
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
 *         &lt;element name="GetAccountingReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetAccountingReportResponse" minOccurs="0"/&gt;
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
    "getAccountingReportResult"
})
@XmlRootElement(name = "GetAccountingReportResponse", namespace = "http://tempuri.org/")
public class GetAccountingReportResponse {

    @XmlElement(name = "GetAccountingReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetAccountingReportResponse2 getAccountingReportResult;

    /**
     * Gets the value of the getAccountingReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountingReportResponse2 }
     *     
     */
    public GetAccountingReportResponse2 getGetAccountingReportResult() {
        return getAccountingReportResult;
    }

    /**
     * Sets the value of the getAccountingReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountingReportResponse2 }
     *     
     */
    public void setGetAccountingReportResult(GetAccountingReportResponse2 value) {
        this.getAccountingReportResult = value;
    }

}
