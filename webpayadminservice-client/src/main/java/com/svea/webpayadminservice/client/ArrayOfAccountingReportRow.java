
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAccountingReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAccountingReportRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingReportRow" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}AccountingReportRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountingReportRow", propOrder = {
    "accountingReportRow"
})
public class ArrayOfAccountingReportRow {

    @XmlElement(name = "AccountingReportRow", nillable = true)
    protected List<AccountingReportRow> accountingReportRow;

    /**
     * Gets the value of the accountingReportRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingReportRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingReportRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingReportRow }
     * 
     * 
     */
    public List<AccountingReportRow> getAccountingReportRow() {
        if (accountingReportRow == null) {
            accountingReportRow = new ArrayList<AccountingReportRow>();
        }
        return this.accountingReportRow;
    }

}
