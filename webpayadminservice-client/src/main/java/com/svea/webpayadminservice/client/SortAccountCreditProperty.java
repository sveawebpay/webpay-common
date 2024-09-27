
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortAccountCreditProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SortAccountCreditProperty"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Amount"/&gt;
 *     &lt;enumeration value="CreationDate"/&gt;
 *     &lt;enumeration value="ContractNumber"/&gt;
 *     &lt;enumeration value="ClientId"/&gt;
 *     &lt;enumeration value="OrderId"/&gt;
 *     &lt;enumeration value="ClientAccountCreditId"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortAccountCreditProperty", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account")
@XmlEnum
public enum SortAccountCreditProperty {

    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("CreationDate")
    CREATION_DATE("CreationDate"),
    @XmlEnumValue("ContractNumber")
    CONTRACT_NUMBER("ContractNumber"),
    @XmlEnumValue("ClientId")
    CLIENT_ID("ClientId"),
    @XmlEnumValue("OrderId")
    ORDER_ID("OrderId"),
    @XmlEnumValue("ClientAccountCreditId")
    CLIENT_ACCOUNT_CREDIT_ID("ClientAccountCreditId");
    private final String value;

    SortAccountCreditProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortAccountCreditProperty fromValue(String v) {
        for (SortAccountCreditProperty c: SortAccountCreditProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
