
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOrdersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOrdersRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchOrderFilter" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchOrderFilter"/&gt;
 *         &lt;element name="SearchOrderSorting" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchOrderSorting"/&gt;
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOrdersRequest", propOrder = {
    "endIndex",
    "searchOrderFilter",
    "searchOrderSorting",
    "startIndex"
})
public class SearchOrdersRequest
    extends BasicRequest
{

    @XmlElement(name = "EndIndex")
    protected int endIndex;
    @XmlElement(name = "SearchOrderFilter", required = true, nillable = true)
    protected SearchOrderFilter searchOrderFilter;
    @XmlElement(name = "SearchOrderSorting", required = true, nillable = true)
    protected SearchOrderSorting searchOrderSorting;
    @XmlElement(name = "StartIndex")
    protected int startIndex;

    /**
     * Gets the value of the endIndex property.
     * 
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * Sets the value of the endIndex property.
     * 
     */
    public void setEndIndex(int value) {
        this.endIndex = value;
    }

    /**
     * Gets the value of the searchOrderFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOrderFilter }
     *     
     */
    public SearchOrderFilter getSearchOrderFilter() {
        return searchOrderFilter;
    }

    /**
     * Sets the value of the searchOrderFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOrderFilter }
     *     
     */
    public void setSearchOrderFilter(SearchOrderFilter value) {
        this.searchOrderFilter = value;
    }

    /**
     * Gets the value of the searchOrderSorting property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOrderSorting }
     *     
     */
    public SearchOrderSorting getSearchOrderSorting() {
        return searchOrderSorting;
    }

    /**
     * Sets the value of the searchOrderSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOrderSorting }
     *     
     */
    public void setSearchOrderSorting(SearchOrderSorting value) {
        this.searchOrderSorting = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

}
