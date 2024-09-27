
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
 *         &lt;element name="GetInvoicePdfLinkResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}PdfLinkResponse" minOccurs="0"/&gt;
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
    "getInvoicePdfLinkResult"
})
@XmlRootElement(name = "GetInvoicePdfLinkResponse", namespace = "http://tempuri.org/")
public class GetInvoicePdfLinkResponse {

    @XmlElement(name = "GetInvoicePdfLinkResult", namespace = "http://tempuri.org/", nillable = true)
    protected PdfLinkResponse getInvoicePdfLinkResult;

    /**
     * Gets the value of the getInvoicePdfLinkResult property.
     * 
     * @return
     *     possible object is
     *     {@link PdfLinkResponse }
     *     
     */
    public PdfLinkResponse getGetInvoicePdfLinkResult() {
        return getInvoicePdfLinkResult;
    }

    /**
     * Sets the value of the getInvoicePdfLinkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfLinkResponse }
     *     
     */
    public void setGetInvoicePdfLinkResult(PdfLinkResponse value) {
        this.getInvoicePdfLinkResult = value;
    }

}
