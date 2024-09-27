
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInvoicesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInvoicesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Invoices" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfInvoice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInvoicesResponse", propOrder = {
    "invoices"
})
public class GetInvoicesResponse2
    extends BasicResponse
{

    @XmlElement(name = "Invoices", nillable = true)
    protected ArrayOfInvoice invoices;

    /**
     * Gets the value of the invoices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoice }
     *     
     */
    public ArrayOfInvoice getInvoices() {
        return invoices;
    }

    /**
     * Sets the value of the invoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoice }
     *     
     */
    public void setInvoices(ArrayOfInvoice value) {
        this.invoices = value;
    }

}
