package com.svea.webpay.common.reconciliation.conv;

import java.util.List;

import com.svea.webpay.common.reconciliation.PaymentReport;

/**
 * Interface for converting format to Svea reconciliation format.
 * 
 * @author Daniel Tamm
 *
 */
public interface ReconOutputConverter {

	public PaymentReport convertToRecon(List<StringBuffer> src) throws Exception;
	
}
