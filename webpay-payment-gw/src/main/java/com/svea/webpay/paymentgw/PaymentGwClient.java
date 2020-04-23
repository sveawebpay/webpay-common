package com.svea.webpay.paymentgw;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.svea.webpay.paymentgw.entity.Query;
import com.svea.webpay.paymentgw.entity.Response;
import com.svea.webpay.paymentgw.entity.Transaction;
import com.svea.webpay.paymentgw.util.PaymentGwUtil;


/**
 * 
 * 
 * @author daniel
 *
 */
public class PaymentGwClient {

	public static String BASE_URL = "https://webpaypaymentgateway.svea.com/webpay";
	public static String TEST_BASE_URL = "https://webpaypaymentgatewaytest.svea.com/webpay";
	
	private Integer 	merchantId;
	private String	secretWord;
	private String	baseUrl = BASE_URL;

	// Get logger
	protected Logger	logger = LoggerFactory.getLogger(PaymentGwClient.class);
	
	
	public PaymentGwClient(Integer merchantId, String secretWord) {
		this.merchantId = merchantId;
		this.secretWord = secretWord;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public String getSecretWord() {
		return secretWord;
	}

	public void setSecretWord(String secretWord) {
		this.secretWord = secretWord;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	
	/**
	 * Queries for a transaction by transaction ID
	 * 
	 * @param transactionId		The transaction ID to query.
	 * @return	A transaction. Null if not found.
	 */
	public Transaction queryByTransactionId(Long transactionId) {
		
		Query q = new Query();
		q.setTransactionId(transactionId);
		StringWriter sr = new StringWriter();
		JAXB.marshal(q, sr);
		StringBuffer buf = null;
		Response result = null;

		Transaction tr = null;
		String message = null;
		try {
			buf = postMessage(sr.toString(), "/rest/querytransactionid");
			BufferedReader in = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(buf.toString().getBytes()), "UTF-8"));		
			if (buf!=null) {
				result = JAXB.unmarshal(in, Response.class);
				if (result.getMessage()!=null) {
					message = PaymentGwUtil.decodeBase64Message(result.getMessage());
					// Unmarshal again
					result = JAXB.unmarshal(new StringReader(message), Response.class);
				}
			}
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		
		if (result!=null && result.getTransaction()!=null) {
			tr = result.getTransaction();
		}
		
		return tr;
	}
	
	/**
	 * Posts an XML-message 
	 * 
	 * @param messageXml	The message to send.
	 * @param path			The path to apply after the base URL.
	 * @return	A http response.
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	private StringBuffer postMessage(String messageXml, String path) throws ClientProtocolException, IOException {

		StringBuffer result = new StringBuffer();
		
		CloseableHttpClient hc = HttpClients.createDefault();
		HttpPost hp = new HttpPost(baseUrl + (path!=null ? path : ""));
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("merchantid",merchantId.toString()));
		String base64msg = PaymentGwUtil.getBase64Message(messageXml);
		nvps.add(new BasicNameValuePair("message", base64msg));
		String mac = PaymentGwUtil.createMacFromBase64Msg(base64msg, secretWord);
		nvps.add(new BasicNameValuePair("mac",mac));
		hp.setEntity(new UrlEncodedFormEntity(nvps));
		CloseableHttpResponse response = hc.execute(hp);
		try {
			HttpEntity entity = response.getEntity();
			BufferedReader rd = new BufferedReader(new InputStreamReader(entity.getContent()));
			String line;
			while ((line=rd.readLine())!=null) {
				result.append(line + "\n");
			}
			
			EntityUtils.consume(entity);
		} finally {
			response.close();
		}
		hc.close();

		return result;
		
	}
	
	
	
}
