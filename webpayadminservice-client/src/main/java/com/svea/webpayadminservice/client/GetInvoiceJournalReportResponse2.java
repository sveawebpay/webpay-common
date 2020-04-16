
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInvoiceJournalReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInvoiceJournalReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfInvoiceJournalReportRow" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInvoiceJournalReportResponse", propOrder = {
    "reportRows"
})
public class GetInvoiceJournalReportResponse2
    extends BasicResponse
{

    @XmlElement(name = "ReportRows", nillable = true)
    protected ArrayOfInvoiceJournalReportRow reportRows;

    /**
     * Gets the value of the reportRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceJournalReportRow }
     *     
     */
    public ArrayOfInvoiceJournalReportRow getReportRows() {
        return reportRows;
    }

    /**
     * Sets the value of the reportRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceJournalReportRow }
     *     
     */
    public void setReportRows(ArrayOfInvoiceJournalReportRow value) {
        this.reportRows = value;
    }

}
