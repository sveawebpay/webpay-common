
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
 *         &lt;element name="GetInvoicesWithChangedDueDateResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetInvoicesWithChangedDueDateResponse" minOccurs="0"/&gt;
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
    "getInvoicesWithChangedDueDateResult"
})
@XmlRootElement(name = "GetInvoicesWithChangedDueDateResponse", namespace = "http://tempuri.org/")
public class GetInvoicesWithChangedDueDateResponse {

    @XmlElement(name = "GetInvoicesWithChangedDueDateResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetInvoicesWithChangedDueDateResponse2 getInvoicesWithChangedDueDateResult;

    /**
     * Gets the value of the getInvoicesWithChangedDueDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetInvoicesWithChangedDueDateResponse2 }
     *     
     */
    public GetInvoicesWithChangedDueDateResponse2 getGetInvoicesWithChangedDueDateResult() {
        return getInvoicesWithChangedDueDateResult;
    }

    /**
     * Sets the value of the getInvoicesWithChangedDueDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInvoicesWithChangedDueDateResponse2 }
     *     
     */
    public void setGetInvoicesWithChangedDueDateResult(GetInvoicesWithChangedDueDateResponse2 value) {
        this.getInvoicesWithChangedDueDateResult = value;
    }

}
