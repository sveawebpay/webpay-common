package com.svea.webpay.paymentgw.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Customer {

	private Long	id;
	private String	firstName;
	private String	lastName;
	private String	initials;
	private String	email;
	private String	ssn;
	private String	address;
	private String	address2;
	private String	city;
	private String	country;
	private String	zip;
	private String	phone;
	private String	vatNumber;
	private String	houseNumber;
	private String	companyName;
	private String	fullName;
	private String	industryCode;
	private Boolean	isCompany;
	private Boolean unknownCustomer;
	
	@XmlAttribute(name="id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@XmlElement(name = "firstname")	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@XmlElement(name = "lastname")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@XmlElement(name = "vatnumber")
	public String getVatNumber() {
		return vatNumber;
	}
	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}
	
	@XmlElement(name = "housenumber")
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	@XmlElement(name = "companyname")
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@XmlElement(name = "fullname")
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@XmlElement(name = "industrycode")
	public String getIndustryCode() {
		return industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	
	@XmlElement(name = "iscompany")
	public Boolean getIsCompany() {
		return isCompany;
	}
	public void setIsCompany(Boolean isCompany) {
		this.isCompany = isCompany;
	}
	
	@XmlElement(name = "unknowncustomer")
	public Boolean getUnknownCustomer() {
		return unknownCustomer;
	}
	public void setUnknownCustomer(Boolean unknownCustomer) {
		this.unknownCustomer = unknownCustomer;
	}
	
	
	
}
