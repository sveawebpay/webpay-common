
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
 *         &lt;element name="CreateApprovedOrderResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}CreateApprovedOrderResponse" minOccurs="0"/&gt;
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
    "createApprovedOrderResult"
})
@XmlRootElement(name = "CreateApprovedOrderResponse", namespace = "http://tempuri.org/")
public class CreateApprovedOrderResponse {

    @XmlElement(name = "CreateApprovedOrderResult", namespace = "http://tempuri.org/", nillable = true)
    protected CreateApprovedOrderResponse2 createApprovedOrderResult;

    /**
     * Gets the value of the createApprovedOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateApprovedOrderResponse2 }
     *     
     */
    public CreateApprovedOrderResponse2 getCreateApprovedOrderResult() {
        return createApprovedOrderResult;
    }

    /**
     * Sets the value of the createApprovedOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateApprovedOrderResponse2 }
     *     
     */
    public void setCreateApprovedOrderResult(CreateApprovedOrderResponse2 value) {
        this.createApprovedOrderResult = value;
    }

}
