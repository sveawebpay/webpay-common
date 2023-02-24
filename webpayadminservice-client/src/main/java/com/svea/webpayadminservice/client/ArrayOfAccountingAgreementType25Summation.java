
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAccountingAgreementType25Summation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAccountingAgreementType25Summation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingAgreementType25Summation" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}AccountingAgreementType25Summation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountingAgreementType25Summation", propOrder = {
    "accountingAgreementType25Summation"
})
public class ArrayOfAccountingAgreementType25Summation {

    @XmlElement(name = "AccountingAgreementType25Summation", nillable = true)
    protected List<AccountingAgreementType25Summation> accountingAgreementType25Summation;

    /**
     * Gets the value of the accountingAgreementType25Summation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingAgreementType25Summation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingAgreementType25Summation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingAgreementType25Summation }
     * 
     * 
     */
    public List<AccountingAgreementType25Summation> getAccountingAgreementType25Summation() {
        if (accountingAgreementType25Summation == null) {
            accountingAgreementType25Summation = new ArrayList<AccountingAgreementType25Summation>();
        }
        return this.accountingAgreementType25Summation;
    }

}
