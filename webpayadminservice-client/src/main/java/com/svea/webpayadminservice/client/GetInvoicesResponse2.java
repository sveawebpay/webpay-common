
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
 *         &lt;element name="GetInvoicesResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetInvoicesResponse" minOccurs="0"/&gt;
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
    "getInvoicesResult"
})
@XmlRootElement(name = "GetInvoicesResponse", namespace = "http://tempuri.org/")
public class GetInvoicesResponse2 {

    @XmlElement(name = "GetInvoicesResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetInvoicesResponse getInvoicesResult;

    /**
     * Gets the value of the getInvoicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetInvoicesResponse }
     *     
     */
    public GetInvoicesResponse getGetInvoicesResult() {
        return getInvoicesResult;
    }

    /**
     * Sets the value of the getInvoicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInvoicesResponse }
     *     
     */
    public void setGetInvoicesResult(GetInvoicesResponse value) {
        this.getInvoicesResult = value;
    }

}
