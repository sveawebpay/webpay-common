
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KycRiskClassification.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="KycRiskClassification"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotAvailable"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Increased"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *     &lt;enumeration value="Unacceptable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KycRiskClassification", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice")
@XmlEnum
public enum KycRiskClassification {

    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Increased")
    INCREASED("Increased"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Unacceptable")
    UNACCEPTABLE("Unacceptable");
    private final String value;

    KycRiskClassification(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KycRiskClassification fromValue(String v) {
        for (KycRiskClassification c: KycRiskClassification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
