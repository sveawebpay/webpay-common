package com.svea.webpay.common.reconciliation;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import com.svea.webpay.common.auth.SveaCredential;
import com.svea.webpay.common.conv.JsonUtil;

/**
 * Vat types used.
 * 
 * Before having a better and more flexible solution, the vat-rates are defined here in order
 * to have a central vat-logic.
 * 
 * @author Daniel Tamm
 *
 */
public class VatType {

	// VAT TYPES
	public static final int VATTYPE_NOT_SET = 0;
	public static final int VATTYPE_EXEMPT = 100;
	public static final int VATTYPE_ZERO = 200;
	public static final int VATTYPE_REVERSE = 300;
	public static final int VATTYPE_HIGH = 400;
	public static final int VATTYPE_MEDIUM = 500;
	public static final int VATTYPE_LOW = 600;
	public static final int VATTYPE_EXPORT = 700;
	
	// Indexes to vat levels
	public static final int VAT_IDX_LOW = 0;
	public static final int VAT_IDX_MEDIUM = 1;
	public static final int VAT_IDX_HIGH = 2;
	
	public static final double DEFAULT_VAT_RATE = 0.25;

	// Version date string
	public static final String vatVersionDateStr = "2018-10-10";
	
	// Date when VAT-rate changed on Swedish credit card payments
	public static final String vatSEcardChangeDateStr = "2018-10-01";
	public static Date vatSEcardChangeDate;
	
	static {
		try {
			vatSEcardChangeDate = JsonUtil.dfmt.parse(vatSEcardChangeDateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Map with country rates	
	 */
	public static final Map<String, Double[]> countryRates = new TreeMap<String, Double[]>() {
	/**
		 * 
		 */
		private static final long serialVersionUID = -3015234286159524187L;

	{
		put("SE", new Double[]{0.06, 0.12, 0.25});
		put("NO", new Double[]{0.12, 0.15, 0.25});
		put("DK", new Double[]{0.25, 0.25, 0.25});
		put("DE", new Double[]{0.07, 0.07, 0.19});
		put("FI", new Double[]{0.10, 0.14, 0.24});
		
	}};

	/**
	 * Returns rates for given country and date. Currently the date isn't considered.
	 * 
	 * @param countryCode
	 * @param rateDate		Can be null.
	 * @return
	 * @throws UnclearVatRateException
	 */
	public static Double[] getRates(String countryCode, Date rateDate) throws UnclearVatRateException {

		if (countryCode==null)
			throw new UnclearVatRateException("No country code supplied");

		// Get rates for country code
		Double[] rates = countryRates.get(countryCode);

		if (rates==null)
			throw new UnclearVatRateException("VAT rates for " + countryCode + " are not defined.");
			
		return rates;
	}
	
	/**
	 * Returns VAT rate depending on vattype 
	 * 
	 * @param countryCode
	 * @param vatType
	 * @param rateDate		Rate date. Currently the date isn't considered. Can be null.
	 * @return
	 * @throws UnclearVatRateException
	 */
	public static double getVatRate(String countryCode, int vatType, Date rateDate) throws UnclearVatRateException {

		if (vatType == VATTYPE_NOT_SET)
			throw new UnclearVatRateException("Vat-type not set");
		
		Double[] rates = getRates(countryCode, rateDate); 
		
		switch(vatType) {
		
			case VATTYPE_EXPORT:
			case VATTYPE_EXEMPT:
			case VATTYPE_ZERO : return 0.0D;
			
			case VATTYPE_LOW : return rates[VAT_IDX_LOW];
			
			case VATTYPE_MEDIUM : return rates[VAT_IDX_MEDIUM];
			
			case VATTYPE_HIGH : return rates[VAT_IDX_HIGH];
			
		}
		
		throw new UnclearVatRateException("Can't get rate for " + countryCode + " with vatType = " + vatType);
		
	}
	
	/**
	 * Returns VAT rate given supplied parameters
	 * 
	 * @param countryCode
	 * @param feeType
	 * @param accountType
	 * @param rateDate			The date of which the rate should be determined. Currencly the date is used for 
	 * 							creditcard transactions.
	 * @param isCompany			NOTE! IsCompany can not be safely determined unless it's explicitly specified
	 * 							in the credential. 
	 * @return
	 */
	public static double getVatRate(
			String countryCode, 
			String feeType, 
			String accountType,
			Date rateDate,
			boolean isCompany) throws UnclearVatRateException {

		if (countryCode==null)
			throw new UnclearVatRateException("No country code supplied for feeType: " + feeType + ", accountType: " + accountType);

		// No VAT for interest in no countries
		if (feeType.equals(FeeDetail.REVENUE_INTEREST)) {
			return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
		}
		
		Double[] rates = getRates(countryCode, rateDate);
		
		if (feeType!=null) {
			
			if ("SE".equalsIgnoreCase(countryCode)) {
			
				if (feeType.equals(FeeDetail.FEETYPE_COLLECTION)) {
					return rates[VAT_IDX_HIGH];
				}
				if (feeType.equals(FeeDetail.FEETYPE_REMINDER)) {
					return rates[VAT_IDX_HIGH];
				}
				if (feeType.equals(FeeDetail.FEETYPE_DUEDATE)) {
					return rates[VAT_IDX_HIGH];
				}
				if (feeType.equals(FeeDetail.FEETYPE_COST)) {
					return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
				}
				if (feeType.equals(FeeDetail.FEETYPE_KICKBACK)) {
					return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
				}
				if (feeType.equals(FeeDetail.FEETYPE_LEGAL_ACTION)) {
					return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
				}
				if (feeType.equals(FeeDetail.FEETYPE_ADM)) {
					if (accountType.equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_PAYMENTPLAN) ||
							accountType.equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_ACCOUNT_CREDIT)
							) {
						return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
					} else {
						return getVatRate(countryCode, VATTYPE_HIGH, rateDate);
					}
				}
				if (feeType.equals(FeeDetail.FEETYPE_CREDIT)) {
					if (accountType.equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_PAYMENTPLAN)) {
						return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
					} else if (accountType.equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_CREDITCARD) || accountType.equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_DIRECT_BANK)) {
						if (rateDate==null || !rateDate.before(vatSEcardChangeDate)) {
							return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
						} else {
							return getVatRate(countryCode, VATTYPE_HIGH, rateDate);
						}
					}
					else
					{
						return getVatRate(countryCode, VATTYPE_HIGH, rateDate);
					}
				}
				if (feeType.equals(FeeDetail.FEETYPE_POSTAGE) || 
					feeType.equals(FeeDetail.FEETYPE_EMAILINVOICE) ||
					feeType.equals(FeeDetail.FEETYPE_SUBSCRIPTION)
					) {
					return getVatRate(countryCode, VATTYPE_HIGH, rateDate);
				}
				if (feeType.equals(FeeDetail.REVENUE_REMINDER)) {
					return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
				}
			} // END OF SE
			else if ("NO".equalsIgnoreCase(countryCode)) {
				
				if (feeType.equals(FeeDetail.FEETYPE_COLLECTION)) {
					return rates[VAT_IDX_HIGH];
				}
				if (feeType.equals(FeeDetail.FEETYPE_REMINDER)) {
					return rates[VAT_IDX_HIGH];
				}
				if (feeType.equals(FeeDetail.FEETYPE_DUEDATE)) {
					return rates[VAT_IDX_HIGH];
				}
				if (feeType.equals(FeeDetail.FEETYPE_KICKBACK)) {
					return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
				}
				if (feeType.equals(FeeDetail.FEETYPE_LEGAL_ACTION)) {
					return rates[VAT_IDX_HIGH];
				}
				if (feeType.equals(FeeDetail.FEETYPE_ADM)) {
					if (accountType.equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_PAYMENTPLAN)) {
						return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
					} else {
						return getVatRate(countryCode, VATTYPE_HIGH, rateDate);
					}
				}
				
