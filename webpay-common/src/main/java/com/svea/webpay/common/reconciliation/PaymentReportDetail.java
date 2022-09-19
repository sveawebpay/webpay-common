package com.svea.webpay.common.reconciliation;

import java.beans.Transient;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.svea.webpay.common.auth.SveaCredential;
import com.svea.webpay.common.conv.JsonUtil;

public class PaymentReportDetail {

	public static Pattern invoiceNoPattern = Pattern.compile(".*?FA?K?T?\\s*(\\d{7,10}).*");
	public static Pattern orderInvoicePattern = Pattern.compile(".*?\\s+(.*?)/(\\d{7,10}).*$");
	public static Pattern reminderPattern = Pattern.compile(".*?\\bPÅM\\.?I?N?(AVG)?.*");
	public static Pattern collectionPattern = Pattern.compile(".*?\\bINK(ASSO)?(AVGI?F?T?)?\\b.*");
	public static Pattern dueDatePattern = Pattern.compile(".*?\\bFFD\\b.*");
	public static Pattern dueDatePatternFi = Pattern.compile(".*?ERÄPÄIVÄ.*");
	public static Pattern legalActionPattern = Pattern.compile(".*?\\bBF\\b.*");
	public static Pattern legalActionPattern2 = Pattern.compile(".*?UTLÄ?G?G?.*"); // Used on admin-invoices
	public static Pattern creditPattern = Pattern.compile("^KREDI?T?\\s+.*$");
	public static Pattern debitInvoicePattern = Pattern.compile("^REG?R?E?S?S?.*?(\\d{7,10}).*$");
	public static Pattern costPattern = Pattern.compile("^KOSTN?A?D?E?R?\\s+.*$");
	public static Pattern annualFeePattern = Pattern.compile("^ÅRSAVG.*$");
	public static Pattern paymentTermChangePattern = Pattern.compile("^OML.*$");
	public static Pattern refundPattern = Pattern.compile("^ÅT?E?R?BE?T?.*$");
	public static Pattern kickbackPattern = Pattern.compile(".*?KICK\\s?BACK.*$");
	public static Pattern depositAcctPattern = Pattern.compile(".*?SPÄRRKONTO.*$");
	public static Pattern vatAdjustmentPattern = Pattern.compile(".*?KORR MOMS.*");
	
	/**
	 * Common reference fields
	 */
	public static final String REF_EMAIL = "email";
	public static final String REF_ZIPCODE = "zipcode";
	public static final String REF_CLIENT_INVOICE_NO = "client_invoice_no";
	public static final String REF_CLIENT_INVOICE_ADDITIONAL_MATCHES = "client_invoice_additional_matches";
	public static final String REF_CLIENT_CUST_NO = "client_cust_no";
	public static final String REF_CLIENT_REF = "client_ref";
	public static final String REF_COMMENT = "comment";
	public static final String REF_CREDIT_ID = "credit_id";
	public static final String REF_DELIVERY_ID = "delivery_id";
	
	private String	paymentId;
	private String	paymentType;
	private String	invoiceId;
	private String	orderId;
	private String	checkoutOrderId;
	private String	customerId;
	private String	payerOrgNo;
	private String	payerName;
	private String	clientOrderNo;
	private String	orderDate;
	private Double	orderTotalAmt;
	private Double  orderVat;
	private Double	paidAmt;
	private Double	receivedAmt;
	private Boolean	retry = null;
	private Boolean	enrichFromInvoice = null;
	private Boolean enrichFromOrder = null;
	private List<PaymentReference> references;
	private List<FeeDetail>	fees;
	
	public PaymentReportDetail() {}
	
	public PaymentReportDetail(
			String paymentId, 
			String invoiceId, 
			String orderId,
			String customerId,
			String payerOrgNo,
			String payerName,
			String clientReference,
			Double paidAmt,
			Double receivedAmt) {
		
		this.paymentId = paymentId;
		this.invoiceId = invoiceId;
		this.orderId = orderId;
		this.customerId = customerId;
		this.payerOrgNo = payerOrgNo;
		this.payerName = payerName;
		this.clientOrderNo = clientReference;
		this.paidAmt = paidAmt;
		this.receivedAmt = receivedAmt;
		
	}
	
	public void addFee(FeeDetail fee) {
		if (fees==null) {
			fees = new ArrayList<FeeDetail>();
		}
		fees.add(fee);
	}
	
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCheckoutOrderId() {
		return checkoutOrderId;
	}

	public void setCheckoutOrderId(String checkoutOrderId) {
		this.checkoutOrderId = checkoutOrderId;
	}

