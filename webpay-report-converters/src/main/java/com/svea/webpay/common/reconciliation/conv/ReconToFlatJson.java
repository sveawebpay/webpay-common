package com.svea.webpay.common.reconciliation.conv;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.svea.webpay.common.reconciliation.PaymentFullRow;
import com.svea.webpay.common.reconciliation.PaymentList;
import com.svea.webpay.common.reconciliation.PaymentReport;

public class ReconToFlatJson implements ReconInputConverter {

	private String 		dateFormatStr;
	private DateFormat	dfmt;
	
	public final static String	defaultDateFormatStr = "yyyy-MM-dd"; 
	public final static String defaultFileName = "reconciliation-report";

	private Gson		gson;
	
	private int colNum;
	
	private File	outFile;
	
	// If true, transactions to represent a minus amount are created.
	// That means that the sum of all transactions will always be zero if 
	// the real transactions have a negative starting balance or ends with a negative balance.
	private boolean	createBalanceTrxForDebt = false; // Defaults to false

	public ReconToFlatJson() {
		
		GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
		builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
		builder.setLenient();
		gson = builder.create();
		
	}
	
	public String getDateFormatStr() {
		return dateFormatStr;
	}

	public void setDateFormatStr(String dateFormatStr) {
		this.dateFormatStr = dateFormatStr;
	}
	
	public boolean isCreateBalanceTrxForDebt() {
		return createBalanceTrxForDebt;
	}

	public void setCreateBalanceTrxForDebt(boolean createBalanceTrxForDebt) {
		this.createBalanceTrxForDebt = createBalanceTrxForDebt;
	}

	public Gson getGson() {
		return gson;
	}

	public void setGson(Gson gson) {
		this.gson = gson;
	}

	public File getOutFile() {
		return outFile;
	}
	
	public void setOutFile(File outFile) {
		this.outFile = outFile;
	}

	public PaymentList createFlatJson(PaymentReport report) throws ParseException, IOException {
		
		// Create date format
		if (dateFormatStr==null || dateFormatStr.trim().length()==0) {
			dateFormatStr = defaultDateFormatStr;
		}
		
		dfmt = new SimpleDateFormat(dateFormatStr);

		ReconToFlatFormat flatConverter = new ReconToFlatFormat();
		flatConverter.setCreateBalanceTrxForDebt(createBalanceTrxForDebt);
		List<Object[]> rows = flatConverter.convertFromReconToRowObjects(report);
		
		PaymentList result = new PaymentList();
		Object[] r;
		
		for (int i=1; i<rows.size(); i++) {
			r = rows.get(i);
			result.getPaymentList().add(createRow(r));
		}
		
		return result;
		
	}

	private PaymentFullRow createRow(Object[] srcRow) {

		colNum = 0;
		
		PaymentFullRow row = new PaymentFullRow();
		
		row.setRecipientTaxId((String)srcRow[colNum++]);
		row.setCustomerTaxId((String)srcRow[colNum++]);
		row.setTaxIdFormat((String)srcRow[colNum++]);

		if (srcRow[colNum]!=null) {
			row.setReconciliationDate(dfmt.format((java.util.Date)srcRow[colNum++]));
		} else {
			colNum++;
		}
		
		row.setSveaCustomerId((String)srcRow[colNum++]);
		row.setExternalCustomerId((String)srcRow[colNum++]);
		row.setCustomerName((String)srcRow[colNum++]);
		row.setCustomerEmail((String)srcRow[colNum++]);
		row.setCustomerZipCode((String)srcRow[colNum++]);
		row.setExternalOrderNo((String)srcRow[colNum++]);
		row.setExternalInvoiceNo((String)srcRow[colNum++]);
		
		if (srcRow[colNum]!=null) {
			row.setOrderDate(dfmt.format((java.util.Date)srcRow[colNum++]));
		} else {
			colNum++;
		}
		
		row.setOrderAmt((Double)srcRow[colNum++]);
		row.setOrderVat((Double)srcRow[colNum++]);
		
		row.setSveaInvoiceNo((String)srcRow[colNum++]);
		row.setSveaOrderNo((String)srcRow[colNum++]);
		row.setPaymentTransactionId((String)srcRow[colNum++]);
		
		row.setSveaCheckoutId((String)srcRow[colNum++]);
		
		row.setCustomerPaidAmt((Double)srcRow[colNum++]);
		row.setSveaPaidAmt((Double)srcRow[colNum++]);
		row.setFeeAmtExVat((Double)srcRow[colNum++]);
		row.setFeeType((String)srcRow[colNum++]);
		row.setFeeVat((Double)srcRow[colNum++]);
		
		row.setRecipientBankAcctNo((String)srcRow[colNum++]);
		row.setRecipientBankAcctType((String)srcRow[colNum++]);
		
		row.setClientId((String)srcRow[colNum++]);
		row.setPaymentType((String)srcRow[colNum++]);
		row.setCurrency((String)srcRow[colNum++]);
		row.setDstCurrency((String)srcRow[colNum++]);
		
		row.setExchangeRate((Double)srcRow[colNum++]);
		
		row.setComment((String)srcRow[colNum++]);
		
		row.setCreditId((String)srcRow[colNum++]);
		row.setDeliveryId((String)srcRow[colNum++]);
		
		return row;
		
	}
	
	/**
	 * @return		A list of file names
	 */
	@Override
	public List<StringBuffer> convertFromRecon(PaymentReport report)
			throws Exception {

		List<StringBuffer> result = new ArrayList<StringBuffer>();
		PaymentList plist = createFlatJson(report);

		StringBuffer buf = new StringBuffer();
		
		buf.append(gson.toJson(plist));
		result.add(buf);
		
		if (outFile!=null) {
			
			if (!outFile.getAbsolutePath().toLowerCase().endsWith(".json")) {
				outFile = new File(outFile.getAbsolutePath() + ".json");
			}
			
			PrintWriter fp = new PrintWriter(outFile);
			for (StringBuffer s : result) {
				fp.append(s.toString());
				fp.append("\n");
			}
			fp.close();
			result.clear();
			result.add(new StringBuffer(outFile.getAbsolutePath()));
		}
		
		return result;
	}

}
