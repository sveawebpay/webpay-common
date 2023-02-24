
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="External"/&gt;
 *     &lt;enumeration value="EndCustomerProvided"/&gt;
 *     &lt;enumeration value="Internal"/&gt;
 *     &lt;enumeration value="Migrated"/&gt;
 *     &lt;enumeration value="BankIdSigned"/&gt;
 *     &lt;enumeration value="ClientProvided"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressSource", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Enums")
@XmlEnum
public enum AddressSource {

    @XmlEnumValue("External")
    EXTERNAL("External"),
    @XmlEnumValue("EndCustomerProvided")
    END_CUSTOMER_PROVIDED("EndCustomerProvided"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Migrated")
    MIGRATED("Migrated"),
    @XmlEnumValue("BankIdSigned")
    BANK_ID_SIGNED("BankIdSigned"),
    @XmlEnumValue("ClientProvided")
    CLIENT_PROVIDED("ClientProvided");
    private final String value;

    AddressSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressSource fromValue(String v) {
        for (AddressSource c: AddressSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
