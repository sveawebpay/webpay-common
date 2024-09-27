
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SumOfPaymentPlanAmountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SumOfPaymentPlanAmountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnPaidToClientAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SearchPaymentPlanFilter" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SearchPaymentPlanFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumOfPaymentPlanAmountRequest", propOrder = {
    "returnPaidToClientAmount",
    "searchPaymentPlanFilter"
})
public class SumOfPaymentPlanAmountRequest
    extends BasicRequest
{

    @XmlElement(name = "ReturnPaidToClientAmount")
    protected Boolean returnPaidToClientAmount;
    @XmlElement(name = "SearchPaymentPlanFilter", nillable = true)
    protected SearchPaymentPlanFilter searchPaymentPlanFilter;

    /**
     * Gets the value of the returnPaidToClientAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnPaidToClientAmount() {
        return returnPaidToClientAmount;
    }

    /**
     * Sets the value of the returnPaidToClientAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnPaidToClientAmount(Boolean value) {
        this.returnPaidToClientAmount = value;
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

}
