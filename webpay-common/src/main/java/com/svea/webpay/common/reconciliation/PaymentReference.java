package com.svea.webpay.common.reconciliation;

/**
 * Additional payment references for a payment.
 * 
 * @author Daniel Tamm
 *
 */
public class PaymentReference {

	public static final String WEBPAY_REF_CLIENTORDERNO = "clientOrderNo";
	public static final String WEBPAY_REF_ORDERNO = "orderNo";
	public static final String WEBPAY_REF_INVOICENO = "invoiceNo";
	public static final String WEBPAY_REF_CHECKOUTORDERID = "checkoutOrderId";
	public static final String WEBPAY_REF_TRANSACTIONID = "transactionid";
	
	private String	referenceKey;
	private String	referenceValue;
	private Double	openAmount;
	private String	currency;
	
	public PaymentReference() {}
	
	public PaymentReference(String key, String value) {
		referenceKey = key;
		referenceValue = value;
	}
	
	public PaymentReference(String key, String value, Double openAmount, String currency) {
		referenceKey = key;
		referenceValue = value;
		if (openAmount==null)
			this.openAmount = new Double(0);
		else
			this.openAmount = openAmount;
		this.currency = currency;
	}
	
	public String getReferenceKey() {
		return referenceKey;
	}
	public void setReferenceKey(String referenceKey) {
		this.referenceKey = referenceKey;
	}
	public String getReferenceValue() {
		return referenceValue;
	}
	public void setReferenceValue(String referenceValue) {
		this.referenceValue = referenceValue;
	}

	public Double getOpenAmount() {
		return openAmount;
	}

	public void setOpenAmount(Double openAmount) {
		this.openAmount = openAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	
}
