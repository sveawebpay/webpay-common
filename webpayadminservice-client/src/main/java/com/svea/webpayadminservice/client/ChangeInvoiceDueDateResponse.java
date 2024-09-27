
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
 *         &lt;element name="ChangeInvoiceDueDateResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ChangeInvoiceDueDateResponse" minOccurs="0"/&gt;
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
    "changeInvoiceDueDateResult"
})
@XmlRootElement(name = "ChangeInvoiceDueDateResponse", namespace = "http://tempuri.org/")
public class ChangeInvoiceDueDateResponse {

    @XmlElement(name = "ChangeInvoiceDueDateResult", namespace = "http://tempuri.org/", nillable = true)
    protected ChangeInvoiceDueDateResponse2 changeInvoiceDueDateResult;

    /**
     * Gets the value of the changeInvoiceDueDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeInvoiceDueDateResponse2 }
     *     
     */
    public ChangeInvoiceDueDateResponse2 getChangeInvoiceDueDateResult() {
        return changeInvoiceDueDateResult;
    }

    /**
     * Sets the value of the changeInvoiceDueDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeInvoiceDueDateResponse2 }
     *     
     */
    public void setChangeInvoiceDueDateResult(ChangeInvoiceDueDateResponse2 value) {
        this.changeInvoiceDueDateResult = value;
    }

}
