package com.svea.webpay.common.reconciliation;

/*

Copyright 2019 Svea Ekonomi AB

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/

import java.beans.Transient;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.svea.webpay.common.conv.JsonUtil;

/**
 * This class represents a group of payment details. This group shares the same bank account, currency,
 * reconciliation date and other relevant properties for a payment batch.
 * 
 * @author Daniel Tamm
 *
 */
public class PaymentReportGroup {

	private String	dstAcct;
	private String	reconcileAcct;
	private String	paymentType;
	private String	paymentTypeReference;
	private String	taxId;
	private String	reconciliationDate;
	private String	currency;
	private String	dstBankAcct;
	private String	dstBankAcctType;
	private Double	openingBalance = 0D;
	private Double	endingBalance = 0D;
	private Double	totalPaidAmt = 0D;
	private Double	totalReceivedAmt = 0D;
	private Double	totalVatAmt = 0D;
	private String	vatAcct;
	private Boolean	createAccountingRecords = Boolean.TRUE;
	private Boolean	processRetryPaymentsOnly = Boolean.FALSE;
	private List<PaymentReportDetail> paymentReportDetail;
	private List<FeeDetail> totalInvoiceFees;
	private List<FeeDetail> totalOtherFees;
	private transient Map<String,FeeDetail> invoiceFeeMap;
	private transient Map<String,FeeDetail> otherFeeMap;
	
	/**
	 * Destination account for this statement. Free text, should mean something to 
	 * the receiving system.
	 * If reconcile account is used, the destination account is the account where the
	 * total paid amount ends and the reconcile account is where the individual payments
	 * end up.
	 * 
	 * @return			The destination account
	 */
	public String getDstAcct() {
		return dstAcct;
	}
	public void setDstAcct(String dstAcct) {
		this.dstAcct = dstAcct;
	}
	
	/**
	 * If reconcile account is used, this is the account where the payments are
	 * accounted first.
	 *  
	 * @return		Reconcile account
	 */
	public String getReconcileAcct() {
		return reconcileAcct;
	}
	public void setReconcileAcct(String reconcileAcct) {
		this.reconcileAcct = reconcileAcct;
	}
	/**
	 * Payment Type. Normally options like invoice, card payment etc.
	 * This field can be used to determine where/how the payments are processed.
	 * 
	 * @return		Payment Type
	 */
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	/**
	 * Payment Type Reference. Free text, could be customer number at card payment processor
	 * or equivalent.
	 * 
	 * @return		PaymentTypeReference
	 */
	public String getPaymentTypeReference() {
		return paymentTypeReference;
	}
	public void setPaymentTypeReference(String paymentTypeReference) {
		this.paymentTypeReference = paymentTypeReference;
	}
	
	/**
	 * If this group belongs to a different tax id than the report itself, this 
	 * attribute is set.
	 * 
	 * @return
	 */
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	
	/**
	 * Date when payments are reconciled (has arrived on the account)
	 * 
	 * @return		Reconciliation Date
	 */
	public String getReconciliationDate() {
		return reconciliationDate;
	}
	
	public void setReconciliationDate(java.util.Date date) {
		if (date!=null)
			reconciliationDate = JsonUtil.dfmt.format(date);
		else 
			reconciliationDate = null;
	}
	
	@Transient
	public Date getReconciliationDateAsDate() throws ParseException {
		if (reconciliationDate==null) return null;
		return JsonUtil.dfmt.parse(reconciliationDate);
	}
	
	public void setReconciliationDate(String reconciliationDate) {
		this.reconciliationDate = reconciliationDate;
	}
	
	/**
	 * Currency of all payments in the group.
	 * 
	 * @return		Currency
	 */
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	/**
	 * Recipients real bank account number.
	 * 
	 * @return		Bank account number
	 */
	public String getDstBankAcct() {
		return dstBankAcct;
	}
	public void setDstBankAcct(String dstBankAcct) {
		this.dstBankAcct = dstBankAcct;
	}
	
	/**
	 * The type of bank account (ie meaning of the bank account number)
	 * 
	 * @return	Type of bank account
	 */
	public String getDstBankAcctType() {
		return dstBankAcctType;
	}
	public void setDstBankAcctType(String dstBankAcctType) {
		this.dstBankAcctType = dstBankAcctType;
	}
	
	public List<PaymentReportDetail> getPaymentReportDetail() {
		return paymentReportDetail;
	}
	public void setPaymentReportDetail(List<PaymentReportDetail> paymentReportDetail) {
		this.paymentReportDetail = paymentReportDetail;
	}
	
