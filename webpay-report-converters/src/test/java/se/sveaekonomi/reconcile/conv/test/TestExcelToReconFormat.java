package se.sveaekonomi.reconcile.conv.test;

import static org.junit.Assert.fail;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.svea.webpay.common.conv.JsonUtil;
import com.svea.webpay.common.reconciliation.PaymentReport;
import com.svea.webpay.common.reconciliation.conv.ExcelToReconFormat;

public class TestExcelToReconFormat {

	public static String orgNo = "555555-5555";
	public static String orgName = "Testbolaget AB";
	public static String paymentType = "creditcard";
	public static String dstAcct = "1580";
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFromExcelFileCCFormat() {
		
		URL url = ClassLoader.getSystemResource("Sample-Reconciliation-171101-171130.xlsx");
		ExcelToReconFormat test = new ExcelToReconFormat();
		
		try {
			
			PaymentReport result = test.fromExcelFileCCFormat(
					url.getFile(),
					orgNo,
					orgName,
					paymentType,
					dstAcct
					);

			System.out.println(JsonUtil.PaymentReportToJson(result));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
