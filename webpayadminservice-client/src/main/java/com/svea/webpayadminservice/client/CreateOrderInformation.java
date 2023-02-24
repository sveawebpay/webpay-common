
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateOrderInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressSelector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreateAccountCreditDetails" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder}CreateAccountCreditDetails" minOccurs="0"/&gt;
 *         &lt;element name="CreatePaymentPlanDetails" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder}CreatePaymentPlanDetails" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIdentity" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}CustomerIdentity"/&gt;
 *         &lt;element name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OrderDeliveryAddress" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}Address" minOccurs="0"/&gt;
 *         &lt;element name="OrderRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}ArrayOfOrderRow"/&gt;
 *         &lt;element name="OrderType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}OrderType"/&gt;
 *         &lt;element name="PeppolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderInformation", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", propOrder = {
    "addressSelector",
    "clientOrderNumber",
    "createAccountCreditDetails",
    "createPaymentPlanDetails",
    "customerIdentity",
    "customerReference",
    "groupReference",
    "orderDate",
    "orderDeliveryAddress",
    "orderRows",
    "orderType",
    "peppolId"
})
public class CreateOrderInformation {

    @XmlElement(name = "AddressSelector", nillable = true)
    protected String addressSelector;
    @XmlElement(name = "ClientOrderNumber", nillable = true)
    protected String clientOrderNumber;
    @XmlElement(name = "CreateAccountCreditDetails", nillable = true)
    protected CreateAccountCreditDetails createAccountCreditDetails;
    @XmlElement(name = "CreatePaymentPlanDetails", nillable = true)
    protected CreatePaymentPlanDetails createPaymentPlanDetails;
    @XmlElement(name = "CustomerIdentity", required = true, nillable = true)
    protected CustomerIdentity customerIdentity;
    @XmlElement(name = "CustomerReference", nillable = true)
    protected String customerReference;
    @XmlElement(name = "GroupReference", nillable = true)
    protected String groupReference;
    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderDeliveryAddress", nillable = true)
    protected Address orderDeliveryAddress;
    @XmlElement(name = "OrderRows", required = true, nillable = true)
    protected ArrayOfOrderRow orderRows;
    @XmlElement(name = "OrderType", required = true)
    @XmlSchemaType(name = "string")
    protected OrderType orderType;
    @XmlElement(name = "PeppolId", nillable = true)
    protected String peppolId;

    /**
     * Gets the value of the addressSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSelector() {
        return addressSelector;
    }

    /**
     * Sets the value of the addressSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSelector(String value) {
        this.addressSelector = value;
    }

    /**
     * Gets the value of the clientOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientOrderNumber() {
        return clientOrderNumber;
    }

    /**
     * Sets the value of the clientOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientOrderNumber(String value) {
        this.clientOrderNumber = value;
    }

    /**
     * Gets the value of the createAccountCreditDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateAccountCreditDetails }
     *     
     */
    public CreateAccountCreditDetails getCreateAccountCreditDetails() {
        return createAccountCreditDetails;
    }

    /**
     * Sets the value of the createAccountCreditDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateAccountCreditDetails }
     *     
     */
    public void setCreateAccountCreditDetails(CreateAccountCreditDetails value) {
        this.createAccountCreditDetails = value;
    }

    /**
     * Gets the value of the createPaymentPlanDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePaymentPlanDetails }
     *     
     */
    public CreatePaymentPlanDetails getCreatePaymentPlanDetails() {
        return createPaymentPlanDetails;
    }

    /**
     * Sets the value of the createPaymentPlanDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePaymentPlanDetails }
     *     
     */
    public void setCreatePaymentPlanDetails(CreatePaymentPlanDetails value) {
        this.createPaymentPlanDetails = value;
    }

    /**
     * Gets the value of the customerIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentity }
     *     
     */
    public CustomerIdentity getCustomerIdentity() {
        return customerIdentity;
    }

    /**
     * Sets the value of the customerIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentity }
     *     
     */
    public void setCustomerIdentity(CustomerIdentity value) {
        this.customerIdentity = value;
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
     * Gets the value of the groupReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupReference() {
        return groupReference;
    }

    /**
     * Sets the value of the groupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupReference(String value) {
        this.groupReference = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderDeliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOrderDeliveryAddress() {
        return orderDeliveryAddress;
    }

    /**
     * Sets the value of the orderDeliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOrderDeliveryAddress(Address value) {
        this.orderDeliveryAddress = value;
    }

    /**
     * Gets the value of the orderRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderRow }
     *     
     */
    public ArrayOfOrderRow getOrderRows() {
        return orderRows;
    }

    /**
     * Sets the value of the orderRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderRow }
     *     
     */
    public void setOrderRows(ArrayOfOrderRow value) {
        this.orderRows = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrderType(OrderType value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the peppolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeppolId() {
        return peppolId;
    }

    /**
     * Sets the value of the peppolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeppolId(String value) {
        this.peppolId = value;
    }

}
