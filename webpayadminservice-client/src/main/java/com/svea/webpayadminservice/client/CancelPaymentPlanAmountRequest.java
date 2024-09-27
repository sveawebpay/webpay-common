
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelPaymentPlanAmountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPaymentPlanAmountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountInclVat" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPaymentPlanAmountRequest", propOrder = {
    "amountInclVat",
    "clientId",
    "contractNumber",
    "description"
})
public class CancelPaymentPlanAmountRequest
    extends BasicRequest
{

    @XmlElement(name = "AmountInclVat", required = true)
    protected BigDecimal amountInclVat;
    @XmlElement(name = "ClientId")
    protected int clientId;
    @XmlElement(name = "ContractNumber")
    protected long contractNumber;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;

    /**
     * Gets the value of the amountInclVat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountInclVat() {
        return amountInclVat;
    }

    /**
     * Sets the value of the amountInclVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountInclVat(BigDecimal value) {
        this.amountInclVat = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(int value) {
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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
