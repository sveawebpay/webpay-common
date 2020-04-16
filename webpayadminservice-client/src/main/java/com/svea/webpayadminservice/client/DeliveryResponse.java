
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrdersDelivered" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfDeliverOrderResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryResponse", propOrder = {
    "ordersDelivered"
})
public class DeliveryResponse
    extends BasicResponse
{

    @XmlElement(name = "OrdersDelivered", required = true, nillable = true)
    protected ArrayOfDeliverOrderResult ordersDelivered;

    /**
     * Gets the value of the ordersDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeliverOrderResult }
     *     
     */
    public ArrayOfDeliverOrderResult getOrdersDelivered() {
        return ordersDelivered;
    }

    /**
     * Sets the value of the ordersDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeliverOrderResult }
     *     
     */
    public void setOrdersDelivered(ArrayOfDeliverOrderResult value) {
        this.ordersDelivered = value;
    }

}
