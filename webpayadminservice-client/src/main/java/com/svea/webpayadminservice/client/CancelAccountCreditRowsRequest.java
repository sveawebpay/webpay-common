
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelAccountCreditRowsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelAccountCreditRowsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancellationRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfCancellationRow"/&gt;
 *         &lt;element name="ClientAccountCreditId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelAccountCreditRowsRequest", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", propOrder = {
    "cancellationRows",
    "clientAccountCreditId",
    "clientId"
})
public class CancelAccountCreditRowsRequest
    extends BasicRequest
{

    @XmlElement(name = "CancellationRows", required = true, nillable = true)
    protected ArrayOfCancellationRow cancellationRows;
    @XmlElement(name = "ClientAccountCreditId")
    protected long clientAccountCreditId;
    @XmlElement(name = "ClientId")
    protected long clientId;

    /**
     * Gets the value of the cancellationRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancellationRow }
     *     
     */
    public ArrayOfCancellationRow getCancellationRows() {
        return cancellationRows;
    }

    /**
     * Sets the value of the cancellationRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancellationRow }
     *     
     */
    public void setCancellationRows(ArrayOfCancellationRow value) {
        this.cancellationRows = value;
    }

    /**
     * Gets the value of the clientAccountCreditId property.
     * 
     */
    public long getClientAccountCreditId() {
        return clientAccountCreditId;
    }

    /**
     * Sets the value of the clientAccountCreditId property.
     * 
     */
    public void setClientAccountCreditId(long value) {
        this.clientAccountCreditId = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     */
    public long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(long value) {
        this.clientId = value;
    }

}
