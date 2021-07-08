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
import com.svea.webpay.common.reconciliation.conv.ReconToFlatFormat;

public class TestReconToFlatFormat {
	
	private String fileName = "test-reconciliation-file.json";
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReconToFlatFormat() {
		
		URL url = ClassLoader.getSystemResource(fileName);
		
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
			
			ReconToFlatFormat converter = new ReconToFlatFormat();

			List<StringBuffer> result = converter.convertFromRecon(report);
			
			if (result!=null) {
				for (StringBuffer b : result) {
					System.out.println(b.toString());
				}
			}
			
			/**
			
			List<Object[]> result = converter.convertFromReconToRowObjects(report);
			String column;
			
			PrintStream os = new PrintStream(new FileOutputStream("/home/daniel/tmp/test.csv"));
			
			for (Object[] f : result) {

				for (int i=0; i<f.length; i++) {
					if (f[i] instanceof java.util.Date) {
						column = JsonUtil.getDateFormat().format((java.util.Date)f[i]);
					} else {
						column = f[i]!=null ? f[i].toString() : "";
					}
					os.print(column);
					if (i<f.length-1) {
						os.print(";");
					} else {
						os.println();
					}
				}
				
			}
			
			os.close();
			
			*/

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
