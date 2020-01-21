package com.svea.webpay.common.reconciliation;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents a payment as one single row (no one-to-many relationships).
 * 
 * This is a convenience class used to create json-data in a flat format.
 * 
 * @author Daniel Tamm
 *
 */
public class PaymentFullRow {

	private String	recipientTaxId;
	private String	customerTaxId;
	private String	taxIdFormat;
	private String  reconciliationDate;
	private String	sveaCustomerId;
	private String	externalCustomerId;
	private String	customerName;
	private	String	customerEmail;
	private String	customerZipCode;
	private String	externalOrderNo;
	private String	externalInvoiceNo;
	private String	creditId;
	private String	deliveryId;
	private String	orderDate;
	@SerializedName("OrderAmount")
	private Double	orderAmt;
	@SerializedName("OrderVatAmount")
	private Double	orderVat;
	private String	sveaInvoiceNo;
	private String	sveaOrderNo;
	private String	paymentTransactionId;
	private String  sveaCheckoutId;
	@SerializedName("CustomerPaidAmount")
	private Double	customerPaidAmt;
	@SerializedName("SveaPaidAmount")
	private Double	sveaPaidAmt;
	@SerializedName("FeeAmountExcludingVat")
	private Double	feeAmtExVat;
	private	String	feeType;
	@SerializedName("FeeVatAmount")
	private Double	feeVat;
	@SerializedName("RecipientBankAccountNo")
	private String	recipientBankAcctNo;
	@SerializedName("RecipientBankAccountType")
	private String	recipientBankAcctType;
	private String	clientId;
	private String	paymentType;
	private String	currency;
	@SerializedName("DestinationCurrency")
	private String	dstCurrency;
	private Double	exchangeRate;
	private String	comment;
	
	public String getRecipientTaxId() {
		return recipientTaxId;
	}
	public void setRecipientTaxId(String recipientTaxId) {
		this.recipientTaxId = recipientTaxId;
	}
	public String getCustomerTaxId() {
		return customerTaxId;
	}
	public void setCustomerTaxId(String customerTaxId) {
		this.customerTaxId = customerTaxId;
	}
	public String getTaxIdFormat() {
		return taxIdFormat;
	}
	public void setTaxIdFormat(String taxIdFormat) {
		this.taxIdFormat = taxIdFormat;
	}
	public String getReconciliationDate() {
		return reconciliationDate;
	}
	public void setReconciliationDate(String reconciliationDate) {
		this.reconciliationDate = reconciliationDate;
	}
	public String getSveaCustomerId() {
		return sveaCustomerId;
	}
	public void setSveaCustomerId(String sveaCustomerId) {
		this.sveaCustomerId = sveaCustomerId;
	}
	public String getExternalCustomerId() {
		return externalCustomerId;
	}
	public void setExternalCustomerId(String externalCustomerId) {
		this.externalCustomerId = externalCustomerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerZipCode() {
		return customerZipCode;
	}
	public void setCustomerZipCode(String customerZipCode) {
		this.customerZipCode = customerZipCode;
	}
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	public String getExternalInvoiceNo() {
		return externalInvoiceNo;
	}
	public void setExternalInvoiceNo(String externalInvoiceNo) {
		this.externalInvoiceNo = externalInvoiceNo;
	}
	public String getCreditId() {
		return creditId;
	}
	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}
	public String getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public Double getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(Double orderAmt) {
		this.orderAmt = orderAmt;
	}
	public Double getOrderVat() {
		return orderVat;
	}
	public void setOrderVat(Double orderVat) {
		this.orderVat = orderVat;
	}
	public String getSveaInvoiceNo() {
		return sveaInvoiceNo;
	}
	public void setSveaInvoiceNo(String sveaInvoiceNo) {
		this.sveaInvoiceNo = sveaInvoiceNo;
	}
	public String getSveaOrderNo() {
		return sveaOrderNo;
	}
	public void setSveaOrderNo(String sveaOrderNo) {
		this.sveaOrderNo = sveaOrderNo;
	}
	
	public String getPaymentTransactionId() {
		return paymentTransactionId;
	}
	public void setPaymentTransactionId(String paymentTransactionId) {
		this.paymentTransactionId = paymentTransactionId;
	}
	public String getSveaCheckoutId() {
		return sveaCheckoutId;
	}
	public void setSveaCheckoutId(String sveaCheckoutId) {
		this.sveaCheckoutId = sveaCheckoutId;
	}
	public Double getCustomerPaidAmt() {
		return customerPaidAmt;
	}
	public void setCustomerPaidAmt(Double customerPaidAmt) {
		this.customerPaidAmt = customerPaidAmt;
	}
	public Double getSveaPaidAmt() {
		return sveaPaidAmt;
	}
	public void setSveaPaidAmt(Double sveaPaidAmt) {
		this.sveaPaidAmt = sveaPaidAmt;
	}
	public Double getFeeAmtExVat() {
		return feeAmtExVat;
	}
	public void setFeeAmtExVat(Double feeAmtExVat) {
		this.feeAmtExVat = feeAmtExVat;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public Double getFeeVat() {
		return feeVat;
	}
	public void setFeeVat(Double feeVat) {
		this.feeVat = feeVat;
	}
	public String getRecipientBankAcctNo() {
		return recipientBankAcctNo;
	}
	public void setRecipientBankAcctNo(String recipientBankAcctNo) {
		this.recipientBankAcctNo = recipientBankAcctNo;
	}
	public String getRecipientBankAcctType() {
		return recipientBankAcctType;
	}
	public void setRecipientBankAcctType(String recipientBankAcctType) {
		this.recipientBankAcctType = recipientBankAcctType;
	}
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDstCurrency() {
		return dstCurrency;
	}
	public void setDstCurrency(String dstCurrency) {
		this.dstCurrency = dstCurrency;
	}
	public Double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	
	
}
