package com.svea.webpay.common.test;

// import static org.junit.Assert.fail;

import org.junit.Test;

import com.svea.webpay.common.auth.ListOfSveaCredentials;
import com.svea.webpay.common.auth.SveaCredential;
import com.svea.webpay.common.conv.JsonUtil;

public class TestAuth {

	@Test
	public void testAuthToJson() {

		ListOfSveaCredentials list = new ListOfSveaCredentials();
		
		SveaCredential cr1 = new SveaCredential();
		cr1.setAccountNo("700XX");
		list.addCredential(cr1);
		SveaCredential cr2 = new SveaCredential();
		cr2.setMerchantId("11111111");
		list.addCredential(cr2);
		
		System.out.println(JsonUtil.gson.toJson(list));
		
		// fail("Not yet implemented");
	}

}
