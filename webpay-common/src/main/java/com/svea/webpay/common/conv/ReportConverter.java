package com.svea.webpay.common.conv;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.svea.webpay.common.auth.SveaCredential;
import com.svea.webpay.common.reconciliation.FeeDetail;
import com.svea.webpay.common.reconciliation.PaymentReport;
import com.svea.webpay.common.reconciliation.PaymentReportDetail;
import com.svea.webpay.common.reconciliation.PaymentReportGroup;
import com.svea.webpay.common.reconciliation2.ClientFee;
import com.svea.webpay.common.reconciliation2.ClientPaymentReport;
import com.svea.webpay.common.reconciliation2.ClientReport;
import com.svea.webpay.common.reconciliation2.ClientReportRow;
import com.svea.webpay.common.reconciliation2.ReconciliationReport;
/**
 * 
 * Helper class to convert from Report
 * 
 * @author Daniel Tamm
 *
 */
public class ReportConverter {

	/**
	 * Converts a BigInteger which represents a currency multiplied by 100 
	 * into a double.
	 * 
	 * @param ii
	 * @return
	 */
	public static Double bigIntegerW2ToDouble(BigInteger ii) {
		
		if (ii==null) return 0D;
		BigDecimal bd = BigDecimal.valueOf(ii.longValue());
		Double result = bd.divide(BigDecimal.valueOf(100), 2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
		
		return result;
		
	}

	public static String mapPaymentReportFeeType(String clientReportFeeType) {
		
		if (clientReportFeeType==null) return null;
		
		String result = null;
		
		switch (clientReportFeeType) {
		
		case ClientFee.FEETYPE_Admin:
			result = FeeDetail.FEETYPE_ADM;
			break;
		case ClientFee.FEETYPE_Credit:
			result = FeeDetail.FEETYPE_CREDIT;
			break;
		case ClientFee.FEETYPE_Reminder:
			result = FeeDetail.FEETYPE_REMINDER;
			break;
		case ClientFee.FEETYPE_Collection:
			result = FeeDetail.FEETYPE_COLLECTION;
			break;
		case ClientFee.FEETYPE_Interest:
			result = FeeDetail.FEETYPE_INTEREST;
			break;
		case ClientFee.FEETYPE_Postage:
			result = FeeDetail.FEETYPE_POSTAGE;
			break;
		case ClientFee.FEETYPE_Deviation:
			result = FeeDetail.FEETYPE_DEVIATIONS;
			break;
		case ClientFee.FEETYPE_Deposit:
			result = FeeDetail.ACCTTYPE_DEPOSIT;
			break;
		case ClientFee.FEETYPE_DueDate:
			result = FeeDetail.FEETYPE_DUEDATE;
			break;
		case ClientFee.FEETYPE_LegalAction:
			result = FeeDetail.FEETYPE_LEGAL_ACTION;
			break;
		case ClientFee.FEETYPE_Kickback:
			result = FeeDetail.FEETYPE_KICKBACK;
			break;
		case ClientFee.FEETYPE_Correction:
			// TODO: Have a better handling of this.
			result = FeeDetail.FEETYPE_DEVIATIONS;
			break;
		}
		
		return result;
		
	}
	
	/**
	 * Maps a ClientReport payment type to a PaymentReport payment type
	 * 
	 * @param clientReportPaymentType
	 * @return
	 */
	public static String mapPaymentReportPaymentType(String clientReportPaymentType) {
		
		if (clientReportPaymentType==null) return null;
		
		String result = null;
		
		switch (clientReportPaymentType) {
		
			case ClientReportRow.PAYMENTTYPE_AccountCredit:
				result = SveaCredential.ACCOUNTTYPE_ACCOUNT_CREDIT;
				break;
			
			case ClientReportRow.PAYMENTTYPE_Card:
				result = SveaCredential.ACCOUNTTYPE_CREDITCARD;
				break;
			
			case ClientReportRow.PAYMENTTYPE_DirectBank:
				result = SveaCredential.ACCOUNTTYPE_DIRECT_BANK;
				break;
				
			case ClientReportRow.PAYMENTTYPE_Invoice:
				result = SveaCredential.ACCOUNTTYPE_INVOICE;
				break;
				
			case ClientReportRow.PAYMENTTYPE_PaymentPlan:
				result = SveaCredential.ACCOUNTTYPE_PAYMENTPLAN;
				break;
			
		}
		
		return result;
		
	}
	
	public static FeeDetail fromClientFee(ClientFee src) {
		
		FeeDetail dst = null;
		
		if (src==null) return dst;
		
		dst = new FeeDetail();
		dst.setFeeType(mapPaymentReportFeeType(src.getType()));
		dst.setFee(bigIntegerW2ToDouble(src.getAmountExcludingVat()));
		dst.setFeeVat(bigIntegerW2ToDouble(src.getVatAmount()));
		
		return dst;
		
	}
	
	/**
	 * Convert a reconciliation report (v2) to a payment report. 
	 * 
	 * @param src
	 * @return		A payment report
	 */
	public static PaymentReport fromReconciliationReport(ReconciliationReport src) {

		PaymentReport dst = new PaymentReport();
		
		if (src.getClientReports()==null || src.getClientReports().size()==0)
			return dst;
		
		PaymentReportGroup gr;
		for (ClientReport cr : src.getClientReports()) {
			
			gr = new PaymentReportGroup();
			gr.setPaymentTypeReference(cr.getClientId().toString());
			try {
				gr.setTaxId(TaxIdFormatter.printTaxId(null, cr.getRecipientTaxId(), TaxIdStructure.FMT_SE11));
			} catch (Exception e) {
				gr.setTaxId(cr.getRecipientTaxId());
			}

			gr.setReconciliationDate(cr.getReconciliationDate());
			
			ClientPaymentReport cpr = cr.getPaymentReport();
			gr.setOpeningBalance(bigIntegerW2ToDouble(cpr.getOpeningBalanceDebt()));

			// TODO: Should perhaps be calculated? Can we trust this number?
			gr.setEndingBalance(bigIntegerW2ToDouble(cpr.getClosingBalanceDebt().negate()));

			gr.setCurrency(cpr.getCurrency());
			gr.setDstBankAcct(cr.getRecipientBankAccountNo());
			gr.setDstBankAcctType(cr.getRecipientBankAccountType());
			
			// Iterate through and convert the rows
			if (cr.getRows()!=null && cr.getRows().size()>0) {
				
				PaymentReportDetail d;
				String rowType;
				Long sveaCustomerId;
				String clientOrderNo;
				BigInteger sveaInvoiceNo;
				BigInteger sveaCheckoutId;
				
				for (ClientReportRow crr : cr.getRows()) {

					// Check payment type. Assume they are not mixed since they all belong to the same client id
					if (gr.getPaymentType()==null && crr.getPaymentType()!=null) {
						gr.setPaymentType(mapPaymentReportPaymentType(crr.getPaymentType()));
					}
					
					// Check row type
					rowType = crr.getRowType();
					if (ClientReportRow.ROWTYPE_ClosingBalanceDebt.equalsIgnoreCase(rowType)
							|| ClientReportRow.ROWTYPE_OpeningBalanceDebt.equalsIgnoreCase(rowType)
							) {
						// Do nothing for this row type
						continue;
					}
				
					// Get references
					sveaCustomerId = crr.getSveaCustomerId();
					clientOrderNo = crr.getExternalOrderNo();
					sveaInvoiceNo = crr.getSveaInvoiceNo();
					sveaCheckoutId = crr.getSveaCheckoutId();
					
					boolean hasReferences = 
							sveaCustomerId!=null ||
							(clientOrderNo!=null && clientOrderNo.trim().length()>0) ||
							sveaInvoiceNo!=null ||
							sveaCheckoutId!=null;
					
					// If manual and no references, create a deviation as other fee.
					if (ClientReportRow.ROWTYPE_Manual.equalsIgnoreCase(rowType) && !hasReferences && crr.getNominalAmount().signum()==0) {
						
						FeeDetail f = new FeeDetail();
						
						f.setFeeType(FeeDetail.FEETYPE_DEVIATIONS);
						f.setFee(bigIntegerW2ToDouble(crr.getTotalFeeAmountExcludingVat()));
						f.setFeeVat(bigIntegerW2ToDouble(crr.getTotalFeeVatAmount()));
						f.setDescription(crr.getComment());
						gr.addOtherFee(f);
						continue;
						
					}
					
					d = new PaymentReportDetail();
					
					if (sveaCustomerId!=null)
						d.setCustomerId(sveaCustomerId.toString());
					
					d.setPayerName(crr.getCustomerName());
					d.setClientOrderNo(clientOrderNo);
					if (crr.getOrderDate()!=null)
						d.setOrderDate(JsonUtil.dfmt.format(crr.getOrderDate()));
					
					if (sveaInvoiceNo!=null)
						d.setInvoiceId(sveaInvoiceNo.toString());
					
					if (sveaCheckoutId!=null)
						d.setCheckoutOrderId(sveaCheckoutId.toString());
					
					d.setPaidAmt(bigIntegerW2ToDouble(crr.getNominalAmount()));
					d.setReceivedAmt(bigIntegerW2ToDouble(crr.getSveaPaidAmount()));
					
					if (crr.getPaymentType()!=null && crr.getPaymentType().trim().length()>0) {
						d.setPaymentType(crr.getPaymentType());
					}
					
					if (crr.getDeliveryId()!=null && crr.getDeliveryId().longValue()!=0) {
						d.addReference(PaymentReportDetail.REF_DELIVERY_ID, crr.getDeliveryId().toString());
					}
					
					if (crr.getComment()!=null && crr.getComment().trim().length()>0) {
						d.addReference(PaymentReportDetail.REF_COMMENT, crr.getComment());
					}
					
					// Check for fees
					if (crr.getFees()!=null && crr.getFees().size()>0) {
						
						FeeDetail f;
						for (ClientFee cf : crr.getFees()) {
							if (ClientFee.FEETYPE_Dismissed.equalsIgnoreCase(cf.getType())) {
								// An invoice transferred back / dismissed is not a fee in
								// report type 1.
								continue;
							}
							f = fromClientFee(cf);
							
							if (f!=null) {
								
								// If the fee type is correction, put details in the fee description.
								if (ClientFee.FEETYPE_Correction.equalsIgnoreCase(cf.getType())) {
									// Set fee description from payment
									String desc = "";
									if (crr.getCustomerName()!=null) {
										desc += crr.getCustomerName();
									}
									if (crr.getSveaCheckoutId()!=null) {
										desc += " CoId: " + crr.getSveaCheckoutId();
									}
									if (crr.getExternalOrderNo()!=null) {
										desc += " ExtOnr: " + crr.getExternalOrderNo();
									}
									if (crr.getComment()!=null) {
										if (desc.length()>0) desc += " : ";
										desc += crr.getComment();
									}
									f.setDescription(desc);
								}
								// If the fee type is deviation, get comment from the transaction
								if (ClientFee.FEETYPE_Deviation.equalsIgnoreCase(cf.getType())) {
									f.setDescription(crr.getComment());
								}
								d.addFee(f);
								
							}
						}
						
					}
					// Add detail to group
					gr.addDetail(d);
					
				}
				
			}

			// Set totals from file (not calculated)
			gr.setTotalPaidAmt(bigIntegerW2ToDouble(cpr.getNominalAmount()));
			gr.setTotalReceivedAmt(bigIntegerW2ToDouble(cpr.getSveaPaidAmountIncludingWithholding()));
			gr.setTotalVatAmt(bigIntegerW2ToDouble(cpr.getFeeVatAmount()));
			
			// Add the group
			dst.addPaymentReportGroup(gr);
			
		}
		
		return dst;
		
	}
	
}
