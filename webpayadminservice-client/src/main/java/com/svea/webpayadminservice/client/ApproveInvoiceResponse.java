
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
 *         &lt;element name="ApproveInvoiceResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ApproveInvoiceResponse" minOccurs="0"/&gt;
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
    "approveInvoiceResult"
})
@XmlRootElement(name = "ApproveInvoiceResponse", namespace = "http://tempuri.org/")
public class ApproveInvoiceResponse {

    @XmlElement(name = "ApproveInvoiceResult", namespace = "http://tempuri.org/", nillable = true)
    protected ApproveInvoiceResponse2 approveInvoiceResult;

    /**
     * Gets the value of the approveInvoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ApproveInvoiceResponse2 }
     *     
     */
    public ApproveInvoiceResponse2 getApproveInvoiceResult() {
        return approveInvoiceResult;
    }

    /**
     * Sets the value of the approveInvoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproveInvoiceResponse2 }
     *     
     */
    public void setApproveInvoiceResult(ApproveInvoiceResponse2 value) {
        this.approveInvoiceResult = value;
    }

}
