
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchAccountCreditsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAccountCreditsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchAccountCreditFilter" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchAccountCreditFilter"/&gt;
 *         &lt;element name="SearchAccountCreditSorting" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account}SearchAccountCreditSorting"/&gt;
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
@XmlType(name = "SearchAccountCreditsRequest", propOrder = {
    "endIndex",
    "searchAccountCreditFilter",
    "searchAccountCreditSorting",
    "startIndex"
})
public class SearchAccountCreditsRequest
    extends BasicRequest
{

    @XmlElement(name = "EndIndex")
    protected int endIndex;
    @XmlElement(name = "SearchAccountCreditFilter", required = true, nillable = true)
    protected SearchAccountCreditFilter searchAccountCreditFilter;
    @XmlElement(name = "SearchAccountCreditSorting", required = true, nillable = true)
    protected SearchAccountCreditSorting searchAccountCreditSorting;
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
     * Gets the value of the searchAccountCreditFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAccountCreditFilter }
     *     
     */
    public SearchAccountCreditFilter getSearchAccountCreditFilter() {
        return searchAccountCreditFilter;
    }

    /**
     * Sets the value of the searchAccountCreditFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAccountCreditFilter }
     *     
     */
    public void setSearchAccountCreditFilter(SearchAccountCreditFilter value) {
        this.searchAccountCreditFilter = value;
    }

    /**
     * Gets the value of the searchAccountCreditSorting property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAccountCreditSorting }
     *     
     */
    public SearchAccountCreditSorting getSearchAccountCreditSorting() {
        return searchAccountCreditSorting;
    }

    /**
     * Sets the value of the searchAccountCreditSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAccountCreditSorting }
     *     
     */
    public void setSearchAccountCreditSorting(SearchAccountCreditSorting value) {
        this.searchAccountCreditSorting = value;
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
