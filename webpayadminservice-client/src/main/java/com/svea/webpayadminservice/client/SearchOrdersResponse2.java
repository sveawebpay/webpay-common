
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
 *         &lt;element name="SearchOrdersResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchOrdersResponse" minOccurs="0"/&gt;
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
    "searchOrdersResult"
})
@XmlRootElement(name = "SearchOrdersResponse", namespace = "http://tempuri.org/")
public class SearchOrdersResponse2 {

    @XmlElement(name = "SearchOrdersResult", namespace = "http://tempuri.org/", nillable = true)
    protected SearchOrdersResponse searchOrdersResult;

    /**
     * Gets the value of the searchOrdersResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOrdersResponse }
     *     
     */
    public SearchOrdersResponse getSearchOrdersResult() {
        return searchOrdersResult;
    }

    /**
     * Sets the value of the searchOrdersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOrdersResponse }
     *     
     */
    public void setSearchOrdersResult(SearchOrdersResponse value) {
        this.searchOrdersResult = value;
    }

}
