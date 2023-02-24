
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoicePaymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoicePaymentStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PendingApproval"/&gt;
 *     &lt;enumeration value="Sent"/&gt;
 *     &lt;enumeration value="Paid"/&gt;
 *     &lt;enumeration value="Overdue"/&gt;
 *     &lt;enumeration value="Reminded"/&gt;
 *     &lt;enumeration value="DebtCollection"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="PartlyPaid"/&gt;
 *     &lt;enumeration value="Credited"/&gt;
 *     &lt;enumeration value="CreditLoss"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoicePaymentStatus")
@XmlEnum
public enum InvoicePaymentStatus {

    @XmlEnumValue("PendingApproval")
    PENDING_APPROVAL("PendingApproval"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Overdue")
    OVERDUE("Overdue"),
    @XmlEnumValue("Reminded")
    REMINDED("Reminded"),
    @XmlEnumValue("DebtCollection")
    DEBT_COLLECTION("DebtCollection"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("PartlyPaid")
    PARTLY_PAID("PartlyPaid"),
    @XmlEnumValue("Credited")
    CREDITED("Credited"),
    @XmlEnumValue("CreditLoss")
    CREDIT_LOSS("CreditLoss"),
    @XmlEnumValue("Refund")
    REFUND("Refund");
    private final String value;

    InvoicePaymentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoicePaymentStatus fromValue(String v) {
        for (InvoicePaymentStatus c: InvoicePaymentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
