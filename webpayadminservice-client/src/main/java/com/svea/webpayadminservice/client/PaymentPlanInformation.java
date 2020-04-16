
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPlanInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentPlanInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CampaignCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentPlanInformation", propOrder = {
    "campaignCode",
    "sendAutomaticGiroPaymentForm"
})
public class PaymentPlanInformation {

    @XmlElement(name = "CampaignCode", nillable = true)
    protected Long campaignCode;
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
