
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificationReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecificationReportType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bank"/&gt;
 *     &lt;enumeration value="Card"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecificationReportType")
@XmlEnum
public enum SpecificationReportType {

    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("Card")
    CARD("Card");
    private final String value;

    SpecificationReportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecificationReportType fromValue(String v) {
        for (SpecificationReportType c: SpecificationReportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
