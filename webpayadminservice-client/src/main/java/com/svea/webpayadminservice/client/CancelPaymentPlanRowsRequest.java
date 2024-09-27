
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelPaymentPlanRowsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPaymentPlanRowsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancellationRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfCancellationRow"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPaymentPlanRowsRequest", propOrder = {
    "cancellationRows",
    "clientId",
    "contractNumber"
})
public class CancelPaymentPlanRowsRequest
    extends BasicRequest
{

    @XmlElement(name = "CancellationRows", required = true, nillable = true)
    protected ArrayOfCancellationRow cancellationRows;
    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "ContractNumber")
    protected long contractNumber;

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

    /**
     * Gets the value of the contractNumber property.
     * 
     */
    public long getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     */
    public void setContractNumber(long value) {
        this.contractNumber = value;
    }

}
