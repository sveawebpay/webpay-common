
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInvoicePaidToClientRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInvoicePaidToClientRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvoicePaidToClientRow" type="{http://schemas.datacontract.org/2004/07/DataObjects.Internal.Service.Types}InvoicePaidToClientRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInvoicePaidToClientRow", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Internal.Service.Types", propOrder = {
    "invoicePaidToClientRow"
})
public class ArrayOfInvoicePaidToClientRow {

    @XmlElement(name = "InvoicePaidToClientRow", nillable = true)
    protected List<InvoicePaidToClientRow> invoicePaidToClientRow;

    /**
     * Gets the value of the invoicePaidToClientRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the invoicePaidToClientRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoicePaidToClientRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoicePaidToClientRow }
     * 
     * 
     */
    public List<InvoicePaidToClientRow> getInvoicePaidToClientRow() {
        if (invoicePaidToClientRow == null) {
            invoicePaidToClientRow = new ArrayList<InvoicePaidToClientRow>();
        }
        return this.invoicePaidToClientRow;
    }

}
