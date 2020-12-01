package com.svea.webpay.common.reconciliation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.svea.webpay.common.auth.SveaCredential;

/**
 * The FeeDetail class represents a fee
 * 
 * @author Daniel Tamm
 *
 */
public class FeeDetail {

	public static final int	  DEFAULT_ROUNDING_DECIMALS = 2;
	
	public static final String FEETYPE_ADM = "adm";				// Adm cost is normally fixed and not based on invoice amount
	public static final String FEETYPE_CREDIT = "credit";		// Credit cost is a cost normally based on invoice amount
	public static final String FEETYPE_REMINDER = "reminder";		
	public static final String FEETYPE_COLLECTION = "collection";
	public static final String FEETYPE_INTEREST = "interest";
	public static final String FEETYPE_POSTAGE = "postage";
	public static final String FEETYPE_MIXED = "mixed";			// Used when multiple different fees must be presented as 
																// one amount. Use only for presentation purpose or when the 
																// mixed fees have the same VAT-rate.
	public static final String FEETYPE_CREDITCARD = "creditcard";
	public static final String FEETYPE_REGRESS = "regress";
	public static final String FEETYPE_COST = "cost";
	public static final String FEETYPE_KICKBACK = "kickback";
	public static final String FEETYPE_VAT = "vat";					// Used when vat is corrected and not included in the regular field for VAT
	public static final String FEETYPE_DEVIATIONS = "deviations";	// If we can't determine fee type it gets this fee type.
	public static final String FEETYPE_ROUNDING = "rounding";
	// Adjust due date
	public static final String FEETYPE_DUEDATE = "duedate";
	public static final String FEETYPE_EMAILINVOICE = "emailinvoice";
	// Subscription fees (annual / monthly)
	public static final String FEETYPE_SUBSCRIPTION = "subscription";
	
	// Send to KF (betalningsforelaggande)
	public static final String FEETYPE_LEGAL_ACTION = "legal-action";
	
	// Revenue types
	public static final String REVENUE_REMINDER = "revenue-reminder";
	public static final String REVENUE_INTEREST = "interest-income";
	
	public static final String ACCTTYPE_CASH = "cash";
	public static final String ACCTTYPE_RECONCILE = "reconcile";
	public static final String ACCTTYPE_DEPOSIT = "deposit";
	public static final String ACCTTYPE_RECEIVABLES = "receivables";
	public static final String ACCTTYPE_VAT = "vat";
	public static final String ACCTTYPE_BALANCE = "debt";
	public static final String ACCTTYPE_FEE = "fee";
	public static final String ACCTTYPE_DEVIATIONS = "deviations";

	/*
	 * This map defines the Id returned from GetAccountingReport (PaymentAdmin).
	 */
	public static Map<String, Integer> AccountingReportRowIdMap;
	public static Map<Integer, String> AccountingReportRowIdAsKeyMap;
	
	private String 	feeType;
	private Double	fee = 0D;
	private Double	feeVat = 0D;
	private String	accountNr;
	private Integer	vatType;
	private String	description;

	static {
		
		AccountingReportRowIdMap = new TreeMap<String, Integer>();
		AccountingReportRowIdMap.put(REVENUE_INTEREST, 99);
		AccountingReportRowIdMap.put(ACCTTYPE_RECEIVABLES, 129);
		AccountingReportRowIdMap.put(ACCTTYPE_CASH, 127);
		AccountingReportRowIdMap.put(ACCTTYPE_VAT, 130);
		AccountingReportRowIdMap.put(FEETYPE_CREDIT, 137);
		AccountingReportRowIdAsKeyMap = new TreeMap<Integer, String>();
		AccountingReportRowIdAsKeyMap.put(99, REVENUE_INTEREST);
		AccountingReportRowIdAsKeyMap.put(129, ACCTTYPE_RECEIVABLES);
		AccountingReportRowIdAsKeyMap.put(127, ACCTTYPE_CASH);
		AccountingReportRowIdAsKeyMap.put(130, ACCTTYPE_VAT);
		AccountingReportRowIdAsKeyMap.put(137, FEETYPE_CREDIT);
		
	}
	
