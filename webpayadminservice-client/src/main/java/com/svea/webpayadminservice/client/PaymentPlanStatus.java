
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPlanStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentPlanStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="WaitingToBeSent"/&gt;
 *     &lt;enumeration value="WaitingForContract"/&gt;
 *     &lt;enumeration value="Running"/&gt;
 *     &lt;enumeration value="Finished"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentPlanStatus")
@XmlEnum
public enum PaymentPlanStatus {

    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("WaitingToBeSent")
    WAITING_TO_BE_SENT("WaitingToBeSent"),
    @XmlEnumValue("WaitingForContract")
    WAITING_FOR_CONTRACT("WaitingForContract"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Finished")
    FINISHED("Finished");
    private final String value;

    PaymentPlanStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentPlanStatus fromValue(String v) {
        for (PaymentPlanStatus c: PaymentPlanStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
