
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInvoicesPaidToClientForReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInvoicesPaidToClientForReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Invoices" type="{http://schemas.datacontract.org/2004/07/DataObjects.Internal.Service.Types}ArrayOfInvoicePaidToClientRow" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInvoicesPaidToClientForReportResponse", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", propOrder = {
    "invoices"
})
public class GetInvoicesPaidToClientForReportResponse2
    extends BasicResponse
{

    @XmlElement(name = "Invoices", nillable = true)
    protected ArrayOfInvoicePaidToClientRow invoices;

    /**
     * Gets the value of the invoices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoicePaidToClientRow }
     *     
     */
    public ArrayOfInvoicePaidToClientRow getInvoices() {
        return invoices;
    }

    /**
     * Sets the value of the invoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoicePaidToClientRow }
     *     
     */
    public void setInvoices(ArrayOfInvoicePaidToClientRow value) {
        this.invoices = value;
    }

}
