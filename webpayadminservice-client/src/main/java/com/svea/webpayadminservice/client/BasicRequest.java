
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authentication" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}Authentication"/&gt;
 *         &lt;element name="Settings" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfSetting" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicRequest", propOrder = {
    "authentication",
    "settings"
})
@XmlSeeAlso({
    AddOrderRowsRequest.class,
    ApproveInvoiceRequest.class,
    CancelAccountCreditAmountRequest.class,
    CancelAccountCreditRowsRequest.class,
    CancelOrderRequest.class,
    CancelOrderRowsRequest.class,
    CancelPaymentPlanAmountRequest.class,
    CancelPaymentPlanRowsRequest.class,
    CreditInvoiceRequest.class,
    PartialDeliveryRequest.class,
    ExtendOrderRequest.class,
    AccountCreditRegressReportRequest.class,
    AccountingAgreementType25ReportRequest.class,
    GetAccountingReportRequest.class,
    GetDebtInvoicesPaidToClientForReportRequest.class,
    GetFinancialReportRequest.class,
    GetInvoiceJournalReportRequest.class,
    GetInvoicePdfLinkRequest.class,
    GetInvoiceReportRequest.class,
    GetInvoicesPaidToClientForReportRequest.class,
    GetInvoicesWithChangedDueDateRequest.class,
    GetKickbackReportRequest.class,
    GetOrderEventsRequest.class,
    GetOrderPdfLinkRequest.class,
    GetPaymentPlanReportRequest.class,
    GetPendingReasonsRequest.class,
    GetRegressionReportRequest.class,
    GetSpecificationReportRequest.class,
    ReleasePendingRequest.class,
    UpdateOrderRequest.class,
    UpdateOrderRowsRequest.class,
    GetOrdersRequest.class,
    DeliveryRequest.class,
    SearchOrdersRequest.class,
    SearchInvoicesRequest.class,
    GetInvoicesRequest.class,
    SearchPaymentPlansRequest.class,
    SumOfOrderAmountRequest.class,
    SumOfInvoiceAmountRequest.class,
    SumOfPaymentPlanAmountRequest.class,
    CreateOrderRequest.class,
    ChangeInvoiceDueDateRequest.class,
    CreateApprovedOrderRequest.class,
    SearchAccountCreditsRequest.class,
    GetAccountCreditsRequest.class,
    GetClientIdRequest.class
})
public class BasicRequest {

    @XmlElement(name = "Authentication", required = true, nillable = true)
    protected Authentication authentication;
    @XmlElement(name = "Settings", nillable = true)
    protected ArrayOfSetting settings;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSetting }
     *     
     */
    public ArrayOfSetting getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSetting }
     *     
     */
    public void setSettings(ArrayOfSetting value) {
        this.settings = value;
    }

}
