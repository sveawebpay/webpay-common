package com.svea.webpay.common.reconciliation2;

import java.math.BigInteger;

public class ClientFee {

	public static final String FEETYPE_Admin = "Admin";
	public static final String FEETYPE_Credit = "Credit";
	public static final String FEETYPE_Reminder = "Reminder";
	public static final String FEETYPE_Collection = "Collection";
	public static final String FEETYPE_Interest = "Interest";
	public static final String FEETYPE_Postage = "Postage";
	public static final String FEETYPE_Deviation = "Deviation";
	public static final String FEETYPE_DueDate = "DueDate";
	public static final String FEETYPE_LegalAction = "LegalAction";
	public static final String FEETYPE_Kickback = "Kickback";
	public static final String FEETYPE_Deposit = "Deposit";
	public static final String FEETYPE_Service = "Service";
	public static final String FEETYPE_Dismissed = "Dismissed";
	public static final String FEETYPE_Correction = "Correction";
	
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
