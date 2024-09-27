
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelOrderResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}CancelOrderResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cancelOrderResult"
})
@XmlRootElement(name = "CancelOrderResponse", namespace = "http://tempuri.org/")
public class CancelOrderResponse {

    @XmlElement(name = "CancelOrderResult", namespace = "http://tempuri.org/", nillable = true)
    protected CancelOrderResponse2 cancelOrderResult;

    /**
     * Gets the value of the cancelOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancelOrderResponse2 }
     *     
     */
    public CancelOrderResponse2 getCancelOrderResult() {
        return cancelOrderResult;
    }

    /**
     * Sets the value of the cancelOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelOrderResponse2 }
     *     
     */
    public void setCancelOrderResult(CancelOrderResponse2 value) {
        this.cancelOrderResult = value;
    }

}
