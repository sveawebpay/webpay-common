
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderListItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CancelledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ChangedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ClientOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreditApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreditRejectionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}CustomerType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "OrderListItem", propOrder = {
    "amount",
    "cancelledDate",
    "changedDate",
    "clientId",
    "clientOrderId",
    "createdDate",
    "creditApproved",
    "creditRejectionMessage",
    "customerCountryCode",
    "customerName",
    "customerType",
    "deliveryStatus",
    "nationalIdNumber",
    "orderType",
    "status",
    "sveaOrderId"
})
public class OrderListItem {

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "CancelledDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelledDate;
    @XmlElement(name = "ChangedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedDate;
    @XmlElement(name = "ClientId")
    protected Long clientId;
    @XmlElement(name = "ClientOrderId", nillable = true)
    protected String clientOrderId;
    @XmlElement(name = "CreatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CreditApproved")
    protected Boolean creditApproved;
    @XmlElement(name = "CreditRejectionMessage", nillable = true)
    protected String creditRejectionMessage;
    @XmlElement(name = "CustomerCountryCode", nillable = true)
    protected String customerCountryCode;
    @XmlElement(name = "CustomerName", nillable = true)
    protected String customerName;
    @XmlElement(name = "CustomerType")
    @XmlSchemaType(name = "string")
    protected CustomerType customerType;
    @XmlElement(name = "DeliveryStatus", nillable = true)
    protected String deliveryStatus;
    @XmlElement(name = "NationalIdNumber", nillable = true)
    protected String nationalIdNumber;
    @XmlElement(name = "OrderType", nillable = true)
    protected String orderType;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "SveaOrderId")
    protected Long sveaOrderId;

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
     * Gets the value of the cancelledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelledDate() {
        return cancelledDate;
    }

    /**
     * Sets the value of the cancelledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelledDate(XMLGregorianCalendar value) {
        this.cancelledDate = value;
    }

    /**
     * Gets the value of the changedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedDate() {
        return changedDate;
    }

    /**
     * Sets the value of the changedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedDate(XMLGregorianCalendar value) {
        this.changedDate = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientId(Long value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientOrderId() {
        return clientOrderId;
    }

    /**
     * Sets the value of the clientOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientOrderId(String value) {
        this.clientOrderId = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the creditApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditApproved() {
        return creditApproved;
    }

    /**
     * Sets the value of the creditApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditApproved(Boolean value) {
        this.creditApproved = value;
    }

    /**
     * Gets the value of the creditRejectionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRejectionMessage() {
        return creditRejectionMessage;
    }

    /**
     * Sets the value of the creditRejectionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRejectionMessage(String value) {
        this.creditRejectionMessage = value;
    }

    /**
     * Gets the value of the customerCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCountryCode() {
        return customerCountryCode;
    }

    /**
     * Sets the value of the customerCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCountryCode(String value) {
        this.customerCountryCode = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
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
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryStatus(String value) {
        this.deliveryStatus = value;
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
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
