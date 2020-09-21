package com.svea.webpay.common.test;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

// import static org.junit.Assert.fail;

import org.junit.Test;

import com.svea.webpay.common.reconciliation2.ClientReport;
import com.svea.webpay.common.reconciliation2.ClientReportRow;
import com.svea.webpay.common.reconciliation2.ReconciliationReport;
import com.svea.webpay.common.reconciliation2.ReconciliationReportJsonUtil;

public class TestReconciliationReport {

	@Test
	public void testReconciliationReportToJson() {

		ReconciliationReport pr = new ReconciliationReport();
		
		ClientReport gr = new ClientReport();
		
		Date today = Calendar.getInstance().getTime();
		
		pr.addClientReport(gr);
		
		gr.setClientId(11111);
		gr.setRecipientTaxId("165555555555");
		gr.setRecipientBankAccountNo("ABC123");
		gr.setRecipientBankAccountType("Bankgiro");

		gr.setReconciliationDate(today);

		ClientReportRow row = new ClientReportRow();
		row.setSveaCustomerId(100291L);
		row.setCustomerName("Test Name");
		row.setExternalOrderNo("129201");
		row.setOrderDate(today);
		row.setSveaOrderNo(BigInteger.valueOf(102921));
		row.setSveaCheckoutId(BigInteger.valueOf(10293892));
		row.setNominalAmount(BigInteger.valueOf(12029));
		row.setSveaPaidAmount(BigInteger.valueOf(11929));
		row.setPaymentType("PaymentPlan");
		row.setCurrency("SEK");
		row.setDeliveryId(BigInteger.valueOf(20192));
		row.setRowType("Order");
		
		row.addFeeNoVAT(BigInteger.valueOf(100), "Credit");
		
		gr.addRow(row);
		
		System.out.println(ReconciliationReportJsonUtil.ReconciliationReportToJson(pr));
		
		// fail("Not yet implemented");
	}

	public void testJsonToReconciliationReport() {
		
		
		
	}
	
}
