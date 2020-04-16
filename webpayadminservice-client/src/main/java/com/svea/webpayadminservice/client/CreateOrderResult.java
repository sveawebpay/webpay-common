
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateOrderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIdentity" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}CustomerIdentity" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PendingReasons" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="SveaOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SveaWillBuyOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderResult", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", propOrder = {
    "amount",
    "customerIdentity",
    "expirationDate",
    "orderType",
    "pendingReasons",
    "sveaOrderId",
    "sveaWillBuyOrder"
})
public class CreateOrderResult {

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "CustomerIdentity", nillable = true)
    protected CustomerIdentity customerIdentity;
    @XmlElement(name = "ExpirationDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "OrderType", nillable = true)
    protected String orderType;
    @XmlElement(name = "PendingReasons", nillable = true)
    protected ArrayOfstring pendingReasons;
    @XmlElement(name = "SveaOrderId")
    protected Long sveaOrderId;
    @XmlElement(name = "SveaWillBuyOrder")
    protected Boolean sveaWillBuyOrder;

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
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
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
     * Gets the value of the pendingReasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getPendingReasons() {
        return pendingReasons;
    }

    /**
     * Sets the value of the pendingReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setPendingReasons(ArrayOfstring value) {
        this.pendingReasons = value;
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

    /**
     * Gets the value of the sveaWillBuyOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSveaWillBuyOrder() {
        return sveaWillBuyOrder;
    }

    /**
     * Sets the value of the sveaWillBuyOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSveaWillBuyOrder(Boolean value) {
        this.sveaWillBuyOrder = value;
    }

}
