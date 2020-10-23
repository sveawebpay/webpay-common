package com.svea.webpay.common.auth;

/*

Copyright 2019 Svea Ekonomi AB

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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/**
 * 
 * Class to represent a list of credentials.
 * 
 */
public class ListOfSveaCredentials {

	private List<SveaCredential> credentials = new ArrayList<SveaCredential>();
	
	public List<SveaCredential> getCredentials() {
		return credentials;
	}

	public void setCredentials(List<SveaCredential> credentials) {
		this.credentials = credentials;
	}

	public void addCredential(SveaCredential c) {
		if (credentials.add(c));
	}
	
	public void clearCredentials() {
		credentials.clear();
	}

	/**
	 * Lists all external accounting dimensions in this list of Svea Credentials
	 * 
	 * @return		A list of external accounting dimensions. If none, an empty list is returned.
	 */
	public List<String> listExternalAccountingDimensions() {
		
		List<String> dims = new ArrayList<String>();
		if (credentials==null) return dims;
		
		Set<String> uniqueDims = new TreeSet<String>();
		String dim;
		
		for (SveaCredential cr : credentials) {
			dim = cr.getExternalAccountingDimension();
			if (dim!=null && dim.trim().length()>0) {
				if (!uniqueDims.contains(dim)) {
					dims.add(dim);
					uniqueDims.add(dim);
				}
			}
		}
		return dims;
		
	}
	
	/**
	 * Sets merchant credentials on all credentials in list with type invoice.
	 * 
	 * @param merchantId
	 * @param secret
	 * @param creds
	 * @return 		True if the credentials are updated.
	 */
	public static boolean setMerchantCredentials(String merchantId, String secret, List<SveaCredential> creds) {
		
		if (creds==null) return false;
		
		boolean updated = false;
		
		for (SveaCredential c : creds) {
			if (c.getAccountType().equals(SveaCredential.ACCOUNTTYPE_INVOICE)) {
				c.setMerchantId(merchantId);
				c.setSecretWord(secret);
				updated = true;
			}
		}
		
		return updated;
		
	}

	
	/**
	 * Sets card merchant credentials on all credentials in list with type invoice.
	 * Card merchant credentials are used to access the payment gate way.
	 * 
	 * @param cardMerchantId
	 * @param secret
	 * @param creds
	 * @return 		True if the credentials are updated.	 
	 */
	public static boolean setCardCredentials(String cardMerchantId, String secret, List<SveaCredential> creds) {
		if (creds == null) return false;

		boolean updated = false;
		
		for (SveaCredential c : creds) {
			if (c.getAccountType().equals(SveaCredential.ACCOUNTTYPE_INVOICE)) {
				c.setCardMerchantId(cardMerchantId);
				c.setCardSecretWord(secret);
				updated = true;
			}
		}
		
		return updated;
	}
	
	
}
