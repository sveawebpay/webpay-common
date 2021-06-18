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

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.svea.webpay.common.conv.JsonUtil;
import com.svea.webpay.common.reconciliation.FeeDetail;

/**
 * Svea Credential Record.
 * 
 * Represents login information and accounting settings associated with the login information.
 * 
 * @author Daniel Tamm
 *
 */
public class SveaCredential {

	public static final String ACCOUNTTYPE_ADMIN = "admin";
	public static final String ACCOUNTTYPE_INVOICE = "invoice";
	public static final String ACCOUNTTYPE_PAYMENTPLAN = "paymentplan";
	public static final String ACCOUNTTYPE_CREDITCARD = "creditcard";
	public static final String ACCOUNTTYPE_LOAN = "loan";
	public static final String ACCOUNTTYPE_ACCOUNT_CREDIT = "account-credit";
	public static final String ACCOUNTTYPE_DIRECT_BANK = "direct-bank";
	
	public static final Map<Integer, String> AGREEMENT_TYPE_MAP = new TreeMap<Integer,String>();

	/**
	 * Create static agreement type lookup map
	 */
	static {
		
		AGREEMENT_TYPE_MAP.put(1,  ACCOUNTTYPE_ADMIN);
		AGREEMENT_TYPE_MAP.put(21, ACCOUNTTYPE_INVOICE);
		AGREEMENT_TYPE_MAP.put(24, ACCOUNTTYPE_PAYMENTPLAN);
		AGREEMENT_TYPE_MAP.put(25, ACCOUNTTYPE_ACCOUNT_CREDIT);
	}
	
	/**
	 * Svea's account number, also called clientId / UG-number. Normally a five digit number.
	 */
	private String	accountNo;
	private String 	username;
	private String	password;
	private String	accountType;
	// merchantId is a 6 digit number
	private String	merchantId;
	private String	secretWord;
	// cardMerchantId is a 4 digit number
	private String	cardMerchantId;			
	private String	cardSecretWord;
	private String	orgNo;
	private String	orgName;
	private String	vatNo;
	// This is Svea's customer number for this customer. It's currently
	// a harmonized VAT-number since the orgNo and vatNo can be typed
	// differently on different accounts.
	private String	sveaCustomerNumber;
	private String	server;
	private String	currency;
	private String	countryCode;
	private boolean	company;
	private boolean enrichFromInvoice = false;
	private boolean skipTaxId = true;
	private boolean skipEmail = true;
	private boolean	includeCardPayments = false;
	private boolean includeAdminPayments = false;
	private boolean	includeKickbacks = true;
	private boolean	active = true;
	// External accounting dimension for this account / credential
	private String  externalAccountingDimension;
	
	/**
	 * If true, the fees on this account are ignored when accounting information is created.
	 */
	private boolean	ignoreFees;
	private Map<String,String> accountMap;
	private Map<String,String> accountRemap;
	
	public SveaCredential() {}
	
	/**
	 * Creates a new credential
	 * 
	 * @param accountNo		The account number for this credential. Normally a five digit number.
	 * @param username		Username (identity) associated with this account.
	 * @param password		Password associated with this account.
	 * @param accountType	Type of account (ACCOUNTTYPE_ADMIN etc).
	 */
	public SveaCredential(String accountNo, String username, String password, String accountType) {
		this.accountNo = accountNo;
		this.username = username;
		this.password = password;
		this.accountType = accountType;
	}
	
	/**
	 * For the credential to be valid, it needs to express some useable credentials.
	 * 
	 * @return
	 */
	public boolean isValid() {
		return hasUsernameAndPassword() || hasMerchantIdAndSecretWord() || hasCardMerchantIdAndSecret();
	}
	
	private boolean hasUsernameAndPassword() {
		return username!=null && username.trim().length()>0 
				&& password!=null && password.trim().length()>0;
	}