				// This includes creditcard since it's always of type credit
				if (feeType.equals(FeeDetail.FEETYPE_CREDIT)) {
					return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
				}
				
				if (feeType.equals(FeeDetail.FEETYPE_POSTAGE) || 
					feeType.equals(FeeDetail.FEETYPE_EMAILINVOICE) ||
					feeType.equals(FeeDetail.FEETYPE_SUBSCRIPTION)
					) {
					return getVatRate(countryCode, VATTYPE_HIGH, rateDate);
				}
				
			} // END OF NO
			else if ("FI".equalsIgnoreCase(countryCode)) {

				if (feeType.equals(FeeDetail.FEETYPE_COLLECTION)) {
					return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
				}
				if (feeType.equals(FeeDetail.FEETYPE_REMINDER)) {
					return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
				}
				if (feeType.equals(FeeDetail.FEETYPE_DUEDATE)) {
					return getVatRate(countryCode, VATTYPE_HIGH, rateDate);
				}
				if (feeType.equals(FeeDetail.FEETYPE_KICKBACK)) {
					return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
				}
				if (feeType.equals(FeeDetail.FEETYPE_LEGAL_ACTION)) {
					return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
				}
				if (feeType.equals(FeeDetail.FEETYPE_ADM)) {
					if (accountType.equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_PAYMENTPLAN)) {
						return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
					} else {
						return getVatRate(countryCode, VATTYPE_HIGH, rateDate);
					}
				}
				if (feeType.equals(FeeDetail.FEETYPE_CREDIT)) {
					if (accountType.equalsIgnoreCase(SveaCredential.ACCOUNTTYPE_CREDITCARD)) {
						return getVatRate(countryCode, VATTYPE_EXEMPT, rateDate);
					}
					else
					{
						return getVatRate(countryCode, VATTYPE_HIGH, rateDate);
					}
				}
				if (feeType.equals(FeeDetail.FEETYPE_POSTAGE) || 
					feeType.equals(FeeDetail.FEETYPE_EMAILINVOICE) ||
					feeType.equals(FeeDetail.FEETYPE_SUBSCRIPTION)
					) {
					return getVatRate(countryCode, VATTYPE_HIGH, rateDate);
				}
				
			}
		}

		throw new UnclearVatRateException("VAT rates not defined for supplied parameters. Countrycode: " 
					+ countryCode + 
					", FeeType: " + feeType + ", AccountType: " + accountType + ", Company: " + isCompany);
		
	}
	
}
