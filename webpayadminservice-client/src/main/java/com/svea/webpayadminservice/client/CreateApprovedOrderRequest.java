
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateApprovedOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateApprovedOrderRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientUsername" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerInformation" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}CustomerInformation"/&gt;
 *         &lt;element name="DeliveryAddress" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}DeliveryAddress" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryAddressSelector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceAddress" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}InvoiceAddress" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceAddressSelector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInformation" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}OrderInformation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateApprovedOrderRequest", propOrder = {
    "clientUsername",
    "customerInformation",
    "deliveryAddress",
    "deliveryAddressSelector",
    "invoiceAddress",
    "invoiceAddressSelector",
    "orderInformation"
})
public class CreateApprovedOrderRequest
    extends BasicRequest
{

    @XmlElement(name = "ClientUsername", required = true, nillable = true)
    protected String clientUsername;
    @XmlElement(name = "CustomerInformation", required = true, nillable = true)
    protected CustomerInformation customerInformation;
    @XmlElement(name = "DeliveryAddress", nillable = true)
    protected DeliveryAddress deliveryAddress;
    @XmlElement(name = "DeliveryAddressSelector", nillable = true)
    protected String deliveryAddressSelector;
    @XmlElement(name = "InvoiceAddress", nillable = true)
    protected InvoiceAddress invoiceAddress;
    @XmlElement(name = "InvoiceAddressSelector", nillable = true)
    protected String invoiceAddressSelector;
    @XmlElement(name = "OrderInformation", required = true, nillable = true)
    protected OrderInformation orderInformation;

    /**
     * Gets the value of the clientUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUsername() {
        return clientUsername;
    }

    /**
     * Sets the value of the clientUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUsername(String value) {
        this.clientUsername = value;
    }

    /**
     * Gets the value of the customerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInformation }
     *     
     */
    public CustomerInformation getCustomerInformation() {
        return customerInformation;
    }

    /**
     * Sets the value of the customerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInformation }
     *     
     */
    public void setCustomerInformation(CustomerInformation value) {
        this.customerInformation = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryAddress }
     *     
     */
    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryAddress }
     *     
     */
    public void setDeliveryAddress(DeliveryAddress value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryAddressSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAddressSelector() {
        return deliveryAddressSelector;
    }

    /**
     * Sets the value of the deliveryAddressSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAddressSelector(String value) {
        this.deliveryAddressSelector = value;
    }

    /**
     * Gets the value of the invoiceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAddress }
     *     
     */
    public InvoiceAddress getInvoiceAddress() {
        return invoiceAddress;
    }

    /**
     * Sets the value of the invoiceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAddress }
     *     
     */
    public void setInvoiceAddress(InvoiceAddress value) {
        this.invoiceAddress = value;
    }

    /**
     * Gets the value of the invoiceAddressSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAddressSelector() {
        return invoiceAddressSelector;
    }

    /**
     * Sets the value of the invoiceAddressSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAddressSelector(String value) {
        this.invoiceAddressSelector = value;
    }

    /**
     * Gets the value of the orderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInformation }
     *     
     */
    public OrderInformation getOrderInformation() {
        return orderInformation;
    }

    /**
     * Sets the value of the orderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInformation }
     *     
     */
    public void setOrderInformation(OrderInformation value) {
        this.orderInformation = value;
    }

}
