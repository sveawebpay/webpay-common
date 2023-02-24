
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
 *         &lt;element name="GetDebtInvoicesPaidToClientForReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}GetDebtInvoicesPaidToClientForReportResponse" minOccurs="0"/&gt;
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
    "getDebtInvoicesPaidToClientForReportResult"
})
@XmlRootElement(name = "GetDebtInvoicesPaidToClientForReportResponse", namespace = "http://tempuri.org/")
public class GetDebtInvoicesPaidToClientForReportResponse {

    @XmlElement(name = "GetDebtInvoicesPaidToClientForReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetDebtInvoicesPaidToClientForReportResponse2 getDebtInvoicesPaidToClientForReportResult;

    /**
     * Gets the value of the getDebtInvoicesPaidToClientForReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetDebtInvoicesPaidToClientForReportResponse2 }
     *     
     */
    public GetDebtInvoicesPaidToClientForReportResponse2 getGetDebtInvoicesPaidToClientForReportResult() {
        return getDebtInvoicesPaidToClientForReportResult;
    }

    /**
     * Sets the value of the getDebtInvoicesPaidToClientForReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDebtInvoicesPaidToClientForReportResponse2 }
     *     
     */
    public void setGetDebtInvoicesPaidToClientForReportResult(GetDebtInvoicesPaidToClientForReportResponse2 value) {
        this.getDebtInvoicesPaidToClientForReportResult = value;
    }

}
