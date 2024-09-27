
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingReferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BillingReferenceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *     &lt;enumeration value="Purchase"/&gt;
 *     &lt;enumeration value="ContactPerson"/&gt;
 *     &lt;enumeration value="InvoiceReference"/&gt;
 *     &lt;enumeration value="CostCenter"/&gt;
 *     &lt;enumeration value="InvoiceRecipient"/&gt;
 *     &lt;enumeration value="LetterNumber"/&gt;
 *     &lt;enumeration value="AccountingNumber"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingReferenceType", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Enums")
@XmlEnum
public enum BillingReferenceType {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("ContactPerson")
    CONTACT_PERSON("ContactPerson"),
    @XmlEnumValue("InvoiceReference")
    INVOICE_REFERENCE("InvoiceReference"),
    @XmlEnumValue("CostCenter")
    COST_CENTER("CostCenter"),
    @XmlEnumValue("InvoiceRecipient")
    INVOICE_RECIPIENT("InvoiceRecipient"),
    @XmlEnumValue("LetterNumber")
    LETTER_NUMBER("LetterNumber"),
    @XmlEnumValue("AccountingNumber")
    ACCOUNTING_NUMBER("AccountingNumber");
    private final String value;

    BillingReferenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingReferenceType fromValue(String v) {
        for (BillingReferenceType c: BillingReferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
