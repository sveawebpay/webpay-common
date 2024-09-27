
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
 *         &lt;element name="GetKickbackReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}GetKickbackReportResponse" minOccurs="0"/&gt;
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
    "getKickbackReportResult"
})
@XmlRootElement(name = "GetKickbackReportResponse", namespace = "http://tempuri.org/")
public class GetKickbackReportResponse {

    @XmlElement(name = "GetKickbackReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetKickbackReportResponse2 getKickbackReportResult;

    /**
     * Gets the value of the getKickbackReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetKickbackReportResponse2 }
     *     
     */
    public GetKickbackReportResponse2 getGetKickbackReportResult() {
        return getKickbackReportResult;
    }

    /**
     * Sets the value of the getKickbackReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetKickbackReportResponse2 }
     *     
     */
    public void setGetKickbackReportResult(GetKickbackReportResponse2 value) {
        this.getKickbackReportResult = value;
    }

}
