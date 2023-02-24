
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistributionType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder}InvoiceDistributionType" minOccurs="0"/&gt;
 *         &lt;element name="BillingReferences" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfBillingReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInformation", propOrder = {
    "distributionType",
    "billingReferences"
})
public class InvoiceInformation {

    @XmlElement(name = "DistributionType", nillable = true)
    @XmlSchemaType(name = "string")
    protected InvoiceDistributionType distributionType;
    @XmlElement(name = "BillingReferences", nillable = true)
    protected ArrayOfBillingReference billingReferences;

    /**
     * Gets the value of the distributionType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDistributionType }
     *     
     */
    public InvoiceDistributionType getDistributionType() {
        return distributionType;
    }

    /**
     * Sets the value of the distributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDistributionType }
     *     
     */
    public void setDistributionType(InvoiceDistributionType value) {
        this.distributionType = value;
    }

    /**
     * Gets the value of the billingReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillingReference }
     *     
     */
    public ArrayOfBillingReference getBillingReferences() {
        return billingReferences;
    }

    /**
     * Sets the value of the billingReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillingReference }
     *     
     */
    public void setBillingReferences(ArrayOfBillingReference value) {
        this.billingReferences = value;
    }

}
