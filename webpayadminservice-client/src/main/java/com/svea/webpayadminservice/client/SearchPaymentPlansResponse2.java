
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPaymentPlansResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPaymentPlansResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentPlanListItems" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfPaymentPlanListItem"/&gt;
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPaymentPlansResponse", propOrder = {
    "paymentPlanListItems",
    "resultCount"
})
public class SearchPaymentPlansResponse2
    extends BasicResponse
{

    @XmlElement(name = "PaymentPlanListItems", required = true, nillable = true)
    protected ArrayOfPaymentPlanListItem paymentPlanListItems;
    @XmlElement(name = "ResultCount")
    protected int resultCount;

    /**
     * Gets the value of the paymentPlanListItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentPlanListItem }
     *     
     */
    public ArrayOfPaymentPlanListItem getPaymentPlanListItems() {
        return paymentPlanListItems;
    }

    /**
     * Sets the value of the paymentPlanListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentPlanListItem }
     *     
     */
    public void setPaymentPlanListItems(ArrayOfPaymentPlanListItem value) {
        this.paymentPlanListItems = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(int value) {
        this.resultCount = value;
    }

}