	public static Double getFeeSum(List<FeeDetail> list) {
		
		if (list==null) return 0D;
		
		Double result = 0D;
		for (FeeDetail f : list) {
			result += f.fee;
		}
		return result;
		
	}
	
	public static Double getVatSum(List<FeeDetail> list) {
		
		if (list==null) return 0D;
		
		Double result = 0D;
		for (FeeDetail f : list) {
			result += f.feeVat;
		}
		return result;
		
	}
	
	public static Double getTotalSum(List<FeeDetail> list) {
		
		if (list==null) return 0D;
		
		Double result = 0D;
		for (FeeDetail f : list) {
			result += f.getFeeTotal();
		}
		return result;
		
	}

	/**
	 * Subtracts the list with the subtract fee.  
	 * 
	 * @param list				The list of fees to be subtracted from
	 * @param feeTypes			The feetypes in the list that may be subtracted from
	 * @param removeCompletely	If the feetypes should be completely removed (clearing, not subtraction)
	 * @param subtract			The fee to subtract.
	 */
	public static void subtract(List<FeeDetail> list, String[] feeTypes, boolean removeCompletely, FeeDetail subtract) {
		
		FeeDetail remainder = new FeeDetail();
		remainder.fee = subtract!=null ? subtract.fee : 0;
		remainder.feeVat = subtract!=null ? subtract.feeVat : 0;
		
		double sf = 0;
		double sv = 0;
		
		List<FeeDetail> removeThese = new ArrayList<FeeDetail>();
		
		for (String feeType : feeTypes) {
		
			for (FeeDetail f : list) {
	
				if (feeType!=null && feeType.trim().length()>0) {
					if (!feeType.equals(f.feeType))
						continue;
					else if (removeCompletely) {
						removeThese.add(f);
						continue;
					}
				}
				
				if (f.fee==null) f.fee = 0D;
				if (f.feeVat==null) f.feeVat = 0D;
				
				sf = Math.min(f.fee, remainder.fee);
				f.fee -= sf;
				remainder.fee -= sf;
				
				sv = Math.min(f.feeVat, remainder.feeVat);
				f.feeVat -= sv;
				remainder.fee -= sf;
				
				if (sf == 0 && sv == 0)
					break;
			}
			
		}

		for (FeeDetail remove : removeThese) {
			list.remove(remove);
		}
		
	}
	
	/**
	 * Adds to first possible fee
	 * 
	 * @param list			List of details to add to
	 * @param add			The detail to add.
	 */
	public static void add(List<FeeDetail> list, FeeDetail add) {
		if (list==null) return;
		if (list.size()==0)
			list.add(add);
		else {
			FeeDetail toAdd = list.get(0);
			toAdd.add(add);
			
		}
	}
	
	public FeeDetail() {}
	
	public FeeDetail(String feeType, Double fee, Double feeVat) {
		this.feeType = feeType;
		this.fee = fee;
		this.feeVat = feeVat;
	}
	
	// Copy constructor
	public FeeDetail(FeeDetail f) {
		this.feeType = f.feeType;
		this.fee = f.fee;
		this.feeVat = f.feeVat;
	}
	
	/**
	 * Add f to current fee.
	 * @param f			The fee to add
	 * @return			The resulting fee detail.
	 */
	public FeeDetail add(FeeDetail f) {
		
		this.fee += f.fee;
		this.feeVat += f.feeVat;
		return this;
	}
	
	public FeeDetail subtract(FeeDetail f) {
		this.fee -= f.fee;
		this.feeVat -= f.feeVat;
		return this;
	}
	
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public Double getFeeVat() {
		return feeVat;
	}
	public void setFeeVat(Double feeVat) {
		this.feeVat = feeVat;
	}
	public Double getFeeTotal() {
		return (fee!=null ? fee : 0d) + (feeVat!=null ? feeVat : 0d);
	}

