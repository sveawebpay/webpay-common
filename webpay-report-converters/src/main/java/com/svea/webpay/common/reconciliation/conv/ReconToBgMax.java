package com.svea.webpay.common.reconciliation.conv;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import org.notima.bg.BgFile;
import org.notima.bg.BgMaxFile;
import org.notima.bg.bgmax.BgMaxReceipt;
import org.notima.bg.bgmax.BgMaxSet;

import com.svea.webpay.common.conv.TaxIdFormatter;
import com.svea.webpay.common.conv.TaxIdStructure;
import com.svea.webpay.common.reconciliation.PaymentReport;
import com.svea.webpay.common.reconciliation.PaymentReportDetail;
import com.svea.webpay.common.reconciliation.PaymentReportGroup;

public class ReconToBgMax implements ReconInputConverter {

	private File	outFile;
	public static String defaultCharsetName = "Cp850";
	public static Charset defaultCharSet = Charset.forName(defaultCharsetName); 
	
	public File getOutFile() {
		return outFile;
	}

	public void setOutFile(File outFile) {
		this.outFile = outFile;
	}

	/**
	 * A destination map containing the BG-number to use
	 * for specific payment types.
	 */
	private Map<String,String>	dstMap = new TreeMap<String,String>();

	/**
	 * Default BG to use if nothing else is set.
	 */
	private String				defaultBg = "000-0000";
	
	public String getDefaultBg() {
		return defaultBg;
	}

	public void setDefaultBg(String defaultBg) {
		this.defaultBg = defaultBg;
	}
	
	public void addBgMap(String paymentType, String bgNo) {
		if (paymentType!=null) {
			dstMap.put(paymentType.toLowerCase(), bgNo);
		}
	}

	public String getBgNo(String paymentType) {
		
		if (paymentType==null)
			return defaultBg;
		
		String result = dstMap.get(paymentType.toLowerCase());
		if (result==null)
			return defaultBg;
		else
			return result;
		
	}
	
	public List<BgFile> convertFromPaymentReport(PaymentReport report) throws Exception {
		
		if (report==null)
			return null;
		if (report.getPaymentReportGroup()==null)
			return null;
		
		List<BgFile> files = new ArrayList<BgFile>();
		
		BgMaxFile bgFile = null;
		BgMaxSet bgSet = null;
		
		Date currentReconciliationDate = null;
		
		for (PaymentReportGroup g : report.getPaymentReportGroup()) {

			if (currentReconciliationDate==null || !currentReconciliationDate.equals(g.getReconciliationDateAsDate())) {
				bgFile = new BgMaxFile(g.getReconciliationDateAsDate());
				files.add(bgFile);
				currentReconciliationDate = g.getReconciliationDateAsDate();
			}

			bgSet = bgFile.createSet(
					currentReconciliationDate, 
					g.getCurrency(), 
					"", 
					"",
					getBgNo(g.getPaymentType()));
			
			// Create transactions
			BgMaxReceipt r = null;
			String zipCode;
			String customerInvoiceNo;
			String taxId;
			String taxIdFormat;
			Vector<String> infoRecords;
			if (g.getPaymentReportDetail()!=null) {
				for (PaymentReportDetail pd : g.getPaymentReportDetail()) {
	
					if (g.getProcessRetryPaymentsOnly()!=null && g.getProcessRetryPaymentsOnly() && (pd.getRetry()==null || !pd.getRetry()))
						continue;
					
					r = new BgMaxReceipt(g.getReconciliationDateAsDate());
					r.setAmount(pd.getPaidAmt());
					r.setName1(pd.getPayerName());
					zipCode = pd.getReference(PaymentReportDetail.REF_ZIPCODE); 
					if (zipCode!=null && zipCode.trim().length()>0) {
						r.setZipCode(zipCode);
					}
					customerInvoiceNo = pd.getReference(PaymentReportDetail.REF_CLIENT_INVOICE_NO);
					if (customerInvoiceNo!=null && customerInvoiceNo.trim().length()>0) {
						r.setReference(customerInvoiceNo);
					} else {
						r.setReference(pd.getInvoiceId());
					}
					r.setBgcRef(pd.getPaymentId()!=null ? pd.getPaymentId() : pd.getOrderId());
					infoRecords = new Vector<String>();
					StringBuffer infoRecord = new StringBuffer();
					if (pd.getOrderId()!=null && pd.getOrderId().trim().length()>0) {
						infoRecord.append("O: " + pd.getOrderId());
					}
					if (pd.getClientOrderNo()!=null && pd.getClientOrderNo().trim().length()>0) {
						if (infoRecord.length()>0) infoRecord.append(" ");
						infoRecord.append("Ref: " + pd.getClientOrderNo());
					}
					if (pd.getCustomerId()!=null && pd.getCustomerId().trim().length()>0) {
						if (infoRecord.length()>0) infoRecord.append(" ");
						infoRecord.append("Knr: " + pd.getCustomerId());
					}
					if (infoRecord.length()>0)
						infoRecords.add(infoRecord.toString());
					if (infoRecords.size()>0) {
						r.setInfoRecords(infoRecords);
					}
					
					if (pd.getPayerOrgNo()!=null) {
						taxId = TaxIdFormatter.removeBlanks(pd.getPayerOrgNo());
						taxIdFormat = TaxIdFormatter.determineFormat("SE", taxId);
						
						if (!taxIdFormat.equals(TaxIdStructure.FMT_UNKNOWN)) {
							r.setTaxId(TaxIdFormatter.printTaxId(taxIdFormat, taxId, TaxIdStructure.FMT_SE10));
						}
					}
					
					bgSet.addTransaction(r);
				}
			}
		}

		return files;
		
	}
	
	@Override
	public List<StringBuffer> convertFromRecon(PaymentReport report) throws Exception {

		if (report==null)
			return null;
		if (report.getPaymentReportGroup()==null)
			return null;

		List<BgFile> files = convertFromPaymentReport(report);
		
		StringBuffer fileStr;
		List<StringBuffer> resultList = new ArrayList<StringBuffer>();
		
		for (BgFile bgf : files) {
			fileStr = new StringBuffer();
			OutputStream of = new StringBufferOutputStream(fileStr);
			bgf.writeToStream(of, defaultCharSet);
			resultList.add(fileStr);
		}
		
		if (outFile!=null) {
			PrintWriter wr = new PrintWriter(outFile);
			for (StringBuffer sb : resultList) {
				wr.append(sb);
				wr.append("\n");
			}
			wr.close();
			resultList.clear();
			resultList.add(new StringBuffer(outFile.getAbsolutePath()));
		}
		
		return resultList;
	}

	
	
	
}
