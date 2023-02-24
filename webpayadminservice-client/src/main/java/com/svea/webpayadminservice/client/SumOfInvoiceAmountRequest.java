
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SumOfInvoiceAmountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SumOfInvoiceAmountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchInvoiceFilter" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchInvoiceFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumOfInvoiceAmountRequest", propOrder = {
    "searchInvoiceFilter"
})
public class SumOfInvoiceAmountRequest
    extends BasicRequest
{

    @XmlElement(name = "SearchInvoiceFilter", nillable = true)
    protected SearchInvoiceFilter searchInvoiceFilter;

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

}
