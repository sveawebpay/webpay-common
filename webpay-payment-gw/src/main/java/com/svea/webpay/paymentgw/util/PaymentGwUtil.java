package com.svea.webpay.paymentgw.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * Utility class for communicating with the Payment Gateway API.
 * 
 * @author Daniel Tamm
 *
 */
public class PaymentGwUtil {

	/**
	 * Creates a mac from given message encoded in Base64 and secret word
	 * 
	 * @param message		The base64 encoded message to use for MAC-creation.
	 * @param secretWord	The secret word to apply.
	 * @return		A mac.
	 */
	public static String createMacFromBase64Msg(String message, String secretWord) {
		
		String result = null;
		
		String inputString = message + secretWord;
		MessageDigest digest;
		
		try {
			digest = MessageDigest.getInstance("SHA-512");
			digest.reset();
			byte[] hashBytes = digest.digest(inputString.getBytes());
			result = javax.xml.bind.DatatypeConverter.printHexBinary(hashBytes).toLowerCase();
		} catch (NoSuchAlgorithmException e) {
			
		}
		
		return result;
	}
	
	/**
	 * Returns xmlMessage encoded in base64
	 * @param xmlMessage	The message to be encoded
	 * @return	The base64 encoded message
	 */
	public static String getBase64Message(String xmlMessage) {
		
		if (xmlMessage==null) return null;
		return Base64.getEncoder().encodeToString(xmlMessage.getBytes());
		
	}
	
	/**
	 * Returns xmlMessage encoded in base64
	 * @param xmlMessage	The message to be encoded
	 * @return	The base64 encoded message
	 */
	public static String decodeBase64Message(String base64Message) {
		
		if (base64Message==null) return null;
		return new String(Base64.getDecoder().decode(base64Message.getBytes(StandardCharsets.UTF_8)));
		
	}
	
	
	
	/**
	 * Creates a mac from given xml/text message and secret word.
	 * 
	 * @param xmlMessage		The message to be used for mac creation.
	 * @param secretWord		The secret word to apply.
	 * @return					The mac
	 */
	public static String createMac(String xmlMessage, String secretWord) {
		
		return createMacFromBase64Msg(getBase64Message(xmlMessage), secretWord);
		
	}
	
}
