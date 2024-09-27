
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
 *         &lt;element name="CancelOrderRowsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}CancelOrderRowsResponse" minOccurs="0"/&gt;
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
    "cancelOrderRowsResult"
})
@XmlRootElement(name = "CancelOrderRowsResponse", namespace = "http://tempuri.org/")
public class CancelOrderRowsResponse {

    @XmlElement(name = "CancelOrderRowsResult", namespace = "http://tempuri.org/", nillable = true)
    protected CancelOrderRowsResponse2 cancelOrderRowsResult;

    /**
     * Gets the value of the cancelOrderRowsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancelOrderRowsResponse2 }
     *     
     */
    public CancelOrderRowsResponse2 getCancelOrderRowsResult() {
        return cancelOrderRowsResult;
    }

    /**
     * Sets the value of the cancelOrderRowsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelOrderRowsResponse2 }
     *     
     */
    public void setCancelOrderRowsResult(CancelOrderRowsResponse2 value) {
        this.cancelOrderRowsResult = value;
    }

}
