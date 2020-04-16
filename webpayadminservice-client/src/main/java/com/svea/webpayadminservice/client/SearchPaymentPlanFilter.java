
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchPaymentPlanFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPaymentPlanFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptedStatus" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfPaymentPlanStatus" minOccurs="0"/&gt;
 *         &lt;element name="ClientIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TextMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TextMatchType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.PaymentPlan}TextMatchType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPaymentPlanFilter", propOrder = {
    "acceptedStatus",
    "clientIds",
    "endDate",
    "startDate",
    "textMatch",
    "textMatchType"
})
public class SearchPaymentPlanFilter {

    @XmlElement(name = "AcceptedStatus", nillable = true)
    protected ArrayOfPaymentPlanStatus acceptedStatus;
    @XmlElement(name = "ClientIds", nillable = true)
    protected ArrayOflong clientIds;
    @XmlElement(name = "EndDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "StartDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "TextMatch", nillable = true)
    protected String textMatch;
    @XmlElement(name = "TextMatchType", nillable = true)
    @XmlSchemaType(name = "string")
    protected TextMatchType textMatchType;

    /**
     * Gets the value of the acceptedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentPlanStatus }
     *     
     */
    public ArrayOfPaymentPlanStatus getAcceptedStatus() {
        return acceptedStatus;
    }

    /**
     * Sets the value of the acceptedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentPlanStatus }
     *     
     */
    public void setAcceptedStatus(ArrayOfPaymentPlanStatus value) {
        this.acceptedStatus = value;
    }

    /**
     * Gets the value of the clientIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getClientIds() {
        return clientIds;
    }

    /**
     * Sets the value of the clientIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setClientIds(ArrayOflong value) {
        this.clientIds = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the textMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextMatch() {
        return textMatch;
    }

    /**
     * Sets the value of the textMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextMatch(String value) {
        this.textMatch = value;
    }

    /**
     * Gets the value of the textMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link TextMatchType }
     *     
     */
    public TextMatchType getTextMatchType() {
        return textMatchType;
    }

    /**
     * Sets the value of the textMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextMatchType }
     *     
     */
    public void setTextMatchType(TextMatchType value) {
        this.textMatchType = value;
    }

}
