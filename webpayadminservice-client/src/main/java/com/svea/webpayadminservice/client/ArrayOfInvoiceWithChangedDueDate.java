
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInvoiceWithChangedDueDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInvoiceWithChangedDueDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvoiceWithChangedDueDate" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}InvoiceWithChangedDueDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInvoiceWithChangedDueDate", propOrder = {
    "invoiceWithChangedDueDate"
})
public class ArrayOfInvoiceWithChangedDueDate {

    @XmlElement(name = "InvoiceWithChangedDueDate", nillable = true)
    protected List<InvoiceWithChangedDueDate> invoiceWithChangedDueDate;

    /**
     * Gets the value of the invoiceWithChangedDueDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceWithChangedDueDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceWithChangedDueDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceWithChangedDueDate }
     * 
     * 
     */
    public List<InvoiceWithChangedDueDate> getInvoiceWithChangedDueDate() {
        if (invoiceWithChangedDueDate == null) {
            invoiceWithChangedDueDate = new ArrayList<InvoiceWithChangedDueDate>();
        }
        return this.invoiceWithChangedDueDate;
    }

}
