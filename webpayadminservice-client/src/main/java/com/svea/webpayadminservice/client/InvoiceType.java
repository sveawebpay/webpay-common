
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InvoiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Debit"/&gt;
 *     &lt;enumeration value="Credit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceType")
@XmlEnum
public enum InvoiceType {

    @XmlEnumValue("Debit")
    DEBIT("Debit"),
    @XmlEnumValue("Credit")
    CREDIT("Credit");
    private final String value;

    InvoiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceType fromValue(String v) {
        for (InvoiceType c: InvoiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
