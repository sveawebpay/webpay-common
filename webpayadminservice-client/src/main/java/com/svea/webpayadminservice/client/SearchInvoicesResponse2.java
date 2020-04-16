
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchInvoicesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchInvoicesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvoiceListItems" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfInvoiceListItem"/&gt;
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchInvoicesResponse", propOrder = {
    "invoiceListItems",
    "resultCount"
})
public class SearchInvoicesResponse2
    extends BasicResponse
{

    @XmlElement(name = "InvoiceListItems", required = true, nillable = true)
    protected ArrayOfInvoiceListItem invoiceListItems;
    @XmlElement(name = "ResultCount")
    protected int resultCount;

    /**
     * Gets the value of the invoiceListItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceListItem }
     *     
     */
    public ArrayOfInvoiceListItem getInvoiceListItems() {
        return invoiceListItems;
    }

    /**
     * Sets the value of the invoiceListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceListItem }
     *     
     */
    public void setInvoiceListItems(ArrayOfInvoiceListItem value) {
        this.invoiceListItems = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(int value) {
        this.resultCount = value;
    }

}
