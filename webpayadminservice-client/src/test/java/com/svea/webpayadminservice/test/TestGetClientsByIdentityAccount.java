package com.svea.webpayadminservice.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.svea.webpayadminservice.client.AdminService;
import com.svea.webpayadminservice.client.Authentication;
import com.svea.webpayadminservice.client.GetClientIdRequest;
import com.svea.webpayadminservice.client.GetClientIdResponse2;
import com.svea.webpayadminservice.client.IAdminService;

public class TestGetClientsByIdentityAccount {

	private IAdminService client;
	
	@Before
	public void setUp() throws Exception {
		
		AdminService service = new AdminService();
		client = service.getAdminSoapService();

	}

	@Test
	public void testGetClientsByIdentityAccount() {
		
		try {
			
			GetClientIdRequest req = new GetClientIdRequest();
			req.setSveaOrderId(new Long(0));
			Authentication auth = new Authentication();
			auth.setUsername(TestConfig.clientUsername);
			auth.setPassword(TestConfig.clientPassword);
			req.setAuthentication(auth);
			
			GetClientIdResponse2 result = client.getClientId(req);
			
			if (result.getErrorMessage()!=null && result.getErrorMessage().trim().length()>0) {
				fail(result.getErrorMessage());
			}
			
			if (result.getClientId()!=null) {
				TestConfig.testLogger.info("Client ID : " + result.getClientId());
			} else {
				TestConfig.testLogger.info("No client found by identity account");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
