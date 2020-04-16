
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerIdentity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyIdentity" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}CompanyIdentity" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}CustomerType"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndividualIdentity" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}IndividualIdentity" minOccurs="0"/&gt;
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NationalIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublicKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIdentity", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", propOrder = {
    "coAddress",
    "companyIdentity",
    "countryCode",
    "customerType",
    "email",
    "fullName",
    "houseNumber",
    "individualIdentity",
    "locality",
    "nationalIdNumber",
    "phoneNumber",
    "publicKey",
    "street",
    "zipCode"
})
public class CustomerIdentity {

    @XmlElement(name = "CoAddress", nillable = true)
    protected String coAddress;
    @XmlElement(name = "CompanyIdentity", nillable = true)
    protected CompanyIdentity companyIdentity;
    @XmlElement(name = "CountryCode", required = true, nillable = true)
    protected String countryCode;
    @XmlElement(name = "CustomerType", required = true)
    @XmlSchemaType(name = "string")
    protected CustomerType customerType;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "FullName", required = true, nillable = true)
    protected String fullName;
    @XmlElement(name = "HouseNumber", nillable = true)
    protected String houseNumber;
    @XmlElement(name = "IndividualIdentity", nillable = true)
    protected IndividualIdentity individualIdentity;
    @XmlElement(name = "Locality", required = true, nillable = true)
    protected String locality;
    @XmlElement(name = "NationalIdNumber", nillable = true)
    protected String nationalIdNumber;
    @XmlElement(name = "PhoneNumber", nillable = true)
    protected String phoneNumber;
    @XmlElement(name = "PublicKey", nillable = true)
    protected String publicKey;
    @XmlElement(name = "Street", required = true, nillable = true)
    protected String street;
    @XmlElement(name = "ZipCode", required = true, nillable = true)
    protected String zipCode;

    /**
     * Gets the value of the coAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoAddress() {
        return coAddress;
    }

    /**
     * Sets the value of the coAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAddress(String value) {
        this.coAddress = value;
    }

    /**
     * Gets the value of the companyIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentity }
     *     
     */
    public CompanyIdentity getCompanyIdentity() {
        return companyIdentity;
    }

    /**
     * Sets the value of the companyIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentity }
     *     
     */
    public void setCompanyIdentity(CompanyIdentity value) {
        this.companyIdentity = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomerType(CustomerType value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the individualIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualIdentity }
     *     
     */
    public IndividualIdentity getIndividualIdentity() {
        return individualIdentity;
    }

    /**
     * Sets the value of the individualIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualIdentity }
     *     
     */
    public void setIndividualIdentity(IndividualIdentity value) {
        this.individualIdentity = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Gets the value of the nationalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdNumber() {
        return nationalIdNumber;
    }

    /**
     * Sets the value of the nationalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdNumber(String value) {
        this.nationalIdNumber = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the publicKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Sets the value of the publicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicKey(String value) {
        this.publicKey = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
