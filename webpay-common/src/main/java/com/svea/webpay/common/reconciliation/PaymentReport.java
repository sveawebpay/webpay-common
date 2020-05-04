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

import java.text.ParseException;
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
	
	public void addPaymentReportGroup(PaymentReportGroup gr) {
		if (paymentReportGroup==null) {
			paymentReportGroup = new ArrayList<PaymentReportGroup>();
		}
		paymentReportGroup.add(gr);
		gr.updateTotalFees();
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
	 * Retrives payout information in a condensed format.
	 * 
	 * @return		A list of payout lines for this report
	 */
	public List<PayoutLine> retrievePayoutLines() {
		
		List<PayoutLine> result = new ArrayList<PayoutLine>();
		
		PayoutLine pl = null;
		
		if (getPaymentReportGroup()!=null) {
			
			// Find credit card groups and direct debit groups
			Map<String, PaymentReportGroup> creditCardGroups = new TreeMap<String,PaymentReportGroup>();
			Map<String, PaymentReportGroup> directDebitGroups = new TreeMap<String,PaymentReportGroup>();
			
			for (PaymentReportGroup gr : getPaymentReportGroup()) {
				if (SveaCredential.ACCOUNTTYPE_CREDITCARD.equalsIgnoreCase(gr.getPaymentType())) {
					creditCardGroups.put(gr.getPaymentTypeReference(), gr);
					continue;
				}
				if (SveaCredential.ACCOUNTTYPE_DIRECT_BANK.equalsIgnoreCase(gr.getPaymentType())) {
					directDebitGroups.put(gr.getPaymentTypeReference(), gr);
				}
			}

			double totalPaidAmount = 0, totalReceivedAmount = 0, feeAmount = 0, feeAmountCard = 0;
			PaymentReportGroup ccGroup;
			PaymentReportGroup debitGroup;
			boolean isCardOrDebit = false;
			
			for (PaymentReportGroup gr : getPaymentReportGroup()) {
				
				totalPaidAmount = gr.getTotalPaidAmt();
				totalReceivedAmount = gr.getTotalReceivedAmt();
				feeAmountCard = 0;
				
				if (gr.getPaymentType().equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_INVOICE)) {
					
					ccGroup = creditCardGroups.get(gr.getPaymentTypeReference());
					debitGroup = directDebitGroups.get(gr.getPaymentTypeReference());
					if (ccGroup!=null) {
						totalPaidAmount += ccGroup.getTotalPaidAmt();
						feeAmountCard += ccGroup.getTotalPaidAmt()-ccGroup.getTotalVatAmt()-ccGroup.getTotalReceivedAmt();
					}
					if (debitGroup!=null) {
						totalPaidAmount += debitGroup!=null ? debitGroup.getTotalPaidAmt() : 0;
						feeAmountCard += debitGroup.getTotalPaidAmt()-debitGroup.getTotalVatAmt()-debitGroup.getTotalReceivedAmt();
					}
				} 
				// Calculate fee amount
				feeAmount = totalPaidAmount-gr.getTotalVatAmt()-gr.getTotalReceivedAmt() - feeAmountCard;
				
				isCardOrDebit = gr.getPaymentType().equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_CREDITCARD) ||
						gr.getPaymentType().equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_DIRECT_BANK);

				if (isCardOrDebit) {
					totalReceivedAmount = 0;
					feeAmount = gr.getTotalPaidAmt()-gr.getTotalVatAmt()-gr.getTotalReceivedAmt();
				}
				
				pl = new PayoutLine();
				
				pl.setPaymentType(gr.getPaymentType());
				pl.setPaymentTypeReference(gr.getPaymentTypeReference());
				pl.setTrxCount(gr.getPaymentReportDetail()!=null ?  gr.getPaymentReportDetail().size() : 0);
				pl.setIncludedInOtherPayout(isCardOrDebit);
				pl.setFeeAmount(feeAmount);
				pl.setTaxAmount(gr.getTotalVatAmt());
				pl.setPaidByCustomer(totalPaidAmount);
				pl.setPaidOut(totalReceivedAmount);

				result.add(pl);
			}	
		} 
		
		return result;
	}
	
}