	private boolean hasCardMerchantIdAndSecret() {
		return hasValidCardMerchantId() && hasValidCardSecretWord();
	}
	
	private boolean hasValidCardMerchantId() {
		return cardMerchantId!=null && cardMerchantId.trim().length()==4;
	}
	
	private boolean hasValidCardSecretWord() {
		return cardSecretWord!=null && cardSecretWord.trim().length()>10;
	}
	
	private boolean hasMerchantIdAndSecretWord() {
		return hasValidMerchantId() && hasValidSecretWord();
	}
	
	private boolean hasValidMerchantId() {
		// TODO: Can be improved to include checking for digits only
		return merchantId!=null && merchantId.trim().length()==6;
	}
	
	private boolean hasValidSecretWord() {
		return secretWord!=null && secretWord.trim().length()>10;
	}
	
	/**
	 * 
	 * @return	The account no for this credential
	 */
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	/**
	 * 
	 * @return	The username for this credential
	 */
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * 
s	 * @return	The password for this credential 
	 */
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 
	 * @return	The account type for this credential
	 */
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	/**
	 * 
	 * @return	The merchant id for this credential. Used when authenticating to the checkout.
	 */
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	/**
	 * 
	 * @return A 4 digit ID used when dealing with credit card transactions.
	 */
	public String getCardMerchantId() {
		return cardMerchantId;
	}
	public void setCardMerchantId(String cardMerchantId) {
		this.cardMerchantId = cardMerchantId;
	}

	/**
	 * 
	 * @return	The secret word used for authentication to the checkout.
	 */
	public String getSecretWord() {
		return secretWord;
	}
	public void setSecretWord(String secretWord) {
		this.secretWord = secretWord;
	}
	
	/**
	 * 
	 * @return	Organization number (domestic tax id) for this credential.
	 */
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	
	/**
	 * 
	 * @return	Organization name for this credential.
	 */
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	/**
	 * 
	 * @return	VAT number for this credential (EU-tax number)
	 */
	public String getVatNo() {
		return vatNo;
	}

	public void setVatNo(String vatNo) {
		this.vatNo = vatNo;
	}

	public String getSveaCustomerNumber() {
		return sveaCustomerNumber;
	}

	public void setSveaCustomerNumber(String sveaCustomerNumber) {
		this.sveaCustomerNumber = sveaCustomerNumber;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	/**
	 * If true, this credential is used also for reconciliation of admin invoices (not a separate account no).
	 * @return	True if admin payments are included here.
	 */
	public boolean isIncludeAdminPayments() {
		return includeAdminPayments;
	}

	public void setIncludeAdminPayments(boolean includeAdminPayments) {
		this.includeAdminPayments = includeAdminPayments;
	}

	/*
	 * If true, this credential is used also for reconciliation of card payments
	 */
	public boolean isIncludeCardPayments() {
		return includeCardPayments;
	}

	public void setIncludeCardPayments(boolean includeCardPayments) {
		this.includeCardPayments = includeCardPayments;
	}
	
	/**
	 * 
	 * @return	If true, kickbacks are reported on end customer level rather than on
	 * 			client level.
	 */
	public boolean isIncludeKickbacks() {
		return includeKickbacks;
	}

	public void setIncludeKickbacks(boolean includeKickbacks) {
		this.includeKickbacks = includeKickbacks;
	}

	/**
	 * Determines if this credential is active or not.
	 * @return		True if credential / client is active.
	 */
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		if (accountNo!=null) {
			buf.append("AcctNo: " + accountNo);
		}
		if (merchantId!=null) {
			buf.append("MerchId: " + merchantId);
		}
		if (accountType!=null) {
			buf.append(" / " + accountType);
		}
		if (buf.length()==0)
			return super.toString();
		return buf.toString();
	}

	/**
	 * The account map, maps the different fee / accounting types to account numbers as defined by Webpay.
	 * 
	 * - The key of the map is a fee/accounting type as defined by FeeDetail.
	 * - The value of the map is the account number.
	 * 
	 * @return		The account map for this credential
	 */
	public Map<String, String> getAccountMap() {
		return accountMap;
	}

