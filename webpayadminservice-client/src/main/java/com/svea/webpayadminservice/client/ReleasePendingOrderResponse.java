
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
 *         &lt;element name="ReleasePendingOrderResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ReleasePendingResponse" minOccurs="0"/&gt;
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
    "releasePendingOrderResult"
})
@XmlRootElement(name = "ReleasePendingOrderResponse", namespace = "http://tempuri.org/")
public class ReleasePendingOrderResponse {

    @XmlElement(name = "ReleasePendingOrderResult", namespace = "http://tempuri.org/", nillable = true)
    protected ReleasePendingResponse releasePendingOrderResult;

    /**
     * Gets the value of the releasePendingOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReleasePendingResponse }
     *     
     */
    public ReleasePendingResponse getReleasePendingOrderResult() {
        return releasePendingOrderResult;
    }

    /**
     * Sets the value of the releasePendingOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleasePendingResponse }
     *     
     */
    public void setReleasePendingOrderResult(ReleasePendingResponse value) {
        this.releasePendingOrderResult = value;
    }

}
