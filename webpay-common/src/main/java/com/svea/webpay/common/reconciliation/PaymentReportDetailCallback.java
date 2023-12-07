package com.svea.webpay.common.reconciliation;

/**
 * Callback interface that can be used in processing scenarios.
 * 
 * @author Daniel Tamm
 *
 */
public interface PaymentReportDetailCallback {

	public void preProcess(int trxId, PaymentReport report, PaymentReportGroup group, PaymentReportDetail detail);
	
	public void postProcess(int trxId, PaymentReport report, PaymentReportGroup group, PaymentReportDetail detail);
	
}