	/**
	 * If fee =! 0 the vat is calculated from the fee
	 * 
	 * If fee = 0 and feeTotal =! 0, vat is calculated from
	 * feeTotal and fee is set.
	 * 
	 * @param vatRate		The vat rate to use. 1 = 100%.
	 * @return				The vat.
	 */
	public Double calculateVat(double vatRate) {
		
		if (fee!=null && fee!=0) {
			fee = roundFee(fee, DEFAULT_ROUNDING_DECIMALS);
			feeVat = fee * vatRate;
			// Round to two decimals
			feeVat = roundFee(feeVat, DEFAULT_ROUNDING_DECIMALS);
		} else if (getFeeTotal()!=0d){
			
			double feeTotal = roundFee(getFeeTotal(), DEFAULT_ROUNDING_DECIMALS);
			fee = feeTotal / (1+vatRate);
			fee = roundFee(fee, DEFAULT_ROUNDING_DECIMALS);
			feeVat = roundFee((feeTotal-fee), DEFAULT_ROUNDING_DECIMALS);
			
		}
		
		return feeVat;
		
	}

	/**
	 * Rounds double by given decimals.
	 * 
	 * @param value			The value to round
	 * @param decimals		Max number of decimals.
	 * @return				The rounded value
	 */
	public static double roundFee(double value, int decimals) {
		
		if (decimals<=0) return (double)Math.round(value);
		double divideby = Math.pow(10, (double)decimals);
		double rounded = Math.round(value * divideby)/((double)divideby);
		return rounded;
		
	}
	
	/**
	 * Remaps fee account if there is an account remapping associated with this fee.
	 * 
	 * @param f
	 * @return
	 */
	public static FeeDetail remapFeeAccount(SveaCredential cre, FeeDetail f) {
		if (f==null || f.getFeeType()==null) return f;
		if (cre==null)
			return f;
		String acctNo = cre.getAccountMap().get(f.getFeeType());
		if (acctNo!=null) {
			f.setAccountNr(acctNo);
			// See if we need to remap
			if (cre.getAccountRemap()!=null) {
				String remap = cre.getAccountRemap().get(acctNo);
				if (remap!=null) {
					f.setAccountNr(remap);
				}
			}
		}
		return f;
	}
	
	/**
	 * Remaps fee accounts
	 */
	public static List<FeeDetail> remapFeeAccounts(SveaCredential cre, List<FeeDetail> srcFees) {

		if (srcFees==null) return null;
		
		// Remap fee accounts
		for (FeeDetail f : srcFees) {
			remapFeeAccount(cre, f);
		}
		return srcFees;
		
	}
	
	/**
	 * Bookkeeping account number if applicable
	 * 
	 * @return		The account nr
	 */
	public String getAccountNr() {
		return accountNr;
	}

	public void setAccountNr(String accountNr) {
		this.accountNr = accountNr;
	}

	/**
	 * Sets VAT-type of fee 
	 * 
	 * @return		The vat type
	 */
	public Integer getVatType() {
		return vatType;
	}

	public void setVatType(Integer vatType) {
		this.vatType = vatType;
	}

	/**
	 * Description of the fee.
	 * 
	 * @return		Description of the fee (if any).
	 */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void roundAll() {
		if (fee==null) fee = 0D;
		fee = roundFee(fee, DEFAULT_ROUNDING_DECIMALS);
		if (feeVat==null) feeVat = 0D;
		feeVat = roundFee(feeVat, DEFAULT_ROUNDING_DECIMALS);
	}

	
	
	public String toString() {
		
		return ("FeeDetail {AccountNo: " + (accountNr!=null ? accountNr : " - ") + ", Fee: " + (fee!=null ? fee : " - ") + ", Vat: " + (feeVat!=null ? feeVat : " - ") + ", Total: " + (getFeeTotal()) + "}");
		
	}
	
}
