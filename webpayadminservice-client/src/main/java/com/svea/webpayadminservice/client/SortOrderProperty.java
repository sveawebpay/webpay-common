
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrderProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrderProperty"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CreatedDate"/&gt;
 *     &lt;enumeration value="RemainingAmount"/&gt;
 *     &lt;enumeration value="ClientOrderId"/&gt;
 *     &lt;enumeration value="CreditApproved"/&gt;
 *     &lt;enumeration value="SveaOrderId"/&gt;
 *     &lt;enumeration value="CustomerName"/&gt;
 *     &lt;enumeration value="Status"/&gt;
 *     &lt;enumeration value="NationalIdNumber"/&gt;
 *     &lt;enumeration value="OrderType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortOrderProperty")
@XmlEnum
public enum SortOrderProperty {

    @XmlEnumValue("CreatedDate")
    CREATED_DATE("CreatedDate"),
    @XmlEnumValue("RemainingAmount")
    REMAINING_AMOUNT("RemainingAmount"),
    @XmlEnumValue("ClientOrderId")
    CLIENT_ORDER_ID("ClientOrderId"),
    @XmlEnumValue("CreditApproved")
    CREDIT_APPROVED("CreditApproved"),
    @XmlEnumValue("SveaOrderId")
    SVEA_ORDER_ID("SveaOrderId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("NationalIdNumber")
    NATIONAL_ID_NUMBER("NationalIdNumber"),
    @XmlEnumValue("OrderType")
    ORDER_TYPE("OrderType");
    private final String value;

    SortOrderProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrderProperty fromValue(String v) {
        for (SortOrderProperty c: SortOrderProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
