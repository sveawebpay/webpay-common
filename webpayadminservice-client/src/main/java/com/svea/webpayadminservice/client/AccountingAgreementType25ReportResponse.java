
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingAgreementType25ReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingAgreementType25ReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfAccountingAgreementType25ReportDataRow" minOccurs="0"/&gt;
 *         &lt;element name="Summations" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfAccountingAgreementType25Summation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingAgreementType25ReportResponse", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", propOrder = {
    "rows",
    "summations"
})
public class AccountingAgreementType25ReportResponse
    extends BasicResponse
{

    @XmlElement(name = "Rows", nillable = true)
    protected ArrayOfAccountingAgreementType25ReportDataRow rows;
    @XmlElement(name = "Summations", nillable = true)
    protected ArrayOfAccountingAgreementType25Summation summations;

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountingAgreementType25ReportDataRow }
     *     
     */
    public ArrayOfAccountingAgreementType25ReportDataRow getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountingAgreementType25ReportDataRow }
     *     
     */
    public void setRows(ArrayOfAccountingAgreementType25ReportDataRow value) {
        this.rows = value;
    }

    /**
     * Gets the value of the summations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountingAgreementType25Summation }
     *     
     */
    public ArrayOfAccountingAgreementType25Summation getSummations() {
        return summations;
    }

    /**
     * Sets the value of the summations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountingAgreementType25Summation }
     *     
     */
    public void setSummations(ArrayOfAccountingAgreementType25Summation value) {
        this.summations = value;
    }

}
