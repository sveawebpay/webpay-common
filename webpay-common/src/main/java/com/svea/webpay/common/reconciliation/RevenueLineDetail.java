package com.svea.webpay.common.reconciliation;

public class RevenueLineDetail {

	private String	customerName;
	private String	webpayOrderNo;
	private String	clientOrderNo;
	private String	checkoutOrderId;
	private String	webpayInvoiceNo;
	private Double	taxBase;
	private Double	taxAmount;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getWebpayOrderNo() {
		return webpayOrderNo;
	}
	public void setWebpayOrderNo(String webpayOrderNo) {
		this.webpayOrderNo = webpayOrderNo;
	}
	public String getClientOrderNo() {
		return clientOrderNo;
	}
	public void setClientOrderNo(String clientOrderNo) {
		this.clientOrderNo = clientOrderNo;
	}
	public String getCheckoutOrderId() {
		return checkoutOrderId;
	}
	public void setCheckoutOrderId(String checkoutOrderId) {
		this.checkoutOrderId = checkoutOrderId;
	}
	public String getWebpayInvoiceNo() {
		return webpayInvoiceNo;
	}
	public void setWebpayInvoiceNo(String webpayInvoiceNo) {
		this.webpayInvoiceNo = webpayInvoiceNo;
	}
	public Double getTaxBase() {
		return taxBase;
	}
	public void setTaxBase(Double taxBase) {
		this.taxBase = taxBase;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	
	
}
