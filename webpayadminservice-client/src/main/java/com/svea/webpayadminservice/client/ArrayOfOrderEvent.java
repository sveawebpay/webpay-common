
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderEvent" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}OrderEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderEvent", propOrder = {
    "orderEvent"
})
public class ArrayOfOrderEvent {

    @XmlElement(name = "OrderEvent", nillable = true)
    protected List<OrderEvent> orderEvent;

    /**
     * Gets the value of the orderEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderEvent }
     * 
     * 
     */
    public List<OrderEvent> getOrderEvent() {
        if (orderEvent == null) {
            orderEvent = new ArrayList<OrderEvent>();
        }
        return this.orderEvent;
    }

}
