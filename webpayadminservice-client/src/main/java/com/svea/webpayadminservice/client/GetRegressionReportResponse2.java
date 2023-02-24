
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
 *         &lt;element name="GetRegressionReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetRegressionReportResponse" minOccurs="0"/&gt;
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
    "getRegressionReportResult"
})
@XmlRootElement(name = "GetRegressionReportResponse", namespace = "http://tempuri.org/")
public class GetRegressionReportResponse2 {

    @XmlElement(name = "GetRegressionReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetRegressionReportResponse getRegressionReportResult;

    /**
     * Gets the value of the getRegressionReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetRegressionReportResponse }
     *     
     */
    public GetRegressionReportResponse getGetRegressionReportResult() {
        return getRegressionReportResult;
    }

    /**
     * Sets the value of the getRegressionReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRegressionReportResponse }
     *     
     */
    public void setGetRegressionReportResult(GetRegressionReportResponse value) {
        this.getRegressionReportResult = value;
    }

}
