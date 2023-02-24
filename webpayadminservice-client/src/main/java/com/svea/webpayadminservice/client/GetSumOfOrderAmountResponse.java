
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
 *         &lt;element name="GetSumOfOrderAmountResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SumOfAmountResponse" minOccurs="0"/&gt;
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
    "getSumOfOrderAmountResult"
})
@XmlRootElement(name = "GetSumOfOrderAmountResponse", namespace = "http://tempuri.org/")
public class GetSumOfOrderAmountResponse {

    @XmlElement(name = "GetSumOfOrderAmountResult", namespace = "http://tempuri.org/", nillable = true)
    protected SumOfAmountResponse getSumOfOrderAmountResult;

    /**
     * Gets the value of the getSumOfOrderAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link SumOfAmountResponse }
     *     
     */
    public SumOfAmountResponse getGetSumOfOrderAmountResult() {
        return getSumOfOrderAmountResult;
    }

    /**
     * Sets the value of the getSumOfOrderAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumOfAmountResponse }
     *     
     */
    public void setGetSumOfOrderAmountResult(SumOfAmountResponse value) {
        this.getSumOfOrderAmountResult = value;
    }

}
