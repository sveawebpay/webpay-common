package com.svea.webpayws.client;

/*

Copyright 2020 Svea Ekonomi AB

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/

import java.util.List;

import com.svea.webpayws.ArrayOfCampaignCodeInfo;
import com.svea.webpayws.ArrayOfOrderStatus;
import com.svea.webpayws.CampaignCodeInfo;
import com.svea.webpayws.ClientAuthInfo;
import com.svea.webpayws.GetOrdersRequest;
import com.svea.webpayws.GetOrdersResponse2;
import com.svea.webpayws.GetPaymentPlanParamsEuRequest;
import com.svea.webpayws.GetPaymentPlanParamsEuResponse2;
import com.svea.webpayws.OrderStatus;
import com.svea.webpayws.Service;
import com.svea.webpayws.ServiceSoap;

/**
 * Example class that uses the CXF-generated classes in package com.svea.webpayws
 * 
 * NOTE: Work in progress. The example is not yet completed.
 * 
 * @author Daniel Tamm
 *
 */
public class WebpayWsClient {

	private Service 			wsService;
	private ServiceSoap 		soapService;
	private ClientAuthInfo 		authInfo;
	
	
	/**
	 * Creates a new client.
	 * 
	 * @param clientNumber		Client number used for authentication. This is a 5-digit number.
	 * @param username			User name used for authentication.
	 * @param password			Password used for authentication.
	 */
	public WebpayWsClient(int clientNumber, String username, String password) {
		
		wsService = new Service();
		soapService = wsService.getServiceSoap();

		authInfo = new ClientAuthInfo();
		authInfo.setClientNumber(clientNumber);
		authInfo.setUsername(username);
		authInfo.setPassword(password);
		
	}
	
	public List<OrderStatus> getOrderStatusByClientOrder(String clientOrderNr) {
		
		GetOrdersRequest req = new GetOrdersRequest();
		req.setAuth(authInfo);
		req.setClientOrderNr(clientOrderNr);
		GetOrdersResponse2 res = soapService.getOrders(req);
		if (!res.isAccepted()) {
			// Find out what went wrong
			String errorMsg = res.getErrorMessage();
			return null;
		} else {
			ArrayOfOrderStatus arr = res.getOrders();
			return arr.getOrderStatus();
		}
		
	}
	
	/**
	 * Gets payment plans for this client. The client number must be a payment plan.
	 * 
	 * @return		A list of campaigncodes
	 */
	public List<CampaignCodeInfo> getPaymentPlans() {
		
		GetPaymentPlanParamsEuRequest req = new GetPaymentPlanParamsEuRequest();
		req.setAuth(authInfo);
		
		GetPaymentPlanParamsEuResponse2 res = soapService.getPaymentPlanParamsEu(req);
		if (!res.isAccepted()) {
			// Find out what went wrong
			return null;
		} else {
			ArrayOfCampaignCodeInfo arr = res.getCampaignCodes();
			return arr.getCampaignCodeInfo();
		}
		
	}
	
	
}
