package com.svea.webpay.paymentgw.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="getreconciliationreport")
public class GetReconciliationReport {

	@XmlElement(name="date")
	private String dateString;
	
}
