
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *     &lt;enumeration value="PaymentPlan"/&gt;
 *     &lt;enumeration value="Loan"/&gt;
 *     &lt;enumeration value="AccountCredit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderType", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice")
@XmlEnum
public enum OrderType {

    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("PaymentPlan")
    PAYMENT_PLAN("PaymentPlan"),
    @XmlEnumValue("Loan")
    LOAN("Loan"),
    @XmlEnumValue("AccountCredit")
    ACCOUNT_CREDIT("AccountCredit");
    private final String value;

    OrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderType fromValue(String v) {
        for (OrderType c: OrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
