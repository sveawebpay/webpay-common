package com.svea.webpay.common.reconciliation;

import java.util.List;

import com.svea.webpay.common.auth.SveaCredential;

public interface PaymentReportFactory {
	
	/**
	 * Instantiates a payment report factory with the given credentials
	 * 
	 * @param cre	Credentials for this factory
	 * @return		The payment report factory created.
	 */
	public PaymentReportFactory init(SveaCredential cre);
	
	/**
	 * 
	 * @return 	Current Svea Credential
	 */
	public SveaCredential getSveaCredential();
	
	/**
	 * Creates bank statement lines for a Svea Account. The svea account is
	 * selected in the constructor of this class.
	 * 
	 * @param report
	 *            The report to be filled in. Must not be null. The report is
	 *            filled in with payments for the account.
	 * @param fromDate
	 *            From date. If null, today's date is used.
	 * @param untilDate
	 *            Until date. If null, untilDate is set to fromDate.
	 * @return	  List of payment report groups added to the report.
	 * 
	 * @throws Exception	if something fails.
	 */
	public List<PaymentReportGroup> createBankStatementLines(PaymentReport report,
			java.util.Date fromDate, java.util.Date untilDate) throws Exception;	
	
	
	
}
