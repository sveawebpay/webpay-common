
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
 *         &lt;element name="GetSumOfPaymentPlanAmountResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SumOfAmountResponse" minOccurs="0"/&gt;
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
    "getSumOfPaymentPlanAmountResult"
})
@XmlRootElement(name = "GetSumOfPaymentPlanAmountResponse", namespace = "http://tempuri.org/")
public class GetSumOfPaymentPlanAmountResponse {

    @XmlElement(name = "GetSumOfPaymentPlanAmountResult", namespace = "http://tempuri.org/", nillable = true)
    protected SumOfAmountResponse getSumOfPaymentPlanAmountResult;

    /**
     * Gets the value of the getSumOfPaymentPlanAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link SumOfAmountResponse }
     *     
     */
    public SumOfAmountResponse getGetSumOfPaymentPlanAmountResult() {
        return getSumOfPaymentPlanAmountResult;
    }

    /**
     * Sets the value of the getSumOfPaymentPlanAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumOfAmountResponse }
     *     
     */
    public void setGetSumOfPaymentPlanAmountResult(SumOfAmountResponse value) {
        this.getSumOfPaymentPlanAmountResult = value;
    }

}
