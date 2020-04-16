package se.sveaekonomi.reconcile.conv.test;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.notima.bg.BgFile;
import org.notima.bg.BgMaxFile;
import org.notima.bg.BgUtil;

import com.svea.webpay.common.conv.JsonUtil;
import com.svea.webpay.common.reconciliation.PaymentReport;
import com.svea.webpay.common.reconciliation.conv.ReconToBgMax;

public class TestReconToBgMax {
	
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
			ReconToBgMax converter = new ReconToBgMax();
			converter.setDefaultBg("419-2464");
			List<BgFile> result = converter.convertFromPaymentReport(report);

			BgMaxFile bgf;
			File saveFile;
			
			if (result==null) {
				return;
			}
			
			for (BgFile f : result) {
			
				bgf = (BgMaxFile)f;
				
				saveFile = new File("BGMax" + BgUtil.getDateString(bgf.getFileDate()) + ".TXT");
				bgf.writeToFile(saveFile, Charset.forName("iso-8859-1"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
