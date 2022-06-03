package com.svea.webpay.common.reconciliation;

import java.beans.Transient;

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

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.svea.webpay.common.auth.SveaCredential;
import com.svea.webpay.common.conv.InvalidTaxIdFormatException;
import com.svea.webpay.common.conv.JsonUtil;
import com.svea.webpay.common.conv.LocalDateUtils;
import com.svea.webpay.common.conv.TaxIdFormatter;
import com.svea.webpay.common.conv.TaxIdStructure;
import com.svea.webpay.common.conv.UnknownTaxIdFormatException;

/**
 * The top structure of a report. 
 * 
 * The report contains a list of PaymentReportGroup which in turn contains a list of PaymentReportDetail.
 * 
 * @author Daniel Tamm
 * @see		PaymentReportGroup
 * @see 	PaymentReportDetail
 *
 */
public class PaymentReport {

	private String taxId;
	private String orgName;
	private String taxIdFormat;
	private AccountingReport	accountingReport;
	
	/**
	 * Tax id of the organization that this report belongs to.
	 * @return		The tax id
	 */
	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	
	/**
	 * Returns tax id in specified destination format (if possible).
	 * 
	 * @param dstFormat		See TaxIdStructure.FMT_* for possible formats.
	 * 
	 * @return	The tax id formatted in specified format. If the source format can't
	 * 			be determined, the unformatted tax id is returned.
	 * 
	 * @throws InvalidTaxIdFormatException  If the tax id doesn't conform to the specified formats or
     * 										the source and destinations formats are incompatible.	 
	 * @throws UnknownTaxIdFormatException  If the tax id specified is not recognized.
	 */
	public String getTaxIdInFormat(String dstFormat) throws UnknownTaxIdFormatException, InvalidTaxIdFormatException {

		if (taxId == null) return null;
		
		String srcFormat = TaxIdFormatter.determineFormat(null, taxId);
		if (TaxIdStructure.FMT_UNKNOWN.equalsIgnoreCase(srcFormat)) {
			return taxId;
		}
		String dstTaxId = TaxIdFormatter.printTaxId(srcFormat, taxId, dstFormat);
		
		return dstTaxId;
	}
	
	/**
	 * Name of the organization that this report belongs to.
	 * @return		The name
	 */
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	/**
	 * Specifies in which format the tax id is stored.
	 * @return		The format identifier.
	 */
	public String getTaxIdFormat() {
		return taxIdFormat;
	}

	public void setTaxIdFormat(String taxIdFormat) {
		this.taxIdFormat = taxIdFormat;
	}

	private List<PaymentReportGroup> paymentReportGroup;

	public List<PaymentReportGroup> getPaymentReportGroup() {
		return paymentReportGroup;
	}

	public void setPaymentReportGroup(List<PaymentReportGroup> paymentReportGroup) {
		this.paymentReportGroup = paymentReportGroup;
	}

	/**
	 * Return only groups that match the given criteria. 
	 * 
	 * @param paymentType				null means all of this paymentType.
	 * @param paymentTypeReference		null means all of this paymentTypeReference.
	 * @return		Filtered groups.
	 */
	public List<PaymentReportGroup> filterGroups(String paymentType, String paymentTypeReference) {
		
		List<PaymentReportGroup> groups = new ArrayList<PaymentReportGroup>();

		// Pick out specific groups of paymentType and paymentType reference are specified.
		for (PaymentReportGroup gr : this.getPaymentReportGroup()) {
			if (paymentTypeReference==null && paymentType==null) {
				groups.add(gr);
			} else if (paymentTypeReference!=null && gr.getPaymentTypeReference().equalsIgnoreCase(paymentTypeReference) && (paymentType==null || gr.getPaymentType().equalsIgnoreCase(paymentType))) {
				groups.add(gr);
			} else if (paymentType!=null && gr.getPaymentType().equals(paymentType)) {
				groups.add(gr);
			}
		}
		
		return groups;
	}
	
