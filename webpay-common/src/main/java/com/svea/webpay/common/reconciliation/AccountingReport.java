package com.svea.webpay.common.reconciliation;

import java.util.ArrayList;
import java.util.List;

/**
 * The accounting report is a compilation of the revenue associated with the payouts and the payouts themselves.
 * 
 * @author Daniel Tamm
 *
 */
public class AccountingReport {

	private String taxId;
	private String orgName;
	private String taxIdFormat;
	
	private List<AccountingVoucher> vouchers;

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getTaxIdFormat() {
		return taxIdFormat;
	}

	public void setTaxIdFormat(String taxIdFormat) {
		this.taxIdFormat = taxIdFormat;
	}

	public List<AccountingVoucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<AccountingVoucher> vouchers) {
		this.vouchers = vouchers;
	}
	
	public void addVoucher(AccountingVoucher av) {
		if (vouchers==null) {
			vouchers = new ArrayList<AccountingVoucher>();
		}
		vouchers.add(av);
	}
	
	
}
