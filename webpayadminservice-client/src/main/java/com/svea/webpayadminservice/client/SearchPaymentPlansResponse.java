
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
 *         &lt;element name="SearchPaymentPlansResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchPaymentPlansResponse" minOccurs="0"/&gt;
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
    "searchPaymentPlansResult"
})
@XmlRootElement(name = "SearchPaymentPlansResponse", namespace = "http://tempuri.org/")
public class SearchPaymentPlansResponse {

    @XmlElement(name = "SearchPaymentPlansResult", namespace = "http://tempuri.org/", nillable = true)
    protected SearchPaymentPlansResponse2 searchPaymentPlansResult;

    /**
     * Gets the value of the searchPaymentPlansResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPaymentPlansResponse2 }
     *     
     */
    public SearchPaymentPlansResponse2 getSearchPaymentPlansResult() {
        return searchPaymentPlansResult;
    }

    /**
     * Sets the value of the searchPaymentPlansResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPaymentPlansResponse2 }
     *     
     */
    public void setSearchPaymentPlansResult(SearchPaymentPlansResponse2 value) {
        this.searchPaymentPlansResult = value;
    }

}
