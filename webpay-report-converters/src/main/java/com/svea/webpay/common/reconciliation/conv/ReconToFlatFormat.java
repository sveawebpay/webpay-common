package com.svea.webpay.common.reconciliation.conv;

import java.io.File;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import com.svea.webpay.common.reconciliation.FeeDetail;
import com.svea.webpay.common.reconciliation.PaymentReport;
import com.svea.webpay.common.reconciliation.PaymentReportDetail;
import com.svea.webpay.common.reconciliation.PaymentReportGroup;

/**
 * Flat format is a format where no grouping occurs. Each line contains all necessary 
 * information about a payment.
 * 
 * @author Daniel Tamm
 *
 */
public class ReconToFlatFormat implements ReconInputConverter {

	private File	outFile;
	
	// If true, transactions to represent a minus amount are created.
	// That means that the sum of all transactions will always be zero if 
	// the real transactions have a negative starting balance or ends with a negative balance.
	private boolean	createBalanceTrxForDebt = false; // Defaults to false
	
	public static final int RECONCILE_DATE_COL = 3;
	public static final int ORDER_DATE_COL = 11; 
	
	public static final Object[] headerColumns = new String[] {
		"recipient-tax-id",
		"customer-tax-id",
		"tax-id-format",
		"reconciliation-date",
		"svea-customer-id",
		"external-customer-id",
		"customer-name",
		"customer-email",
		"customer-zipcode",
		"external-order-no",
		"external-invoice-no",
		"order-date",
		"order-amt",
		"order-vat",
		"svea-invoice-no",
		"svea-order-no",
		"pmt-transaction-id",
		"svea-checkout-id",
		"customer-paid-amt",
		"svea-paid-amt",
		"fee-amt-ex-vat",
		"fee-type",
		"fee-vat",
		"recipient-bank-acct-no",
		"recipient-bank-acct-type",
		"client-id",
		"payment-type",
		"currency",
		"dst-currency",
		"exchange-rate",
		"comment",
		"credit-id",
		"delivery-id"
	};
	
	// The number of columns
	public static int NCOLS = headerColumns.length;	
	
