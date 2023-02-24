
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
 *         &lt;element name="GetPaymentPlanReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetPaymentPlanReportResponse" minOccurs="0"/&gt;
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
    "getPaymentPlanReportResult"
})
@XmlRootElement(name = "GetPaymentPlanReportResponse", namespace = "http://tempuri.org/")
public class GetPaymentPlanReportResponse2 {

    @XmlElement(name = "GetPaymentPlanReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetPaymentPlanReportResponse getPaymentPlanReportResult;

    /**
     * Gets the value of the getPaymentPlanReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPaymentPlanReportResponse }
     *     
     */
    public GetPaymentPlanReportResponse getGetPaymentPlanReportResult() {
        return getPaymentPlanReportResult;
    }

    /**
     * Sets the value of the getPaymentPlanReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPaymentPlanReportResponse }
     *     
     */
    public void setGetPaymentPlanReportResult(GetPaymentPlanReportResponse value) {
        this.getPaymentPlanReportResult = value;
    }

}
