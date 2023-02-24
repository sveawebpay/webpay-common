
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountCreditStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountCreditStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="WaitingToBeSent"/&gt;
 *     &lt;enumeration value="SentToEconomySystem"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountCreditStatus")
@XmlEnum
public enum AccountCreditStatus {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("WaitingToBeSent")
    WAITING_TO_BE_SENT("WaitingToBeSent"),
    @XmlEnumValue("SentToEconomySystem")
    SENT_TO_ECONOMY_SYSTEM("SentToEconomySystem"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    AccountCreditStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountCreditStatus fromValue(String v) {
        for (AccountCreditStatus c: AccountCreditStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
