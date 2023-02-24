
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
 *         &lt;element name="GetPendingReasonsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}GetPendingReasonsResponse" minOccurs="0"/&gt;
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
    "getPendingReasonsResult"
})
@XmlRootElement(name = "GetPendingReasonsResponse", namespace = "http://tempuri.org/")
public class GetPendingReasonsResponse {

    @XmlElement(name = "GetPendingReasonsResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetPendingReasonsResponse2 getPendingReasonsResult;

    /**
     * Gets the value of the getPendingReasonsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPendingReasonsResponse2 }
     *     
     */
    public GetPendingReasonsResponse2 getGetPendingReasonsResult() {
        return getPendingReasonsResult;
    }

    /**
     * Sets the value of the getPendingReasonsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPendingReasonsResponse2 }
     *     
     */
    public void setGetPendingReasonsResult(GetPendingReasonsResponse2 value) {
        this.getPendingReasonsResult = value;
    }

}
