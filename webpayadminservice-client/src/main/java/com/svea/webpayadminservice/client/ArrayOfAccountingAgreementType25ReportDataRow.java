
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAccountingAgreementType25ReportDataRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAccountingAgreementType25ReportDataRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingAgreementType25ReportDataRow" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}AccountingAgreementType25ReportDataRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountingAgreementType25ReportDataRow", propOrder = {
    "accountingAgreementType25ReportDataRow"
})
public class ArrayOfAccountingAgreementType25ReportDataRow {

    @XmlElement(name = "AccountingAgreementType25ReportDataRow", nillable = true)
    protected List<AccountingAgreementType25ReportDataRow> accountingAgreementType25ReportDataRow;

    /**
     * Gets the value of the accountingAgreementType25ReportDataRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingAgreementType25ReportDataRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingAgreementType25ReportDataRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingAgreementType25ReportDataRow }
     * 
     * 
     */
    public List<AccountingAgreementType25ReportDataRow> getAccountingAgreementType25ReportDataRow() {
        if (accountingAgreementType25ReportDataRow == null) {
            accountingAgreementType25ReportDataRow = new ArrayList<AccountingAgreementType25ReportDataRow>();
        }
        return this.accountingAgreementType25ReportDataRow;
    }

}
