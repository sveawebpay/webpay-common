
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
 *         &lt;element name="UpdateOrderRowsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}UpdateOrderRowsResponse" minOccurs="0"/&gt;
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
    "updateOrderRowsResult"
})
@XmlRootElement(name = "UpdateOrderRowsResponse", namespace = "http://tempuri.org/")
public class UpdateOrderRowsResponse {

    @XmlElement(name = "UpdateOrderRowsResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateOrderRowsResponse2 updateOrderRowsResult;

    /**
     * Gets the value of the updateOrderRowsResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderRowsResponse2 }
     *     
     */
    public UpdateOrderRowsResponse2 getUpdateOrderRowsResult() {
        return updateOrderRowsResult;
    }

    /**
     * Sets the value of the updateOrderRowsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderRowsResponse2 }
     *     
     */
    public void setUpdateOrderRowsResult(UpdateOrderRowsResponse2 value) {
        this.updateOrderRowsResult = value;
    }

}
