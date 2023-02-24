
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
 *         &lt;element name="CancelAccountCreditAmountResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}CancelAccountCreditAmountResponse" minOccurs="0"/&gt;
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
    "cancelAccountCreditAmountResult"
})
@XmlRootElement(name = "CancelAccountCreditAmountResponse", namespace = "http://tempuri.org/")
public class CancelAccountCreditAmountResponse {

    @XmlElement(name = "CancelAccountCreditAmountResult", namespace = "http://tempuri.org/", nillable = true)
    protected CancelAccountCreditAmountResponse2 cancelAccountCreditAmountResult;

    /**
     * Gets the value of the cancelAccountCreditAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancelAccountCreditAmountResponse2 }
     *     
     */
    public CancelAccountCreditAmountResponse2 getCancelAccountCreditAmountResult() {
        return cancelAccountCreditAmountResult;
    }

    /**
     * Sets the value of the cancelAccountCreditAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelAccountCreditAmountResponse2 }
     *     
     */
    public void setCancelAccountCreditAmountResult(CancelAccountCreditAmountResponse2 value) {
        this.cancelAccountCreditAmountResult = value;
    }

}
