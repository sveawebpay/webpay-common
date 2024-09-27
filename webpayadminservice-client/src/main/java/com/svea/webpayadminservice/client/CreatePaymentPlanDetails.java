
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreatePaymentPlanDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatePaymentPlanDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CampaignCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CoCustomerIdentity" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}CustomerIdentity" minOccurs="0"/&gt;
 *         &lt;element name="FixedMonthlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SendAutomaticGiroPaymentForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatePaymentPlanDetails", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", propOrder = {
    "campaignCode",
    "coCustomerIdentity",
    "fixedMonthlyAmount",
    "sendAutomaticGiroPaymentForm"
})
public class CreatePaymentPlanDetails {

    @XmlElement(name = "CampaignCode", nillable = true)
    protected Long campaignCode;
    @XmlElement(name = "CoCustomerIdentity", nillable = true)
    protected CustomerIdentity coCustomerIdentity;
    @XmlElement(name = "FixedMonthlyAmount", nillable = true)
    protected BigDecimal fixedMonthlyAmount;
    @XmlElement(name = "SendAutomaticGiroPaymentForm")
    protected Boolean sendAutomaticGiroPaymentForm;

    /**
     * Gets the value of the campaignCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignCode() {
        return campaignCode;
    }

    /**
     * Sets the value of the campaignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignCode(Long value) {
        this.campaignCode = value;
    }

    /**
     * Gets the value of the coCustomerIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentity }
     *     
     */
    public CustomerIdentity getCoCustomerIdentity() {
        return coCustomerIdentity;
    }

    /**
     * Sets the value of the coCustomerIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentity }
     *     
     */
    public void setCoCustomerIdentity(CustomerIdentity value) {
        this.coCustomerIdentity = value;
    }

    /**
     * Gets the value of the fixedMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedMonthlyAmount() {
        return fixedMonthlyAmount;
    }

    /**
     * Sets the value of the fixedMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedMonthlyAmount(BigDecimal value) {
        this.fixedMonthlyAmount = value;
    }

    /**
     * Gets the value of the sendAutomaticGiroPaymentForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAutomaticGiroPaymentForm() {
        return sendAutomaticGiroPaymentForm;
    }

    /**
     * Sets the value of the sendAutomaticGiroPaymentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAutomaticGiroPaymentForm(Boolean value) {
        this.sendAutomaticGiroPaymentForm = value;
    }

}