	/**
	 * Default date format. Can be changed using property settings.
	 */
	public DateFormat	dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	public DateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}
	
	public boolean isCreateBalanceTrxForDebt() {
		return createBalanceTrxForDebt;
	}

	public void setCreateBalanceTrxForDebt(boolean createBalanceTrxForDebt) {
		this.createBalanceTrxForDebt = createBalanceTrxForDebt;
	}

	/**
	 * Creates a flat row object from fee
	 * 
	 * @param report
	 * @param g
	 * @param f
	 * @return
	 * @throws ParseException
	 */
	private Object[] createRowObjectFromFee(PaymentReport report, PaymentReportGroup g, FeeDetail f) throws ParseException {
		
		String feeType;
		int c = 0;
		// Create a new row
		Object[] row = new Object[NCOLS];

		// Recipients tax id
		row[c++] = report.getTaxId();
		row[c++] = null;
		row[c++] = null;
		row[c++] = g.getReconciliationDateAsDate();
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = null;
		row[c++] = 0d;
		row[c++] = -f.getFeeTotal(); // Svea paid amt

		feeType = f.getFeeType();
		// BALANCE or DEPOSIT aren't fees
		if (feeType.equalsIgnoreCase(FeeDetail.ACCTTYPE_BALANCE) 
			|| feeType.equalsIgnoreCase(FeeDetail.ACCTTYPE_DEPOSIT)) {
			row[c++] = 0d;
		} else {
			row[c++] = f.getFee();
		}
		
		row[c++] = feeType;			 // Fee Type
		row[c++] = f.getFeeVat();
		row[c++] = g.getDstBankAcct();
		row[c++] = g.getDstBankAcctType();
		row[c++] = g.getPaymentTypeReference();
		row[c++] = g.getPaymentType();
		row[c++] = g.getCurrency();
		// TODO: Create field for source currency
		row[c++] = g.getCurrency();
		// TODO: Create field for exchange rate
		row[c++] = new Double(1.0);
		row[c++] = f.getAccountNr();		// Suggested account if any
		
		return row;
		
	}
	
	/**
	 * Creates a flat row object from Payment Detail
	 * 
	 * @param report
	 * @param g
	 * @param d
	 * @return
	 * @throws ParseException
	 */
	private Object[] createRowObjectFromPaymentDetail(PaymentReport report, PaymentReportGroup g, PaymentReportDetail d) throws ParseException {
		
		String feeType;
		int c = 0;
		// Create a new row
		Object[] row = new Object[NCOLS];
		
		// Recipients tax id
		row[c++] = g.getTaxId()!=null && g.getTaxId().trim().length()>0 ? g.getTaxId() : report.getTaxId();
		row[c++] = d.getPayerOrgNo();
		row[c++] = report.getTaxIdFormat();
		row[c++] = g.getReconciliationDateAsDate();
		row[c++] = d.getCustomerId(); // Svea's customer ID
		row[c++] = d.getReference(PaymentReportDetail.REF_CLIENT_CUST_NO);
		row[c++] = d.getPayerName();
		row[c++] = d.getReference(PaymentReportDetail.REF_EMAIL);
		row[c++] = d.getReference(PaymentReportDetail.REF_ZIPCODE);
		row[c++] = d.getClientOrderNo(); // Customer order Id
		row[c++] = d.getReference(PaymentReportDetail.REF_CLIENT_INVOICE_NO);
		row[c++] = d.getOrderDateAsDate();
		row[c++] = d.getOrderTotalAmt(); // Order amount
		row[c++] = d.getOrderVat(); // Order VAT
		row[c++] = d.getInvoiceId();
		row[c++] = d.getOrderId();
		row[c++] = d.getPaymentId(); // Payment transaction Id
		row[c++] = d.getCheckoutOrderId();
		row[c++] = d.getPaidAmt();
		row[c++] = d.getReceivedAmt();
		
		// Determine feetype
		if (d.getFees()!=null) {
			if (d.getFees().size()==1)
				feeType = d.getFees().get(0).getFeeType();
			else
				feeType = FeeDetail.FEETYPE_MIXED;
		} else {
			feeType = "";
		}

		// DEBT or DEPOSIT aren't fees
		if (feeType.equalsIgnoreCase(FeeDetail.ACCTTYPE_BALANCE) 
			|| feeType.equalsIgnoreCase(FeeDetail.ACCTTYPE_DEPOSIT)) {
			row[c++] = 0d;
		} else {
			row[c++] = FeeDetail.getFeeSum(d.getFees());
		}
		
		row[c++] = feeType;
		row[c++] = FeeDetail.getVatSum(d.getFees());
		row[c++] = g.getDstBankAcct();
		row[c++] = g.getDstBankAcctType();
		row[c++] = g.getPaymentTypeReference();
		row[c++] = g.getPaymentType();
		row[c++] = g.getCurrency();
		// TODO: Create field for source currency
		row[c++] = g.getCurrency();
		// TODO: Create field for exchange rate
		row[c++] = new Double(1.0);
		row[c++] = d.getReference(PaymentReportDetail.REF_COMMENT);
		row[c++] = d.getReference(PaymentReportDetail.REF_CREDIT_ID);
		row[c++] = d.getReference(PaymentReportDetail.REF_DELIVERY_ID);

		return row;
		
	}
	
	public List<Object[]> convertFromReconToRowObjects(PaymentReport report) throws ParseException {

		List<Object[]> rows = new ArrayList<Object[]>();
		
		Object[] row = null;
		
		FeeDetail inBalance, outBalance;

		if (report==null || report.getPaymentReportGroup()==null) return rows;
		
		for (PaymentReportGroup g : report.getPaymentReportGroup()) {
			
			inBalance = outBalance = null;
			
			// Opening balance
			if (createBalanceTrxForDebt && g.getOpeningBalance()!=null && g.getOpeningBalance().doubleValue()!=0) {
				inBalance = new FeeDetail();
				inBalance.setFeeType(FeeDetail.ACCTTYPE_BALANCE);
				inBalance.setFee(-g.getOpeningBalance());
				row = createRowObjectFromFee(report, g, inBalance);
				rows.add(row);
			}

			// Transactions (details)
			if (g.getPaymentReportDetail()!=null) {
				for (PaymentReportDetail d : g.getPaymentReportDetail()) {
	
					row = createRowObjectFromPaymentDetail(report, g, d);
					rows.add(row);
					
				}
			}
			
			// Check for other fees
			if (g.getTotalOtherFees()!=null && g.getTotalOtherFees().size()>0) {
				
				for (FeeDetail f : g.getTotalOtherFees()) {
					
					row = createRowObjectFromFee(report, g, f);
					rows.add(row);
					
				}
				
			}
			
			// Ending balance
			if (createBalanceTrxForDebt && g.getEndingBalance()!=null && g.getEndingBalance().doubleValue()!=0) {
				outBalance = new FeeDetail();
				outBalance.setFeeType(FeeDetail.ACCTTYPE_BALANCE);
				outBalance.setFee(g.getEndingBalance());
				row = createRowObjectFromFee(report, g, outBalance);
				rows.add(row);
			}
			
		}

		if (rows!=null && rows.size()>0) {
			// Add headers
			rows.add(0, headerColumns);
		}
		
		return rows;
		
	}
	
	/**
	 * Sets out file if applicable 
	 * @param of
	 */
	public void setOutFile(File of) {
		outFile = of;
	}
	
	@Override
	public List<StringBuffer> convertFromRecon(PaymentReport report)
			throws Exception {
		
		List<StringBuffer> result = new ArrayList<StringBuffer>();
		StringBuffer buf = new StringBuffer();
		result.add(buf);
		
		List<Object[]> rows = convertFromReconToRowObjects(report);
		
		CSVPrinter printer = new CSVPrinter(buf, CSVFormat.EXCEL);
		int rowCount = 0;
		for (Object[] r : rows) {
			// Convert date
			if (dateFormat!=null && rowCount>0) {
				if (r[RECONCILE_DATE_COL]!=null) {
					r[RECONCILE_DATE_COL] = dateFormat.format((Date)r[RECONCILE_DATE_COL]);
				}
				if (r[ORDER_DATE_COL]!=null) {
					r[ORDER_DATE_COL] = dateFormat.format((Date)r[ORDER_DATE_COL]);
				}
			}
			printer.printRecord(r);
			rowCount++;
		}
		
		printer.close();
		
		if (outFile!=null) {
			
			if (!outFile.getAbsolutePath().toLowerCase().endsWith(".csv")) {
				outFile = new File(outFile.getAbsolutePath() + ".csv");
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
