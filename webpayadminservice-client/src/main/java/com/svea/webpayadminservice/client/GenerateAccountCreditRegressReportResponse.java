
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GenerateAccountCreditRegressReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}AccountCreditRegressReportResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generateAccountCreditRegressReportResult"
})
@XmlRootElement(name = "GenerateAccountCreditRegressReportResponse", namespace = "http://tempuri.org/")
public class GenerateAccountCreditRegressReportResponse {

    @XmlElement(name = "GenerateAccountCreditRegressReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected AccountCreditRegressReportResponse generateAccountCreditRegressReportResult;

    /**
     * Gets the value of the generateAccountCreditRegressReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCreditRegressReportResponse }
     *     
     */
    public AccountCreditRegressReportResponse getGenerateAccountCreditRegressReportResult() {
        return generateAccountCreditRegressReportResult;
    }

    /**
     * Sets the value of the generateAccountCreditRegressReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCreditRegressReportResponse }
     *     
     */
    public void setGenerateAccountCreditRegressReportResult(AccountCreditRegressReportResponse value) {
        this.generateAccountCreditRegressReportResult = value;
    }

}
