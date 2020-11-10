package com.svea.webpay.common.reconciliation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The accounting voucher describes one or more revenue types (separated by tax key / payment type) and the corresponding 
 * payouts.
 * 
 * @author Daniel Tamm
 *
 */
public class AccountingVoucher {

	private String	paymentType;
	private String	paymentTypeReference;
	private LocalDate	acctDate;
	private String	currency;
	private String	costCenter;
	private String	projectCode;

	private List<RevenueLine> revenues;
	private List<PayoutLine> payouts;
	
	public double calculateTotalRevenueIncTax() {

		if (revenues==null) return 0;
		double totalRevenueIncTax = 0;
		for (RevenueLine rl : revenues) {
			totalRevenueIncTax += rl.getTaxBase() + rl.getTaxAmount();
		}
		return totalRevenueIncTax;
		
	}
	
	public double calculateTotalPaidByCustomer() {

		if (payouts==null) return 0;
		double totalPaidByCustomer = 0;
		for (PayoutLine pl : payouts) {
			if (!pl.isIncludedInOtherPayout())
				totalPaidByCustomer += pl.getPaidByCustomer();
		}
		return totalPaidByCustomer;
		
	}
	
	
	public double calculateTotalPaidOut() {

		if (payouts==null) return 0;
		double totalPaidOut = 0;
		for (PayoutLine pl : payouts) {
			if (!pl.isIncludedInOtherPayout()) {
				totalPaidOut += pl.getPaidOut();
			}
		}
		return totalPaidOut;
		
	}
	
	public double calculateTotalFees() {

		if (payouts==null) return 0;
		double totalFees = 0;
		for (PayoutLine pl : payouts) {
			totalFees += pl.getFeeAmount();
		}
		return totalFees;
		
	}
	
	public double calculateTotalFeeVAT() {

		if (payouts==null) return 0;
		double totalFeeVAT = 0;
		for (PayoutLine pl : payouts) {
			totalFeeVAT += pl.getTaxAmount();
		}
		return totalFeeVAT;
	}
	
	/**
	 * Returns the first (and normally only Payoutline)
	 * 
	 * @return
	 */
	public PayoutLine getFirstPayoutLine() {
		if (payouts==null || payouts.size()==0) return null;
		return (payouts.get(0));
	}
	
	public void addRevenueLine(RevenueLine rl) {
		if (revenues==null)
			revenues = new ArrayList<RevenueLine>();
		revenues.add(rl);
	}
	
	public void addPayoutLine(PayoutLine pl) {
		if (payouts==null) {
			payouts = new ArrayList<PayoutLine>();
		}
		payouts.add(pl);
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
	public LocalDate getAcctDate() {
		return acctDate;
	}
	public void setAcctDate(LocalDate acctDate) {
		this.acctDate = acctDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<RevenueLine> getRevenues() {
		return revenues;
	}
	public void setRevenues(List<RevenueLine> revenues) {
		this.revenues = revenues;
	}
	public List<PayoutLine> getPayouts() {
		return payouts;
	}
	public void setPayouts(List<PayoutLine> payouts) {
		this.payouts = payouts;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	
}