	public boolean isEmpty() {
		return paymentReportGroup==null || paymentReportGroup.size()==0;
	}
	
	/**
	 * Adds a payment report group to this report.
	 * The total fees in the group are updated.
	 * 
	 * If the report doesn't have a tax ID set and there's a tax id in the group,
	 * the report gets the tax id of the group.
	 * 
	 * @param gr		The group to be added to the report.
	 */
	public void addPaymentReportGroup(PaymentReportGroup gr) {
		if (paymentReportGroup==null) {
			paymentReportGroup = new ArrayList<PaymentReportGroup>();
		}
		paymentReportGroup.add(gr);
		gr.updateTotalFees();
		if (taxId==null || taxId.trim().length()==0) {
			if (gr.getTaxId()!=null && gr.getTaxId().trim().length()>0) {
				taxId = gr.getTaxId();
			}
		}
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("{");
		if (taxId!=null) {
			str.append(taxId);
		}
		if (orgName!=null) {
			if (str.length()>1) {
				str.append(", ");
			}
			str.append(orgName);
		}
		str.append("}");
		return str.toString();
	}
	
	/**
	 * @return		All payment type references in this file as a list of string.
	 */
	public List<String> getPaymentTypeReferences() {
		
		List<String> result = new ArrayList<String>();
		if (paymentReportGroup==null)
			return result;

		Set<String> resultSet = new TreeSet<String>();
		
		for (PaymentReportGroup gr : paymentReportGroup) {
			if (gr.getPaymentTypeReference()!=null)
				resultSet.add(gr.getPaymentTypeReference());
		}
		
		// Convert set to list
		for (Iterator<String> i = resultSet.iterator(); i.hasNext();) {
			result.add(i.next());
		}
		
		return result;
		
	}
	
	/**
	 * 
	 * @return	The earliest date in this file
	 * @throws ParseException 
	 */
	public Date fromDate() throws ParseException {
		
		if (paymentReportGroup==null)
			return null;
		
		Date earliestDate = null;
		for (PaymentReportGroup gr : paymentReportGroup) {
			if (earliestDate==null || gr.getReconciliationDateAsDate().before(earliestDate)) {
				earliestDate = gr.getReconciliationDateAsDate();
			}
		}
		
		return earliestDate;
	}

	@Transient
	public Date getEarliestOrderDate() throws ParseException {
		if (isEmpty()) return null;
		
		Date earliestDate = new Date(Long.MAX_VALUE);
		Date groupDate;
		for (PaymentReportGroup gr : paymentReportGroup) {
			groupDate = gr.getEarliestOrderDate();
			if (groupDate!=null && groupDate.before(earliestDate)) {
				earliestDate = groupDate;
			}
		}
		return earliestDate;
	}
	
	/**
	 * Takes the until date in the report if it exists. 
	 * If the until date doesn't exist, try to find a date pattern
	 * in the file name (date should be last, just before the suffix).
	 * Date formats yyyy-MM-dd and yyMMdd
	 * 
	 * @param fileName			The filename to parse
	 * @return					The date (if found). If not found, null is returned.
	 * @throws ParseException	If the until date can't be parsed.
	 */
	@Transient
	public Date reportDate(String fileName) throws ParseException {
		if (untilDate()!=null) 
			return untilDate();
		
		// Try finding a date pattern in the file name
		if (fileName==null) return null;
		
		if (fileName.length()<6) 
			return null;
		
		int dotIdx = fileName.lastIndexOf(".");
		
		if (dotIdx<0) {
			dotIdx = fileName.length()-1;
		}
		String dateStr = fileName.substring(dotIdx-6, dotIdx);
		Date result = null;
		// Try parsing date
		if (!dateStr.contains("-")) {
			try {
				result = JsonUtil.getShortDateFormat().parse(dateStr);
				return result;
			} catch (ParseException pe1) {
			}
		}
		
		// Check for longer format
		if (fileName.length()<10) {
			return null;
		}
		dateStr = fileName.substring(dotIdx-10, dotIdx);
		try {
			result = JsonUtil.getDateFormat().parse(dateStr);
			return result;
		} catch (ParseException pe2) {
			return null;
		}
		
	}
	
