
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelOrderRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="OrderType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}OrderType" minOccurs="0"/&gt;
 *         &lt;element name="SveaOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelOrderRequest", propOrder = {
    "clientId",
    "orderType",
    "sveaOrderId"
})
public class CancelOrderRequest
    extends BasicRequest
{

    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "OrderType")
    @XmlSchemaType(name = "string")
    protected OrderType orderType;
    @XmlElement(name = "SveaOrderId")
    protected long sveaOrderId;

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

}