	/**
	 * This is the total amount of the original payments (before fees)
	 * @return	Total Paid Amount
	 */
	public Double getTotalPaidAmt() {
		return totalPaidAmt;
	}
	public void setTotalPaidAmt(Double totalPaidAmt) {
		this.totalPaidAmt = totalPaidAmt;
	}
	
	/**
	 * This is the total amount paid out to client (after fees and other adjustments)
	 * @return	Total received amount.
	 */
	public Double getTotalReceivedAmt() {
		return totalReceivedAmt;
	}
	public void setTotalReceivedAmt(Double totalReceivedAmt) {
		this.totalReceivedAmt = totalReceivedAmt;
	}

	
	/**
	 * The opening balance for this account for this date.
	 * @return	Opening balance.
	 */
	public Double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(Double openingBalance) {
		this.openingBalance = openingBalance;
	}
	
	/**
	 * The ending balance for this account for this date.
	 * @return	Ending balance
	 */
	public Double getEndingBalance() {
		return endingBalance;
	}
	public void setEndingBalance(Double endingBalance) {
		this.endingBalance = endingBalance;
	}
	
	// Account to use for incoming VAT
	public String getVatAcct() {
		return vatAcct;
	}
	public void setVatAcct(String vatAcct) {
		this.vatAcct = vatAcct;
	}
	
	/**
	 * This indicates that a transfer accounting records should be 
	 * created. This is for accounting systems.
	 * 
	 * A transfer record is a booking between the destination account 
	 * and the reconciliation account.
	 * 
	 * @return	True if a transfer record should be created.
	 */
	public Boolean getCreateAccountingRecords() {
		return createAccountingRecords;
	}
	public void setCreateAccountingRecords(Boolean createAccountingRecords) {
		this.createAccountingRecords = createAccountingRecords;
	}
	
	/**
	 * If true only payments marked with retry are processed.
	 * Other accounting regarding the entire group should not be repeated.
	 * 
	 * @return		If only retry payments should be processed.
	 */
	public Boolean getProcessRetryPaymentsOnly() {
		return processRetryPaymentsOnly;
	}
	public void setProcessRetryPaymentsOnly(Boolean processRetryPaymentsOnly) {
		this.processRetryPaymentsOnly = processRetryPaymentsOnly;
	}
	
	public void addDetail(PaymentReportDetail d) {
		if (paymentReportDetail==null)
			paymentReportDetail = new ArrayList<PaymentReportDetail>();
		paymentReportDetail.add(d);
		
		totalPaidAmt += d.getPaidAmt();
		totalReceivedAmt += d.getReceivedAmt();
		totalReceivedAmt = Math.round(totalReceivedAmt * 100)/(100D);
		
		// Summarize fees
		if (d.getFees()!=null) {
			for (FeeDetail f : d.getFees()) {
				addInvoiceFee(f);
			}
		}
		
	}
	
	/**
	 * Finds first detail with given amount and fee type
	 * 
	 * @param feeType
	 * @param amount
	 * @return
	 */
	public PaymentReportDetail findDetailWithFeeAmount(String feeType, Double amount) {
		if (paymentReportDetail==null) return null;
		if (feeType==null) return null;
		PaymentReportDetail result = null;
		
		for (PaymentReportDetail d : paymentReportDetail) {
			if (d.getFees()==null) continue;
			for (FeeDetail f : d.getFees()) {
				if (feeType.equals(f.getFeeType()) && amount.equals(d.getReceivedAmt())) {
					result = d;
					break;
				}
			}
			if (result!=null)
				break;
			
		}
		return result;
	}
	
	public void removeDetail(PaymentReportDetail d) {
		if (paymentReportDetail==null)
			return;
		
		if (paymentReportDetail.contains(d)) {
			paymentReportDetail.remove(d);
			
			totalPaidAmt -= d.getPaidAmt();
			totalReceivedAmt -= d.getReceivedAmt();
			totalReceivedAmt = Math.round(totalReceivedAmt * 100)/(100D);
			
			// Remove from fee summary
			if (d.getFees()!=null) {
				for (FeeDetail f : d.getFees()) {
					if (!FeeDetail.FEETYPE_DEVIATIONS.equalsIgnoreCase(f.getFeeType())) {
						removeInvoiceFee(f);
					} else {
						removeOtherFee(f);
					}
				}
			}
		}
		
	}
	
	/**
	 * Gets rounding record if any.
	 * 
	 * @return
	 */
	public FeeDetail getRoundingRecord() {
		
		FeeDetail roundingFee = null;
		if (otherFeeMap!=null) {
			roundingFee = otherFeeMap.get(FeeDetail.FEETYPE_ROUNDING);
		}
		return roundingFee;
	}
	