	/**
	 * 
	 * @return	The latest date in this file
	 * @throws ParseException 
	 */
	public Date untilDate() throws ParseException {
		
		if (paymentReportGroup==null)
			return null;
		
		Date latestDate = null;
		for (PaymentReportGroup gr : paymentReportGroup) {
			if (latestDate==null || gr.getReconciliationDateAsDate().after(latestDate)) {
				latestDate = gr.getReconciliationDateAsDate();
			}
		}
		
		return latestDate;
	}

	/**
	 * Returns the total number of report lines
	 * 
	 * @return
	 */
	public long countReportLines() {
		
		if (paymentReportGroup==null || paymentReportGroup.isEmpty())
			return 0L;
		
		long total = 0;
		for (PaymentReportGroup g : paymentReportGroup) {
			total += g.getPaymentReportDetail()!=null ? g.getPaymentReportDetail().size() : 0;
		}
		
		return total;
		
	}
	
	/**
	 * Prunes the report of all empty report groups.
	 */
	public void pruneReport() {

		if (paymentReportGroup==null || paymentReportGroup.isEmpty())
			return;
		
		List<PaymentReportGroup> pruneThese = new ArrayList<PaymentReportGroup>();
		
		// Check which report groups are empty.
		for (PaymentReportGroup g : paymentReportGroup) {
			if (g.isEmpty()) {
				pruneThese.add(g);
			}
		}
		
		// Remove the empty ones
		if (!pruneThese.isEmpty()) {
			for (PaymentReportGroup g : pruneThese) {
				paymentReportGroup.remove(g);
			}
		}
		
	}
	
	/**
	 * 
	 * @return	Returns an accounting report if an accounting report has been generated / supplied
	 */
	public AccountingReport getAccountingReport() {
		return accountingReport;
	}

	public void setAccountingReport(AccountingReport accountingReport) {
		this.accountingReport = accountingReport;
	}

	/**
	 * 
	 * Retrieves a total of customer paid without calculating any VAT.
	 * 
	 * @param	paymentReference		If only this payment reference should be processed.
	 * @param 	paymentType				If only this payment type should be processed.
	 * 
	 * @return 	A list of revenue lines, one per day and payment reference.
	 * 
	 */
	public List<RevenueLine> retrieveUnspecifiedRevenueLines(String paymentReference, String paymentType) throws ParseException {
		
		List<RevenueLine> result = new ArrayList<RevenueLine>();
		RevenueLine rl = null;
		
		Map<LocalDate, List<RevenueLine>> revenueMap = new TreeMap<LocalDate, List<RevenueLine>>();
		List<RevenueLine> revenueList;
		
		if (getPaymentReportGroup()!=null) {
			
			// Map groups by date
			Map<LocalDate, List<PaymentReportGroup>> dateGroups = new TreeMap<LocalDate, List<PaymentReportGroup>>();
			List<PaymentReportGroup> groups;
			
			for (PaymentReportGroup g : getPaymentReportGroup()) {
				groups = dateGroups.get(LocalDateUtils.asLocalDate(g.getReconciliationDateAsDate()));
				if (groups==null) {
					groups = new ArrayList<PaymentReportGroup>();
					dateGroups.put(LocalDateUtils.asLocalDate(g.getReconciliationDateAsDate()), groups);
				}
				groups.add(g);
			}
			
			List<PaymentReportGroup> grs;
			for (LocalDate groupDate : dateGroups.keySet()) {

				grs = dateGroups.get(groupDate);
				
				revenueList = revenueMap.get(groupDate);
				if (revenueList==null) {
					revenueList = new ArrayList<RevenueLine>();
					revenueMap.put(groupDate, revenueList);
				}
				
				for (PaymentReportGroup gr : grs) {
					
					if ((paymentReference==null || paymentReference.equalsIgnoreCase(gr.getPaymentTypeReference()))
							&& 
							(paymentType==null || paymentType.equalsIgnoreCase(gr.getPaymentType()))) {

						if (gr.getPaymentReportDetail()!=null) {
							
							rl = new RevenueLine();
							
							rl.setAcctDate(LocalDateUtils.asLocalDate(gr.getReconciliationDateAsDate()));
							rl.setPaymentType(gr.getPaymentType());
							rl.setPaymentTypeReference(gr.getPaymentTypeReference());
							rl.setCurrency(gr.getCurrency());
							
							for (PaymentReportDetail d : gr.getPaymentReportDetail()) {
								rl.addRevenue(d.getPaidAmt(), 0D);
							}
							
							revenueList.add(rl);
							
						}
					
						
					}
				}
			}
			
		}
		
		if (!revenueMap.isEmpty()) {
			for (List<RevenueLine> rlist : revenueMap.values()) {
				result.addAll(rlist);
			}
		}
		
		return result;
		
	}
	
