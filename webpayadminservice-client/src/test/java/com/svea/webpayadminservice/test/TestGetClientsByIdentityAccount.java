package com.svea.webpayadminservice.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.svea.webpayadminservice.client.AdminService;
import com.svea.webpayadminservice.client.Authentication;
import com.svea.webpayadminservice.client.ClientData;
import com.svea.webpayadminservice.client.GetClientsByIdentityAccountRequest;
import com.svea.webpayadminservice.client.GetClientsByIdentityAccountResponse2;
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
			
			GetClientsByIdentityAccountRequest req = new GetClientsByIdentityAccountRequest();
			Authentication auth = new Authentication();
			auth.setUsername(TestConfig.clientUsername);
			auth.setPassword(TestConfig.clientPassword);
			req.setAuthentication(auth);
			
			GetClientsByIdentityAccountResponse2 result = client.getClientsByIdentityAccount(req);
			
			if (result.getErrorMessage()!=null && result.getErrorMessage().trim().length()>0) {
				fail(result.getErrorMessage());
			}
			
			if (result.getClients()!=null && result.getClients().getClientData()!=null) {
				List<ClientData> clients = result.getClients().getClientData();
				TestConfig.testLogger.info("The following clients were found:");
				for (ClientData cl : clients) {
					TestConfig.testLogger.info(cl.getClientId().toString());
				}
			} else {
				TestConfig.testLogger.info("No clients found by identity account");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