	/**
	 * Adds fee detail to total fees
	 * 
	 * @param f		The invoice fee to be added
	 */
	private void addInvoiceFee(FeeDetail f) {
		if (f==null) return;
		if (invoiceFeeMap==null) {
			invoiceFeeMap = new TreeMap<String,FeeDetail>();
		}
		FeeDetail src = invoiceFeeMap.get(f.getFeeType());
		if (src==null) {
			invoiceFeeMap.put(f.getFeeType(), new FeeDetail(f));
		} else {
			src.add(f);
		}
	}
	
	
	private void removeInvoiceFee(FeeDetail f) {
		if (f==null) return;
		if (invoiceFeeMap==null) return;
		FeeDetail src = invoiceFeeMap.get(f.getFeeType());
		if (src==null) return;
		src.subtract(f);
	}
	
	private void removeOtherFee(FeeDetail f) {
		if (f==null) return;
		if (otherFeeMap==null) return;
		FeeDetail src = otherFeeMap.get(f.getFeeType());
		if (src==null) return;
		src.subtract(f);
	}
	
	/**
	 * Clears all fees for this group
	 */
	public void clearFees() {
		
		setTotalReceivedAmt(getTotalPaidAmt());
		setTotalVatAmt(0D);
		
		if (paymentReportDetail!=null) {
		
			for (PaymentReportDetail d : paymentReportDetail) {
				d.setFees(null);
				d.setReceivedAmt(d.getPaidAmt());
			}
			
		}
		
		totalInvoiceFees = null;
		totalOtherFees = null;
		invoiceFeeMap = null;
		otherFeeMap = null;
		
	}
	
	/**
	 * Adds other fee. This fee is not tied to a specific invoice
	 * but is for the whole payment report group.
	 * 
	 * @param f			The other fee to be added
	 */
	public void addOtherFee(FeeDetail f) {
		if (f==null) return;
		if (otherFeeMap==null) {
			otherFeeMap = new TreeMap<String,FeeDetail>();
		}
		if (f.getFeeType()==null) {
			f.setFeeType(FeeDetail.FEETYPE_DEVIATIONS);
		}
		FeeDetail src = otherFeeMap.get(f.getFeeType());
		if (src==null) {
			otherFeeMap.put(f.getFeeType(), f);
		} else {
			src.add(f);
		}
	}
	

	/**
	 * Updates the total fees from the internal fee map and rounds
	 * If a fee is zero, it's removed.
	 */
	public void updateTotalFees() {
		List<FeeDetail> zeroFees = new ArrayList<FeeDetail>();
		if (invoiceFeeMap!=null) {
			totalInvoiceFees = new ArrayList<FeeDetail>(invoiceFeeMap.values());
			for (FeeDetail f : totalInvoiceFees) {
				f.roundAll();
				if (f.getFeeTotal()==0) {
					zeroFees.add(f);
				}
			}
			for (FeeDetail f : zeroFees) {
				totalInvoiceFees.remove(f);
				invoiceFeeMap.remove(f.getFeeType());
			}
		}
		if (otherFeeMap!=null) {
			zeroFees.clear();
			totalOtherFees = new ArrayList<FeeDetail>(otherFeeMap.values());
			for (FeeDetail f : totalOtherFees) {
				f.roundAll();
				if (f.getFeeTotal()==0) {
					zeroFees.add(f);
				}
			}
			for (FeeDetail f : zeroFees) {
				totalOtherFees.remove(f);
				otherFeeMap.remove(f.getFeeType());
			}
		}
	}

	/**
	 * @see updateTotalFees
	 * @return		A list of total invoice fees
	 */
	public List<FeeDetail> getTotalInvoiceFees() {
		return totalInvoiceFees;
	}
	
	public void setTotalInvoiceFees(List<FeeDetail> totalFees) {
		this.totalInvoiceFees = totalFees;
	}
	
	public Double getTotalVatAmt() {
		return totalVatAmt;
	}
	
	public void setTotalVatAmt(Double totalVatAmt) {
		this.totalVatAmt = totalVatAmt;
	}
	
	public List<FeeDetail> getTotalOtherFees() {
		return totalOtherFees;
	}
	
