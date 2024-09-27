
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortPaymentPlanProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SortPaymentPlanProperty"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ApprovedDate"/&gt;
 *     &lt;enumeration value="Amount"/&gt;
 *     &lt;enumeration value="ContractNumber"/&gt;
 *     &lt;enumeration value="PaidDate"/&gt;
 *     &lt;enumeration value="SveaOrderId"/&gt;
 *     &lt;enumeration value="CustomerName"/&gt;
 *     &lt;enumeration value="Status"/&gt;
 *     &lt;enumeration value="NationalIdNumber"/&gt;
 *     &lt;enumeration value="ClientOrderId"/&gt;
 *     &lt;enumeration value="ContractLengthMonths"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortPaymentPlanProperty")
@XmlEnum
public enum SortPaymentPlanProperty {

    @XmlEnumValue("ApprovedDate")
    APPROVED_DATE("ApprovedDate"),
    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("ContractNumber")
    CONTRACT_NUMBER("ContractNumber"),
    @XmlEnumValue("PaidDate")
    PAID_DATE("PaidDate"),
    @XmlEnumValue("SveaOrderId")
    SVEA_ORDER_ID("SveaOrderId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("NationalIdNumber")
    NATIONAL_ID_NUMBER("NationalIdNumber"),
    @XmlEnumValue("ClientOrderId")
    CLIENT_ORDER_ID("ClientOrderId"),
    @XmlEnumValue("ContractLengthMonths")
    CONTRACT_LENGTH_MONTHS("ContractLengthMonths");
    private final String value;

    SortPaymentPlanProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortPaymentPlanProperty fromValue(String v) {
        for (SortPaymentPlanProperty c: SortPaymentPlanProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
