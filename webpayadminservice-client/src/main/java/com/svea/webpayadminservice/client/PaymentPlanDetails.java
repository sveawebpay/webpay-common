
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPlanDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentPlanDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CampaignCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ContractLengthMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPlanDetails", propOrder = {
    "campaignCode",
    "contractLengthMonths",
    "contractNumber"
})
public class PaymentPlanDetails {

    @XmlElement(name = "CampaignCode")
    protected BigDecimal campaignCode;
    @XmlElement(name = "ContractLengthMonths")
    protected Integer contractLengthMonths;
    @XmlElement(name = "ContractNumber", nillable = true)
    protected Long contractNumber;

    /**
     * Gets the value of the campaignCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCampaignCode() {
        return campaignCode;
    }

    /**
     * Sets the value of the campaignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCampaignCode(BigDecimal value) {
        this.campaignCode = value;
    }

    /**
     * Gets the value of the contractLengthMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractLengthMonths() {
        return contractLengthMonths;
    }

    /**
     * Sets the value of the contractLengthMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractLengthMonths(Integer value) {
        this.contractLengthMonths = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractNumber(Long value) {
        this.contractNumber = value;
    }

}
