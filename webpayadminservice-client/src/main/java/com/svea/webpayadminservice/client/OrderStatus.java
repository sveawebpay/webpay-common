
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Denied"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice")
@XmlEnum
public enum OrderStatus {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Denied")
    DENIED("Denied"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    OrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatus fromValue(String v) {
        for (OrderStatus c: OrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
