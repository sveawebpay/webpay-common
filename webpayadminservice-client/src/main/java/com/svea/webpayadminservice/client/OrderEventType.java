
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="OrderEvent"/&gt;
 *     &lt;enumeration value="PendingEvent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderEventType")
@XmlEnum
public enum OrderEventType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("OrderEvent")
    ORDER_EVENT("OrderEvent"),
    @XmlEnumValue("PendingEvent")
    PENDING_EVENT("PendingEvent");
    private final String value;

    OrderEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderEventType fromValue(String v) {
        for (OrderEventType c: OrderEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
