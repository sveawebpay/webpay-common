
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelAccountCreditAmountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelAccountCreditAmountRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountIncVat" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ClientAccountCreditId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "CancelAccountCreditAmountRequest", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", propOrder = {
    "amountIncVat",
    "clientAccountCreditId",
    "clientId",
    "description"
})
public class CancelAccountCreditAmountRequest
    extends BasicRequest
{

    @XmlElement(name = "AmountIncVat", required = true)
    protected BigDecimal amountIncVat;
    @XmlElement(name = "ClientAccountCreditId")
    protected long clientAccountCreditId;
    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;

    /**
     * Gets the value of the amountIncVat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountIncVat() {
        return amountIncVat;
    }

    /**
     * Sets the value of the amountIncVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountIncVat(BigDecimal value) {
        this.amountIncVat = value;
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
