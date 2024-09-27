
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
 *         &lt;element name="DeliverPartialResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}DeliveryResponse" minOccurs="0"/&gt;
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
    "deliverPartialResult"
})
@XmlRootElement(name = "DeliverPartialResponse", namespace = "http://tempuri.org/")
public class DeliverPartialResponse {

    @XmlElement(name = "DeliverPartialResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeliveryResponse deliverPartialResult;

    /**
     * Gets the value of the deliverPartialResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryResponse }
     *     
     */
    public DeliveryResponse getDeliverPartialResult() {
        return deliverPartialResult;
    }

    /**
     * Sets the value of the deliverPartialResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryResponse }
     *     
     */
    public void setDeliverPartialResult(DeliveryResponse value) {
        this.deliverPartialResult = value;
    }

}
