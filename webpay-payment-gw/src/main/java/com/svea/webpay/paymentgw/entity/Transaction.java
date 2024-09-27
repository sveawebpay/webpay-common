package com.svea.webpay.paymentgw.entity;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.svea.webpay.paymentgw.xmladapter.PaymentGwDateAdapter;

@XmlRootElement(name="transaction")
public class Transaction {

	private static Pattern checkoutOrderIdPattern = Pattern.compile(".*?/(\\d+)$");
	
	private Long	id;
	private String 	customerRefNo;
	private Integer	merchantId;
	private String	status;
	private Long	amount;
	private String	currency;
	private	Long	vat;
	private Long	capturedAmount;
	private Long	authorizedAmount;
	private Date	created;
	private String	creditStatus;
	private Long	creditedAmount;
	private	Integer	merchantResponseCode;
	private String	paymentMethod;
	private String	callbackUrl;
	private Date	captureDate;
	private Long	subscriptionId;
	private String	subscriptionType;
	private Customer	customer;
	private String	maskedCardNo;
	private String	cardtype;
	private Integer	eci;
	private Integer	mdStatus;
	private Integer	expiryYear;
	private Integer	expiryMonth;
	private String	chName;
	private Integer	authCode;
	private OrderRows	orderRows;

	private	Long	checkoutOrderId;
	
	@XmlAttribute(name="id")	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@XmlElement(name = "customerrefno")	
	public String getCustomerRefNo() {
		return customerRefNo;
	}
	public void setCustomerRefNo(String customerRefNo) {
		this.customerRefNo = customerRefNo;
	}
	
	@XmlElement(name = "merchantid")
	public Integer getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Long getVat() {
		return vat;
	}
	public void setVat(Long vat) {
		this.vat = vat;
	}
	
	@XmlElement(name = "capturedamount")
	public Long getCapturedAmount() {
		return capturedAmount;
	}
	public void setCapturedAmount(Long capturedAmount) {
		this.capturedAmount = capturedAmount;
	}
	
	@XmlElement(name = "authorizedamount")
	public Long getAuthorizedAmount() {
		return authorizedAmount;
	}
	public void setAuthorizedAmount(Long authorizedAmount) {
		this.authorizedAmount = authorizedAmount;
	}
	
	@XmlJavaTypeAdapter(PaymentGwDateAdapter.class)
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	@XmlElement(name = "creditstatus")
	public String getCreditStatus() {
		return creditStatus;
	}
	public void setCreditStatus(String creditStatus) {
		this.creditStatus = creditStatus;
	}
	
	@XmlElement(name = "creditedamount")
	public Long getCreditedAmount() {
		return creditedAmount;
	}
	public void setCreditedAmount(Long creditedAmount) {
		this.creditedAmount = creditedAmount;
	}
	
	@XmlElement(name = "merchantresponsecode")
	public Integer getMerchantResponseCode() {
		return merchantResponseCode;
	}
	public void setMerchantResponseCode(Integer merchantResponseCode) {
		this.merchantResponseCode = merchantResponseCode;
	}
	
	@XmlElement(name = "paymentmethod")
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	@XmlElement(name = "orderrows")
	public OrderRows getOrderRows() {
		return orderRows;
	}
	public void setOrderRows(OrderRows orderRows) {
		this.orderRows = orderRows;
	}
	
	@XmlElement(name = "capturedate")
	@XmlJavaTypeAdapter(PaymentGwDateAdapter.class)
	public Date getCaptureDate() {
		return captureDate;
	}
	public void setCaptureDate(Date captureDate) {
		this.captureDate = captureDate;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@XmlElement(name = "cardtype")
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	
	public Integer getEci() {
		return eci;
	}
	public void setEci(Integer eci) {
		this.eci = eci;
	}
	
	@XmlElement(name = "mdstatus")
	public Integer getMdStatus() {
		return mdStatus;
	}
	public void setMdStatus(Integer mdStatus) {
		this.mdStatus = mdStatus;
	}
	
	@XmlElement(name = "expiryyear")
	public Integer getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(Integer expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	@XmlElement(name = "expirymonth")
	public Integer getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(Integer expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	
	@XmlElement(name = "chname")
	public String getChName() {
		return chName;
	}
	public void setChName(String chName) {
		this.chName = chName;
	}
	
	@XmlElement(name = "authcode")
	public Integer getAuthCode() {
		return authCode;
	}
	public void setAuthCode(Integer authCode) {
		this.authCode = authCode;
	}
	
	@XmlElement(name = "callbackurl")
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	
	@XmlElement(name = "subscriptionid")
	public Long getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(Long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	
	@XmlElement(name = "subscriptiontype")
	public String getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	
	@XmlElement(name = "maskedcardno")
	public String getMaskedCardNo() {
		return maskedCardNo;
	}
	public void setMaskedCardNo(String maskedCardNo) {
		this.maskedCardNo = maskedCardNo;
	}
	
	public Long getCheckoutOrderId() {
		if (checkoutOrderId==null && callbackUrl!=null) {
			Matcher m = checkoutOrderIdPattern.matcher(callbackUrl);
			if (m.matches()) {
				checkoutOrderId = Long.parseLong(m.group(1));
			}
		}
		return checkoutOrderId;
	}
	public void setCheckoutOrderId(Long checkoutOrderId) {
		this.checkoutOrderId = checkoutOrderId;
	}
	
	
	
	
}
