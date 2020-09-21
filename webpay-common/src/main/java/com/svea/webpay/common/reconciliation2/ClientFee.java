package com.svea.webpay.common.reconciliation2;

import java.math.BigInteger;

public class ClientFee {

	private BigInteger	sveaPaidAmount;
	private BigInteger	amountExcludingVat;
	private String	type;
	private BigInteger	vatAmount;
	private Long		vatPercent;
	
	public ClientFee() {}
	
	public ClientFee(BigInteger feeAmtNoVat, String feeType) {
		sveaPaidAmount = feeAmtNoVat!=null ? feeAmtNoVat : BigInteger.ZERO;
		amountExcludingVat = feeAmtNoVat.negate();
		vatAmount = BigInteger.ZERO;
		vatPercent = 0L;
		type = feeType;
	}
	
	public BigInteger getSveaPaidAmount() {
		return sveaPaidAmount;
	}
	public void setSveaPaidAmount(BigInteger sveaPaidAmount) {
		this.sveaPaidAmount = sveaPaidAmount;
	}
	public BigInteger getAmountExcludingVat() {
		return amountExcludingVat;
	}
	public void setAmountExcludingVat(BigInteger amountExcludingVat) {
		this.amountExcludingVat = amountExcludingVat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigInteger getVatAmount() {
		return vatAmount;
	}
	public void setVatAmount(BigInteger vatAmount) {
		this.vatAmount = vatAmount;
	}
	public Long getVatPercent() {
		return vatPercent;
	}
	public void setVatPercent(Long vatPercent) {
		this.vatPercent = vatPercent;
	}
	

	
}
