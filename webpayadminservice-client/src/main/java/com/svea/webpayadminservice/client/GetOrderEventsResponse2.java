
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOrderEventsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrderEventsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Events" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfOrderEvent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderEventsResponse", propOrder = {
    "events"
})
public class GetOrderEventsResponse2
    extends BasicResponse
{

    @XmlElement(name = "Events", nillable = true)
    protected ArrayOfOrderEvent events;

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderEvent }
     *     
     */
    public ArrayOfOrderEvent getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderEvent }
     *     
     */
    public void setEvents(ArrayOfOrderEvent value) {
        this.events = value;
    }

}
