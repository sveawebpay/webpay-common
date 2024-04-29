
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountCreditInformation" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}AccountCreditInformation" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BillingEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckoutOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ClientOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditReportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalCreditReportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceInformation" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}InvoiceInformation" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OrderRows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}ArrayOfOrderRow"/&gt;
 *         &lt;element name="OrderType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}OrderType"/&gt;
 *         &lt;element name="PaymentPlanInformation" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}PaymentPlanInformation" minOccurs="0"/&gt;
 *         &lt;element name="PeppolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScoringId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WillBuy" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="KycProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KycRiskClassification" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}KycRiskClassification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInformation", propOrder = {
    "accountCreditInformation",
    "amount",
    "billingEmailAddress",
    "checkoutOrderId",
    "clientId",
    "clientOrderId",
    "creditReportId",
    "customerReference",
    "externalCreditReportId",
    "invoiceInformation",
    "ipAddress",
    "orderDate",
    "orderRows",
    "orderType",
    "paymentPlanInformation",
    "peppolId",
    "scoringId",
    "willBuy",
    "kycProductId",
    "kycRiskClassification"
})
public class OrderInformation {

    @XmlElement(name = "AccountCreditInformation", nillable = true)
    protected AccountCreditInformation accountCreditInformation;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "BillingEmailAddress", nillable = true)
    protected String billingEmailAddress;
    @XmlElement(name = "CheckoutOrderId", nillable = true)
    protected Long checkoutOrderId;
    @XmlElement(name = "ClientId")
    protected long clientId;
    @XmlElement(name = "ClientOrderId", nillable = true)
    protected String clientOrderId;
    @XmlElement(name = "CreditReportId", nillable = true)
    protected Long creditReportId;
    @XmlElement(name = "CustomerReference", nillable = true)
    protected String customerReference;
    @XmlElement(name = "ExternalCreditReportId", nillable = true)
    protected Long externalCreditReportId;
    @XmlElement(name = "InvoiceInformation", nillable = true)
    protected InvoiceInformation invoiceInformation;
    @XmlElement(name = "IpAddress", nillable = true)
    protected String ipAddress;
    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderRows", required = true, nillable = true)
    protected ArrayOfOrderRow orderRows;
    @XmlElement(name = "OrderType", required = true)
    @XmlSchemaType(name = "string")
    protected OrderType orderType;
    @XmlElement(name = "PaymentPlanInformation", nillable = true)
    protected PaymentPlanInformation paymentPlanInformation;
    @XmlElement(name = "PeppolId", nillable = true)
    protected String peppolId;
    @XmlElement(name = "ScoringId", nillable = true)
    protected Long scoringId;
    @XmlElement(name = "WillBuy")
    protected boolean willBuy;
    @XmlElement(name = "KycProductId", nillable = true)
    protected String kycProductId;
    @XmlElement(name = "KycRiskClassification", nillable = true)
    @XmlSchemaType(name = "string")
    protected KycRiskClassification kycRiskClassification;

    /**
     * Gets the value of the accountCreditInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCreditInformation }
     *     
     */
    public AccountCreditInformation getAccountCreditInformation() {
        return accountCreditInformation;
    }

    /**
     * Sets the value of the accountCreditInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCreditInformation }
     *     
     */
    public void setAccountCreditInformation(AccountCreditInformation value) {
        this.accountCreditInformation = value;
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
     * Gets the value of the billingEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingEmailAddress() {
        return billingEmailAddress;
    }

    /**
     * Sets the value of the billingEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingEmailAddress(String value) {
        this.billingEmailAddress = value;
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
     * Gets the value of the creditReportId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditReportId() {
        return creditReportId;
    }

    /**
     * Sets the value of the creditReportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditReportId(Long value) {
        this.creditReportId = value;
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
     * Gets the value of the externalCreditReportId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExternalCreditReportId() {
        return externalCreditReportId;
    }

    /**
     * Sets the value of the externalCreditReportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExternalCreditReportId(Long value) {
        this.externalCreditReportId = value;
    }

    /**
     * Gets the value of the invoiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInformation }
     *     
     */
    public InvoiceInformation getInvoiceInformation() {
        return invoiceInformation;
    }

    /**
     * Sets the value of the invoiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInformation }
     *     
     */
    public void setInvoiceInformation(InvoiceInformation value) {
        this.invoiceInformation = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderRow }
     *     
     */
    public ArrayOfOrderRow getOrderRows() {
        return orderRows;
    }

    /**
     * Sets the value of the orderRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderRow }
     *     
     */
    public void setOrderRows(ArrayOfOrderRow value) {
        this.orderRows = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrderType(OrderType value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the paymentPlanInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPlanInformation }
     *     
     */
    public PaymentPlanInformation getPaymentPlanInformation() {
        return paymentPlanInformation;
    }

    /**
     * Sets the value of the paymentPlanInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPlanInformation }
     *     
     */
    public void setPaymentPlanInformation(PaymentPlanInformation value) {
        this.paymentPlanInformation = value;
    }

    /**
     * Gets the value of the peppolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeppolId() {
        return peppolId;
    }

    /**
     * Sets the value of the peppolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeppolId(String value) {
        this.peppolId = value;
    }

    /**
     * Gets the value of the scoringId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScoringId() {
        return scoringId;
    }

    /**
     * Sets the value of the scoringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScoringId(Long value) {
        this.scoringId = value;
    }

    /**
     * Gets the value of the willBuy property.
     * 
     */
    public boolean isWillBuy() {
        return willBuy;
    }

    /**
     * Sets the value of the willBuy property.
     * 
     */
    public void setWillBuy(boolean value) {
        this.willBuy = value;
    }

    /**
     * Gets the value of the kycProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKycProductId() {
        return kycProductId;
    }

    /**
     * Sets the value of the kycProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKycProductId(String value) {
        this.kycProductId = value;
    }

    /**
     * Gets the value of the kycRiskClassification property.
     * 
     * @return
     *     possible object is
     *     {@link KycRiskClassification }
     *     
     */
    public KycRiskClassification getKycRiskClassification() {
        return kycRiskClassification;
    }

    /**
     * Sets the value of the kycRiskClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link KycRiskClassification }
     *     
     */
    public void setKycRiskClassification(KycRiskClassification value) {
        this.kycRiskClassification = value;
    }

}
