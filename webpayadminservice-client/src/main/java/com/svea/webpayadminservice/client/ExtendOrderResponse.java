
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
 *         &lt;element name="ExtendOrderResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}ExtendOrderResponse" minOccurs="0"/&gt;
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
    "extendOrderResult"
})
@XmlRootElement(name = "ExtendOrderResponse", namespace = "http://tempuri.org/")
public class ExtendOrderResponse {

    @XmlElement(name = "ExtendOrderResult", namespace = "http://tempuri.org/", nillable = true)
    protected ExtendOrderResponse2 extendOrderResult;

    /**
     * Gets the value of the extendOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendOrderResponse2 }
     *     
     */
    public ExtendOrderResponse2 getExtendOrderResult() {
        return extendOrderResult;
    }

    /**
     * Sets the value of the extendOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendOrderResponse2 }
     *     
     */
    public void setExtendOrderResult(ExtendOrderResponse2 value) {
        this.extendOrderResult = value;
    }

}
