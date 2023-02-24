
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
 *         &lt;element name="GetFinancialReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetFinancialReportResponse" minOccurs="0"/&gt;
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
    "getFinancialReportResult"
})
@XmlRootElement(name = "GetFinancialReportResponse", namespace = "http://tempuri.org/")
public class GetFinancialReportResponse2 {

    @XmlElement(name = "GetFinancialReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetFinancialReportResponse getFinancialReportResult;

    /**
     * Gets the value of the getFinancialReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetFinancialReportResponse }
     *     
     */
    public GetFinancialReportResponse getGetFinancialReportResult() {
        return getFinancialReportResult;
    }

    /**
     * Sets the value of the getFinancialReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFinancialReportResponse }
     *     
     */
    public void setGetFinancialReportResult(GetFinancialReportResponse value) {
        this.getFinancialReportResult = value;
    }

}
