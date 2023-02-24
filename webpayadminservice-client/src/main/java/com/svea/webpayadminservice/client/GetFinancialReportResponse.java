
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFinancialReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFinancialReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportHeader" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}FinancialReportHeader" minOccurs="0"/&gt;
 *         &lt;element name="ReportRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfFinancialReportRow" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFinancialReportResponse", propOrder = {
    "reportHeader",
    "reportRows"
})
public class GetFinancialReportResponse
    extends BasicResponse
{

    @XmlElement(name = "ReportHeader", nillable = true)
    protected FinancialReportHeader reportHeader;
    @XmlElement(name = "ReportRows", nillable = true)
    protected ArrayOfFinancialReportRow reportRows;

    /**
     * Gets the value of the reportHeader property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialReportHeader }
     *     
     */
    public FinancialReportHeader getReportHeader() {
        return reportHeader;
    }

    /**
     * Sets the value of the reportHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialReportHeader }
     *     
     */
    public void setReportHeader(FinancialReportHeader value) {
        this.reportHeader = value;
    }

    /**
     * Gets the value of the reportRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFinancialReportRow }
     *     
     */
    public ArrayOfFinancialReportRow getReportRows() {
        return reportRows;
    }

    /**
     * Sets the value of the reportRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFinancialReportRow }
     *     
     */
    public void setReportRows(ArrayOfFinancialReportRow value) {
        this.reportRows = value;
    }

}
