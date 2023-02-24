
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
 *         &lt;element name="CancelAccountCreditRowsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}CancelAccountCreditRowsResponse" minOccurs="0"/&gt;
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
    "cancelAccountCreditRowsResult"
})
@XmlRootElement(name = "CancelAccountCreditRowsResponse", namespace = "http://tempuri.org/")
public class CancelAccountCreditRowsResponse {

    @XmlElement(name = "CancelAccountCreditRowsResult", namespace = "http://tempuri.org/", nillable = true)
    protected CancelAccountCreditRowsResponse2 cancelAccountCreditRowsResult;

    /**
     * Gets the value of the cancelAccountCreditRowsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancelAccountCreditRowsResponse2 }
     *     
     */
    public CancelAccountCreditRowsResponse2 getCancelAccountCreditRowsResult() {
        return cancelAccountCreditRowsResult;
    }

    /**
     * Sets the value of the cancelAccountCreditRowsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelAccountCreditRowsResponse2 }
     *     
     */
    public void setCancelAccountCreditRowsResult(CancelAccountCreditRowsResponse2 value) {
        this.cancelAccountCreditRowsResult = value;
    }

}
