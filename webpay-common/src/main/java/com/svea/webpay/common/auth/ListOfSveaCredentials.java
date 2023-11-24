package com.svea.webpay.common.auth;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

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
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.svea.webpay.common.conv.JsonUtil;
/**
 * 
 * Class to represent a list of credentials.
 * 
 */
public class ListOfSveaCredentials {

	private List<SveaCredential> credentials = new ArrayList<SveaCredential>();

	private transient Set<String> merchantIdSet = new TreeSet<String>();
	
	private transient Set<String> storeIdSet = new TreeSet<String>();
	
	public static ListOfSveaCredentials readFromJsonFilename(String configfile) throws Exception {
		
		URL credentialsFileUrl = getUrlForFile(configfile);
		return readFromJsonFile(new File(credentialsFileUrl.getFile()));
		
	}
	
	public static ListOfSveaCredentials readFromJsonFile(File credentialsFile) throws IOException {
		FileReader fr = new FileReader(credentialsFile);
		ListOfSveaCredentials result = JsonUtil.buildGson().fromJson(fr, ListOfSveaCredentials.class);
		fr.close();
		return result;
	}
	
	public static ListOfSveaCredentials buildFromMerchantIdAndSecret(String merchantId, String secretWord) {
		ListOfSveaCredentials creds = new ListOfSveaCredentials();
		SveaCredential sc = new SveaCredential();
		sc.setMerchantId(merchantId);
		sc.setSecretWord(secretWord);
		creds.addCredential(sc);
		return creds;
	}
	
	public static ListOfSveaCredentials buildFromUsernameAndPassword(String username, String password) {
		ListOfSveaCredentials creds = new ListOfSveaCredentials();
		SveaCredential sc = new SveaCredential(username, password);
		creds.addCredential(sc);
		return creds;
	}
	
	public void saveToJsonFile(String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		JsonUtil.buildGson().toJson(this, fw);
		fw.flush();
		fw.close();
	}

	public void setOrgNameForAllCredentials(String orgName) {
		for (SveaCredential sc : credentials) {
			sc.setOrgName(orgName);
		}
	}
	
	public void setOrgNoForAllCredentials(String orgNo) {
		for (SveaCredential sc : credentials) {
			sc.setOrgNo(orgNo);
		}
	}
	
	public void setUsernameAndPasswordForAllCredentials(String username, String password) {
		for (SveaCredential sc : credentials) {
			sc.setUsername(username);
			sc.setPassword(password);
		}
	}
	
	public List<SveaCredential> getCredentials() {
		return credentials;
	}

	public void setCredentials(List<SveaCredential> credentials) {
		if (credentials==null) {
			this.credentials.clear();
			return;
		}
		this.credentials = credentials;
	}

	public void addCredential(SveaCredential c) {
		if (credentials.add(c));
	}
	
	public void clearCredentials() {
		credentials.clear();
	}
	
	public boolean hasMerchantId(String merchantId) {
		if (merchantId==null) return false;
		refreshMerchantIdSet();
		return merchantIdSet.contains(merchantId);
	}
	
	public List<String> getMerchantIds() {
		refreshMerchantIdSet();
		List<String> result = Arrays.asList(merchantIdSet.toArray(new String[0]));
		return result;
	}
	
	private void refreshMerchantIdSet() {
		merchantIdSet.clear();;
		if (credentials==null || credentials.size()==0) {
			return;
		}
		for (SveaCredential sc : credentials) {
			if (sc.hasValidMerchantId()) {
				merchantIdSet.add(sc.getMerchantId());
			}
		}
	}
	
	public boolean hasStoreId(String storeId) {
		if (storeId==null) return false;
		refreshStoreIdSet();
		return storeIdSet.contains(storeId);
	}
	
	private void refreshStoreIdSet() {
		storeIdSet.clear();
		if (credentials==null || credentials.size()==0) {
			return;
		}
		for (SveaCredential sc : credentials) {
			if (sc.getAccountNo()!=null) {
				storeIdSet.add(sc.getAccountNo());
			}
		}
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

	private static URL getUrlForFile(String configfile) throws FileNotFoundException, MalformedURLException {
		
		URL url;
		File cf = new File(configfile);
		if (!cf.exists()) {
			// Try read as resource
			url = ClassLoader.getSystemResource(configfile);
		} else {
			url = new URL("file://" + cf.getAbsolutePath());
		}

		if (url==null) {
			throw new FileNotFoundException(configfile);
		}

		return url;
	}
	
	
	
}
