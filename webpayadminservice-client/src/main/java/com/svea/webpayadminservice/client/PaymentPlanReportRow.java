
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentPlanReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentPlanReportRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdministrationFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CheckoutOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ContractId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToClientAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ReportingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SveaOrderCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SveaOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPlanReportRow", propOrder = {
    "administrationFee",
    "amount",
    "checkoutOrderId",
    "clientId",
    "contractId",
    "customerId",
    "date",
    "name",
    "orderId",
    "payToClientAmount",
    "reportingDate",
    "sveaOrderCreationDate",
    "sveaOrderId"
})
public class PaymentPlanReportRow {

    @XmlElement(name = "AdministrationFee")
    protected BigDecimal administrationFee;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "CheckoutOrderId", nillable = true)
    protected Long checkoutOrderId;
    @XmlElement(name = "ClientId")
    protected int clientId;
    @XmlElement(name = "ContractId")
    protected long contractId;
    @XmlElement(name = "CustomerId")
    protected long customerId;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "OrderId", nillable = true)
    protected String orderId;
    @XmlElement(name = "PayToClientAmount")
    protected BigDecimal payToClientAmount;
    @XmlElement(name = "ReportingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportingDate;
    @XmlElement(name = "SveaOrderCreationDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sveaOrderCreationDate;
    @XmlElement(name = "SveaOrderId", nillable = true)
    protected Long sveaOrderId;

    /**
     * Gets the value of the administrationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdministrationFee() {
        return administrationFee;
    }

    /**
     * Sets the value of the administrationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdministrationFee(BigDecimal value) {
        this.administrationFee = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the checkoutOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCheckoutOrderId() {
        return checkoutOrderId;
    }

    /**
     * Sets the value of the checkoutOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCheckoutOrderId(Long value) {
        this.checkoutOrderId = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(int value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     */
    public long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the payToClientAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayToClientAmount() {
        return payToClientAmount;
    }

    /**
     * Sets the value of the payToClientAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayToClientAmount(BigDecimal value) {
        this.payToClientAmount = value;
    }

    /**
     * Gets the value of the reportingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportingDate() {
        return reportingDate;
    }

    /**
     * Sets the value of the reportingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportingDate(XMLGregorianCalendar value) {
        this.reportingDate = value;
    }

    /**
     * Gets the value of the sveaOrderCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSveaOrderCreationDate() {
        return sveaOrderCreationDate;
    }

    /**
     * Sets the value of the sveaOrderCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSveaOrderCreationDate(XMLGregorianCalendar value) {
        this.sveaOrderCreationDate = value;
    }

    /**
     * Gets the value of the sveaOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSveaOrderId() {
        return sveaOrderId;
    }

    /**
     * Sets the value of the sveaOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSveaOrderId(Long value) {
        this.sveaOrderId = value;
    }

}
