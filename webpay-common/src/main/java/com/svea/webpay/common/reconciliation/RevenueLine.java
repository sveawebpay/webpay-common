package com.svea.webpay.common.reconciliation;

import java.time.LocalDate;
import java.util.List;

public class RevenueLine {

	private LocalDate	acctDate;
	private String	revenueAcctNo;
	private String	taxAcctNo;
	private String	taxKey;
	private Double	taxRate;
	private Double	taxBase;
	private Double	taxAmount;
	private String	paymentType;
	private String	paymentTypeReference;
	private String	description;
	private String	currency;	
	
	private List<RevenueLineDetail> details;
	
	public LocalDate getAcctDate() {
		return acctDate;
	}
	public void setAcctDate(LocalDate acctDate) {
		this.acctDate = acctDate;
	}
	public String getRevenueAcctNo() {
		return revenueAcctNo;
	}
	public void setRevenueAcctNo(String revenueAcctNo) {
		this.revenueAcctNo = revenueAcctNo;
	}
	public String getTaxAcctNo() {
		return taxAcctNo;
	}
	public void setTaxAcctNo(String taxAcctNo) {
		this.taxAcctNo = taxAcctNo;
	}
	public String getTaxKey() {
		return taxKey;
	}
	public void setTaxKey(String taxKey) {
		this.taxKey = taxKey;
	}
	public Double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<RevenueLineDetail> getDetails() {
		return details;
	}
	public void setDetails(List<RevenueLineDetail> details) {
		this.details = details;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	/**
	 * Adds revenue and tax amount to this revenue line.
	 * 
	 * @param taxBase
	 * @param taxAmount
	 * @return		The new total (taxbase + taxamount)
	 */
	public Double addRevenue(double taxBase, double taxAmount) {
		
		if (this.taxBase==null) this.taxBase = 0D;
		if (this.taxAmount == null) this.taxAmount = 0D;
		
		this.taxBase += taxBase;
		this.taxAmount += taxAmount;

		return this.taxBase + this.taxAmount;
		
	}
	
}
