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
			totalPaidByCustomer += pl.getPaidByCustomer();
		}
		return totalPaidByCustomer;
		
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
	
	
}
