
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchAccountCreditFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAccountCreditFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptedAccountCreditStatuses" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfAccountCreditStatus" minOccurs="0"/&gt;
 *         &lt;element name="AccountCreditIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="ClientIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TextMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TextMatchType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.AccountCredit}TextMatchType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchAccountCreditFilter", propOrder = {
    "acceptedAccountCreditStatuses",
    "accountCreditIds",
    "clientIds",
    "endDate",
    "startDate",
    "textMatch",
    "textMatchType"
})
public class SearchAccountCreditFilter {

    @XmlElement(name = "AcceptedAccountCreditStatuses", nillable = true)
    protected ArrayOfAccountCreditStatus acceptedAccountCreditStatuses;
    @XmlElement(name = "AccountCreditIds", nillable = true)
    protected ArrayOflong accountCreditIds;
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
    protected TextMatchType4 textMatchType;

    /**
     * Gets the value of the acceptedAccountCreditStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountCreditStatus }
     *     
     */
    public ArrayOfAccountCreditStatus getAcceptedAccountCreditStatuses() {
        return acceptedAccountCreditStatuses;
    }

    /**
     * Sets the value of the acceptedAccountCreditStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountCreditStatus }
     *     
     */
    public void setAcceptedAccountCreditStatuses(ArrayOfAccountCreditStatus value) {
        this.acceptedAccountCreditStatuses = value;
    }

    /**
     * Gets the value of the accountCreditIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAccountCreditIds() {
        return accountCreditIds;
    }

    /**
     * Sets the value of the accountCreditIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAccountCreditIds(ArrayOflong value) {
        this.accountCreditIds = value;
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
     *     {@link TextMatchType4 }
     *     
     */
    public TextMatchType4 getTextMatchType() {
        return textMatchType;
    }

    /**
     * Sets the value of the textMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextMatchType4 }
     *     
     */
    public void setTextMatchType(TextMatchType4 value) {
        this.textMatchType = value;
    }

}
