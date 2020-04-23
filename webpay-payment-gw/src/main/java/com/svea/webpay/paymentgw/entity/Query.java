package com.svea.webpay.paymentgw.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="query")
public class Query {

	private String 	customerrefno;
	private Long 	transactionId;
	
	@XmlElement(name = "customerrefno")
	public String getCustomerrefno() {
		return customerrefno;
	}
	public void setCustomerrefno(String customerrefno) {
		this.customerrefno = customerrefno;
	}
	
	@XmlElement(name = "transactionid")
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	
}
