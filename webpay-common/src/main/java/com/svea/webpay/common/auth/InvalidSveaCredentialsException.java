package com.svea.webpay.common.auth;

public class InvalidSveaCredentialsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5914233980227413136L;
	
	private SveaCredential sc;
	
	public InvalidSveaCredentialsException(SveaCredential sc) {
		this.sc = sc;
	}
	
	public SveaCredential getCredential() {
		return sc;
	}
	
}
