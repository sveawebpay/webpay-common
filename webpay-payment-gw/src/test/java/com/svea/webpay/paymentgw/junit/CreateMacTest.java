package com.svea.webpay.paymentgw.junit;

import java.io.PrintStream;
import java.io.StringWriter;

import jakarta.xml.bind.JAXB;

import org.junit.Before;
import org.junit.Test;

import com.svea.webpay.paymentgw.entity.Query;
import com.svea.webpay.paymentgw.util.PaymentGwUtil;

public class CreateMacTest {
	
	private PrintStream os;
	
	@Before
	public void setUp() throws Exception {
		os = System.out;
	}

	@Test
	public void testMAC() {
		
		Query q = TestXmlEntities.getTestQuery();
		
		StringWriter sw = new StringWriter();
		JAXB.marshal(q, sw);
		
		String mac = PaymentGwUtil.createMac(sw.toString(), TestConfig.testSecretWord);
		os.println("MAC: " + mac);
		
	}

}