	/**
	 * Calculates a rounding fee.
	 * If the rounding fee is larger than 5 SEK or 0.5 EUR, the fee type is set to deviation
	 * instead of rounding.
	 * 
	 * @param includedGroups		If groups are included in this group (i e card payments),
	 * 								these groups amounts are also considered.
	 * @return
	 */
	@Transient
	public FeeDetail calculateRoundingFee(double actualReceivedAmt, List<PaymentReportGroup> includedGroups) {

		double amt = calculateReceivedAmt();
		
		if (includedGroups!=null) {
			for (PaymentReportGroup g : includedGroups) {
				amt += g.calculateReceivedAmt();
			}
		}

		// Round amt
		amt = FeeDetail.roundFee(amt, FeeDetail.DEFAULT_ROUNDING_DECIMALS);
		
		FeeDetail roundFee = null;
		
		if (actualReceivedAmt!=amt) {
			double roundingAmt = amt - actualReceivedAmt;
			String feeType = FeeDetail.FEETYPE_ROUNDING;
			roundFee = new FeeDetail();
			if ("EUR".equalsIgnoreCase(this.getCurrency())) {
				if (Math.abs(roundingAmt)>0.5)
					feeType = FeeDetail.FEETYPE_DEVIATIONS;
			} else if (Math.abs(roundingAmt)>5) {
				feeType = FeeDetail.FEETYPE_DEVIATIONS;
			}
			roundFee.setFeeType(feeType);
			roundFee.setFee(roundingAmt);
		}
		
		return roundFee;
		
	}

	@Transient
	public double calculateReceivedAmt() {

		double amt = openingBalance;
		if (paymentReportDetail==null) return amt;
		for (PaymentReportDetail d : paymentReportDetail) {
			amt += d.calculateReceivedAmt();
		}
		// Consider other fees
		double otherFees = -FeeDetail.getTotalSum(getTotalOtherFees());
		amt += otherFees;
		
		return amt;
		
	}
	
	/**
	 * Cancels other fees.
	 * If an other fee with FeeType can be cancelled by the exact amount with
	 * a cancel candidate feeType, they are cancelled.
	 * 
	 * @param feeType
	 * @param cancelCandidates
	 */
	public void cancelOtherFees(String feeType, String[] cancelCandidates) {
		
		if (otherFeeMap==null) return;
		FeeDetail src = otherFeeMap.get(feeType);
		if (src==null) return;

		FeeDetail candidate;
		for (String c : cancelCandidates) {
			
			candidate = otherFeeMap.get(c);
			if (candidate==null)
				continue;
		
			double diff = 0D;
			diff = src.getFeeTotal() + candidate.getFeeTotal();
			
			if ((("SEK".equalsIgnoreCase(currency) 
					|| "NOK".equalsIgnoreCase(currency) 
					|| "DKK".equalsIgnoreCase(currency))
					&& Math.abs(diff) <= 0.25)
				|| ("EUR".equalsIgnoreCase(currency) && Math.abs(diff) <= 0.025)
					) {
				otherFeeMap.remove(src.getFeeType());
				otherFeeMap.remove(candidate.getFeeType());
				if (diff!=0) {
					FeeDetail f = new FeeDetail();
					f.setFee(diff);
					f.setFeeType(FeeDetail.FEETYPE_ROUNDING);
					f.roundAll();
					addOtherFee(f);
				}
				updateTotalFees();
			}
			
		}
		
	}

	/**
	 * Checks for small deviations (less than 2 SEK/NOK or 0,5 EUR) and sets them to rounding instead
	 */
	public void replaceDeviationsAsRounding() {
		
		if (otherFeeMap==null) return;
		FeeDetail existingRounding = otherFeeMap.get(FeeDetail.FEETYPE_ROUNDING);
		// Check for deviation
		FeeDetail deviation = otherFeeMap.get(FeeDetail.FEETYPE_DEVIATIONS);
		if (deviation==null) return;
		
		if (("EUR".equalsIgnoreCase(getCurrency()) && Math.abs(deviation.getFeeTotal())<0.5) || 
			(("SEK".equalsIgnoreCase(getCurrency()) || "NOK".equalsIgnoreCase(getCurrency()))
					&& Math.abs(deviation.getFeeTotal())<2)) {

			// Remove the deviation from the feeMap
			otherFeeMap.remove(FeeDetail.FEETYPE_DEVIATIONS);
			
			if (existingRounding!=null) {
				// Add the value to rounding.
				existingRounding.add(deviation);
			} else {
				deviation.setFeeType(FeeDetail.FEETYPE_ROUNDING);
				otherFeeMap.put(FeeDetail.FEETYPE_ROUNDING, deviation);
			}
			updateTotalFees();
			
		}
		
	}
	
