
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountCreditRegressReportDataRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountCreditRegressReportDataRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountCreditNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdministratorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CheckoutOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditForClientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CreditForCustomerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreditForInvoiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreditForOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SveaOrderCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SveaOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCreditRegressReportDataRow", propOrder = {
    "accountCreditNumber",
    "administratorId",
    "amount",
    "checkoutOrderId",
    "clientId",
    "clientName",
    "clientType",
    "creditForClientId",
    "creditForCustomerId",
    "creditForInvoiceId",
    "creditForOrderId",
    "currency",
    "customerName",
    "invoiceId",
    "sveaOrderCreationDate",
    "sveaOrderId",
    "transactionDate",
    "transactionType"
})
public class AccountCreditRegressReportDataRow {

    @XmlElement(name = "AccountCreditNumber")
    protected Integer accountCreditNumber;
    @XmlElement(name = "AdministratorId")
    protected Integer administratorId;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "CheckoutOrderId", nillable = true)
    protected Long checkoutOrderId;
    @XmlElement(name = "ClientId")
    protected Long clientId;
    @XmlElement(name = "ClientName", nillable = true)
    protected String clientName;
    @XmlElement(name = "ClientType", nillable = true)
    protected String clientType;
    @XmlElement(name = "CreditForClientId")
    protected Long creditForClientId;
    @XmlElement(name = "CreditForCustomerId")
    protected Integer creditForCustomerId;
    @XmlElement(name = "CreditForInvoiceId")
    protected Integer creditForInvoiceId;
    @XmlElement(name = "CreditForOrderId", nillable = true)
    protected String creditForOrderId;
    @XmlElement(name = "Currency", nillable = true)
    protected String currency;
    @XmlElement(name = "CustomerName", nillable = true)
    protected String customerName;
    @XmlElement(name = "InvoiceId")
    protected Integer invoiceId;
    @XmlElement(name = "SveaOrderCreationDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sveaOrderCreationDate;
    @XmlElement(name = "SveaOrderId", nillable = true)
    protected Long sveaOrderId;
    @XmlElement(name = "TransactionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "TransactionType")
    protected Integer transactionType;

    /**
     * Gets the value of the accountCreditNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountCreditNumber() {
        return accountCreditNumber;
    }

    /**
     * Sets the value of the accountCreditNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountCreditNumber(Integer value) {
        this.accountCreditNumber = value;
    }

    /**
     * Gets the value of the administratorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdministratorId() {
        return administratorId;
    }

    /**
     * Sets the value of the administratorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdministratorId(Integer value) {
        this.administratorId = value;
    }

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
     * Gets the value of the checkoutOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCheckoutOrderId() {
        return checkoutOrderId;
    }

    /**
     * Sets the value of the checkoutOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCheckoutOrderId(Long value) {
        this.checkoutOrderId = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientId(Long value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the clientType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientType(String value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the creditForClientId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditForClientId() {
        return creditForClientId;
    }

    /**
     * Sets the value of the creditForClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditForClientId(Long value) {
        this.creditForClientId = value;
    }

    /**
     * Gets the value of the creditForCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditForCustomerId() {
        return creditForCustomerId;
    }

    /**
     * Sets the value of the creditForCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditForCustomerId(Integer value) {
        this.creditForCustomerId = value;
    }

    /**
     * Gets the value of the creditForInvoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditForInvoiceId() {
        return creditForInvoiceId;
    }

    /**
     * Sets the value of the creditForInvoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditForInvoiceId(Integer value) {
        this.creditForInvoiceId = value;
    }

    /**
     * Gets the value of the creditForOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditForOrderId() {
        return creditForOrderId;
    }

    /**
     * Sets the value of the creditForOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditForOrderId(String value) {
        this.creditForOrderId = value;
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
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoiceId(Integer value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the sveaOrderCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSveaOrderCreationDate() {
        return sveaOrderCreationDate;
    }

    /**
     * Sets the value of the sveaOrderCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSveaOrderCreationDate(XMLGregorianCalendar value) {
        this.sveaOrderCreationDate = value;
    }

    /**
     * Gets the value of the sveaOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSveaOrderId() {
        return sveaOrderId;
    }

    /**
     * Sets the value of the sveaOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSveaOrderId(Long value) {
        this.sveaOrderId = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionType(Integer value) {
        this.transactionType = value;
    }

}
