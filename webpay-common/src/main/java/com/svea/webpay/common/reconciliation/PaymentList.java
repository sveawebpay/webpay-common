package com.svea.webpay.common.reconciliation;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Class used to hold a list of PaymentFullRows.
 * 
 * This is a convenience class to create json-data.
 * 
 * @author Daniel Tamm
 * @see PaymentFullRow
 *
 */

public class PaymentList {

	@SerializedName("PaymentReport")
	public List<PaymentFullRow> paymentList = new ArrayList<PaymentFullRow>();

	public List<PaymentFullRow> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(List<PaymentFullRow> paymentList) {
		this.paymentList = paymentList;
	}
	
}
