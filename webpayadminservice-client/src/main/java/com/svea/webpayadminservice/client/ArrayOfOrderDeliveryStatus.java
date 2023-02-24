
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderDeliveryStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderDeliveryStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderDeliveryStatus" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}OrderDeliveryStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderDeliveryStatus", propOrder = {
    "orderDeliveryStatus"
})
public class ArrayOfOrderDeliveryStatus {

    @XmlElement(name = "OrderDeliveryStatus")
    @XmlSchemaType(name = "string")
    protected List<OrderDeliveryStatus> orderDeliveryStatus;

    /**
     * Gets the value of the orderDeliveryStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderDeliveryStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderDeliveryStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderDeliveryStatus }
     * 
     * 
     */
    public List<OrderDeliveryStatus> getOrderDeliveryStatus() {
        if (orderDeliveryStatus == null) {
            orderDeliveryStatus = new ArrayList<OrderDeliveryStatus>();
        }
        return this.orderDeliveryStatus;
    }

}
