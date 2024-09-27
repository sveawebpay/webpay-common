
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
 *         &lt;element name="CreateOrderResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}CreateOrderResponse" minOccurs="0"/&gt;
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
    "createOrderResult"
})
@XmlRootElement(name = "CreateOrderResponse", namespace = "http://tempuri.org/")
public class CreateOrderResponse {

    @XmlElement(name = "CreateOrderResult", namespace = "http://tempuri.org/", nillable = true)
    protected CreateOrderResponse2 createOrderResult;

    /**
     * Gets the value of the createOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOrderResponse2 }
     *     
     */
    public CreateOrderResponse2 getCreateOrderResult() {
        return createOrderResult;
    }

    /**
     * Sets the value of the createOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOrderResponse2 }
     *     
     */
    public void setCreateOrderResult(CreateOrderResponse2 value) {
        this.createOrderResult = value;
    }

}
