
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
 *         &lt;element name="GetInvoiceReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetInvoiceReportResponse" minOccurs="0"/&gt;
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
    "getInvoiceReportResult"
})
@XmlRootElement(name = "GetInvoiceReportResponse", namespace = "http://tempuri.org/")
public class GetInvoiceReportResponse {

    @XmlElement(name = "GetInvoiceReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetInvoiceReportResponse2 getInvoiceReportResult;

    /**
     * Gets the value of the getInvoiceReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetInvoiceReportResponse2 }
     *     
     */
    public GetInvoiceReportResponse2 getGetInvoiceReportResult() {
        return getInvoiceReportResult;
    }

    /**
     * Sets the value of the getInvoiceReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInvoiceReportResponse2 }
     *     
     */
    public void setGetInvoiceReportResult(GetInvoiceReportResponse2 value) {
        this.getInvoiceReportResult = value;
    }

}
