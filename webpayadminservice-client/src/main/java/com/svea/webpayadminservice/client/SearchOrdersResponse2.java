
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOrdersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOrdersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderListItems" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfOrderListItem"/&gt;
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
@XmlType(name = "SearchOrdersResponse", propOrder = {
    "orderListItems",
    "resultCount"
})
public class SearchOrdersResponse2
    extends BasicResponse
{

    @XmlElement(name = "OrderListItems", required = true, nillable = true)
    protected ArrayOfOrderListItem orderListItems;
    @XmlElement(name = "ResultCount")
    protected int resultCount;

    /**
     * Gets the value of the orderListItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderListItem }
     *     
     */
    public ArrayOfOrderListItem getOrderListItems() {
        return orderListItems;
    }

    /**
     * Sets the value of the orderListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderListItem }
     *     
     */
    public void setOrderListItems(ArrayOfOrderListItem value) {
        this.orderListItems = value;
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
