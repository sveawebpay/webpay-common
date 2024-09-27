
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
 *         &lt;element name="SearchInvoicesResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchInvoicesResponse" minOccurs="0"/&gt;
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
    "searchInvoicesResult"
})
@XmlRootElement(name = "SearchInvoicesResponse", namespace = "http://tempuri.org/")
public class SearchInvoicesResponse {

    @XmlElement(name = "SearchInvoicesResult", namespace = "http://tempuri.org/", nillable = true)
    protected SearchInvoicesResponse2 searchInvoicesResult;

    /**
     * Gets the value of the searchInvoicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchInvoicesResponse2 }
     *     
     */
    public SearchInvoicesResponse2 getSearchInvoicesResult() {
        return searchInvoicesResult;
    }

    /**
     * Sets the value of the searchInvoicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInvoicesResponse2 }
     *     
     */
    public void setSearchInvoicesResult(SearchInvoicesResponse2 value) {
        this.searchInvoicesResult = value;
    }

}
