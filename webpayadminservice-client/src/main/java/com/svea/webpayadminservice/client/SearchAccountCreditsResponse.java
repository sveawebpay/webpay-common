
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
 *         &lt;element name="SearchAccountCreditsResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}SearchAccountCreditsResponse" minOccurs="0"/&gt;
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
    "searchAccountCreditsResult"
})
@XmlRootElement(name = "SearchAccountCreditsResponse", namespace = "http://tempuri.org/")
public class SearchAccountCreditsResponse {

    @XmlElement(name = "SearchAccountCreditsResult", namespace = "http://tempuri.org/", nillable = true)
    protected SearchAccountCreditsResponse2 searchAccountCreditsResult;

    /**
     * Gets the value of the searchAccountCreditsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAccountCreditsResponse2 }
     *     
     */
    public SearchAccountCreditsResponse2 getSearchAccountCreditsResult() {
        return searchAccountCreditsResult;
    }

    /**
     * Sets the value of the searchAccountCreditsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAccountCreditsResponse2 }
     *     
     */
    public void setSearchAccountCreditsResult(SearchAccountCreditsResponse2 value) {
        this.searchAccountCreditsResult = value;
    }

}
