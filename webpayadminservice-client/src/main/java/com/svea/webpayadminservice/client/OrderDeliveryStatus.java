
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDeliveryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OrderDeliveryStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="PartiallyDelivered"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderDeliveryStatus")
@XmlEnum
public enum OrderDeliveryStatus {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("PartiallyDelivered")
    PARTIALLY_DELIVERED("PartiallyDelivered"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    OrderDeliveryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderDeliveryStatus fromValue(String v) {
        for (OrderDeliveryStatus c: OrderDeliveryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
