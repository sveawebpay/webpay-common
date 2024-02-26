package com.svea.webpay.paymentgw.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="getreconciliationreport")
public class GetReconciliationReport {

	@XmlElement(name="date")
	private String dateString;
	
}
