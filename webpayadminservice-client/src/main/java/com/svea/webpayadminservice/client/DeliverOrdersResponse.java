
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
 *         &lt;element name="DeliverOrdersResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}DeliveryResponse" minOccurs="0"/&gt;
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
    "deliverOrdersResult"
})
@XmlRootElement(name = "DeliverOrdersResponse", namespace = "http://tempuri.org/")
public class DeliverOrdersResponse {

    @XmlElement(name = "DeliverOrdersResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeliveryResponse deliverOrdersResult;

    /**
     * Gets the value of the deliverOrdersResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryResponse }
     *     
     */
    public DeliveryResponse getDeliverOrdersResult() {
        return deliverOrdersResult;
    }

    /**
     * Sets the value of the deliverOrdersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryResponse }
     *     
     */
    public void setDeliverOrdersResult(DeliveryResponse value) {
        this.deliverOrdersResult = value;
    }

}
