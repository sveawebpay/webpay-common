
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInvoicePdfLinkRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInvoicePdfLinkRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInvoicePdfLinkRequest", propOrder = {
    "clientId",
    "invoiceId"
})
public class GetInvoicePdfLinkRequest
    extends BasicRequest
{

    @XmlElement(name = "ClientId")
    protected Long clientId;
    @XmlElement(name = "InvoiceId")
    protected long invoiceId;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientId(Long value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     */
    public long getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     */
    public void setInvoiceId(long value) {
        this.invoiceId = value;
    }

}
