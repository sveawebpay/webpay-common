
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDistributionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceDistributionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotDefined"/&gt;
 *     &lt;enumeration value="Post"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="EInvoiceB2B"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceDistributionType", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder")
@XmlEnum
public enum InvoiceDistributionType {

    @XmlEnumValue("NotDefined")
    NOT_DEFINED("NotDefined"),
    @XmlEnumValue("Post")
    POST("Post"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("EInvoiceB2B")
    E_INVOICE_B_2_B("EInvoiceB2B");
    private final String value;

    InvoiceDistributionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceDistributionType fromValue(String v) {
        for (InvoiceDistributionType c: InvoiceDistributionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