	/**
	 * Sets the account map for this credential.
	 * 
	 * @param accountMap	The account map.
	 */
	public void setAccountMap(Map<String, String> accountMap) {
		this.accountMap = accountMap;
	}

	/**
	 * Adds an account mapping.
	 * 
	 * @param type		The type of account type or fee type.
	 * @param account	The account used for accounting.
	 */
	public void addAccountMapping(String type, String account) {
		if (type==null)
			return;
		if (accountMap==null)
			accountMap = new TreeMap<String,String>();
		if (account==null || account.trim().length()==0) {
			return;
		}
		accountMap.put(type, account);
	}

	/**
	 * Creates a default account map if none is supplied.
	 * If the accountmap exists it's overwritten.
	 * 
	 * @return	An account map with default accounts set.
	 * 
	 */
	public Map<String,String> createDefaultAccountMap() {
		
		if (accountMap==null) {
			accountMap = new TreeMap<String,String>();
		}
		
		accountMap.put(FeeDetail.ACCTTYPE_CASH, "1930");
		accountMap.put(FeeDetail.ACCTTYPE_RECONCILE, "1580");
		accountMap.put(FeeDetail.ACCTTYPE_DEPOSIT, "1974");
		accountMap.put(FeeDetail.ACCTTYPE_RECEIVABLES, "1510");
		accountMap.put(FeeDetail.ACCTTYPE_BALANCE, "2419");
		accountMap.put(FeeDetail.ACCTTYPE_VAT, "2641");
		accountMap.put(FeeDetail.FEETYPE_ROUNDING, "3740");
		accountMap.put(FeeDetail.REVENUE_REMINDER, "3990");
		accountMap.put(FeeDetail.FEETYPE_ADM, "6532");
		accountMap.put(FeeDetail.FEETYPE_CREDIT, "6590");
		accountMap.put(FeeDetail.FEETYPE_REMINDER, "6533");
		accountMap.put(FeeDetail.FEETYPE_COLLECTION, "6533");
		accountMap.put(FeeDetail.FEETYPE_INTEREST, "6534");
		accountMap.put(FeeDetail.FEETYPE_POSTAGE, "6250");
		accountMap.put(FeeDetail.REVENUE_INTEREST, "8313");
		accountMap.put(FeeDetail.ACCTTYPE_DEVIATIONS, "9999");		
		
		return accountMap;
		
	}

	/**
	 * Gets the reverse account map. This means that the account number is the key and the feetype is the
	 * value.
	 * 
	 * The map is created each time this method is called. Call it once and save the map.
	 * 
	 * @return	A reverse account map.
	 */
	public Map<String,String> getReverseAccountMap() {
		
		// Create a default account map if no account map exists
		if (accountMap==null)
			createDefaultAccountMap();
		
		Map<String,String> reverseMap = new TreeMap<String,String>();
		String acctNr;
		for (String feeType : accountMap.keySet()) {
			
			acctNr = accountMap.get(feeType);
			reverseMap.put(acctNr, feeType);
			
		}
		
		return reverseMap;
	}
	
	/**
	 * The account remap, remaps the accounting numbers as defined by Svea to the client's actual
	 * accounting numbers (if they are different).
	 * 
	 * @return	A remapped account map.
	 */
	public Map<String, String> getAccountRemap() {
		return accountRemap;
	}

	public void setAccountRemap(Map<String, String> accountRemap) {
		this.accountRemap = accountRemap;
	}
	
	/**
	 * Currency for this account
	 * 
	 * @return		Currency
	 */
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void addAccountRemap(String src, String dst) {
		if (src==null)
			return;
		if (accountRemap==null)
			accountRemap = new TreeMap<String,String>();
		if (dst==null) {
			accountRemap.remove(src);
			return;
		}
		accountRemap.put(src, dst);
		
	}

