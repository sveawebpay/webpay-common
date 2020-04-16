
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
 *         &lt;element name="GetInvoicesPaidToClientForReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}GetInvoicesPaidToClientForReportResponse" minOccurs="0"/&gt;
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
    "getInvoicesPaidToClientForReportResult"
})
@XmlRootElement(name = "GetInvoicesPaidToClientForReportResponse", namespace = "http://tempuri.org/")
public class GetInvoicesPaidToClientForReportResponse {

    @XmlElement(name = "GetInvoicesPaidToClientForReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetInvoicesPaidToClientForReportResponse2 getInvoicesPaidToClientForReportResult;

    /**
     * Gets the value of the getInvoicesPaidToClientForReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetInvoicesPaidToClientForReportResponse2 }
     *     
     */
    public GetInvoicesPaidToClientForReportResponse2 getGetInvoicesPaidToClientForReportResult() {
        return getInvoicesPaidToClientForReportResult;
    }

    /**
     * Sets the value of the getInvoicesPaidToClientForReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInvoicesPaidToClientForReportResponse2 }
     *     
     */
    public void setGetInvoicesPaidToClientForReportResult(GetInvoicesPaidToClientForReportResponse2 value) {
        this.getInvoicesPaidToClientForReportResult = value;
    }

}
