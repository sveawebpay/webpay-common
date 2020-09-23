package com.svea.webpay.common.reconciliation2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientReportRow {

	public static final String ROWTYPE_ClosingBalanceDebt = "ClosingBalanceDebt";
	public static final String ROWTYPE_Cost = "Cost";
	public static final String ROWTYPE_Credit = "Credit";
	public static final String ROWTYPE_Deposit = "Deposit";
	public static final String ROWTYPE_Kickback = "Kickback";
	public static final String ROWTYPE_Manual = "Manual";
	public static final String ROWTYPE_OpeningBalanceDebt = "OpeningBalanceDebt";
	public static final String ROWTYPE_Order = "Order";
	public static final String ROWTYPE_Regression = "Regression";
	
	public static final String PAYMENTTYPE_AccountCredit = "AccountCredit";
	public static final String PAYMENTTYPE_Card = "Card";
	public static final String PAYMENTTYPE_DirectBank = "DirectBank";
	public static final String PAYMENTTYPE_Invoice = "Invoice";
	public static final String PAYMENTTYPE_PaymentPlan = "PaymentPlan";
	
	private Long	sveaCustomerId;
	private String	customerName;
	private String	externalOrderNo;
	private Date	orderDate;
	
	private BigInteger	sveaInvoiceNo;
	private BigInteger	sveaOrderNo;
	private BigInteger	sveaCheckoutId;
	private BigInteger	nominalAmount;
	private BigInteger	sveaPaidAmount;
	private BigInteger	totalFeeAmountExcludingVat;
	private BigInteger	totalFeeVatAmount;
	private String		paymentType;
	private String		currency;
	private String		destinationCurrency;
	private Double		exchangeRate;
	private String		comment;
	private BigInteger	deliveryId;
	private String		rowType;
	private List<ClientFee> fees;
	private Date		reconciliationDate;
	public Long getSveaCustomerId() {
		return sveaCustomerId;
	}
	public void setSveaCustomerId(Long sveaCustomerId) {
		this.sveaCustomerId = sveaCustomerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	
	public BigInteger getSveaInvoiceNo() {
		return sveaInvoiceNo;
	}
	public void setSveaInvoiceNo(BigInteger sveaInvoiceNo) {
		this.sveaInvoiceNo = sveaInvoiceNo;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public BigInteger getSveaOrderNo() {
		return sveaOrderNo;
	}
	public void setSveaOrderNo(BigInteger sveaOrderNo) {
		this.sveaOrderNo = sveaOrderNo;
	}
	public BigInteger getSveaCheckoutId() {
		return sveaCheckoutId;
	}
	public void setSveaCheckoutId(BigInteger sveaCheckoutId) {
		this.sveaCheckoutId = sveaCheckoutId;
	}
	public BigInteger getNominalAmount() {
		return nominalAmount;
	}
	public void setNominalAmount(BigInteger nominalAmount) {
		this.nominalAmount = nominalAmount;
	}
	public BigInteger getSveaPaidAmount() {
		return sveaPaidAmount;
	}
	public void setSveaPaidAmount(BigInteger sveaPaidAmount) {
		this.sveaPaidAmount = sveaPaidAmount;
	}
	public BigInteger getTotalFeeAmountExcludingVat() {
		return totalFeeAmountExcludingVat;
	}
	public void setTotalFeeAmountExcludingVat(BigInteger totalFeeAmountExcludingVat) {
		this.totalFeeAmountExcludingVat = totalFeeAmountExcludingVat;
	}
	public BigInteger getTotalFeeVatAmount() {
		return totalFeeVatAmount;
	}
	public void setTotalFeeVatAmount(BigInteger totalFeeVatAmount) {
		this.totalFeeVatAmount = totalFeeVatAmount;
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
	public String getDestinationCurrency() {
		return destinationCurrency;
	}
	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
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
	public BigInteger getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(BigInteger deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getRowType() {
		return rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}
	public List<ClientFee> getFees() {
		return fees;
	}
	public void setFees(List<ClientFee> fees) {
		this.fees = fees;
	}
	public Date getReconciliationDate() {
		return reconciliationDate;
	}
	public void setReconciliationDate(Date reconciliationDate) {
		this.reconciliationDate = reconciliationDate;
	}
	
	public ClientReportRow addFeeNoVAT(BigInteger feeAmt, String feeType) {
		ClientFee fee = new ClientFee(feeAmt, feeType);
		if (fees==null) {
			fees = new ArrayList<ClientFee>();
		}
		fees.add(fee);
		
		return this;
	}
	
}
