
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
 *         &lt;element name="CreditInvoiceRowsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}DeliveryResponse" minOccurs="0"/&gt;
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
    "creditInvoiceRowsResult"
})
@XmlRootElement(name = "CreditInvoiceRowsResponse", namespace = "http://tempuri.org/")
public class CreditInvoiceRowsResponse {

    @XmlElement(name = "CreditInvoiceRowsResult", namespace = "http://tempuri.org/", nillable = true)
    protected DeliveryResponse creditInvoiceRowsResult;

    /**
     * Gets the value of the creditInvoiceRowsResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryResponse }
     *     
     */
    public DeliveryResponse getCreditInvoiceRowsResult() {
        return creditInvoiceRowsResult;
    }

    /**
     * Sets the value of the creditInvoiceRowsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryResponse }
     *     
     */
    public void setCreditInvoiceRowsResult(DeliveryResponse value) {
        this.creditInvoiceRowsResult = value;
    }

}
