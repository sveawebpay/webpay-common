
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
 *         &lt;element name="GetSpecificationReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests}GetSpecificationReportResponse" minOccurs="0"/&gt;
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
    "getSpecificationReportResult"
})
@XmlRootElement(name = "GetSpecificationReportResponse", namespace = "http://tempuri.org/")
public class GetSpecificationReportResponse {

    @XmlElement(name = "GetSpecificationReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetSpecificationReportResponse2 getSpecificationReportResult;

    /**
     * Gets the value of the getSpecificationReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetSpecificationReportResponse2 }
     *     
     */
    public GetSpecificationReportResponse2 getGetSpecificationReportResult() {
        return getSpecificationReportResult;
    }

    /**
     * Sets the value of the getSpecificationReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSpecificationReportResponse2 }
     *     
     */
    public void setGetSpecificationReportResult(GetSpecificationReportResponse2 value) {
        this.getSpecificationReportResult = value;
    }

}
