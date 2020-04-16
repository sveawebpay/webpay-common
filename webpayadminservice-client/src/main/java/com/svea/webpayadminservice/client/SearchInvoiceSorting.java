
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchInvoiceSorting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchInvoiceSorting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SortDirection" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SortDirection" minOccurs="0"/&gt;
 *         &lt;element name="SortInvoiceProperty" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SortInvoiceProperty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchInvoiceSorting", propOrder = {
    "sortDirection",
    "sortInvoiceProperty"
})
public class SearchInvoiceSorting {

    @XmlElement(name = "SortDirection")
    @XmlSchemaType(name = "string")
    protected SortDirection sortDirection;
    @XmlElement(name = "SortInvoiceProperty")
    @XmlSchemaType(name = "string")
    protected SortInvoiceProperty sortInvoiceProperty;

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link SortDirection }
     *     
     */
    public SortDirection getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirection }
     *     
     */
    public void setSortDirection(SortDirection value) {
        this.sortDirection = value;
    }

    /**
     * Gets the value of the sortInvoiceProperty property.
     * 
     * @return
     *     possible object is
     *     {@link SortInvoiceProperty }
     *     
     */
    public SortInvoiceProperty getSortInvoiceProperty() {
        return sortInvoiceProperty;
    }

    /**
     * Sets the value of the sortInvoiceProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortInvoiceProperty }
     *     
     */
    public void setSortInvoiceProperty(SortInvoiceProperty value) {
        this.sortInvoiceProperty = value;
    }

}
