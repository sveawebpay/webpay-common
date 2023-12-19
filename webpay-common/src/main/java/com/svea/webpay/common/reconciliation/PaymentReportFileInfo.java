package com.svea.webpay.common.reconciliation;

/**
 * Interface to get payment report file info, including processed state.
 * 
 * @author Daniel Tamm
 *
 */
public interface PaymentReportFileInfo {

	public String	getAbsolutePath();
	
	public String	getFileName();
	
	public boolean  isLocked();
	
	public boolean	hasRetryRecords();
	
	public String	getLastProcessedGroup();
	
	public int		getLastProcessedTrx();
	
	public boolean	isValidReportFile();
	
}
