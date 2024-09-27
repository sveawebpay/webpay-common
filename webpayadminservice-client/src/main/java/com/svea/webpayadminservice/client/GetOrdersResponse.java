
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
 *         &lt;element name="GetOrdersResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetOrdersResponse" minOccurs="0"/&gt;
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
    "getOrdersResult"
})
@XmlRootElement(name = "GetOrdersResponse", namespace = "http://tempuri.org/")
public class GetOrdersResponse {

    @XmlElement(name = "GetOrdersResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetOrdersResponse2 getOrdersResult;

    /**
     * Gets the value of the getOrdersResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrdersResponse2 }
     *     
     */
    public GetOrdersResponse2 getGetOrdersResult() {
        return getOrdersResult;
    }

    /**
     * Sets the value of the getOrdersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrdersResponse2 }
     *     
     */
    public void setGetOrdersResult(GetOrdersResponse2 value) {
        this.getOrdersResult = value;
    }

}
