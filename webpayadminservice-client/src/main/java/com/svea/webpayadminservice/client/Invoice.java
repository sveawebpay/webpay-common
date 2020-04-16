
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ClientOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditApproved" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CreditedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CreditedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Customer" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}CustomerIdentity"/&gt;
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebtCollectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EarliestPossibleNewDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="InvoiceRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfNumberedOrderRow"/&gt;
 *         &lt;element name="IsPossibleToCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LatestPossibleNewDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PaidToClientDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Reminder1Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Reminder2Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SveaHasBought" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SveaOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}InvoiceType"/&gt;
 *         &lt;element name="UnmatchedCreditAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", propOrder = {
    "amount",
    "clientId",
    "clientOrderId",
    "clientReference",
    "creditApproved",
    "creditedAmount",
    "creditedDate",
    "currency",
    "customer",
    "customerId",
    "customerReference",
    "debtCollectionDate",
    "dueDate",
    "earliestPossibleNewDueDate",
    "invoiceDate",
    "invoiceId",
    "invoiceRows",
    "isPossibleToCancel",
    "latestPossibleNewDueDate",
    "notes",
    "paidDate",
    "paidToClientDate",
    "reminder1Date",
    "reminder2Date",
    "status",
    "sveaHasBought",
    "sveaOrderId",
    "type",
    "unmatchedCreditAmount"
})
public class Invoice {

    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "ClientOrderId", nillable = true)
    protected String clientOrderId;
    @XmlElement(name = "ClientReference", nillable = true)
    protected String clientReference;
    @XmlElement(name = "CreditApproved")
    protected boolean creditApproved;
    @XmlElement(name = "CreditedAmount", required = true)
    protected BigDecimal creditedAmount;
    @XmlElement(name = "CreditedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditedDate;
    @XmlElement(name = "Currency", required = true, nillable = true)
    protected String currency;
    @XmlElement(name = "Customer", required = true, nillable = true)
    protected CustomerIdentity customer;
    @XmlElement(name = "CustomerId", nillable = true)
    protected Long customerId;
    @XmlElement(name = "CustomerReference", nillable = true)
    protected String customerReference;
    @XmlElement(name = "DebtCollectionDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar debtCollectionDate;
    @XmlElement(name = "DueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "EarliestPossibleNewDueDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestPossibleNewDueDate;
    @XmlElement(name = "InvoiceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "InvoiceId")
    protected long invoiceId;
    @XmlElement(name = "InvoiceRows", required = true, nillable = true)
    protected ArrayOfNumberedOrderRow invoiceRows;
    @XmlElement(name = "IsPossibleToCancel")
    protected boolean isPossibleToCancel;
    @XmlElement(name = "LatestPossibleNewDueDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestPossibleNewDueDate;
    @XmlElement(name = "Notes", nillable = true)
    protected String notes;
    @XmlElement(name = "PaidDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paidDate;
    @XmlElement(name = "PaidToClientDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paidToClientDate;
    @XmlElement(name = "Reminder1Date", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reminder1Date;
    @XmlElement(name = "Reminder2Date", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reminder2Date;
    @XmlElement(name = "Status", required = true, nillable = true)
    protected String status;
    @XmlElement(name = "SveaHasBought")
    protected boolean sveaHasBought;
    @XmlElement(name = "SveaOrderId")
    protected long sveaOrderId;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected InvoiceType type;
    @XmlElement(name = "UnmatchedCreditAmount", required = true)
    protected BigDecimal unmatchedCreditAmount;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     */
    public long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(long value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientOrderId() {
        return clientOrderId;
    }

    /**
     * Sets the value of the clientOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientOrderId(String value) {
        this.clientOrderId = value;
    }

    /**
     * Gets the value of the clientReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReference() {
        return clientReference;
    }

    /**
     * Sets the value of the clientReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReference(String value) {
        this.clientReference = value;
    }

    /**
     * Gets the value of the creditApproved property.
     * 
     */
    public boolean isCreditApproved() {
        return creditApproved;
    }

    /**
     * Sets the value of the creditApproved property.
     * 
     */
    public void setCreditApproved(boolean value) {
        this.creditApproved = value;
    }

    /**
     * Gets the value of the creditedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditedAmount() {
        return creditedAmount;
    }

    /**
     * Sets the value of the creditedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditedAmount(BigDecimal value) {
        this.creditedAmount = value;
    }

    /**
     * Gets the value of the creditedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditedDate() {
        return creditedDate;
    }

    /**
     * Sets the value of the creditedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditedDate(XMLGregorianCalendar value) {
        this.creditedDate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentity }
     *     
     */
    public CustomerIdentity getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentity }
     *     
     */
    public void setCustomer(CustomerIdentity value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the debtCollectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDebtCollectionDate() {
        return debtCollectionDate;
    }

    /**
     * Sets the value of the debtCollectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDebtCollectionDate(XMLGregorianCalendar value) {
        this.debtCollectionDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the earliestPossibleNewDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestPossibleNewDueDate() {
        return earliestPossibleNewDueDate;
    }

    /**
     * Sets the value of the earliestPossibleNewDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestPossibleNewDueDate(XMLGregorianCalendar value) {
        this.earliestPossibleNewDueDate = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
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
     * Gets the value of the invoiceRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumberedOrderRow }
     *     
     */
    public ArrayOfNumberedOrderRow getInvoiceRows() {
        return invoiceRows;
    }

    /**
     * Sets the value of the invoiceRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumberedOrderRow }
     *     
     */
    public void setInvoiceRows(ArrayOfNumberedOrderRow value) {
        this.invoiceRows = value;
    }

    /**
     * Gets the value of the isPossibleToCancel property.
     * 
     */
    public boolean isIsPossibleToCancel() {
        return isPossibleToCancel;
    }

    /**
     * Sets the value of the isPossibleToCancel property.
     * 
     */
    public void setIsPossibleToCancel(boolean value) {
        this.isPossibleToCancel = value;
    }

    /**
     * Gets the value of the latestPossibleNewDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestPossibleNewDueDate() {
        return latestPossibleNewDueDate;
    }

    /**
     * Sets the value of the latestPossibleNewDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestPossibleNewDueDate(XMLGregorianCalendar value) {
        this.latestPossibleNewDueDate = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the paidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaidDate() {
        return paidDate;
    }

    /**
     * Sets the value of the paidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaidDate(XMLGregorianCalendar value) {
        this.paidDate = value;
    }

    /**
     * Gets the value of the paidToClientDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaidToClientDate() {
        return paidToClientDate;
    }

    /**
     * Sets the value of the paidToClientDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaidToClientDate(XMLGregorianCalendar value) {
        this.paidToClientDate = value;
    }

    /**
     * Gets the value of the reminder1Date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReminder1Date() {
        return reminder1Date;
    }

    /**
     * Sets the value of the reminder1Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReminder1Date(XMLGregorianCalendar value) {
        this.reminder1Date = value;
    }

    /**
     * Gets the value of the reminder2Date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReminder2Date() {
        return reminder2Date;
    }

    /**
     * Sets the value of the reminder2Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReminder2Date(XMLGregorianCalendar value) {
        this.reminder2Date = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the sveaHasBought property.
     * 
     */
    public boolean isSveaHasBought() {
        return sveaHasBought;
    }

    /**
     * Sets the value of the sveaHasBought property.
     * 
     */
    public void setSveaHasBought(boolean value) {
        this.sveaHasBought = value;
    }

    /**
     * Gets the value of the sveaOrderId property.
     * 
     */
    public long getSveaOrderId() {
        return sveaOrderId;
    }

    /**
     * Sets the value of the sveaOrderId property.
     * 
     */
    public void setSveaOrderId(long value) {
        this.sveaOrderId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceType }
     *     
     */
    public InvoiceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceType }
     *     
     */
    public void setType(InvoiceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the unmatchedCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnmatchedCreditAmount() {
        return unmatchedCreditAmount;
    }

    /**
     * Sets the value of the unmatchedCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnmatchedCreditAmount(BigDecimal value) {
        this.unmatchedCreditAmount = value;
    }

}
