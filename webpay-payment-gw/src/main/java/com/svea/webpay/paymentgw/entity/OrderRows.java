package com.svea.webpay.paymentgw.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class OrderRows {

	private List<Row> orderRows;

	public List<Row> getOrderRows() {
		return orderRows;
	}

	@XmlElement(name = "row")
	public void setOrderRows(List<Row> orderRows) {
		this.orderRows = orderRows;
	}
	
}
