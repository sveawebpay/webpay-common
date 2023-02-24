
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
public class GetAccountingReportResponse2 {

    @XmlElement(name = "GetAccountingReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetAccountingReportResponse getAccountingReportResult;

    /**
     * Gets the value of the getAccountingReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountingReportResponse }
     *     
     */
    public GetAccountingReportResponse getGetAccountingReportResult() {
        return getAccountingReportResult;
    }

    /**
     * Sets the value of the getAccountingReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountingReportResponse }
     *     
     */
    public void setGetAccountingReportResult(GetAccountingReportResponse value) {
        this.getAccountingReportResult = value;
    }

}
