
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SumOfOrderAmountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SumOfOrderAmountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchOrderFilter" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchOrderFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumOfOrderAmountRequest", propOrder = {
    "searchOrderFilter"
})
public class SumOfOrderAmountRequest
    extends BasicRequest
{

    @XmlElement(name = "SearchOrderFilter", nillable = true)
    protected SearchOrderFilter searchOrderFilter;

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

}
