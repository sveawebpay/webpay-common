
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPaymentPlanReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPaymentPlanReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfPaymentPlanReportRow" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPaymentPlanReportResponse", propOrder = {
    "reportRows"
})
public class GetPaymentPlanReportResponse2
    extends BasicResponse
{

    @XmlElement(name = "ReportRows", nillable = true)
    protected ArrayOfPaymentPlanReportRow reportRows;

    /**
     * Gets the value of the reportRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentPlanReportRow }
     *     
     */
    public ArrayOfPaymentPlanReportRow getReportRows() {
        return reportRows;
    }

    /**
     * Sets the value of the reportRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentPlanReportRow }
     *     
     */
    public void setReportRows(ArrayOfPaymentPlanReportRow value) {
        this.reportRows = value;
    }

}