	public String getPayerOrgNo() {
		return payerOrgNo;
	}
	public void setPayerOrgNo(String payerOrgNo) {
		this.payerOrgNo = payerOrgNo;
	}
	public String getPayerName() {
		return payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public String getClientOrderNo() {
		return clientOrderNo;
	}
	public void setClientOrderNo(String clientOrderNo) {
		this.clientOrderNo = clientOrderNo;
	}
	
	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Transient
	public Date getOrderDateAsDate() throws ParseException {
		if (orderDate==null) return null;
		return JsonUtil.getDateFormat().parse(orderDate);
	}
	
	public Double getOrderTotalAmt() {
		return orderTotalAmt;
	}

	public void setOrderTotalAmt(Double orderTotalAmt) {
		this.orderTotalAmt = orderTotalAmt;
	}

	public Double getOrderVat() {
		return orderVat;
	}

	public void setOrderVat(Double orderVat) {
		this.orderVat = orderVat;
	}

	public List<PaymentReference> getReferences() {
		return references;
	}

	public void setReferences(List<PaymentReference> references) {
		this.references = references;
	}

	/**
	 * Adds a reference. If an existing reference with the same key exists,
	 * it's replaced.
	 * 
	 * If the value is null, an existing reference with that key is removed.
	 * 
	 * @param key
	 * @param value
	 */
	@Transient
	public void addReference(String key, String value) {
		
		if (key==null) return;
		if (references==null && value==null) return;

		if (references==null)
			references = new ArrayList<PaymentReference>();
		
		PaymentReference existing = null;
		
		// Check for existing reference of the key
		for (PaymentReference r : references) {
			if (key.equalsIgnoreCase(r.getReferenceKey())) {
				existing = r;
				break;
			}
		}

		if (existing!=null) {
			existing.setReferenceValue(value);
		} else {
			references.add(new PaymentReference(key, value));
		}
		
	}
	
	/**
	 * Gets a given reference with key
	 * @param key
	 * @return
	 */
	@Transient
	public String getReference(String key) {

		if (references==null || key==null) return null;
		
		for (PaymentReference r : references) {
			if (key.equalsIgnoreCase(r.getReferenceKey())) {
				return r.getReferenceValue();
			}
		}

		return null;
	}
		
	public boolean hasFees() {
		return fees!=null && fees.size()>0;
	}

	/**
	 * If this payment detail only describes fees, this method returns true.
	 * @return
	 */
	public boolean hasOnlyFees() {
		if (hasFees() && getPaidAmt()==0d) {
			if (getReceivedAmt()!=0) return true;
		}
		return false;
	}
	
	
	@Transient
	public boolean hasComments() {
		return getReference(REF_COMMENT)!=null;
	}

	/**
	 * 
	 * @return	A list of comments. An empty list is returned if there are no comments.
	 */
	public List<String> listComments() {
		List<String> comments = new ArrayList<String>();
		if (references == null)
			return comments;
		for (PaymentReference r : references) {
			if (REF_COMMENT.equals(r.getReferenceKey())) {
				comments.add(r.getReferenceValue());
			}
		}
		return comments;
	}

	@Transient
	public boolean hasDeviations() {
		return listDeviations().size()>0;
	}
	
	/**
	 * 
	 * @return	A list of deviations. An empty list is returned if there are no deviations.
	 */
	public List<FeeDetail> listDeviations() {
		List<FeeDetail> deviations = new ArrayList<FeeDetail>();
		if (fees==null) return deviations;
		for (FeeDetail fee : fees) {
			if (FeeDetail.FEETYPE_DEVIATIONS.equals(fee.getFeeType())) {
				deviations.add(fee);
			}
		}
		return deviations;
	}
	
	public List<FeeDetail> getFees() {
		return fees;
	}
	public void setFees(List<FeeDetail> fees) {
		this.fees = fees;
	}

	public Double getPaidAmt() {
		if (paidAmt==null) paidAmt = new Double(0);
		return paidAmt;
	}

	public void setPaidAmt(Double paidAmt) {
		this.paidAmt = paidAmt;
	}

	public Double getReceivedAmt() {
		if (receivedAmt==null) receivedAmt = new Double(0);
		return receivedAmt;
	}

	public void setReceivedAmt(Double receivedAmt) {
		this.receivedAmt = receivedAmt;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	// Calculates received amount based on paid amount and fees
	public Double calculateReceivedAmt() {
		
		double totalFees = 0D;
		if (getFees()!=null) {
			for (FeeDetail fee : getFees()) {
				totalFees += fee.getFeeTotal();
			}
		}
		
		receivedAmt = paidAmt - totalFees;

		return receivedAmt;
	}

	/**
	 * For this flag to be considered, the processRetryPaymentsOnly should be 
	 * true on the group.
	 * 
	 * If processRetryPaymentsOnly are true and this flag is true, this payment is
	 * processed again.
	 * 
	 * @return		True if this report only should be considered for retries.
	 */
	public Boolean getRetry() {
		return retry;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

	
	/**
	 * Payment type (if different from group).
	 * @return		The payment type (if different from the group's payment type).
	 */
	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * A processing flag that asks this record to be enriched from invoice
	 *  
	 * @return
	 */
	public Boolean getEnrichFromInvoice() {
		return enrichFromInvoice;
	}

	public void setEnrichFromInvoice(Boolean enrichFromInvoice) {
		this.enrichFromInvoice = enrichFromInvoice;
	}

	/**
	 * A processing flag that asks this record to be enriched from order
	 * 
	 * @return
	 */
	public Boolean getEnrichFromOrder() {
		return enrichFromOrder;
	}

	public void setEnrichFromOrder(Boolean enrichFromOrder) {
		this.enrichFromOrder = enrichFromOrder;
	}
	
	
	/**
	 * 
	 * @return		True if this payment report detail is a kickback (and nothing else)
	 */
	public boolean isKickbackOnly() {
		
		if (fees==null) return false;
		List<FeeDetail> kickbacks = new ArrayList<FeeDetail>();
		for (FeeDetail f : fees) {
			if (FeeDetail.FEETYPE_KICKBACK.equalsIgnoreCase(f.getFeeType())) {
				kickbacks.add(f);
			}
		}
		
		double kickBackSum = FeeDetail.getTotalSum(kickbacks);
		// TODO: Rounding precision should be a setting. 
		if (FeeDetail.roundFee(kickBackSum, 2) == FeeDetail.roundFee(-receivedAmt, 2))
			return true;
		
		return false;
	}
	
	/**
	 * Generates payment report detail from supplied parameters
	 * 
	 * @param countryCode
	 * @param accountType
	 * @param vatRateDate
	 * @param isCompany
	 * @param description
	 * @param amount
	 * @param qty
	 * @param rowId
	 * @return
	 * @throws UnclearVatRateException 
	 */
	public static PaymentReportDetail parseDeviation(
			String countryCode,
			String accountType,
			Date vatRateDate,
			boolean isCompany,
			String description, 
			double amount, 
			double qty, 
			int rowId) throws UnclearVatRateException {

		PaymentReportDetail result = new PaymentReportDetail();
		
		if (description==null) description = "";
		
		// Convert description to uppercase
		description = description.toUpperCase();
		
		Matcher invoiceNoMatcher = invoiceNoPattern.matcher(description);
		Matcher orderInvoiceMatcher = orderInvoicePattern.matcher(description);
		Matcher reminderMatcher = reminderPattern.matcher(description);
		Matcher collectionMatcher = collectionPattern.matcher(description);
		Matcher dueDateMatcher = dueDatePattern.matcher(description);
		Matcher legalActionMatcher = legalActionPattern.matcher(description);
		Matcher legalActionMatcher2 = legalActionPattern2.matcher(description);
		Matcher creditMatcher = creditPattern.matcher(description);
		Matcher debitInvoiceMatcher = debitInvoicePattern.matcher(description);
		Matcher costMatcher = costPattern.matcher(description);
		Matcher annualFeeMatcher = annualFeePattern.matcher(description);
		Matcher paymentTermChangeMatcher = paymentTermChangePattern.matcher(description);
		Matcher refundMatcher = refundPattern.matcher(description);
		Matcher kickbackMatcher = kickbackPattern.matcher(description); 
		Matcher depositAcctMatcher = depositAcctPattern.matcher(description);
		Matcher vatAdjustmentMatcher = vatAdjustmentPattern.matcher(description);

		if (invoiceNoMatcher.matches()) {
			result.setInvoiceId(invoiceNoMatcher.group(1));
		}
		if (orderInvoiceMatcher.matches()) {
			result.setClientOrderNo(orderInvoiceMatcher.group(1));
			result.setInvoiceId(orderInvoiceMatcher.group(2));
		}
		
		// Invoice matching
		if (result.getInvoiceId()!=null && 
				!creditMatcher.matches() && 
				!debitInvoiceMatcher.matches() &&
				!paymentTermChangeMatcher.matches()) {
			
			result.setEnrichFromInvoice(Boolean.TRUE);
			
			FeeDetail fee = new FeeDetail();
			fee.setFee(-amount);
			
			if (reminderMatcher.matches()) {
				fee.setFeeType(FeeDetail.FEETYPE_REMINDER);
			} else if (collectionMatcher.matches()) {
				fee.setFeeType(FeeDetail.FEETYPE_COLLECTION);
			} else if (dueDateMatcher.matches()) {
				fee.setFeeType(FeeDetail.FEETYPE_DUEDATE);
			} else if (legalActionMatcher.matches()) {
				fee.setFeeType(FeeDetail.FEETYPE_LEGAL_ACTION);
			} else if (costMatcher.matches()) {
				fee.setFeeType(FeeDetail.FEETYPE_COST);
			} else if (vatAdjustmentMatcher.matches()) {
				fee.setFeeType(FeeDetail.FEETYPE_VAT);
			} else {
				fee.setFeeType(FeeDetail.FEETYPE_DEVIATIONS);
			}

			result.addFee(fee);
			
			// Calculate vat on fees
			if (result.getFees()!=null && result.getFees().size()>0) {
				
				if (!vatAdjustmentMatcher.matches()) {
					double vatRate = 0D;
					for (FeeDetail f : result.getFees()) {
						try {
							vatRate = VatType.getVatRate(
									countryCode, 
									f.getFeeType(), 
									accountType,
									vatRateDate,
									isCompany);
							f.calculateVat(vatRate);
						} catch (UnclearVatRateException uvre) {
							System.err.println(uvre.getMessage());
							description = description + " :VAT unclear (" + f.getFeeType() + ")";
						}
					}
				}

				double totalFees = FeeDetail.getTotalSum(result.getFees());
				result.setReceivedAmt(-totalFees);
				result.setPaidAmt(0D);
				
			}
			
			
		} else if (result.getInvoiceId()!=null && 
				(creditMatcher.matches() 
						|| paymentTermChangeMatcher.matches()
						|| refundMatcher.matches()
						)) {
			
			// Credit matching
			result.setEnrichFromInvoice(Boolean.TRUE);
			result.setReceivedAmt(amount);
			result.setPaidAmt(amount);

		} else if (debitInvoiceMatcher.matches()) {
			
			String invoiceId = debitInvoiceMatcher.group(1);
			result.setInvoiceId(invoiceId);
			result.setEnrichFromInvoice(Boolean.TRUE);
			result.setReceivedAmt(amount);
			result.setPaidAmt(amount);
			
		} else {

			// Check if utlägg on admin invoices
			if (SveaCredential.ACCOUNTTYPE_ADMIN.equals(accountType) && legalActionMatcher2.matches()) {
				FeeDetail fee = new FeeDetail();
				fee.setFee(-amount);
				fee.setFeeType(FeeDetail.FEETYPE_LEGAL_ACTION);
				result.addFee(fee);
			} else
			
			// Check if annual fee
			if (annualFeeMatcher.matches()) {
				FeeDetail fee = new FeeDetail();
				fee.setFee(-amount);
				fee.setFeeType(FeeDetail.FEETYPE_ADM);
				result.addFee(fee);
			} else 
			
			// Check if kickback
			if (kickbackMatcher.matches()) {
				FeeDetail fee = new FeeDetail();
				fee.setFee(-amount);
				fee.setFeeType(FeeDetail.FEETYPE_KICKBACK);
				result.addFee(fee);
			} else 
				
			if (depositAcctMatcher.matches()) {
				FeeDetail fee = new FeeDetail();
				fee.setFee(-amount);
				fee.setFeeType(FeeDetail.ACCTTYPE_DEPOSIT);
				result.addFee(fee);
			}
			
			// Calculate vat on fees
			if (result.getFees()!=null && result.getFees().size()>0) {
				
				double vatRate = 0D;
				for (FeeDetail f : result.getFees()) {
					if (!FeeDetail.ACCTTYPE_DEPOSIT.equalsIgnoreCase(f.getFeeType())) {
						try {
							vatRate = VatType.getVatRate(
									countryCode, 
									f.getFeeType(), 
									accountType,
									vatRateDate,
									isCompany);
							f.calculateVat(vatRate);
						} catch (UnclearVatRateException uvre) {
							System.err.println(uvre.getMessage());
							description = description + " :VAT unclear (" + f.getFeeType() + ")";
						}
					}
				}

				double totalFees = FeeDetail.getTotalSum(result.getFees());
				result.setReceivedAmt(-totalFees);
				result.setPaidAmt(0D);
			}
			
		}
		
		// If nothing was matched
		if (result.getFees()==null && result.getReceivedAmt()==null) {
			FeeDetail fee = new FeeDetail();
			fee.setFee(0D);
			fee.setFeeType(FeeDetail.FEETYPE_DEVIATIONS);
			result.addFee(fee);
			result.setReceivedAmt(amount);
			result.setPaidAmt(amount);
		}
		
		result.addReference(PaymentReportDetail.REF_COMMENT, description);
		
		return result;
		
	}
	
	
}
