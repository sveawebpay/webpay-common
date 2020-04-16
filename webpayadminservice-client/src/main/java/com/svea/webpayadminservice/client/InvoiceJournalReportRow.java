
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvoiceJournalReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceJournalReportRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="InvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReportingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="VatAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceJournalReportRow", propOrder = {
    "clientId",
    "customerId",
    "invoiceAmount",
    "invoiceId",
    "name",
    "orderNumber",
    "postingDate",
    "reportingDate",
    "vatAmount"
})
public class InvoiceJournalReportRow {

    @XmlElement(name = "ClientId")
    protected int clientId;
    @XmlElement(name = "CustomerId")
    protected long customerId;
    @XmlElement(name = "InvoiceAmount", required = true)
    protected BigDecimal invoiceAmount;
    @XmlElement(name = "InvoiceId")
    protected long invoiceId;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "OrderNumber", required = true, nillable = true)
    protected String orderNumber;
    @XmlElement(name = "PostingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingDate;
    @XmlElement(name = "ReportingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportingDate;
    @XmlElement(name = "VatAmount", required = true)
    protected BigDecimal vatAmount;

    /**
     * Gets the value of the clientId property.
     * 
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(int value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the invoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Sets the value of the invoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceAmount(BigDecimal value) {
        this.invoiceAmount = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     */
    public long getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     */
    public void setInvoiceId(long value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the reportingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportingDate() {
        return reportingDate;
    }

    /**
     * Sets the value of the reportingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportingDate(XMLGregorianCalendar value) {
        this.reportingDate = value;
    }

    /**
     * Gets the value of the vatAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatAmount() {
        return vatAmount;
    }

    /**
     * Sets the value of the vatAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatAmount(BigDecimal value) {
        this.vatAmount = value;
    }

}
