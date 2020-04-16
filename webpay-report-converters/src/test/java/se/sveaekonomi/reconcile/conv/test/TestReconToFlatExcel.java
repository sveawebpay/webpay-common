package se.sveaekonomi.reconcile.conv.test;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.svea.webpay.common.conv.JsonUtil;
import com.svea.webpay.common.reconciliation.PaymentReport;
import com.svea.webpay.common.reconciliation.conv.ReconToFlatExcel;

public class TestReconToFlatExcel {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReconToBgMax() {
		
		URL url = ClassLoader.getSystemResource("test-reconciliation-file.json");
		
		try {
			
			FileReader fr = new FileReader(url.getFile());
			BufferedReader jsonReader = new BufferedReader(fr);
			StringBuffer buf = new StringBuffer();
			String line;
			while((line = jsonReader.readLine())!=null) {
				buf.append(line);
			}
			jsonReader.close();
			fr.close();
			
			PaymentReport report = JsonUtil.JsonToPaymentReport(buf.toString());
			
			ReconToFlatExcel converter = new ReconToFlatExcel();
			
			List<StringBuffer> result = converter.convertFromRecon(report);

			for (StringBuffer r : result) {
				System.out.println(r.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
