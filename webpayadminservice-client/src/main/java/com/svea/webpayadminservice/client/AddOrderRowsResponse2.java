
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
public class AddOrderRowsResponse2 {

    @XmlElement(name = "AddOrderRowsResult", namespace = "http://tempuri.org/", nillable = true)
    protected AddOrderRowsResponse addOrderRowsResult;

    /**
     * Gets the value of the addOrderRowsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrderRowsResponse }
     *     
     */
    public AddOrderRowsResponse getAddOrderRowsResult() {
        return addOrderRowsResult;
    }

    /**
     * Sets the value of the addOrderRowsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrderRowsResponse }
     *     
     */
    public void setAddOrderRowsResult(AddOrderRowsResponse value) {
        this.addOrderRowsResult = value;
    }

}
