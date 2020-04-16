
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountCreditDetails" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account}AccountCreditDetails" minOccurs="0"/&gt;
 *         &lt;element name="ChangedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ClientOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CreditReportStatus" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}CreditReportStatus" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Customer" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}CustomerIdentity"/&gt;
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryAddress" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}Address" minOccurs="0"/&gt;
 *         &lt;element name="IsPossibleToAdminister" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsPossibleToCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderDeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfNumberedOrderRow"/&gt;
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentPlanDetails" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}PaymentPlanDetails" minOccurs="0"/&gt;
 *         &lt;element name="PendingReasons" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfPendingReason" minOccurs="0"/&gt;
 *         &lt;element name="SveaOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SveaWillBuy" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "accountCreditDetails",
    "changedDate",
    "clientId",
    "clientOrderId",
    "createdDate",
    "creditReportStatus",
    "currency",
    "customer",
    "customerId",
    "customerReference",
    "deliveryAddress",
    "isPossibleToAdminister",
    "isPossibleToCancel",
    "notes",
    "orderDeliveryStatus",
    "orderRows",
    "orderStatus",
    "orderType",
    "paymentPlanDetails",
    "pendingReasons",
    "sveaOrderId",
    "sveaWillBuy"
})
public class Order {

    @XmlElement(name = "AccountCreditDetails", nillable = true)
    protected AccountCreditDetails accountCreditDetails;
    @XmlElement(name = "ChangedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedDate;
    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "ClientOrderId", nillable = true)
    protected String clientOrderId;
    @XmlElement(name = "CreatedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CreditReportStatus", nillable = true)
    protected CreditReportStatus creditReportStatus;
    @XmlElement(name = "Currency", required = true, nillable = true)
    protected String currency;
    @XmlElement(name = "Customer", required = true, nillable = true)
    protected CustomerIdentity customer;
    @XmlElement(name = "CustomerId", nillable = true)
    protected Long customerId;
    @XmlElement(name = "CustomerReference", nillable = true)
    protected String customerReference;
    @XmlElement(name = "DeliveryAddress", nillable = true)
    protected Address deliveryAddress;
    @XmlElement(name = "IsPossibleToAdminister")
    protected boolean isPossibleToAdminister;
    @XmlElement(name = "IsPossibleToCancel")
    protected boolean isPossibleToCancel;
    @XmlElement(name = "Notes", required = true, nillable = true)
    protected String notes;
    @XmlElement(name = "OrderDeliveryStatus", required = true, nillable = true)
    protected String orderDeliveryStatus;
    @XmlElement(name = "OrderRows", required = true, nillable = true)
    protected ArrayOfNumberedOrderRow orderRows;
    @XmlElement(name = "OrderStatus", required = true, nillable = true)
    protected String orderStatus;
    @XmlElement(name = "OrderType", required = true, nillable = true)
    protected String orderType;
    @XmlElement(name = "PaymentPlanDetails", nillable = true)
    protected PaymentPlanDetails paymentPlanDetails;
    @XmlElement(name = "PendingReasons", nillable = true)
    protected ArrayOfPendingReason pendingReasons;
    @XmlElement(name = "SveaOrderId")
    protected long sveaOrderId;
    @XmlElement(name = "SveaWillBuy")
    protected boolean sveaWillBuy;

    /**
     * Gets the value of the accountCreditDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCreditDetails }
     *     
     */
    public AccountCreditDetails getAccountCreditDetails() {
        return accountCreditDetails;
    }

    /**
     * Sets the value of the accountCreditDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCreditDetails }
     *     
     */
    public void setAccountCreditDetails(AccountCreditDetails value) {
        this.accountCreditDetails = value;
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
     */
    public long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(long value) {
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
     * Gets the value of the creditReportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CreditReportStatus }
     *     
     */
    public CreditReportStatus getCreditReportStatus() {
        return creditReportStatus;
    }

    /**
     * Sets the value of the creditReportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditReportStatus }
     *     
     */
    public void setCreditReportStatus(CreditReportStatus value) {
        this.creditReportStatus = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentity }
     *     
     */
    public CustomerIdentity getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentity }
     *     
     */
    public void setCustomer(CustomerIdentity value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDeliveryAddress(Address value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the isPossibleToAdminister property.
     * 
     */
    public boolean isIsPossibleToAdminister() {
        return isPossibleToAdminister;
    }

    /**
     * Sets the value of the isPossibleToAdminister property.
     * 
     */
    public void setIsPossibleToAdminister(boolean value) {
        this.isPossibleToAdminister = value;
    }

    /**
     * Gets the value of the isPossibleToCancel property.
     * 
     */
    public boolean isIsPossibleToCancel() {
        return isPossibleToCancel;
    }

    /**
     * Sets the value of the isPossibleToCancel property.
     * 
     */
    public void setIsPossibleToCancel(boolean value) {
        this.isPossibleToCancel = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the orderDeliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDeliveryStatus() {
        return orderDeliveryStatus;
    }

    /**
     * Sets the value of the orderDeliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDeliveryStatus(String value) {
        this.orderDeliveryStatus = value;
    }

    /**
     * Gets the value of the orderRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumberedOrderRow }
     *     
     */
    public ArrayOfNumberedOrderRow getOrderRows() {
        return orderRows;
    }

    /**
     * Sets the value of the orderRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumberedOrderRow }
     *     
     */
    public void setOrderRows(ArrayOfNumberedOrderRow value) {
        this.orderRows = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
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
     * Gets the value of the paymentPlanDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPlanDetails }
     *     
     */
    public PaymentPlanDetails getPaymentPlanDetails() {
        return paymentPlanDetails;
    }

    /**
     * Sets the value of the paymentPlanDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPlanDetails }
     *     
     */
    public void setPaymentPlanDetails(PaymentPlanDetails value) {
        this.paymentPlanDetails = value;
    }

    /**
     * Gets the value of the pendingReasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPendingReason }
     *     
     */
    public ArrayOfPendingReason getPendingReasons() {
        return pendingReasons;
    }

    /**
     * Sets the value of the pendingReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPendingReason }
     *     
     */
    public void setPendingReasons(ArrayOfPendingReason value) {
        this.pendingReasons = value;
    }

    /**
     * Gets the value of the sveaOrderId property.
     * 
     */
    public long getSveaOrderId() {
        return sveaOrderId;
    }

    /**
     * Sets the value of the sveaOrderId property.
     * 
     */
    public void setSveaOrderId(long value) {
        this.sveaOrderId = value;
    }

    /**
     * Gets the value of the sveaWillBuy property.
     * 
     */
    public boolean isSveaWillBuy() {
        return sveaWillBuy;
    }

    /**
     * Sets the value of the sveaWillBuy property.
     * 
     */
    public void setSveaWillBuy(boolean value) {
        this.sveaWillBuy = value;
    }

}
