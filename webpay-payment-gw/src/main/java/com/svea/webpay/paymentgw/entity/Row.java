package com.svea.webpay.paymentgw.entity;

import javax.xml.bind.annotation.XmlElement;

public class Row {

	private String	name;
	private String	description;
	private Long	amount;
	private Long	vat;
	private Double	quantity;
	private String	SKU;
	private	String	unit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getVat() {
		return vat;
	}
	public void setVat(Long vat) {
		this.vat = vat;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	@XmlElement(name = "sku")
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
	
}
