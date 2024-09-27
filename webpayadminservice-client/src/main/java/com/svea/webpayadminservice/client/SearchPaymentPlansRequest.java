
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPaymentPlansRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPaymentPlansRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchPaymentPlanFilter" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchPaymentPlanFilter"/&gt;
 *         &lt;element name="SearchPaymentPlanSorting" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchPaymentPlanSorting"/&gt;
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
@XmlType(name = "SearchPaymentPlansRequest", propOrder = {
    "endIndex",
    "searchPaymentPlanFilter",
    "searchPaymentPlanSorting",
    "startIndex"
})
public class SearchPaymentPlansRequest
    extends BasicRequest
{

    @XmlElement(name = "EndIndex")
    protected int endIndex;
    @XmlElement(name = "SearchPaymentPlanFilter", required = true, nillable = true)
    protected SearchPaymentPlanFilter searchPaymentPlanFilter;
    @XmlElement(name = "SearchPaymentPlanSorting", required = true, nillable = true)
    protected SearchPaymentPlanSorting searchPaymentPlanSorting;
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
     * Gets the value of the searchPaymentPlanFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPaymentPlanFilter }
     *     
     */
    public SearchPaymentPlanFilter getSearchPaymentPlanFilter() {
        return searchPaymentPlanFilter;
    }

    /**
     * Sets the value of the searchPaymentPlanFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPaymentPlanFilter }
     *     
     */
    public void setSearchPaymentPlanFilter(SearchPaymentPlanFilter value) {
        this.searchPaymentPlanFilter = value;
    }

    /**
     * Gets the value of the searchPaymentPlanSorting property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPaymentPlanSorting }
     *     
     */
    public SearchPaymentPlanSorting getSearchPaymentPlanSorting() {
        return searchPaymentPlanSorting;
    }

    /**
     * Sets the value of the searchPaymentPlanSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPaymentPlanSorting }
     *     
     */
    public void setSearchPaymentPlanSorting(SearchPaymentPlanSorting value) {
        this.searchPaymentPlanSorting = value;
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
