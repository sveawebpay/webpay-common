package com.svea.webpay.common.reconciliation.conv;

import java.io.File;
import java.util.List;

import com.svea.webpay.common.reconciliation.PaymentReport;

/**
 * Interface for converting from Svea Reconciliation Format.
 * 
 * @author daniel
 *
 */
public interface ReconInputConverter {

	public void setOutFile(File of);
	
	public List<StringBuffer> convertFromRecon(PaymentReport report) throws Exception;
	
}
