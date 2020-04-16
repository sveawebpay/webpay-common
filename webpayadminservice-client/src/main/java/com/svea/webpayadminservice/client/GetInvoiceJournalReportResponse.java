
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
 *         &lt;element name="GetInvoiceJournalReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetInvoiceJournalReportResponse" minOccurs="0"/&gt;
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
    "getInvoiceJournalReportResult"
})
@XmlRootElement(name = "GetInvoiceJournalReportResponse", namespace = "http://tempuri.org/")
public class GetInvoiceJournalReportResponse {

    @XmlElement(name = "GetInvoiceJournalReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetInvoiceJournalReportResponse2 getInvoiceJournalReportResult;

    /**
     * Gets the value of the getInvoiceJournalReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetInvoiceJournalReportResponse2 }
     *     
     */
    public GetInvoiceJournalReportResponse2 getGetInvoiceJournalReportResult() {
        return getInvoiceJournalReportResult;
    }

    /**
     * Sets the value of the getInvoiceJournalReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInvoiceJournalReportResponse2 }
     *     
     */
    public void setGetInvoiceJournalReportResult(GetInvoiceJournalReportResponse2 value) {
        this.getInvoiceJournalReportResult = value;
    }

}
