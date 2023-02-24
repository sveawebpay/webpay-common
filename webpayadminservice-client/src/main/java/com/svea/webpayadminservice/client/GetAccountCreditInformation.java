
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountCreditInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountCreditInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientAccountCreditId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountCreditInformation", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", propOrder = {
    "clientAccountCreditId",
    "clientId"
})
public class GetAccountCreditInformation {

    @XmlElement(name = "ClientAccountCreditId")
    protected long clientAccountCreditId;
    @XmlElement(name = "ClientId")
    protected long clientId;

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
