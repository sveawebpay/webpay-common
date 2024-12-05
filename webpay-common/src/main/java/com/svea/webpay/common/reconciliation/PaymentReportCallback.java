package com.svea.webpay.common.reconciliation;

/**
 * Callback interface that can be used in processing scenarios.
 * 
 * @author Daniel Tamm
 *
 */
public interface PaymentReportCallback {

	/**
	 * 
	 * @param report
	 * @return		False if there's problem with the preProcess.
	 */
	public boolean preProcess(PaymentReport report);
	
	/**
	 * 
	 * @param report
	 * @return		False if there's problem with the postProcess.
	 */
	public boolean postProcess(PaymentReport report);
	
	/**
	 * 
	 * @param trxId
	 * @param group
	 * @param detail
	 * @return		False if there's problem with the preProcess.
	 */
	public boolean preProcessDetail(int trxId, PaymentReportGroup group, PaymentReportDetail detail, boolean isDryRun);

	/**
	 * 
	 * @param trxId
	 * @param group
	 * @param detail
	 * @return		False if there's problem with the postProcess
	 */
	public boolean postProcessDetail(int trxId, PaymentReportGroup group, PaymentReportDetail detail, boolean isDryRun);
	
	public CallbackResult getCallbackDetailResult();
	
	public void setCallbackDetailResult(CallbackResult r);
	
	public CallbackResult getCallbackResult();
	
	public void setCallbackResult(CallbackResult r);
	
}
