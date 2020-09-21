package com.svea.webpay.common.reconciliation2;

import java.math.BigInteger;
import java.util.List;

public class ClientPaymentReport {

	private BigInteger sveaPaidAmountExcludingWithholding;
	private BigInteger sveaPaidAmountIncludingWithholding;
	private BigInteger openingBalanceDebt;
	private BigInteger closingBalanceDebt;
	private BigInteger nominalAmount;
	private BigInteger feeAmountExcludingVat;
	private BigInteger feeVatAmount;
	private Long numberOfRows;
	private String	currency;
	private List<VatGroup> vatGroups;
	
	
	public BigInteger getSveaPaidAmountExcludingWithholding() {
		return sveaPaidAmountExcludingWithholding;
	}
	public void setSveaPaidAmountExcludingWithholding(BigInteger sveaPaidAmountExcludingWithholding) {
		this.sveaPaidAmountExcludingWithholding = sveaPaidAmountExcludingWithholding;
	}
	public BigInteger getSveaPaidAmountIncludingWithholding() {
		return sveaPaidAmountIncludingWithholding;
	}
	public void setSveaPaidAmountIncludingWithholding(BigInteger sveaPaidAmountIncludingWithholding) {
		this.sveaPaidAmountIncludingWithholding = sveaPaidAmountIncludingWithholding;
	}
	public BigInteger getOpeningBalanceDebt() {
		return openingBalanceDebt;
	}
	public void setOpeningBalanceDebt(BigInteger openingBalanceDebt) {
		this.openingBalanceDebt = openingBalanceDebt;
	}
	public BigInteger getClosingBalanceDebt() {
		return closingBalanceDebt;
	}
	public void setClosingBalanceDebt(BigInteger closingBalanceDebt) {
		this.closingBalanceDebt = closingBalanceDebt;
	}
	public BigInteger getNominalAmount() {
		return nominalAmount;
	}
	public void setNominalAmount(BigInteger nominalAmount) {
		this.nominalAmount = nominalAmount;
	}
	public BigInteger getFeeAmountExcludingVat() {
		return feeAmountExcludingVat;
	}
	public void setFeeAmountExcludingVat(BigInteger feeAmountExcludingVat) {
		this.feeAmountExcludingVat = feeAmountExcludingVat;
	}
	public BigInteger getFeeVatAmount() {
		return feeVatAmount;
	}
	public void setFeeVatAmount(BigInteger feeVatAmount) {
		this.feeVatAmount = feeVatAmount;
	}
	public Long getNumberOfRows() {
		return numberOfRows;
	}
	public void setNumberOfRows(Long numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<VatGroup> getVatGroups() {
		return vatGroups;
	}
	public void setVatGroups(List<VatGroup> vatGroups) {
		this.vatGroups = vatGroups;
	}
	
	
	
}
