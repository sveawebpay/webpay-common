
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortInvoiceProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortInvoiceProperty"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="InvoiceDate"/&gt;
 *     &lt;enumeration value="Amount"/&gt;
 *     &lt;enumeration value="InvoiceId"/&gt;
 *     &lt;enumeration value="DueDate"/&gt;
 *     &lt;enumeration value="SveaOrderId"/&gt;
 *     &lt;enumeration value="CustomerName"/&gt;
 *     &lt;enumeration value="Status"/&gt;
 *     &lt;enumeration value="NationalIdNumber"/&gt;
 *     &lt;enumeration value="Type"/&gt;
 *     &lt;enumeration value="SveaHasBought"/&gt;
 *     &lt;enumeration value="PaidToClientDate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortInvoiceProperty")
@XmlEnum
public enum SortInvoiceProperty {

    @XmlEnumValue("InvoiceDate")
    INVOICE_DATE("InvoiceDate"),
    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("InvoiceId")
    INVOICE_ID("InvoiceId"),
    @XmlEnumValue("DueDate")
    DUE_DATE("DueDate"),
    @XmlEnumValue("SveaOrderId")
    SVEA_ORDER_ID("SveaOrderId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("NationalIdNumber")
    NATIONAL_ID_NUMBER("NationalIdNumber"),
    @XmlEnumValue("Type")
    TYPE("Type"),
    @XmlEnumValue("SveaHasBought")
    SVEA_HAS_BOUGHT("SveaHasBought"),
    @XmlEnumValue("PaidToClientDate")
    PAID_TO_CLIENT_DATE("PaidToClientDate");
    private final String value;

    SortInvoiceProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortInvoiceProperty fromValue(String v) {
        for (SortInvoiceProperty c: SortInvoiceProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
