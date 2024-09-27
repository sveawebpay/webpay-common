
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountCreditRegressReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountCreditRegressReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfAccountCreditRegressReportDataRow" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCreditRegressReportResponse", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", propOrder = {
    "rows"
})
public class AccountCreditRegressReportResponse
    extends BasicResponse
{

    @XmlElement(name = "Rows", nillable = true)
    protected ArrayOfAccountCreditRegressReportDataRow rows;

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountCreditRegressReportDataRow }
     *     
     */
    public ArrayOfAccountCreditRegressReportDataRow getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountCreditRegressReportDataRow }
     *     
     */
    public void setRows(ArrayOfAccountCreditRegressReportDataRow value) {
        this.rows = value;
    }

}