	/**
	 * If this account is for companies or persons.
	 * 
	 * Unclear if this flag is necessary
	 * 
	 * @return		If this credential is for companies.
	 */
	public boolean isCompany() {
		return company;
	}

	public void setCompany(boolean company) {
		this.company = company;
	}
	
	public boolean isIgnoreFees() {
		return ignoreFees;
	}

	public void setIgnoreFees(boolean ignoreFees) {
		this.ignoreFees = ignoreFees;
	}
	
	public boolean isEnrichFromInvoice() {
		return enrichFromInvoice;
	}

	public void setEnrichFromInvoice(boolean enrichFromInvoice) {
		this.enrichFromInvoice = enrichFromInvoice;
	}

	public boolean isSkipTaxId() {
		return skipTaxId;
	}

	public void setSkipTaxId(boolean skipTaxId) {
		this.skipTaxId = skipTaxId;
	}

	public boolean isSkipEmail() {
		return skipEmail;
	}

	public void setSkipEmail(boolean skipEmail) {
		this.skipEmail = skipEmail;
	}
	
	public String getCardSecretWord() {
		return cardSecretWord;
	}

	public void setCardSecretWord(String cardSecretWord) {
		this.cardSecretWord = cardSecretWord;
	}

	/**
	 * Returns account for given AccountType. If remapped, the remapped account is returned.
	 *  
	 * @param acctType		One of FeeDetail.ACCTTYPE_*
	 * @return		The remapped account
	 */
	public String getRemappedAccountFor(String acctType) {
		if (accountMap==null) return null;
		String sveaAcct = accountMap.get(acctType);
		if (sveaAcct!=null) {
			if (accountRemap==null) return sveaAcct;
			String clientAcct = accountRemap.get(sveaAcct);
			if (clientAcct!=null) 
				return clientAcct;
		}
		return sveaAcct;
	}
	
	/**
	 * External accounting dimension (a.k.a CostCenter).
	 * @return		The external accounting dimension.
	 */
	public String getExternalAccountingDimension() {
		return externalAccountingDimension;
	}

	public void setExternalAccountingDimension(String externalAccountingDimension) {
		this.externalAccountingDimension = externalAccountingDimension;
	}

