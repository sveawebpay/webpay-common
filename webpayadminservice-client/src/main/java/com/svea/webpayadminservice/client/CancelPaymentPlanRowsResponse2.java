
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
 *         &lt;element name="CancelPaymentPlanRowsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}CancelPaymentPlanRowsResponse" minOccurs="0"/&gt;
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
    "cancelPaymentPlanRowsResult"
})
@XmlRootElement(name = "CancelPaymentPlanRowsResponse", namespace = "http://tempuri.org/")
public class CancelPaymentPlanRowsResponse2 {

    @XmlElement(name = "CancelPaymentPlanRowsResult", namespace = "http://tempuri.org/", nillable = true)
    protected CancelPaymentPlanRowsResponse cancelPaymentPlanRowsResult;

    /**
     * Gets the value of the cancelPaymentPlanRowsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPaymentPlanRowsResponse }
     *     
     */
    public CancelPaymentPlanRowsResponse getCancelPaymentPlanRowsResult() {
        return cancelPaymentPlanRowsResult;
    }

    /**
     * Sets the value of the cancelPaymentPlanRowsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPaymentPlanRowsResponse }
     *     
     */
    public void setCancelPaymentPlanRowsResult(CancelPaymentPlanRowsResponse value) {
        this.cancelPaymentPlanRowsResult = value;
    }

}
