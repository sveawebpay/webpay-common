
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
 *         &lt;element name="GetOrderPdfLinkResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}PdfLinkResponse" minOccurs="0"/&gt;
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
    "getOrderPdfLinkResult"
})
@XmlRootElement(name = "GetOrderPdfLinkResponse", namespace = "http://tempuri.org/")
public class GetOrderPdfLinkResponse {

    @XmlElement(name = "GetOrderPdfLinkResult", namespace = "http://tempuri.org/", nillable = true)
    protected PdfLinkResponse getOrderPdfLinkResult;

    /**
     * Gets the value of the getOrderPdfLinkResult property.
     * 
     * @return
     *     possible object is
     *     {@link PdfLinkResponse }
     *     
     */
    public PdfLinkResponse getGetOrderPdfLinkResult() {
        return getOrderPdfLinkResult;
    }

    /**
     * Sets the value of the getOrderPdfLinkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfLinkResponse }
     *     
     */
    public void setGetOrderPdfLinkResult(PdfLinkResponse value) {
        this.getOrderPdfLinkResult = value;
    }

}