	/**
	 * Checks the VAT-total and compares with total vat on lines.
	 * If vat on lines differ from VAT-total this difference is moved
	 * to rounding.
	 * 
	 * Some systems need this (Specter)
	 * 
	 */
	public void roundVatToGroupValue() {
		
		List<FeeDetail> allFees = new ArrayList<FeeDetail>();
		if (getTotalInvoiceFees()!=null) allFees.addAll(getTotalInvoiceFees());
		if (getTotalOtherFees()!=null) allFees.addAll(getTotalOtherFees());
		
		double vatSum = FeeDetail.getVatSum(allFees);
		
		FeeDetail roundingFee = null;
		double diff = vatSum - this.getTotalVatAmt();
		boolean newFee = false;
		if (diff!=0.0) {
			roundingFee = this.getRoundingRecord();
			if (roundingFee==null) {
				roundingFee = new FeeDetail();
				roundingFee.setFeeType(FeeDetail.FEETYPE_ROUNDING);
				newFee = true;
			}
			roundingFee.setFeeVat(roundingFee.getFeeVat()-diff);
			roundingFee.setFee(roundingFee.getFee()+diff);
			if (newFee) {
				this.addOtherFee(roundingFee);
			}
			updateTotalFees();
		}
		
	}
	
	/**
	 * 
	 * @param totalOtherFees				The other fees to be considered.
	 * @param invoiceFeeTypes				The fee type to be reduced
	 * @param invoiceFeesIncludedInTotal	If invoice fees are included in otherFees, the other fees are to be
	 * 										reduced with the invoice fees.
	 */
	public void combineTotalOtherFees(List<FeeDetail> totalOtherFees, String[] invoiceFeeTypes, boolean invoiceFeesIncludedInTotal) {
		if (totalOtherFees==null) return;
		
		if (this.totalOtherFees == null) {
			this.totalOtherFees = totalOtherFees;
		} else {
			if (this.totalOtherFees!=totalOtherFees) {
				this.totalOtherFees.addAll(totalOtherFees);
			}
		}
		
		if (invoiceFeesIncludedInTotal && invoiceFeeMap!=null && invoiceFeeTypes!=null) {
			
			for (String invoiceFeeType : invoiceFeeTypes) {
			
				FeeDetail f = invoiceFeeMap.get(invoiceFeeType);
				if (f!=null) {
					FeeDetail.subtract(this.totalOtherFees, invoiceFeeTypes, false, f);
					// Round all
					for (FeeDetail fi : this.totalOtherFees) {
						fi.roundAll();
					}
				}
				
			}
			
		}
		
		// Update total otherfees map
		if (otherFeeMap!=null) otherFeeMap.clear();
		
		for (FeeDetail f : this.totalOtherFees) {
			addOtherFee(f);
		}
		
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("{");
		if (dstAcct!=null) {
			if (dstAcct!=null) {
				str.append("DstAcct: " + dstAcct);
			}
			if (reconcileAcct!=null) {
				if (str.length()>1) str.append(", ");
				str.append("ReconcileAcct: " + reconcileAcct);
			}
			if (paymentType!=null) {
				if (str.length()>1) str.append(", ");
				str.append("PaymentType: " + paymentType);
			}
			if (paymentTypeReference!=null) {
				if (str.length()>1) str.append(", ");
				str.append("PaymentTypeRef: " + paymentTypeReference);
			}
			if (reconciliationDate!=null) {
				if (str.length()>1) str.append(", ");
				String dateStr = null;
				try {
					dateStr = JsonUtil.dfmt.format(reconciliationDate);
				} catch (Exception e) {
					dateStr = reconciliationDate;
				}
				str.append("Date: " + dateStr);
			}
			if (currency!=null) {
				if (str.length()>1) str.append(", ");
				str.append("Currency: " + currency);
			}
			if (totalPaidAmt!=null) {
				if (str.length()>1) str.append(", ");
				str.append("Total Paid: " + totalPaidAmt);
			}
			if (totalReceivedAmt!=null) {
				if (str.length()>1) str.append(", ");
				str.append("Total Received: " + totalReceivedAmt);
			}
		}
		str.append("}");
		return str.toString();
	}
	
	/**
	 * Checks if this group is empty from any payment information.
	 * 
	 * Empty means zero amounts, no fees and no transactions.
	 * 
	 * @return	true if empty
	 */
	@Transient
	public boolean isEmpty() {
		
		boolean noFees = totalInvoiceFees==null || totalInvoiceFees.isEmpty();
		boolean noOtherFees = totalOtherFees == null || totalOtherFees.isEmpty();
		boolean noDetails = paymentReportDetail == null || paymentReportDetail.isEmpty();
		boolean noAmounts = (totalPaidAmt==null || totalPaidAmt==0D)
				&& (totalReceivedAmt==null || totalReceivedAmt==0D)
				&& (totalVatAmt==null || totalVatAmt==0D);
		
		return (noFees && noOtherFees && noDetails && noAmounts);
		
	}
}
