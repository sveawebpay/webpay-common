package com.svea.webpay.common.reconciliation;

/**
 * A structure to keep an unambigous reference to a webpay order
 * 
 * @author Daniel Tamm
 *
 */
public class WebpayOrderReference {

	private String	orgNo;
	private String	countryCode;
	
	private String	paymentType;
	private String	paymentTypeReference;
	private String	paymentId;
	private String	invoiceId;
	private String	orderId;
	private String	checkoutOrderId;
	private String	customerId;
	private String	payerOrgNo;
	private String	payerCountryCode;
	private String	clientOrderNo;
	
	
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentTypeReference() {
		return paymentTypeReference;
	}
	public void setPaymentTypeReference(String paymentTypeReference) {
		this.paymentTypeReference = paymentTypeReference;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCheckoutOrderId() {
		return checkoutOrderId;
	}
	public void setCheckoutOrderId(String checkoutOrderId) {
		this.checkoutOrderId = checkoutOrderId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPayerOrgNo() {
		return payerOrgNo;
	}
	public void setPayerOrgNo(String payerOrgNo) {
		this.payerOrgNo = payerOrgNo;
	}
	public String getPayerCountryCode() {
		return payerCountryCode;
	}
	public void setPayerCountryCode(String payerCountryCode) {
		this.payerCountryCode = payerCountryCode;
	}
	public String getClientOrderNo() {
		return clientOrderNo;
	}
	public void setClientOrderNo(String clientOrderNo) {
		this.clientOrderNo = clientOrderNo;
	}
	
	
	
}
