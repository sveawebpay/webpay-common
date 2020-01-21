package com.svea.webpay.common.reconciliation;

/**
 * Exception thrown when vat rate can't be safely determined
 * 
 * @author Daniel Tamm
 *
 */
public class UnclearVatRateException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1471567726649659799L;
	
	public UnclearVatRateException(String message) {
		super(message);
	}
	
}
