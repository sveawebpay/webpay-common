
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAccountCreditRegressReportDataRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAccountCreditRegressReportDataRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountCreditRegressReportDataRow" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}AccountCreditRegressReportDataRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountCreditRegressReportDataRow", propOrder = {
    "accountCreditRegressReportDataRow"
})
public class ArrayOfAccountCreditRegressReportDataRow {

    @XmlElement(name = "AccountCreditRegressReportDataRow", nillable = true)
    protected List<AccountCreditRegressReportDataRow> accountCreditRegressReportDataRow;

    /**
     * Gets the value of the accountCreditRegressReportDataRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCreditRegressReportDataRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountCreditRegressReportDataRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCreditRegressReportDataRow }
     * 
     * 
     */
    public List<AccountCreditRegressReportDataRow> getAccountCreditRegressReportDataRow() {
        if (accountCreditRegressReportDataRow == null) {
            accountCreditRegressReportDataRow = new ArrayList<AccountCreditRegressReportDataRow>();
        }
        return this.accountCreditRegressReportDataRow;
    }

}
