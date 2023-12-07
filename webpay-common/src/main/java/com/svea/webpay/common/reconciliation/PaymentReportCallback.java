package com.svea.webpay.common.reconciliation;

/**
 * Callback interface that can be used in processing scenarios.
 * 
 * @author Daniel Tamm
 *
 */
public interface PaymentReportCallback {

	public void preProcess(PaymentReport report);
	
	public void postProcess(PaymentReport report);
	
}
