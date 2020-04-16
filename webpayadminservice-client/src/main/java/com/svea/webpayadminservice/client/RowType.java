
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RowType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="AdjustmentRow"/&gt;
 *     &lt;enumeration value="GiftCard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RowType", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Enums")
@XmlEnum
public enum RowType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("AdjustmentRow")
    ADJUSTMENT_ROW("AdjustmentRow"),
    @XmlEnumValue("GiftCard")
    GIFT_CARD("GiftCard");
    private final String value;

    RowType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RowType fromValue(String v) {
        for (RowType c: RowType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
