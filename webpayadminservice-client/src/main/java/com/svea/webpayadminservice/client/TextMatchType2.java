
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
 *     &lt;enumeration value="ClientInvoiceId"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TextMatchType", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.Invoice")
@XmlEnum
public enum TextMatchType2 {

    @XmlEnumValue("AllFields")
    ALL_FIELDS("AllFields"),
    @XmlEnumValue("SveaOrderId")
    SVEA_ORDER_ID("SveaOrderId"),
    @XmlEnumValue("ClientOrderNumber")
    CLIENT_ORDER_NUMBER("ClientOrderNumber"),
    @XmlEnumValue("NationalIdNumber")
    NATIONAL_ID_NUMBER("NationalIdNumber"),
    @XmlEnumValue("ClientInvoiceId")
    CLIENT_INVOICE_ID("ClientInvoiceId");
    private final String value;

    TextMatchType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextMatchType2 fromValue(String v) {
        for (TextMatchType2 c: TextMatchType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
