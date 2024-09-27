
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdfLinkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdfLinkResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PdfLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdfLinkResponse", propOrder = {
    "pdfLink"
})
public class PdfLinkResponse
    extends BasicResponse
{

    @XmlElement(name = "PdfLink", nillable = true)
    protected String pdfLink;

    /**
     * Gets the value of the pdfLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfLink() {
        return pdfLink;
    }

    /**
     * Sets the value of the pdfLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfLink(String value) {
        this.pdfLink = value;
    }

}