	/**
	 * Loads credentials from an XML-file containing credentials.
	 * 
	 * @param configfile		The file to read from
	 * @return	A list of credentials or null if the file doesn't exist.
	 * @throws MalformedURLException	when file can't be found
	 * @throws XPathExpressionException		if xml-file can't be parsed
	 * @throws org.apache.commons.configuration2.ex.ConfigurationException	if xml-file can't be parsed
	 */
	public static List<SveaCredential> loadCredentialsFromXmlFile(String configfile) throws MalformedURLException, XPathExpressionException, org.apache.commons.configuration2.ex.ConfigurationException {

		if (configfile == null) return null;
		
		Configurations configs = new Configurations();
		List<SveaCredential> result = new ArrayList<SveaCredential>();
		
		URL url = null;
		
		// Try absolute path first
		File cf = new File(configfile);
		if (!cf.exists()) {
			// Try read as resource
			url = ClassLoader.getSystemResource(configfile);
		} else {
			url = new URL("file://" + cf.getAbsolutePath());
		}

		if (url==null) {
			return null;
		}
		
		XMLConfiguration fc = configs.xml(url);
		Document xmlDoc = fc.getDocument();

		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath path = xpathFactory.newXPath();
		
		// Read company information if any
		String configOrgNo = path.evaluate("//configuration/orgNo", xmlDoc);
		String configOrgName = path.evaluate("//configuration/orgName", xmlDoc);
		
		NodeList list = (NodeList)path.evaluate("//configuration/accounts/account", xmlDoc, XPathConstants.NODESET);
		Node node;

		SveaCredential cre = null;
		
		for (int i=0; i<list.getLength(); i++) {
			node = list.item(i);

			cre = new SveaCredential();
			
			NodeList clist = node.getChildNodes();
			
			// OrgNo 
			String onr = path.evaluate("orgNo", clist);
			if (onr!=null && onr.trim().length()>0) {
				cre.setOrgNo(onr);
			} else {
				if (configOrgNo!=null) {
					cre.setOrgNo(configOrgNo);
				}
			}
			
			String oname = path.evaluate("orgName", clist);
			if (oname!=null && oname.trim().length()>0) {
				cre.setOrgName(oname);
			} else {
				if (configOrgName!=null) {
					cre.setOrgName(configOrgName);
				}
			}
			
			cre.setAccountNo(path.evaluate("accountNo", clist));
			cre.setUsername(path.evaluate("username", clist));
			cre.setPassword(path.evaluate("password", clist));
			cre.setAccountType(path.evaluate("accountType", clist));
			cre.setCurrency(path.evaluate("currency", clist));
			String company = path.evaluate("company", clist);
			if (company!=null)
				cre.setCompany(Boolean.parseBoolean(company));
			String ignoreFees = path.evaluate("ignoreFees", clist);
			if (ignoreFees!=null) {
				cre.setIgnoreFees(Boolean.parseBoolean(ignoreFees));
			}
			String countryCodeTmp = path.evaluate("countryCode", clist);
			if (countryCodeTmp!=null) {
				cre.setCountryCode(countryCodeTmp);
			}
			
			String enrichFromInvoice = path.evaluate("enrichFromInvoice", clist);
			if (enrichFromInvoice!=null) {
				cre.setEnrichFromInvoice(Boolean.parseBoolean(enrichFromInvoice));
			}
			String skipTaxId = path.evaluate("skipTaxId", clist);
			if (skipTaxId!=null && skipTaxId.trim().length()>0) {
				cre.setSkipTaxId(Boolean.parseBoolean(skipTaxId));
			}
			String skipEmail = path.evaluate("skipEmail", clist);
			if (skipEmail!=null && skipEmail.trim().length()>0) {
				cre.setSkipEmail(Boolean.parseBoolean(skipEmail));
			}
			String includeCardPayments = path.evaluate("includeCardPayments", clist);
			if (includeCardPayments!=null && includeCardPayments.trim().length()>0) {
				cre.setIncludeCardPayments(Boolean.parseBoolean(includeCardPayments));
			}
			
			cre.setSecretWord(path.evaluate("secretWord", clist));
			cre.setServer(path.evaluate("server", clist));
			cre.setMerchantId(path.evaluate("merchantId", clist));
			cre.setCardMerchantId(path.evaluate("cardMerchantId", clist));
			cre.setCardSecretWord(path.evaluate("cardSecretWord", clist));
			cre.setExternalAccountingDimension(path.evaluate("externalAccountingDimension", clist));
			
			Node aNode = (Node)path.evaluate("accountMappings", clist, XPathConstants.NODE);

			// Create default account map to start with
			if (cre.getAccountMap()==null) {
				cre.createDefaultAccountMap();
			}
			
			if (aNode!=null) {
				NodeList alist = aNode.getChildNodes();
				if (alist!=null) {
					cre.addAccountMapping(FeeDetail.ACCTTYPE_CASH, (String)path.evaluate("accountMap/" + FeeDetail.ACCTTYPE_CASH, alist, XPathConstants.STRING));
					cre.addAccountMapping(FeeDetail.ACCTTYPE_RECONCILE, (String)path.evaluate("accountMap/" + FeeDetail.ACCTTYPE_RECONCILE, alist));
					cre.addAccountMapping(FeeDetail.ACCTTYPE_DEPOSIT, path.evaluate("accountMap/" + FeeDetail.ACCTTYPE_DEPOSIT, alist));
					cre.addAccountMapping(FeeDetail.ACCTTYPE_RECEIVABLES, path.evaluate("accountMap/" + FeeDetail.ACCTTYPE_RECEIVABLES, alist));
					cre.addAccountMapping(FeeDetail.ACCTTYPE_BALANCE, path.evaluate("accountMap/" + FeeDetail.ACCTTYPE_BALANCE, alist));
					cre.addAccountMapping(FeeDetail.ACCTTYPE_VAT, path.evaluate("accountMap/" + FeeDetail.ACCTTYPE_VAT, alist));
					cre.addAccountMapping(FeeDetail.FEETYPE_ADM, path.evaluate("accountMap/" + FeeDetail.FEETYPE_ADM, alist));
					cre.addAccountMapping(FeeDetail.FEETYPE_COLLECTION, path.evaluate("accountMap/" + FeeDetail.FEETYPE_COLLECTION, alist));
					cre.addAccountMapping(FeeDetail.FEETYPE_CREDIT, path.evaluate("accountMap/" + FeeDetail.FEETYPE_CREDIT, alist));
					cre.addAccountMapping(FeeDetail.FEETYPE_INTEREST, path.evaluate("accountMap/" + FeeDetail.FEETYPE_INTEREST, alist));
					cre.addAccountMapping(FeeDetail.FEETYPE_POSTAGE, path.evaluate("accountMap/" + FeeDetail.FEETYPE_POSTAGE, alist));
					cre.addAccountMapping(FeeDetail.FEETYPE_REMINDER, path.evaluate("accountMap/" + FeeDetail.FEETYPE_REMINDER, alist));
					cre.addAccountMapping(FeeDetail.FEETYPE_ROUNDING, path.evaluate("accountMap/" + FeeDetail.FEETYPE_ROUNDING, alist));
				}
			}
			
			// Get remaps
			NodeList remaps = (NodeList)path.evaluate("accountMappings/accountRemap", clist, XPathConstants.NODESET);

			if (remaps!=null) {
				Node remap;
				NamedNodeMap attr;
				for (int j=0; j<remaps.getLength(); j++) {
					remap = remaps.item(j);
					attr = remap.getAttributes();
					cre.addAccountRemap(attr.getNamedItem("from").getNodeValue(), attr.getNamedItem("to").getNodeValue());
				}
			}
			
			result.add(cre);
			
		}
		
		return result;
		
	}

