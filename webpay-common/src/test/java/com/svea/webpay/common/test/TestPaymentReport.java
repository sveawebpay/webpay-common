package com.svea.webpay.common.test;

// import static org.junit.Assert.fail;

import org.junit.Test;

import com.svea.webpay.common.conv.JsonUtil;
import com.svea.webpay.common.reconciliation.FeeDetail;
import com.svea.webpay.common.reconciliation.PaymentReport;
import com.svea.webpay.common.reconciliation.PaymentReportDetail;
import com.svea.webpay.common.reconciliation.PaymentReportGroup;

public class TestPaymentReport {

	@Test
	public void testPaymentReportToJson() {

		PaymentReport pr = new PaymentReport();
		
		PaymentReportGroup gr = new PaymentReportGroup();
		
		pr.addPaymentReportGroup(gr);
		
		gr.setCurrency("SEK");
		gr.setDstAcct("240-7569");
		gr.setPaymentType("FAKT");
		gr.setReconciliationDate("2017-05-10");
		gr.setTotalPaidAmt(1000D);
		gr.setTotalReceivedAmt(995.25D);
		
		PaymentReportDetail d = new PaymentReportDetail(
				"100291",
				"100000",
				"100000",
				"100002",
				"555555-5555",
				"Buyer AB",
				"F29102",
				1000D,
				995.25D
				);
		
		d.addFee(new FeeDetail("A", 3.8D, 0.95D));
		gr.addDetail(d);
		
		System.out.println(JsonUtil.PaymentReportToJson(pr));
		
		// fail("Not yet implemented");
	}

}
