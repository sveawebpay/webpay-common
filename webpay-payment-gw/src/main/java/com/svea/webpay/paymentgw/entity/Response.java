package com.svea.webpay.paymentgw.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class Response {
	
	private Transaction transaction;
	private int statusCode;
	
	private String message;
	private String mac;
	
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	
	
	
}