	/**
	 * Retrives payout information in a condensed format.
	 * @param	paymentReference	If non-null, only with this payment reference
	 * @param  	paymentType			If non-null, only with this payment type
	 * @param   detailedFeeTypes	Fee types to specify in detail.
	 * 
	 * @return		A list of payout lines for this report
	 * @throws ParseException If dates can't be parsed.
	 */
	public List<PayoutLine> retrievePayoutLines(String paymentReference, String paymentType, Set<String> detailedFeeTypes) throws ParseException {
		
		List<PayoutLine> result = new ArrayList<PayoutLine>();
		
		PayoutLine pl = null;
		
		// Make sure we have groups
		if (getPaymentReportGroup()!=null) {
			
			// Map groups by date
			Map<LocalDate, List<PaymentReportGroup>> dateGroups = new TreeMap<LocalDate, List<PaymentReportGroup>>();
			List<PaymentReportGroup> groups;
			
			for (PaymentReportGroup g : getPaymentReportGroup()) {
				groups = dateGroups.get(LocalDateUtils.asLocalDate(g.getReconciliationDateAsDate()));
				if (groups==null) {
					groups = new ArrayList<PaymentReportGroup>();
					dateGroups.put(LocalDateUtils.asLocalDate(g.getReconciliationDateAsDate()), groups);
				}
				groups.add(g);
			}

			// Iterate through the groups, one per date.
			for (List<PaymentReportGroup> grs : dateGroups.values()) {
			
				// Find credit card groups, direct debit groups and admin groups
				// since they can be included in invoice groups
				Map<String, PaymentReportGroup> creditCardGroups = new TreeMap<String,PaymentReportGroup>();
				Map<String, PaymentReportGroup> directDebitGroups = new TreeMap<String,PaymentReportGroup>();
				Map<String, PaymentReportGroup> adminGroups = new TreeMap<String, PaymentReportGroup>();
				Map<String, PaymentReportGroup> invoiceGroups = new TreeMap<String, PaymentReportGroup>();
				
				for (PaymentReportGroup gr : grs) {
					if (SveaCredential.ACCOUNTTYPE_CREDITCARD.equalsIgnoreCase(gr.getPaymentType())) {
						creditCardGroups.put(gr.getPaymentTypeReference(), gr);
						continue;
					}
					if (SveaCredential.ACCOUNTTYPE_DIRECT_BANK.equalsIgnoreCase(gr.getPaymentType())) {
						directDebitGroups.put(gr.getPaymentTypeReference(), gr);
						continue;
					}
					if (SveaCredential.ACCOUNTTYPE_ADMIN.equalsIgnoreCase(gr.getPaymentType())) {
						adminGroups.put(gr.getPaymentTypeReference(), gr);
						continue;
					}
					if (SveaCredential.ACCOUNTTYPE_INVOICE.equalsIgnoreCase(gr.getPaymentType())) {
						invoiceGroups.put(gr.getPaymentTypeReference(), gr);
					}
				}
	
				double totalPaidAmount = 0, totalReceivedAmount = 0, feeAmount = 0, feeAmountCard = 0;
				PaymentReportGroup ccGroup;
				PaymentReportGroup debitGroup;
				PaymentReportGroup adminGroup;
				boolean includedInOtherPayout = false;
			
				// Iterate through the groups for the given date.
				for (PaymentReportGroup gr : grs) {
					
					totalPaidAmount = gr.getTotalPaidAmt();
					totalReceivedAmount = gr.getTotalReceivedAmt();
					feeAmountCard = 0;
					
					if (gr.getPaymentType().equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_INVOICE)) {
						
						ccGroup = creditCardGroups.get(gr.getPaymentTypeReference());
						debitGroup = directDebitGroups.get(gr.getPaymentTypeReference());
						adminGroup = adminGroups.get(gr.getPaymentTypeReference());
						
						if (ccGroup!=null) {
							totalPaidAmount += ccGroup.getTotalPaidAmt();
							feeAmountCard += ccGroup.getTotalPaidAmt()-ccGroup.getTotalVatAmt()-ccGroup.getTotalReceivedAmt();
						}
						if (debitGroup!=null) {
							totalPaidAmount += debitGroup.getTotalPaidAmt();
							feeAmountCard += debitGroup.getTotalPaidAmt()-debitGroup.getTotalVatAmt()-debitGroup.getTotalReceivedAmt();
						}
						if (adminGroup!=null) {
							totalPaidAmount += adminGroup.getTotalPaidAmt();
							feeAmountCard += adminGroup.getTotalPaidAmt()-adminGroup.getTotalVatAmt()-adminGroup.getTotalReceivedAmt();
						}
						
					} 
					// Calculate fee amount
					feeAmount = totalPaidAmount-gr.getTotalVatAmt()- gr.getTotalReceivedAmt() + gr.getOpeningBalance() - feeAmountCard - gr.getEndingBalance();
					
					// If payment type is not invoice but a reference exists as invoice payout, this
					// is included in another payout.
					includedInOtherPayout = (!gr.getPaymentType().equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_INVOICE)) &&
							 invoiceGroups.containsKey(gr.getPaymentTypeReference());
					
					if (includedInOtherPayout) {
						totalReceivedAmount = 0;
						feeAmount = gr.getTotalPaidAmt()-gr.getTotalVatAmt()-gr.getTotalReceivedAmt();
					}
	
					// Check if paymentReference / paymentGroup applies
					if ((paymentReference==null || paymentReference.equalsIgnoreCase(gr.getPaymentTypeReference()))
						&& 
						(paymentType==null || paymentType.equalsIgnoreCase(gr.getPaymentType()))) {
						
							pl = new PayoutLine();
							
							pl.setAcctDate(LocalDateUtils.asLocalDate(gr.getReconciliationDateAsDate()));
							pl.setPaymentType(gr.getPaymentType());
							pl.setPaymentTypeReference(gr.getPaymentTypeReference());
							pl.setTrxCount(gr.getPaymentReportDetail()!=null ?  gr.getPaymentReportDetail().size() : 0);
							pl.setIncludedInOtherPayout(includedInOtherPayout);
							pl.setFeeAmount(FeeDetail.roundFee(feeAmount, FeeDetail.DEFAULT_ROUNDING_DECIMALS));
							pl.addFeeSpecifications(gr, detailedFeeTypes);
							pl.setTaxAmount(gr.getTotalVatAmt());
							pl.setCurrency(gr.getCurrency());
							pl.setPaidByCustomer(FeeDetail.roundFee(totalPaidAmount, FeeDetail.DEFAULT_ROUNDING_DECIMALS));
							pl.setPaidOut(FeeDetail.roundFee(totalReceivedAmount, FeeDetail.DEFAULT_ROUNDING_DECIMALS));
							pl.setOpeningBalance(gr.getOpeningBalance());
							pl.setEndingBalance(gr.getEndingBalance());
			
							result.add(pl);
					}
				}	
			}
		}
		
		return result;
	}
	
}
