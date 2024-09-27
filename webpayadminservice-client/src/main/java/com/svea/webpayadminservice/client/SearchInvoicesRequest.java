
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchInvoicesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchInvoicesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchInvoiceFilter" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchInvoiceFilter"/&gt;
 *         &lt;element name="SearchInvoiceSorting" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchInvoiceSorting"/&gt;
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
@XmlType(name = "SearchInvoicesRequest", propOrder = {
    "endIndex",
    "searchInvoiceFilter",
    "searchInvoiceSorting",
    "startIndex"
})
public class SearchInvoicesRequest
    extends BasicRequest
{

    @XmlElement(name = "EndIndex")
    protected int endIndex;
    @XmlElement(name = "SearchInvoiceFilter", required = true, nillable = true)
    protected SearchInvoiceFilter searchInvoiceFilter;
    @XmlElement(name = "SearchInvoiceSorting", required = true, nillable = true)
    protected SearchInvoiceSorting searchInvoiceSorting;
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
     * Gets the value of the searchInvoiceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SearchInvoiceFilter }
     *     
     */
    public SearchInvoiceFilter getSearchInvoiceFilter() {
        return searchInvoiceFilter;
    }

    /**
     * Sets the value of the searchInvoiceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInvoiceFilter }
     *     
     */
    public void setSearchInvoiceFilter(SearchInvoiceFilter value) {
        this.searchInvoiceFilter = value;
    }

    /**
     * Gets the value of the searchInvoiceSorting property.
     * 
     * @return
     *     possible object is
     *     {@link SearchInvoiceSorting }
     *     
     */
    public SearchInvoiceSorting getSearchInvoiceSorting() {
        return searchInvoiceSorting;
    }

    /**
     * Sets the value of the searchInvoiceSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInvoiceSorting }
     *     
     */
    public void setSearchInvoiceSorting(SearchInvoiceSorting value) {
        this.searchInvoiceSorting = value;
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