	/**
	 * Loads credentials from json file
	 * 
	 * @param configfile		The file name to read
	 * @return	A list of credentials
	 * @throws Exception	if file can't be found or read
	 */
	public static List<SveaCredential> loadCredentialsFromJsonFile(String configfile) throws Exception {

		if (configfile==null) return null;
		
		URL url;
		// Try absolute path first
		File cf = new File(configfile);
		if (!cf.exists()) {
			// Try read as resource
			url = ClassLoader.getSystemResource(configfile);
		} else {
			url = new URL("file://" + cf.getAbsolutePath());
		}

		if (url==null) {
			return null;
		}
		
		FileReader fr = new FileReader(url.getFile());
		
		ListOfSveaCredentials result = JsonUtil.gson.fromJson(fr, ListOfSveaCredentials.class);
		
		if (result!=null)
			return result.getCredentials();

		else return null;
	}
	
	/**
	 * Saves credentials as json-file. Handy to use if sending credentials as json.
	 * 
	 * @param credentials		The credentials to save
	 * @param filename			The file name to save the credentials in
	 * @throws Exception		If save operation fails.
	 */
	public static void saveCredentialsAsJson(List<SveaCredential> credentials, String filename) throws Exception {

		if (credentials==null) return;
		ListOfSveaCredentials result = new ListOfSveaCredentials();
		for (SveaCredential cr : credentials) {
			result.addCredential(cr);
		}
		
		FileWriter fr = new FileWriter(filename);
		fr.write("{ \"credentials\": \n");
		fr.write(JsonUtil.gson.toJson(credentials));
		fr.write("}\n");
		fr.close();
		
	}
	
}
