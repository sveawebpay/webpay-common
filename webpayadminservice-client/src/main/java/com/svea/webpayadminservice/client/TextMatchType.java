
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextMatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TextMatchType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AllFields"/&gt;
 *     &lt;enumeration value="SveaOrderId"/&gt;
 *     &lt;enumeration value="ClientOrderNumber"/&gt;
 *     &lt;enumeration value="NationalIdNumber"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TextMatchType", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.Order")
@XmlEnum
public enum TextMatchType {

    @XmlEnumValue("AllFields")
    ALL_FIELDS("AllFields"),
    @XmlEnumValue("SveaOrderId")
    SVEA_ORDER_ID("SveaOrderId"),
    @XmlEnumValue("ClientOrderNumber")
    CLIENT_ORDER_NUMBER("ClientOrderNumber"),
    @XmlEnumValue("NationalIdNumber")
    NATIONAL_ID_NUMBER("NationalIdNumber");
    private final String value;

    TextMatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextMatchType fromValue(String v) {
        for (TextMatchType c: TextMatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
