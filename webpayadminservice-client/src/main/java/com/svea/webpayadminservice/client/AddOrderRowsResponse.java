
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
 *         &lt;element name="AddOrderRowsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}AddOrderRowsResponse" minOccurs="0"/&gt;
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
    "addOrderRowsResult"
})
@XmlRootElement(name = "AddOrderRowsResponse", namespace = "http://tempuri.org/")
public class AddOrderRowsResponse {

    @XmlElement(name = "AddOrderRowsResult", namespace = "http://tempuri.org/", nillable = true)
    protected AddOrderRowsResponse2 addOrderRowsResult;

    /**
     * Gets the value of the addOrderRowsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrderRowsResponse2 }
     *     
     */
    public AddOrderRowsResponse2 getAddOrderRowsResult() {
        return addOrderRowsResult;
    }

    /**
     * Sets the value of the addOrderRowsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrderRowsResponse2 }
     *     
     */
    public void setAddOrderRowsResult(AddOrderRowsResponse2 value) {
        this.addOrderRowsResult = value;
    }

}
