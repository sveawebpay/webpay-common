
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GenerateAccountingAgreementType25ReportResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}AccountingAgreementType25ReportResponse" minOccurs="0"/&gt;
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
    "generateAccountingAgreementType25ReportResult"
})
@XmlRootElement(name = "GenerateAccountingAgreementType25ReportResponse", namespace = "http://tempuri.org/")
public class GenerateAccountingAgreementType25ReportResponse {

    @XmlElement(name = "GenerateAccountingAgreementType25ReportResult", namespace = "http://tempuri.org/", nillable = true)
    protected AccountingAgreementType25ReportResponse generateAccountingAgreementType25ReportResult;

    /**
     * Gets the value of the generateAccountingAgreementType25ReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingAgreementType25ReportResponse }
     *     
     */
    public AccountingAgreementType25ReportResponse getGenerateAccountingAgreementType25ReportResult() {
        return generateAccountingAgreementType25ReportResult;
    }

    /**
     * Sets the value of the generateAccountingAgreementType25ReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAgreementType25ReportResponse }
     *     
     */
    public void setGenerateAccountingAgreementType25ReportResult(AccountingAgreementType25ReportResponse value) {
        this.generateAccountingAgreementType25ReportResult = value;
    }

}
