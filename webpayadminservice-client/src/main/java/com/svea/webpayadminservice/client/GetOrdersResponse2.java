
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOrdersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrdersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Orders" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfOrder" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrdersResponse", propOrder = {
    "orders"
})
public class GetOrdersResponse2
    extends BasicResponse
{

    @XmlElement(name = "Orders", nillable = true)
    protected ArrayOfOrder orders;

    /**
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrder }
     *     
     */
    public ArrayOfOrder getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrder }
     *     
     */
    public void setOrders(ArrayOfOrder value) {
        this.orders = value;
    }

}
