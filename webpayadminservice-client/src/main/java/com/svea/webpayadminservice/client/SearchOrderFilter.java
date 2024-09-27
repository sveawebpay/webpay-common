
package com.svea.webpayadminservice.client;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOrderFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOrderFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptedDeliveryStatus" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfOrderDeliveryStatus" minOccurs="0"/&gt;
 *         &lt;element name="AcceptedOrderStatus" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}ArrayOfOrderStatus" minOccurs="0"/&gt;
 *         &lt;element name="ClientIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TextMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TextMatchType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.Order}TextMatchType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOrderFilter", propOrder = {
    "acceptedDeliveryStatus",
    "acceptedOrderStatus",
    "clientIds",
    "endDate",
    "startDate",
    "textMatch",
    "textMatchType"
})
public class SearchOrderFilter {

    @XmlElement(name = "AcceptedDeliveryStatus", nillable = true)
    protected ArrayOfOrderDeliveryStatus acceptedDeliveryStatus;
    @XmlElement(name = "AcceptedOrderStatus", nillable = true)
    protected ArrayOfOrderStatus acceptedOrderStatus;
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
     * Gets the value of the acceptedDeliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderDeliveryStatus }
     *     
     */
    public ArrayOfOrderDeliveryStatus getAcceptedDeliveryStatus() {
        return acceptedDeliveryStatus;
    }

    /**
     * Sets the value of the acceptedDeliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderDeliveryStatus }
     *     
     */
    public void setAcceptedDeliveryStatus(ArrayOfOrderDeliveryStatus value) {
        this.acceptedDeliveryStatus = value;
    }

    /**
     * Gets the value of the acceptedOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderStatus }
     *     
     */
    public ArrayOfOrderStatus getAcceptedOrderStatus() {
        return acceptedOrderStatus;
    }

    /**
     * Sets the value of the acceptedOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderStatus }
     *     
     */
    public void setAcceptedOrderStatus(ArrayOfOrderStatus value) {
        this.acceptedOrderStatus = value;
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
