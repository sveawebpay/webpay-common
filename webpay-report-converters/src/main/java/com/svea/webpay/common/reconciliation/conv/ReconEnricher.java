package com.svea.webpay.common.reconciliation.conv;

import java.util.Properties;

import com.svea.webpay.common.reconciliation.PaymentReport;

/**
 * Interface for enriching a payment report.
 * 
 * @author Daniel Tamm
 *
 */
public interface ReconEnricher {

	/**
	 * Enriches a payment report.
	 * 
	 * @param props			Properties for the enrichment implementation
	 * @param src			The report to be enriched.
	 * @return				The enriched report.
	 */
	public PaymentReport enrich(Properties props, PaymentReport src);
	
	
}
