
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInvoicesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInvoicesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvoicesToRetrieve" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfGetInvoiceInformation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInvoicesRequest", propOrder = {
    "invoicesToRetrieve"
})
public class GetInvoicesRequest
    extends BasicRequest
{

    @XmlElement(name = "InvoicesToRetrieve", required = true, nillable = true)
    protected ArrayOfGetInvoiceInformation invoicesToRetrieve;

    /**
     * Gets the value of the invoicesToRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetInvoiceInformation }
     *     
     */
    public ArrayOfGetInvoiceInformation getInvoicesToRetrieve() {
        return invoicesToRetrieve;
    }

    /**
     * Sets the value of the invoicesToRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetInvoiceInformation }
     *     
     */
    public void setInvoicesToRetrieve(ArrayOfGetInvoiceInformation value) {
        this.invoicesToRetrieve = value;
    }

}
