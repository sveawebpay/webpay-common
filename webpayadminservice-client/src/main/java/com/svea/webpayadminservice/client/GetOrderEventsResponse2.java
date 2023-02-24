
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetOrderEventsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetOrderEventsResponse" minOccurs="0"/&gt;
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
    "getOrderEventsResult"
})
@XmlRootElement(name = "GetOrderEventsResponse", namespace = "http://tempuri.org/")
public class GetOrderEventsResponse2 {

    @XmlElement(name = "GetOrderEventsResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetOrderEventsResponse getOrderEventsResult;

    /**
     * Gets the value of the getOrderEventsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrderEventsResponse }
     *     
     */
    public GetOrderEventsResponse getGetOrderEventsResult() {
        return getOrderEventsResult;
    }

    /**
     * Sets the value of the getOrderEventsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrderEventsResponse }
     *     
     */
    public void setGetOrderEventsResult(GetOrderEventsResponse value) {
        this.getOrderEventsResult = value;
    }

}
