package com.svea.webpay.paymentgw.junit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestConfig {

	public static Logger testLogger = LoggerFactory.getLogger("com.svea.webpay.paymentgw.junit");

	
	// NOTE! This secret word is publicly available as a test secret in the publicly available manuals online.
	// It's hence not really secret.
	public static String testSecretWord = 
			"27f18bfcbe4d7f39971cb3460fbe7234a82fb48f985cf22a068fa1a685fe7e6f93c7d0d92fee4e8fd7dc0c9f11e2507300e675220ee85679afa681407ee2416d";

	// Test MerchantId found in manuals for Payment Gateway API.
	public static Integer testMerchantId = 1200;
	
	public static Long transactionId = null;
	
	public static String	CONFIG_FILE = "test-config.properties";
	
	static {
		
		// Check if the file is there
		URL url = ClassLoader.getSystemResource(CONFIG_FILE);
		
		if (url!=null) {
			Properties props = new Properties();
			try {
				props.load(new FileReader(url.getFile()));
				
				testSecretWord = props.getProperty("secretWord");
				
				if (props.getProperty("merchantId")!=null) {
					testMerchantId = Integer.parseInt((String)props.getProperty("merchantId"));	
				}

				if (props.getProperty("transactionId")!=null) {
					transactionId = Long.parseLong((String)props.getProperty("transactionId"));
				}
				
			} catch (FileNotFoundException e) {
				testLogger.info("No test-config.properties file found in classpath / path. Using defaults.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
