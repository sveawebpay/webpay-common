
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountCreditItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountCreditItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountCreditRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfNumberedOrderRow" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ClientAccountCreditId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreditReportStatus" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}CreditReportStatus" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}CustomerIdentity" minOccurs="0"/&gt;
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCreditItem", propOrder = {
    "accountCreditRows",
    "amount",
    "clientAccountCreditId",
    "clientId",
    "contractNumber",
    "creationDate",
    "creditReportStatus",
    "currency",
    "customer",
    "customerId",
    "deliveryStatus",
    "orderId"
})
public class AccountCreditItem {

    @XmlElement(name = "AccountCreditRows", nillable = true)
    protected ArrayOfNumberedOrderRow accountCreditRows;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "ClientAccountCreditId")
    protected Long clientAccountCreditId;
    @XmlElement(name = "ClientId")
    protected Long clientId;
    @XmlElement(name = "ContractNumber")
    protected Long contractNumber;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreditReportStatus", nillable = true)
    protected CreditReportStatus creditReportStatus;
    @XmlElement(name = "Currency", nillable = true)
    protected String currency;
    @XmlElement(name = "Customer", nillable = true)
    protected CustomerIdentity customer;
    @XmlElement(name = "CustomerId", nillable = true)
    protected Long customerId;
    @XmlElement(name = "DeliveryStatus", nillable = true)
    protected String deliveryStatus;
    @XmlElement(name = "OrderId")
    protected Long orderId;

    /**
     * Gets the value of the accountCreditRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumberedOrderRow }
     *     
     */
    public ArrayOfNumberedOrderRow getAccountCreditRows() {
        return accountCreditRows;
    }

    /**
     * Sets the value of the accountCreditRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumberedOrderRow }
     *     
     */
    public void setAccountCreditRows(ArrayOfNumberedOrderRow value) {
        this.accountCreditRows = value;
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
     * Gets the value of the clientAccountCreditId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientAccountCreditId() {
        return clientAccountCreditId;
    }

    /**
     * Sets the value of the clientAccountCreditId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientAccountCreditId(Long value) {
        this.clientAccountCreditId = value;
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

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the creditReportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CreditReportStatus }
     *     
     */
    public CreditReportStatus getCreditReportStatus() {
        return creditReportStatus;
    }

    /**
     * Sets the value of the creditReportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditReportStatus }
     *     
     */
    public void setCreditReportStatus(CreditReportStatus value) {
        this.creditReportStatus = value;
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
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryStatus(String value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderId(Long value) {
        this.orderId = value;
    }

}
