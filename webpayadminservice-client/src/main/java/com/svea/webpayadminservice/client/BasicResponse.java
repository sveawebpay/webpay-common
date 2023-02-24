
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicResponse", propOrder = {
    "errorMessage",
    "resultCode"
})
@XmlSeeAlso({
    AddOrderRowsResponse.class,
    ApproveInvoiceResponse.class,
    CancelOrderResponse.class,
    CancelOrderRowsResponse.class,
    CancelPaymentPlanAmountResponse.class,
    CancelPaymentPlanRowsResponse.class,
    DeliveryResponse.class,
    GetAccountingReportResponse.class,
    GetFinancialReportResponse.class,
    GetInvoiceJournalReportResponse.class,
    PdfLinkResponse.class,
    GetInvoiceReportResponse.class,
    GetInvoicesWithChangedDueDateResponse.class,
    GetOrderEventsResponse.class,
    GetPaymentPlanReportResponse.class,
    GetRegressionReportResponse.class,
    ReleasePendingResponse.class,
    UpdateOrderResponse.class,
    UpdateOrderRowsResponse.class,
    GetOrdersResponse.class,
    SearchOrdersResponse.class,
    SearchInvoicesResponse.class,
    GetInvoicesResponse.class,
    SearchPaymentPlansResponse.class,
    SumOfAmountResponse.class,
    CreateOrderResponse.class,
    ChangeInvoiceDueDateResponse.class,
    CreateApprovedOrderResponse.class,
    CancelAccountCreditAmountResponse2 .class,
    CancelAccountCreditRowsResponse2 .class,
    ExtendOrderResponse2 .class,
    AccountCreditRegressReportResponse.class,
    AccountingAgreementType25ReportResponse.class,
    GetClientsByIdentityAccountResponse2 .class,
    GetDebtInvoicesPaidToClientForReportResponse2 .class,
    GetInvoicesPaidToClientForReportResponse2 .class,
    GetKickbackReportResponse2 .class,
    GetPendingReasonsResponse2 .class,
    GetSpecificationReportResponse2 .class,
    SearchAccountCreditsResponse2 .class,
    GetAccountCreditsResponse2 .class,
    GetClientIdResponse2 .class
})
public class BasicResponse {

    @XmlElement(name = "ErrorMessage", nillable = true)
    protected String errorMessage;
    @XmlElement(name = "ResultCode")
    protected int resultCode;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

}
