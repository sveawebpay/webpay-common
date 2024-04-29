
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.svea.webpayadminservice.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.Order", "TextMatchType");
    private final static QName _AddOrderRowsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "AddOrderRowsRequest");
    private final static QName _BasicRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "BasicRequest");
    private final static QName _Authentication_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "Authentication");
    private final static QName _ArrayOfSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfSetting");
    private final static QName _Setting_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "Setting");
    private final static QName _AddOrderRowsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "AddOrderRowsResponse");
    private final static QName _BasicResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "BasicResponse");
    private final static QName _ApproveInvoiceRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ApproveInvoiceRequest");
    private final static QName _ApproveInvoiceResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ApproveInvoiceResponse");
    private final static QName _ArrayOfCancellationRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfCancellationRow");
    private final static QName _CancellationRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CancellationRow");
    private final static QName _CancelOrderRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CancelOrderRequest");
    private final static QName _CancelOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CancelOrderResponse");
    private final static QName _CancelOrderRowsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CancelOrderRowsRequest");
    private final static QName _CancelOrderRowsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CancelOrderRowsResponse");
    private final static QName _CancelPaymentPlanAmountRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CancelPaymentPlanAmountRequest");
    private final static QName _CancelPaymentPlanAmountResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CancelPaymentPlanAmountResponse");
    private final static QName _CancelPaymentPlanRowsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CancelPaymentPlanRowsRequest");
    private final static QName _CancelPaymentPlanRowsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CancelPaymentPlanRowsResponse");
    private final static QName _CreditInvoiceRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CreditInvoiceRequest");
    private final static QName _ArrayOfRowCreditingOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfRowCreditingOption");
    private final static QName _RowCreditingOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "RowCreditingOption");
    private final static QName _DeliveryResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "DeliveryResponse");
    private final static QName _ArrayOfDeliverOrderResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfDeliverOrderResult");
    private final static QName _DeliverOrderResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "DeliverOrderResult");
    private final static QName _PartialDeliveryRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "PartialDeliveryRequest");
    private final static QName _DeliverOrderInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "DeliverOrderInformation");
    private final static QName _ArrayOfRowDeliveryOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfRowDeliveryOption");
    private final static QName _RowDeliveryOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "RowDeliveryOption");
    private final static QName _ExtendOrderRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ExtendOrderRequest");
    private final static QName _ArrayOfAccountCreditRegressReportDataRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfAccountCreditRegressReportDataRow");
    private final static QName _AccountCreditRegressReportDataRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "AccountCreditRegressReportDataRow");
    private final static QName _ArrayOfAccountingAgreementType25ReportDataRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfAccountingAgreementType25ReportDataRow");
    private final static QName _AccountingAgreementType25ReportDataRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "AccountingAgreementType25ReportDataRow");
    private final static QName _ArrayOfAccountingAgreementType25Summation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfAccountingAgreementType25Summation");
    private final static QName _AccountingAgreementType25Summation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "AccountingAgreementType25Summation");
    private final static QName _GetAccountingReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetAccountingReportRequest");
    private final static QName _GetAccountingReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetAccountingReportResponse");
    private final static QName _ArrayOfAccountingReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfAccountingReportRow");
    private final static QName _AccountingReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "AccountingReportRow");
    private final static QName _GetFinancialReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetFinancialReportRequest");
    private final static QName _GetFinancialReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetFinancialReportResponse");
    private final static QName _FinancialReportHeader_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "FinancialReportHeader");
    private final static QName _ArrayOfFinancialReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfFinancialReportRow");
    private final static QName _FinancialReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "FinancialReportRow");
    private final static QName _GetInvoiceJournalReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetInvoiceJournalReportRequest");
    private final static QName _GetInvoiceJournalReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetInvoiceJournalReportResponse");
    private final static QName _ArrayOfInvoiceJournalReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfInvoiceJournalReportRow");
    private final static QName _InvoiceJournalReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "InvoiceJournalReportRow");
    private final static QName _GetInvoicePdfLinkRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetInvoicePdfLinkRequest");
    private final static QName _PdfLinkResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "PdfLinkResponse");
    private final static QName _GetInvoiceReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetInvoiceReportRequest");
    private final static QName _GetInvoiceReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetInvoiceReportResponse");
    private final static QName _ArrayOfInvoiceReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfInvoiceReportRow");
    private final static QName _InvoiceReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "InvoiceReportRow");
    private final static QName _GetInvoicesWithChangedDueDateRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetInvoicesWithChangedDueDateRequest");
    private final static QName _GetInvoicesWithChangedDueDateResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetInvoicesWithChangedDueDateResponse");
    private final static QName _ArrayOfInvoiceWithChangedDueDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfInvoiceWithChangedDueDate");
    private final static QName _InvoiceWithChangedDueDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "InvoiceWithChangedDueDate");
    private final static QName _ArrayOfKickbackReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfKickbackReportRow");
    private final static QName _KickbackReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "KickbackReportRow");
    private final static QName _GetOrderEventsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetOrderEventsRequest");
    private final static QName _OrderEventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "OrderEventType");
    private final static QName _GetOrderEventsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetOrderEventsResponse");
    private final static QName _ArrayOfOrderEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfOrderEvent");
    private final static QName _OrderEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "OrderEvent");
    private final static QName _PendingEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "PendingEvent");
    private final static QName _GetOrderPdfLinkRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetOrderPdfLinkRequest");
    private final static QName _GetPaymentPlanReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetPaymentPlanReportRequest");
    private final static QName _GetPaymentPlanReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetPaymentPlanReportResponse");
    private final static QName _ArrayOfPaymentPlanReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfPaymentPlanReportRow");
    private final static QName _PaymentPlanReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "PaymentPlanReportRow");
    private final static QName _ArrayOfPendingReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfPendingReason");
    private final static QName _PendingReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "PendingReason");
    private final static QName _GetRegressionReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetRegressionReportRequest");
    private final static QName _GetRegressionReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetRegressionReportResponse");
    private final static QName _ArrayOfRegressionReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfRegressionReportRow");
    private final static QName _RegressionReportRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "RegressionReportRow");
    private final static QName _SpecificationReportType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SpecificationReportType");
    private final static QName _ArrayOfSpecificationRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfSpecificationRow");
    private final static QName _SpecificationRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SpecificationRow");
    private final static QName _SpecificationSummation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SpecificationSummation");
    private final static QName _ReleasePendingRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ReleasePendingRequest");
    private final static QName _ReleasePendingResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ReleasePendingResponse");
    private final static QName _UpdateOrderRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "UpdateOrderRequest");
    private final static QName _UpdateOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "UpdateOrderResponse");
    private final static QName _UpdateOrderRowsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "UpdateOrderRowsRequest");
    private final static QName _ArrayOfNumberedOrderRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfNumberedOrderRow");
    private final static QName _NumberedOrderRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "NumberedOrderRow");
    private final static QName _UpdateOrderRowsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "UpdateOrderRowsResponse");
    private final static QName _GetOrdersRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetOrdersRequest");
    private final static QName _ArrayOfGetOrderInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfGetOrderInformation");
    private final static QName _GetOrderInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetOrderInformation");
    private final static QName _GetOrdersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetOrdersResponse");
    private final static QName _ArrayOfOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfOrder");
    private final static QName _Order_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "Order");
    private final static QName _CreditReportStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CreditReportStatus");
    private final static QName _PaymentPlanDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "PaymentPlanDetails");
    private final static QName _DeliveryRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "DeliveryRequest");
    private final static QName _ArrayOfDeliverOrderInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfDeliverOrderInformation");
    private final static QName _SearchOrdersRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchOrdersRequest");
    private final static QName _SearchOrderFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchOrderFilter");
    private final static QName _ArrayOfOrderDeliveryStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfOrderDeliveryStatus");
    private final static QName _OrderDeliveryStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "OrderDeliveryStatus");
    private final static QName _SearchOrderSorting_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchOrderSorting");
    private final static QName _SortDirection_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SortDirection");
    private final static QName _SortOrderProperty_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SortOrderProperty");
    private final static QName _SearchOrdersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchOrdersResponse");
    private final static QName _ArrayOfOrderListItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfOrderListItem");
    private final static QName _OrderListItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "OrderListItem");
    private final static QName _SearchInvoicesRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchInvoicesRequest");
    private final static QName _SearchInvoiceFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchInvoiceFilter");
    private final static QName _ArrayOfInvoicePaymentStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfInvoicePaymentStatus");
    private final static QName _InvoicePaymentStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "InvoicePaymentStatus");
    private final static QName _SearchInvoiceSorting_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchInvoiceSorting");
    private final static QName _SortInvoiceProperty_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SortInvoiceProperty");
    private final static QName _SearchInvoicesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchInvoicesResponse");
    private final static QName _ArrayOfInvoiceListItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfInvoiceListItem");
    private final static QName _InvoiceListItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "InvoiceListItem");
    private final static QName _InvoiceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "InvoiceType");
    private final static QName _GetInvoicesRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetInvoicesRequest");
    private final static QName _ArrayOfGetInvoiceInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfGetInvoiceInformation");
    private final static QName _GetInvoiceInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetInvoiceInformation");
    private final static QName _GetInvoicesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetInvoicesResponse");
    private final static QName _ArrayOfInvoice_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfInvoice");
    private final static QName _Invoice_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "Invoice");
    private final static QName _SearchPaymentPlansRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchPaymentPlansRequest");
    private final static QName _SearchPaymentPlanFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchPaymentPlanFilter");
    private final static QName _ArrayOfPaymentPlanStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfPaymentPlanStatus");
    private final static QName _PaymentPlanStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "PaymentPlanStatus");
    private final static QName _SearchPaymentPlanSorting_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchPaymentPlanSorting");
    private final static QName _SortPaymentPlanProperty_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SortPaymentPlanProperty");
    private final static QName _SearchPaymentPlansResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchPaymentPlansResponse");
    private final static QName _ArrayOfPaymentPlanListItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfPaymentPlanListItem");
    private final static QName _PaymentPlanListItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "PaymentPlanListItem");
    private final static QName _SumOfOrderAmountRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SumOfOrderAmountRequest");
    private final static QName _SumOfAmountResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SumOfAmountResponse");
    private final static QName _SumOfInvoiceAmountRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SumOfInvoiceAmountRequest");
    private final static QName _SumOfPaymentPlanAmountRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SumOfPaymentPlanAmountRequest");
    private final static QName _CreateOrderRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CreateOrderRequest");
    private final static QName _CreateOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CreateOrderResponse");
    private final static QName _ChangeInvoiceDueDateRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ChangeInvoiceDueDateRequest");
    private final static QName _ChangeInvoiceDueDateResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ChangeInvoiceDueDateResponse");
    private final static QName _CreateApprovedOrderRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CreateApprovedOrderRequest");
    private final static QName _CustomerInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CustomerInformation");
    private final static QName _DeliveryAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "DeliveryAddress");
    private final static QName _InvoiceAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "InvoiceAddress");
    private final static QName _OrderInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "OrderInformation");
    private final static QName _AccountCreditInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "AccountCreditInformation");
    private final static QName _InvoiceInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "InvoiceInformation");
    private final static QName _ArrayOfBillingReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfBillingReference");
    private final static QName _BillingReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "BillingReference");
    private final static QName _PaymentPlanInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "PaymentPlanInformation");
    private final static QName _CreateApprovedOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "CreateApprovedOrderResponse");
    private final static QName _SearchAccountCreditsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchAccountCreditsRequest");
    private final static QName _SearchAccountCreditFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "SearchAccountCreditFilter");
    private final static QName _ArrayOfAccountCreditStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfAccountCreditStatus");
    private final static QName _AccountCreditStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "AccountCreditStatus");
    private final static QName _ArrayOfAccountCreditListItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfAccountCreditListItem");
    private final static QName _AccountCreditListItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "AccountCreditListItem");
    private final static QName _GetAccountCreditsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "GetAccountCreditsRequest");
    private final static QName _ArrayOfAccountCreditItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "ArrayOfAccountCreditItem");
    private final static QName _AccountCreditItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", "AccountCreditItem");
    private final static QName _AccountCreditDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", "AccountCreditDetails");
    private final static QName _SearchAccountCreditSorting_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", "SearchAccountCreditSorting");
    private final static QName _SortAccountCreditProperty_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", "SortAccountCreditProperty");
    private final static QName _ArrayOfGetAccountCreditInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", "ArrayOfGetAccountCreditInformation");
    private final static QName _GetAccountCreditInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", "GetAccountCreditInformation");
    private final static QName _SearchInvoice_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.Invoice", "TextMatchType");
    private final static QName _CancelAccountCreditAmountRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "CancelAccountCreditAmountRequest");
    private final static QName _CancelAccountCreditRowsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "CancelAccountCreditRowsRequest");
    private final static QName _AccountCreditRegressReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "AccountCreditRegressReportRequest");
    private final static QName _AccountingAgreementType25ReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "AccountingAgreementType25ReportRequest");
    private final static QName _GetDebtInvoicesPaidToClientForReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "GetDebtInvoicesPaidToClientForReportRequest");
    private final static QName _GetInvoicesPaidToClientForReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "GetInvoicesPaidToClientForReportRequest");
    private final static QName _GetKickbackReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "GetKickbackReportRequest");
    private final static QName _GetPendingReasonsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "GetPendingReasonsRequest");
    private final static QName _GetSpecificationReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "GetSpecificationReportRequest");
    private final static QName _GetSpecificationReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "GetSpecificationReportResponse");
    private final static QName _GetClientIdRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", "GetClientIdRequest");
    private final static QName _SearchPaymentPlan_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.PaymentPlan", "TextMatchType");
    private final static QName _CreateOrderInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", "CreateOrderInformation");
    private final static QName _CreateAccountCreditDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", "CreateAccountCreditDetails");
    private final static QName _CreatePaymentPlanDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", "CreatePaymentPlanDetails");
    private final static QName _CreateOrderResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", "CreateOrderResult");
    private final static QName _SearchAccountCredit_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.AccountCredit", "TextMatchType");
    private final static QName _RowType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Enums", "RowType");
    private final static QName _AddressSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Enums", "AddressSource");
    private final static QName _BillingReferenceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Enums", "BillingReferenceType");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfOrderRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "ArrayOfOrderRow");
    private final static QName _OrderRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "OrderRow");
    private final static QName _OrderType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "OrderType");
    private final static QName _ArrayOfOrderRowReferenceItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "ArrayOfOrderRowReferenceItem");
    private final static QName _OrderRowReferenceItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "OrderRowReferenceItem");
    private final static QName _Address_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "Address");
    private final static QName _CustomerIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "CustomerIdentity");
    private final static QName _CompanyIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "CompanyIdentity");
    private final static QName _CustomerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "CustomerType");
    private final static QName _IndividualIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "IndividualIdentity");
    private final static QName _ArrayOfOrderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "ArrayOfOrderStatus");
    private final static QName _OrderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "OrderStatus");
    private final static QName _KycRiskClassification_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice", "KycRiskClassification");
    private final static QName _InvoiceDistributionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder", "InvoiceDistributionType");
    private final static QName _ArrayOfInvoicePaidToClientRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Internal.Service.Types", "ArrayOfInvoicePaidToClientRow");
    private final static QName _InvoicePaidToClientRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Internal.Service.Types", "InvoicePaidToClientRow");
    private final static QName _CancelAccountCreditAmountResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "CancelAccountCreditAmountResponse");
    private final static QName _CancelAccountCreditRowsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "CancelAccountCreditRowsResponse");
    private final static QName _ExtendOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "ExtendOrderResponse");
    private final static QName _AccountCreditRegressReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "AccountCreditRegressReportResponse");
    private final static QName _AccountingAgreementType25ReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "AccountingAgreementType25ReportResponse");
    private final static QName _GetDebtInvoicesPaidToClientForReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "GetDebtInvoicesPaidToClientForReportResponse");
    private final static QName _GetInvoicesPaidToClientForReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "GetInvoicesPaidToClientForReportResponse");
    private final static QName _GetKickbackReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "GetKickbackReportResponse");
    private final static QName _GetPendingReasonsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "GetPendingReasonsResponse");
    private final static QName _SearchAccountCreditsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "SearchAccountCreditsResponse");
    private final static QName _GetAccountCreditsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "GetAccountCreditsResponse");
    private final static QName _GetClientIdResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", "GetClientIdResponse");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.svea.webpayadminservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOrderRowsRequest }
     * 
     */
    public AddOrderRowsRequest createAddOrderRowsRequest() {
        return new AddOrderRowsRequest();
    }

    /**
     * Create an instance of {@link BasicRequest }
     * 
     */
    public BasicRequest createBasicRequest() {
        return new BasicRequest();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link ArrayOfSetting }
     * 
     */
    public ArrayOfSetting createArrayOfSetting() {
        return new ArrayOfSetting();
    }

    /**
     * Create an instance of {@link Setting }
     * 
     */
    public Setting createSetting() {
        return new Setting();
    }

    /**
     * Create an instance of {@link AddOrderRowsResponse }
     * 
     */
    public AddOrderRowsResponse createAddOrderRowsResponse() {
        return new AddOrderRowsResponse();
    }

    /**
     * Create an instance of {@link BasicResponse }
     * 
     */
    public BasicResponse createBasicResponse() {
        return new BasicResponse();
    }

    /**
     * Create an instance of {@link ApproveInvoiceRequest }
     * 
     */
    public ApproveInvoiceRequest createApproveInvoiceRequest() {
        return new ApproveInvoiceRequest();
    }

    /**
     * Create an instance of {@link ApproveInvoiceResponse }
     * 
     */
    public ApproveInvoiceResponse createApproveInvoiceResponse() {
        return new ApproveInvoiceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCancellationRow }
     * 
     */
    public ArrayOfCancellationRow createArrayOfCancellationRow() {
        return new ArrayOfCancellationRow();
    }

    /**
     * Create an instance of {@link CancellationRow }
     * 
     */
    public CancellationRow createCancellationRow() {
        return new CancellationRow();
    }

    /**
     * Create an instance of {@link CancelOrderRequest }
     * 
     */
    public CancelOrderRequest createCancelOrderRequest() {
        return new CancelOrderRequest();
    }

    /**
     * Create an instance of {@link CancelOrderResponse }
     * 
     */
    public CancelOrderResponse createCancelOrderResponse() {
        return new CancelOrderResponse();
    }

    /**
     * Create an instance of {@link CancelOrderRowsRequest }
     * 
     */
    public CancelOrderRowsRequest createCancelOrderRowsRequest() {
        return new CancelOrderRowsRequest();
    }

    /**
     * Create an instance of {@link CancelOrderRowsResponse }
     * 
     */
    public CancelOrderRowsResponse createCancelOrderRowsResponse() {
        return new CancelOrderRowsResponse();
    }

    /**
     * Create an instance of {@link CancelPaymentPlanAmountRequest }
     * 
     */
    public CancelPaymentPlanAmountRequest createCancelPaymentPlanAmountRequest() {
        return new CancelPaymentPlanAmountRequest();
    }

    /**
     * Create an instance of {@link CancelPaymentPlanAmountResponse }
     * 
     */
    public CancelPaymentPlanAmountResponse createCancelPaymentPlanAmountResponse() {
        return new CancelPaymentPlanAmountResponse();
    }

    /**
     * Create an instance of {@link CancelPaymentPlanRowsRequest }
     * 
     */
    public CancelPaymentPlanRowsRequest createCancelPaymentPlanRowsRequest() {
        return new CancelPaymentPlanRowsRequest();
    }

    /**
     * Create an instance of {@link CancelPaymentPlanRowsResponse }
     * 
     */
    public CancelPaymentPlanRowsResponse createCancelPaymentPlanRowsResponse() {
        return new CancelPaymentPlanRowsResponse();
    }

    /**
     * Create an instance of {@link CreditInvoiceRequest }
     * 
     */
    public CreditInvoiceRequest createCreditInvoiceRequest() {
        return new CreditInvoiceRequest();
    }

    /**
     * Create an instance of {@link ArrayOfRowCreditingOption }
     * 
     */
    public ArrayOfRowCreditingOption createArrayOfRowCreditingOption() {
        return new ArrayOfRowCreditingOption();
    }

    /**
     * Create an instance of {@link RowCreditingOption }
     * 
     */
    public RowCreditingOption createRowCreditingOption() {
        return new RowCreditingOption();
    }

    /**
     * Create an instance of {@link DeliveryResponse }
     * 
     */
    public DeliveryResponse createDeliveryResponse() {
        return new DeliveryResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDeliverOrderResult }
     * 
     */
    public ArrayOfDeliverOrderResult createArrayOfDeliverOrderResult() {
        return new ArrayOfDeliverOrderResult();
    }

    /**
     * Create an instance of {@link DeliverOrderResult }
     * 
     */
    public DeliverOrderResult createDeliverOrderResult() {
        return new DeliverOrderResult();
    }

    /**
     * Create an instance of {@link PartialDeliveryRequest }
     * 
     */
    public PartialDeliveryRequest createPartialDeliveryRequest() {
        return new PartialDeliveryRequest();
    }

    /**
     * Create an instance of {@link DeliverOrderInformation }
     * 
     */
    public DeliverOrderInformation createDeliverOrderInformation() {
        return new DeliverOrderInformation();
    }

    /**
     * Create an instance of {@link ArrayOfRowDeliveryOption }
     * 
     */
    public ArrayOfRowDeliveryOption createArrayOfRowDeliveryOption() {
        return new ArrayOfRowDeliveryOption();
    }

    /**
     * Create an instance of {@link RowDeliveryOption }
     * 
     */
    public RowDeliveryOption createRowDeliveryOption() {
        return new RowDeliveryOption();
    }

    /**
     * Create an instance of {@link ExtendOrderRequest }
     * 
     */
    public ExtendOrderRequest createExtendOrderRequest() {
        return new ExtendOrderRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAccountCreditRegressReportDataRow }
     * 
     */
    public ArrayOfAccountCreditRegressReportDataRow createArrayOfAccountCreditRegressReportDataRow() {
        return new ArrayOfAccountCreditRegressReportDataRow();
    }

    /**
     * Create an instance of {@link AccountCreditRegressReportDataRow }
     * 
     */
    public AccountCreditRegressReportDataRow createAccountCreditRegressReportDataRow() {
        return new AccountCreditRegressReportDataRow();
    }

    /**
     * Create an instance of {@link ArrayOfAccountingAgreementType25ReportDataRow }
     * 
     */
    public ArrayOfAccountingAgreementType25ReportDataRow createArrayOfAccountingAgreementType25ReportDataRow() {
        return new ArrayOfAccountingAgreementType25ReportDataRow();
    }

    /**
     * Create an instance of {@link AccountingAgreementType25ReportDataRow }
     * 
     */
    public AccountingAgreementType25ReportDataRow createAccountingAgreementType25ReportDataRow() {
        return new AccountingAgreementType25ReportDataRow();
    }

    /**
     * Create an instance of {@link ArrayOfAccountingAgreementType25Summation }
     * 
     */
    public ArrayOfAccountingAgreementType25Summation createArrayOfAccountingAgreementType25Summation() {
        return new ArrayOfAccountingAgreementType25Summation();
    }

    /**
     * Create an instance of {@link AccountingAgreementType25Summation }
     * 
     */
    public AccountingAgreementType25Summation createAccountingAgreementType25Summation() {
        return new AccountingAgreementType25Summation();
    }

    /**
     * Create an instance of {@link GetAccountingReportRequest }
     * 
     */
    public GetAccountingReportRequest createGetAccountingReportRequest() {
        return new GetAccountingReportRequest();
    }

    /**
     * Create an instance of {@link GetAccountingReportResponse }
     * 
     */
    public GetAccountingReportResponse createGetAccountingReportResponse() {
        return new GetAccountingReportResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountingReportRow }
     * 
     */
    public ArrayOfAccountingReportRow createArrayOfAccountingReportRow() {
        return new ArrayOfAccountingReportRow();
    }

    /**
     * Create an instance of {@link AccountingReportRow }
     * 
     */
    public AccountingReportRow createAccountingReportRow() {
        return new AccountingReportRow();
    }

    /**
     * Create an instance of {@link GetFinancialReportRequest }
     * 
     */
    public GetFinancialReportRequest createGetFinancialReportRequest() {
        return new GetFinancialReportRequest();
    }

    /**
     * Create an instance of {@link GetFinancialReportResponse }
     * 
     */
    public GetFinancialReportResponse createGetFinancialReportResponse() {
        return new GetFinancialReportResponse();
    }

    /**
     * Create an instance of {@link FinancialReportHeader }
     * 
     */
    public FinancialReportHeader createFinancialReportHeader() {
        return new FinancialReportHeader();
    }

    /**
     * Create an instance of {@link ArrayOfFinancialReportRow }
     * 
     */
    public ArrayOfFinancialReportRow createArrayOfFinancialReportRow() {
        return new ArrayOfFinancialReportRow();
    }

    /**
     * Create an instance of {@link FinancialReportRow }
     * 
     */
    public FinancialReportRow createFinancialReportRow() {
        return new FinancialReportRow();
    }

    /**
     * Create an instance of {@link GetInvoiceJournalReportRequest }
     * 
     */
    public GetInvoiceJournalReportRequest createGetInvoiceJournalReportRequest() {
        return new GetInvoiceJournalReportRequest();
    }

    /**
     * Create an instance of {@link GetInvoiceJournalReportResponse }
     * 
     */
    public GetInvoiceJournalReportResponse createGetInvoiceJournalReportResponse() {
        return new GetInvoiceJournalReportResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInvoiceJournalReportRow }
     * 
     */
    public ArrayOfInvoiceJournalReportRow createArrayOfInvoiceJournalReportRow() {
        return new ArrayOfInvoiceJournalReportRow();
    }

    /**
     * Create an instance of {@link InvoiceJournalReportRow }
     * 
     */
    public InvoiceJournalReportRow createInvoiceJournalReportRow() {
        return new InvoiceJournalReportRow();
    }

    /**
     * Create an instance of {@link GetInvoicePdfLinkRequest }
     * 
     */
    public GetInvoicePdfLinkRequest createGetInvoicePdfLinkRequest() {
        return new GetInvoicePdfLinkRequest();
    }

    /**
     * Create an instance of {@link PdfLinkResponse }
     * 
     */
    public PdfLinkResponse createPdfLinkResponse() {
        return new PdfLinkResponse();
    }

    /**
     * Create an instance of {@link GetInvoiceReportRequest }
     * 
     */
    public GetInvoiceReportRequest createGetInvoiceReportRequest() {
        return new GetInvoiceReportRequest();
    }

    /**
     * Create an instance of {@link GetInvoiceReportResponse }
     * 
     */
    public GetInvoiceReportResponse createGetInvoiceReportResponse() {
        return new GetInvoiceReportResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInvoiceReportRow }
     * 
     */
    public ArrayOfInvoiceReportRow createArrayOfInvoiceReportRow() {
        return new ArrayOfInvoiceReportRow();
    }

    /**
     * Create an instance of {@link InvoiceReportRow }
     * 
     */
    public InvoiceReportRow createInvoiceReportRow() {
        return new InvoiceReportRow();
    }

    /**
     * Create an instance of {@link GetInvoicesWithChangedDueDateRequest }
     * 
     */
    public GetInvoicesWithChangedDueDateRequest createGetInvoicesWithChangedDueDateRequest() {
        return new GetInvoicesWithChangedDueDateRequest();
    }

    /**
     * Create an instance of {@link GetInvoicesWithChangedDueDateResponse }
     * 
     */
    public GetInvoicesWithChangedDueDateResponse createGetInvoicesWithChangedDueDateResponse() {
        return new GetInvoicesWithChangedDueDateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInvoiceWithChangedDueDate }
     * 
     */
    public ArrayOfInvoiceWithChangedDueDate createArrayOfInvoiceWithChangedDueDate() {
        return new ArrayOfInvoiceWithChangedDueDate();
    }

    /**
     * Create an instance of {@link InvoiceWithChangedDueDate }
     * 
     */
    public InvoiceWithChangedDueDate createInvoiceWithChangedDueDate() {
        return new InvoiceWithChangedDueDate();
    }

    /**
     * Create an instance of {@link ArrayOfKickbackReportRow }
     * 
     */
    public ArrayOfKickbackReportRow createArrayOfKickbackReportRow() {
        return new ArrayOfKickbackReportRow();
    }

    /**
     * Create an instance of {@link KickbackReportRow }
     * 
     */
    public KickbackReportRow createKickbackReportRow() {
        return new KickbackReportRow();
    }

    /**
     * Create an instance of {@link GetOrderEventsRequest }
     * 
     */
    public GetOrderEventsRequest createGetOrderEventsRequest() {
        return new GetOrderEventsRequest();
    }

    /**
     * Create an instance of {@link GetOrderEventsResponse }
     * 
     */
    public GetOrderEventsResponse createGetOrderEventsResponse() {
        return new GetOrderEventsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrderEvent }
     * 
     */
    public ArrayOfOrderEvent createArrayOfOrderEvent() {
        return new ArrayOfOrderEvent();
    }

    /**
     * Create an instance of {@link OrderEvent }
     * 
     */
    public OrderEvent createOrderEvent() {
        return new OrderEvent();
    }

    /**
     * Create an instance of {@link PendingEvent }
     * 
     */
    public PendingEvent createPendingEvent() {
        return new PendingEvent();
    }

    /**
     * Create an instance of {@link GetOrderPdfLinkRequest }
     * 
     */
    public GetOrderPdfLinkRequest createGetOrderPdfLinkRequest() {
        return new GetOrderPdfLinkRequest();
    }

    /**
     * Create an instance of {@link GetPaymentPlanReportRequest }
     * 
     */
    public GetPaymentPlanReportRequest createGetPaymentPlanReportRequest() {
        return new GetPaymentPlanReportRequest();
    }

    /**
     * Create an instance of {@link GetPaymentPlanReportResponse }
     * 
     */
    public GetPaymentPlanReportResponse createGetPaymentPlanReportResponse() {
        return new GetPaymentPlanReportResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentPlanReportRow }
     * 
     */
    public ArrayOfPaymentPlanReportRow createArrayOfPaymentPlanReportRow() {
        return new ArrayOfPaymentPlanReportRow();
    }

    /**
     * Create an instance of {@link PaymentPlanReportRow }
     * 
     */
    public PaymentPlanReportRow createPaymentPlanReportRow() {
        return new PaymentPlanReportRow();
    }

    /**
     * Create an instance of {@link ArrayOfPendingReason }
     * 
     */
    public ArrayOfPendingReason createArrayOfPendingReason() {
        return new ArrayOfPendingReason();
    }

    /**
     * Create an instance of {@link PendingReason }
     * 
     */
    public PendingReason createPendingReason() {
        return new PendingReason();
    }

    /**
     * Create an instance of {@link GetRegressionReportRequest }
     * 
     */
    public GetRegressionReportRequest createGetRegressionReportRequest() {
        return new GetRegressionReportRequest();
    }

    /**
     * Create an instance of {@link GetRegressionReportResponse }
     * 
     */
    public GetRegressionReportResponse createGetRegressionReportResponse() {
        return new GetRegressionReportResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRegressionReportRow }
     * 
     */
    public ArrayOfRegressionReportRow createArrayOfRegressionReportRow() {
        return new ArrayOfRegressionReportRow();
    }

    /**
     * Create an instance of {@link RegressionReportRow }
     * 
     */
    public RegressionReportRow createRegressionReportRow() {
        return new RegressionReportRow();
    }

    /**
     * Create an instance of {@link ArrayOfSpecificationRow }
     * 
     */
    public ArrayOfSpecificationRow createArrayOfSpecificationRow() {
        return new ArrayOfSpecificationRow();
    }

    /**
     * Create an instance of {@link SpecificationRow }
     * 
     */
    public SpecificationRow createSpecificationRow() {
        return new SpecificationRow();
    }

    /**
     * Create an instance of {@link SpecificationSummation }
     * 
     */
    public SpecificationSummation createSpecificationSummation() {
        return new SpecificationSummation();
    }

    /**
     * Create an instance of {@link ReleasePendingRequest }
     * 
     */
    public ReleasePendingRequest createReleasePendingRequest() {
        return new ReleasePendingRequest();
    }

    /**
     * Create an instance of {@link ReleasePendingResponse }
     * 
     */
    public ReleasePendingResponse createReleasePendingResponse() {
        return new ReleasePendingResponse();
    }

    /**
     * Create an instance of {@link UpdateOrderRequest }
     * 
     */
    public UpdateOrderRequest createUpdateOrderRequest() {
        return new UpdateOrderRequest();
    }

    /**
     * Create an instance of {@link UpdateOrderResponse }
     * 
     */
    public UpdateOrderResponse createUpdateOrderResponse() {
        return new UpdateOrderResponse();
    }

    /**
     * Create an instance of {@link UpdateOrderRowsRequest }
     * 
     */
    public UpdateOrderRowsRequest createUpdateOrderRowsRequest() {
        return new UpdateOrderRowsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfNumberedOrderRow }
     * 
     */
    public ArrayOfNumberedOrderRow createArrayOfNumberedOrderRow() {
        return new ArrayOfNumberedOrderRow();
    }

    /**
     * Create an instance of {@link NumberedOrderRow }
     * 
     */
    public NumberedOrderRow createNumberedOrderRow() {
        return new NumberedOrderRow();
    }

    /**
     * Create an instance of {@link UpdateOrderRowsResponse }
     * 
     */
    public UpdateOrderRowsResponse createUpdateOrderRowsResponse() {
        return new UpdateOrderRowsResponse();
    }

    /**
     * Create an instance of {@link GetOrdersRequest }
     * 
     */
    public GetOrdersRequest createGetOrdersRequest() {
        return new GetOrdersRequest();
    }

    /**
     * Create an instance of {@link ArrayOfGetOrderInformation }
     * 
     */
    public ArrayOfGetOrderInformation createArrayOfGetOrderInformation() {
        return new ArrayOfGetOrderInformation();
    }

    /**
     * Create an instance of {@link GetOrderInformation }
     * 
     */
    public GetOrderInformation createGetOrderInformation() {
        return new GetOrderInformation();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrder }
     * 
     */
    public ArrayOfOrder createArrayOfOrder() {
        return new ArrayOfOrder();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link CreditReportStatus }
     * 
     */
    public CreditReportStatus createCreditReportStatus() {
        return new CreditReportStatus();
    }

    /**
     * Create an instance of {@link PaymentPlanDetails }
     * 
     */
    public PaymentPlanDetails createPaymentPlanDetails() {
        return new PaymentPlanDetails();
    }

    /**
     * Create an instance of {@link DeliveryRequest }
     * 
     */
    public DeliveryRequest createDeliveryRequest() {
        return new DeliveryRequest();
    }

    /**
     * Create an instance of {@link ArrayOfDeliverOrderInformation }
     * 
     */
    public ArrayOfDeliverOrderInformation createArrayOfDeliverOrderInformation() {
        return new ArrayOfDeliverOrderInformation();
    }

    /**
     * Create an instance of {@link SearchOrdersRequest }
     * 
     */
    public SearchOrdersRequest createSearchOrdersRequest() {
        return new SearchOrdersRequest();
    }

    /**
     * Create an instance of {@link SearchOrderFilter }
     * 
     */
    public SearchOrderFilter createSearchOrderFilter() {
        return new SearchOrderFilter();
    }

    /**
     * Create an instance of {@link ArrayOfOrderDeliveryStatus }
     * 
     */
    public ArrayOfOrderDeliveryStatus createArrayOfOrderDeliveryStatus() {
        return new ArrayOfOrderDeliveryStatus();
    }

    /**
     * Create an instance of {@link SearchOrderSorting }
     * 
     */
    public SearchOrderSorting createSearchOrderSorting() {
        return new SearchOrderSorting();
    }

    /**
     * Create an instance of {@link SearchOrdersResponse }
     * 
     */
    public SearchOrdersResponse createSearchOrdersResponse() {
        return new SearchOrdersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrderListItem }
     * 
     */
    public ArrayOfOrderListItem createArrayOfOrderListItem() {
        return new ArrayOfOrderListItem();
    }

    /**
     * Create an instance of {@link OrderListItem }
     * 
     */
    public OrderListItem createOrderListItem() {
        return new OrderListItem();
    }

    /**
     * Create an instance of {@link SearchInvoicesRequest }
     * 
     */
    public SearchInvoicesRequest createSearchInvoicesRequest() {
        return new SearchInvoicesRequest();
    }

    /**
     * Create an instance of {@link SearchInvoiceFilter }
     * 
     */
    public SearchInvoiceFilter createSearchInvoiceFilter() {
        return new SearchInvoiceFilter();
    }

    /**
     * Create an instance of {@link ArrayOfInvoicePaymentStatus }
     * 
     */
    public ArrayOfInvoicePaymentStatus createArrayOfInvoicePaymentStatus() {
        return new ArrayOfInvoicePaymentStatus();
    }

    /**
     * Create an instance of {@link SearchInvoiceSorting }
     * 
     */
    public SearchInvoiceSorting createSearchInvoiceSorting() {
        return new SearchInvoiceSorting();
    }

    /**
     * Create an instance of {@link SearchInvoicesResponse }
     * 
     */
    public SearchInvoicesResponse createSearchInvoicesResponse() {
        return new SearchInvoicesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInvoiceListItem }
     * 
     */
    public ArrayOfInvoiceListItem createArrayOfInvoiceListItem() {
        return new ArrayOfInvoiceListItem();
    }

    /**
     * Create an instance of {@link InvoiceListItem }
     * 
     */
    public InvoiceListItem createInvoiceListItem() {
        return new InvoiceListItem();
    }

    /**
     * Create an instance of {@link GetInvoicesRequest }
     * 
     */
    public GetInvoicesRequest createGetInvoicesRequest() {
        return new GetInvoicesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfGetInvoiceInformation }
     * 
     */
    public ArrayOfGetInvoiceInformation createArrayOfGetInvoiceInformation() {
        return new ArrayOfGetInvoiceInformation();
    }

    /**
     * Create an instance of {@link GetInvoiceInformation }
     * 
     */
    public GetInvoiceInformation createGetInvoiceInformation() {
        return new GetInvoiceInformation();
    }

    /**
     * Create an instance of {@link GetInvoicesResponse }
     * 
     */
    public GetInvoicesResponse createGetInvoicesResponse() {
        return new GetInvoicesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInvoice }
     * 
     */
    public ArrayOfInvoice createArrayOfInvoice() {
        return new ArrayOfInvoice();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link SearchPaymentPlansRequest }
     * 
     */
    public SearchPaymentPlansRequest createSearchPaymentPlansRequest() {
        return new SearchPaymentPlansRequest();
    }

    /**
     * Create an instance of {@link SearchPaymentPlanFilter }
     * 
     */
    public SearchPaymentPlanFilter createSearchPaymentPlanFilter() {
        return new SearchPaymentPlanFilter();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentPlanStatus }
     * 
     */
    public ArrayOfPaymentPlanStatus createArrayOfPaymentPlanStatus() {
        return new ArrayOfPaymentPlanStatus();
    }

    /**
     * Create an instance of {@link SearchPaymentPlanSorting }
     * 
     */
    public SearchPaymentPlanSorting createSearchPaymentPlanSorting() {
        return new SearchPaymentPlanSorting();
    }

    /**
     * Create an instance of {@link SearchPaymentPlansResponse }
     * 
     */
    public SearchPaymentPlansResponse createSearchPaymentPlansResponse() {
        return new SearchPaymentPlansResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentPlanListItem }
     * 
     */
    public ArrayOfPaymentPlanListItem createArrayOfPaymentPlanListItem() {
        return new ArrayOfPaymentPlanListItem();
    }

    /**
     * Create an instance of {@link PaymentPlanListItem }
     * 
     */
    public PaymentPlanListItem createPaymentPlanListItem() {
        return new PaymentPlanListItem();
    }

    /**
     * Create an instance of {@link SumOfOrderAmountRequest }
     * 
     */
    public SumOfOrderAmountRequest createSumOfOrderAmountRequest() {
        return new SumOfOrderAmountRequest();
    }

    /**
     * Create an instance of {@link SumOfAmountResponse }
     * 
     */
    public SumOfAmountResponse createSumOfAmountResponse() {
        return new SumOfAmountResponse();
    }

    /**
     * Create an instance of {@link SumOfInvoiceAmountRequest }
     * 
     */
    public SumOfInvoiceAmountRequest createSumOfInvoiceAmountRequest() {
        return new SumOfInvoiceAmountRequest();
    }

    /**
     * Create an instance of {@link SumOfPaymentPlanAmountRequest }
     * 
     */
    public SumOfPaymentPlanAmountRequest createSumOfPaymentPlanAmountRequest() {
        return new SumOfPaymentPlanAmountRequest();
    }

    /**
     * Create an instance of {@link CreateOrderRequest }
     * 
     */
    public CreateOrderRequest createCreateOrderRequest() {
        return new CreateOrderRequest();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link ChangeInvoiceDueDateRequest }
     * 
     */
    public ChangeInvoiceDueDateRequest createChangeInvoiceDueDateRequest() {
        return new ChangeInvoiceDueDateRequest();
    }

    /**
     * Create an instance of {@link ChangeInvoiceDueDateResponse }
     * 
     */
    public ChangeInvoiceDueDateResponse createChangeInvoiceDueDateResponse() {
        return new ChangeInvoiceDueDateResponse();
    }

    /**
     * Create an instance of {@link CreateApprovedOrderRequest }
     * 
     */
    public CreateApprovedOrderRequest createCreateApprovedOrderRequest() {
        return new CreateApprovedOrderRequest();
    }

    /**
     * Create an instance of {@link CustomerInformation }
     * 
     */
    public CustomerInformation createCustomerInformation() {
        return new CustomerInformation();
    }

    /**
     * Create an instance of {@link DeliveryAddress }
     * 
     */
    public DeliveryAddress createDeliveryAddress() {
        return new DeliveryAddress();
    }

    /**
     * Create an instance of {@link InvoiceAddress }
     * 
     */
    public InvoiceAddress createInvoiceAddress() {
        return new InvoiceAddress();
    }

    /**
     * Create an instance of {@link OrderInformation }
     * 
     */
    public OrderInformation createOrderInformation() {
        return new OrderInformation();
    }

    /**
     * Create an instance of {@link AccountCreditInformation }
     * 
     */
    public AccountCreditInformation createAccountCreditInformation() {
        return new AccountCreditInformation();
    }

    /**
     * Create an instance of {@link InvoiceInformation }
     * 
     */
    public InvoiceInformation createInvoiceInformation() {
        return new InvoiceInformation();
    }

    /**
     * Create an instance of {@link ArrayOfBillingReference }
     * 
     */
    public ArrayOfBillingReference createArrayOfBillingReference() {
        return new ArrayOfBillingReference();
    }

    /**
     * Create an instance of {@link BillingReference }
     * 
     */
    public BillingReference createBillingReference() {
        return new BillingReference();
    }

    /**
     * Create an instance of {@link PaymentPlanInformation }
     * 
     */
    public PaymentPlanInformation createPaymentPlanInformation() {
        return new PaymentPlanInformation();
    }

    /**
     * Create an instance of {@link CreateApprovedOrderResponse }
     * 
     */
    public CreateApprovedOrderResponse createCreateApprovedOrderResponse() {
        return new CreateApprovedOrderResponse();
    }

    /**
     * Create an instance of {@link SearchAccountCreditsRequest }
     * 
     */
    public SearchAccountCreditsRequest createSearchAccountCreditsRequest() {
        return new SearchAccountCreditsRequest();
    }

    /**
     * Create an instance of {@link SearchAccountCreditFilter }
     * 
     */
    public SearchAccountCreditFilter createSearchAccountCreditFilter() {
        return new SearchAccountCreditFilter();
    }

    /**
     * Create an instance of {@link ArrayOfAccountCreditStatus }
     * 
     */
    public ArrayOfAccountCreditStatus createArrayOfAccountCreditStatus() {
        return new ArrayOfAccountCreditStatus();
    }

    /**
     * Create an instance of {@link ArrayOfAccountCreditListItem }
     * 
     */
    public ArrayOfAccountCreditListItem createArrayOfAccountCreditListItem() {
        return new ArrayOfAccountCreditListItem();
    }

    /**
     * Create an instance of {@link AccountCreditListItem }
     * 
     */
    public AccountCreditListItem createAccountCreditListItem() {
        return new AccountCreditListItem();
    }

    /**
     * Create an instance of {@link GetAccountCreditsRequest }
     * 
     */
    public GetAccountCreditsRequest createGetAccountCreditsRequest() {
        return new GetAccountCreditsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAccountCreditItem }
     * 
     */
    public ArrayOfAccountCreditItem createArrayOfAccountCreditItem() {
        return new ArrayOfAccountCreditItem();
    }

    /**
     * Create an instance of {@link AccountCreditItem }
     * 
     */
    public AccountCreditItem createAccountCreditItem() {
        return new AccountCreditItem();
    }

    /**
     * Create an instance of {@link AccountCreditDetails }
     * 
     */
    public AccountCreditDetails createAccountCreditDetails() {
        return new AccountCreditDetails();
    }

    /**
     * Create an instance of {@link SearchAccountCreditSorting }
     * 
     */
    public SearchAccountCreditSorting createSearchAccountCreditSorting() {
        return new SearchAccountCreditSorting();
    }

    /**
     * Create an instance of {@link ArrayOfGetAccountCreditInformation }
     * 
     */
    public ArrayOfGetAccountCreditInformation createArrayOfGetAccountCreditInformation() {
        return new ArrayOfGetAccountCreditInformation();
    }

    /**
     * Create an instance of {@link GetAccountCreditInformation }
     * 
     */
    public GetAccountCreditInformation createGetAccountCreditInformation() {
        return new GetAccountCreditInformation();
    }

    /**
     * Create an instance of {@link AddOrderRows }
     * 
     */
    public AddOrderRows createAddOrderRows() {
        return new AddOrderRows();
    }

    /**
     * Create an instance of {@link AddOrderRowsResponse2 }
     * 
     */
    public AddOrderRowsResponse2 createAddOrderRowsResponse2() {
        return new AddOrderRowsResponse2();
    }

    /**
     * Create an instance of {@link ApproveInvoice }
     * 
     */
    public ApproveInvoice createApproveInvoice() {
        return new ApproveInvoice();
    }

    /**
     * Create an instance of {@link ApproveInvoiceResponse2 }
     * 
     */
    public ApproveInvoiceResponse2 createApproveInvoiceResponse2() {
        return new ApproveInvoiceResponse2();
    }

    /**
     * Create an instance of {@link CancelAccountCreditAmount }
     * 
     */
    public CancelAccountCreditAmount createCancelAccountCreditAmount() {
        return new CancelAccountCreditAmount();
    }

    /**
     * Create an instance of {@link CancelAccountCreditAmountRequest }
     * 
     */
    public CancelAccountCreditAmountRequest createCancelAccountCreditAmountRequest() {
        return new CancelAccountCreditAmountRequest();
    }

    /**
     * Create an instance of {@link CancelAccountCreditAmountResponse }
     * 
     */
    public CancelAccountCreditAmountResponse createCancelAccountCreditAmountResponse() {
        return new CancelAccountCreditAmountResponse();
    }

    /**
     * Create an instance of {@link CancelAccountCreditAmountResponse2 }
     * 
     */
    public CancelAccountCreditAmountResponse2 createCancelAccountCreditAmountResponse2() {
        return new CancelAccountCreditAmountResponse2();
    }

    /**
     * Create an instance of {@link CancelAccountCreditRows }
     * 
     */
    public CancelAccountCreditRows createCancelAccountCreditRows() {
        return new CancelAccountCreditRows();
    }

    /**
     * Create an instance of {@link CancelAccountCreditRowsRequest }
     * 
     */
    public CancelAccountCreditRowsRequest createCancelAccountCreditRowsRequest() {
        return new CancelAccountCreditRowsRequest();
    }

    /**
     * Create an instance of {@link CancelAccountCreditRowsResponse }
     * 
     */
    public CancelAccountCreditRowsResponse createCancelAccountCreditRowsResponse() {
        return new CancelAccountCreditRowsResponse();
    }

    /**
     * Create an instance of {@link CancelAccountCreditRowsResponse2 }
     * 
     */
    public CancelAccountCreditRowsResponse2 createCancelAccountCreditRowsResponse2() {
        return new CancelAccountCreditRowsResponse2();
    }

    /**
     * Create an instance of {@link CancelOrder }
     * 
     */
    public CancelOrder createCancelOrder() {
        return new CancelOrder();
    }

    /**
     * Create an instance of {@link CancelOrderResponse2 }
     * 
     */
    public CancelOrderResponse2 createCancelOrderResponse2() {
        return new CancelOrderResponse2();
    }

    /**
     * Create an instance of {@link CancelOrderRows }
     * 
     */
    public CancelOrderRows createCancelOrderRows() {
        return new CancelOrderRows();
    }

    /**
     * Create an instance of {@link CancelOrderRowsResponse2 }
     * 
     */
    public CancelOrderRowsResponse2 createCancelOrderRowsResponse2() {
        return new CancelOrderRowsResponse2();
    }

    /**
     * Create an instance of {@link CancelPaymentPlanAmount }
     * 
     */
    public CancelPaymentPlanAmount createCancelPaymentPlanAmount() {
        return new CancelPaymentPlanAmount();
    }

    /**
     * Create an instance of {@link CancelPaymentPlanAmountResponse2 }
     * 
     */
    public CancelPaymentPlanAmountResponse2 createCancelPaymentPlanAmountResponse2() {
        return new CancelPaymentPlanAmountResponse2();
    }

    /**
     * Create an instance of {@link CancelPaymentPlanRows }
     * 
     */
    public CancelPaymentPlanRows createCancelPaymentPlanRows() {
        return new CancelPaymentPlanRows();
    }

    /**
     * Create an instance of {@link CancelPaymentPlanRowsResponse2 }
     * 
     */
    public CancelPaymentPlanRowsResponse2 createCancelPaymentPlanRowsResponse2() {
        return new CancelPaymentPlanRowsResponse2();
    }

    /**
     * Create an instance of {@link CreditInvoiceRows }
     * 
     */
    public CreditInvoiceRows createCreditInvoiceRows() {
        return new CreditInvoiceRows();
    }

    /**
     * Create an instance of {@link CreditInvoiceRowsResponse }
     * 
     */
    public CreditInvoiceRowsResponse createCreditInvoiceRowsResponse() {
        return new CreditInvoiceRowsResponse();
    }

    /**
     * Create an instance of {@link DeliverPartial }
     * 
     */
    public DeliverPartial createDeliverPartial() {
        return new DeliverPartial();
    }

    /**
     * Create an instance of {@link DeliverPartialResponse }
     * 
     */
    public DeliverPartialResponse createDeliverPartialResponse() {
        return new DeliverPartialResponse();
    }

    /**
     * Create an instance of {@link ExtendOrder }
     * 
     */
    public ExtendOrder createExtendOrder() {
        return new ExtendOrder();
    }

    /**
     * Create an instance of {@link ExtendOrderResponse }
     * 
     */
    public ExtendOrderResponse createExtendOrderResponse() {
        return new ExtendOrderResponse();
    }

    /**
     * Create an instance of {@link ExtendOrderResponse2 }
     * 
     */
    public ExtendOrderResponse2 createExtendOrderResponse2() {
        return new ExtendOrderResponse2();
    }

    /**
     * Create an instance of {@link GenerateAccountCreditRegressReport }
     * 
     */
    public GenerateAccountCreditRegressReport createGenerateAccountCreditRegressReport() {
        return new GenerateAccountCreditRegressReport();
    }

    /**
     * Create an instance of {@link AccountCreditRegressReportRequest }
     * 
     */
    public AccountCreditRegressReportRequest createAccountCreditRegressReportRequest() {
        return new AccountCreditRegressReportRequest();
    }

    /**
     * Create an instance of {@link GenerateAccountCreditRegressReportResponse }
     * 
     */
    public GenerateAccountCreditRegressReportResponse createGenerateAccountCreditRegressReportResponse() {
        return new GenerateAccountCreditRegressReportResponse();
    }

    /**
     * Create an instance of {@link AccountCreditRegressReportResponse }
     * 
     */
    public AccountCreditRegressReportResponse createAccountCreditRegressReportResponse() {
        return new AccountCreditRegressReportResponse();
    }

    /**
     * Create an instance of {@link GenerateAccountingAgreementType25Report }
     * 
     */
    public GenerateAccountingAgreementType25Report createGenerateAccountingAgreementType25Report() {
        return new GenerateAccountingAgreementType25Report();
    }

    /**
     * Create an instance of {@link AccountingAgreementType25ReportRequest }
     * 
     */
    public AccountingAgreementType25ReportRequest createAccountingAgreementType25ReportRequest() {
        return new AccountingAgreementType25ReportRequest();
    }

    /**
     * Create an instance of {@link GenerateAccountingAgreementType25ReportResponse }
     * 
     */
    public GenerateAccountingAgreementType25ReportResponse createGenerateAccountingAgreementType25ReportResponse() {
        return new GenerateAccountingAgreementType25ReportResponse();
    }

    /**
     * Create an instance of {@link AccountingAgreementType25ReportResponse }
     * 
     */
    public AccountingAgreementType25ReportResponse createAccountingAgreementType25ReportResponse() {
        return new AccountingAgreementType25ReportResponse();
    }

    /**
     * Create an instance of {@link GetAccountingReport }
     * 
     */
    public GetAccountingReport createGetAccountingReport() {
        return new GetAccountingReport();
    }

    /**
     * Create an instance of {@link GetAccountingReportResponse2 }
     * 
     */
    public GetAccountingReportResponse2 createGetAccountingReportResponse2() {
        return new GetAccountingReportResponse2();
    }

    /**
     * Create an instance of {@link GetDebtInvoicesPaidToClientForReport }
     * 
     */
    public GetDebtInvoicesPaidToClientForReport createGetDebtInvoicesPaidToClientForReport() {
        return new GetDebtInvoicesPaidToClientForReport();
    }

    /**
     * Create an instance of {@link GetDebtInvoicesPaidToClientForReportRequest }
     * 
     */
    public GetDebtInvoicesPaidToClientForReportRequest createGetDebtInvoicesPaidToClientForReportRequest() {
        return new GetDebtInvoicesPaidToClientForReportRequest();
    }

    /**
     * Create an instance of {@link GetDebtInvoicesPaidToClientForReportResponse }
     * 
     */
    public GetDebtInvoicesPaidToClientForReportResponse createGetDebtInvoicesPaidToClientForReportResponse() {
        return new GetDebtInvoicesPaidToClientForReportResponse();
    }

    /**
     * Create an instance of {@link GetDebtInvoicesPaidToClientForReportResponse2 }
     * 
     */
    public GetDebtInvoicesPaidToClientForReportResponse2 createGetDebtInvoicesPaidToClientForReportResponse2() {
        return new GetDebtInvoicesPaidToClientForReportResponse2();
    }

    /**
     * Create an instance of {@link GetFinancialReport }
     * 
     */
    public GetFinancialReport createGetFinancialReport() {
        return new GetFinancialReport();
    }

    /**
     * Create an instance of {@link GetFinancialReportResponse2 }
     * 
     */
    public GetFinancialReportResponse2 createGetFinancialReportResponse2() {
        return new GetFinancialReportResponse2();
    }

    /**
     * Create an instance of {@link GetInvoiceJournalReport }
     * 
     */
    public GetInvoiceJournalReport createGetInvoiceJournalReport() {
        return new GetInvoiceJournalReport();
    }

    /**
     * Create an instance of {@link GetInvoiceJournalReportResponse2 }
     * 
     */
    public GetInvoiceJournalReportResponse2 createGetInvoiceJournalReportResponse2() {
        return new GetInvoiceJournalReportResponse2();
    }

    /**
     * Create an instance of {@link GetInvoicePdfLink }
     * 
     */
    public GetInvoicePdfLink createGetInvoicePdfLink() {
        return new GetInvoicePdfLink();
    }

    /**
     * Create an instance of {@link GetInvoicePdfLinkResponse }
     * 
     */
    public GetInvoicePdfLinkResponse createGetInvoicePdfLinkResponse() {
        return new GetInvoicePdfLinkResponse();
    }

    /**
     * Create an instance of {@link GetInvoiceReport }
     * 
     */
    public GetInvoiceReport createGetInvoiceReport() {
        return new GetInvoiceReport();
    }

    /**
     * Create an instance of {@link GetInvoiceReportResponse2 }
     * 
     */
    public GetInvoiceReportResponse2 createGetInvoiceReportResponse2() {
        return new GetInvoiceReportResponse2();
    }

    /**
     * Create an instance of {@link GetInvoicesPaidToClientForReport }
     * 
     */
    public GetInvoicesPaidToClientForReport createGetInvoicesPaidToClientForReport() {
        return new GetInvoicesPaidToClientForReport();
    }

    /**
     * Create an instance of {@link GetInvoicesPaidToClientForReportRequest }
     * 
     */
    public GetInvoicesPaidToClientForReportRequest createGetInvoicesPaidToClientForReportRequest() {
        return new GetInvoicesPaidToClientForReportRequest();
    }

    /**
     * Create an instance of {@link GetInvoicesPaidToClientForReportResponse }
     * 
     */
    public GetInvoicesPaidToClientForReportResponse createGetInvoicesPaidToClientForReportResponse() {
        return new GetInvoicesPaidToClientForReportResponse();
    }

    /**
     * Create an instance of {@link GetInvoicesPaidToClientForReportResponse2 }
     * 
     */
    public GetInvoicesPaidToClientForReportResponse2 createGetInvoicesPaidToClientForReportResponse2() {
        return new GetInvoicesPaidToClientForReportResponse2();
    }

    /**
     * Create an instance of {@link GetInvoicesWithChangedDueDate }
     * 
     */
    public GetInvoicesWithChangedDueDate createGetInvoicesWithChangedDueDate() {
        return new GetInvoicesWithChangedDueDate();
    }

    /**
     * Create an instance of {@link GetInvoicesWithChangedDueDateResponse2 }
     * 
     */
    public GetInvoicesWithChangedDueDateResponse2 createGetInvoicesWithChangedDueDateResponse2() {
        return new GetInvoicesWithChangedDueDateResponse2();
    }

    /**
     * Create an instance of {@link GetKickbackReport }
     * 
     */
    public GetKickbackReport createGetKickbackReport() {
        return new GetKickbackReport();
    }

    /**
     * Create an instance of {@link GetKickbackReportRequest }
     * 
     */
    public GetKickbackReportRequest createGetKickbackReportRequest() {
        return new GetKickbackReportRequest();
    }

    /**
     * Create an instance of {@link GetKickbackReportResponse }
     * 
     */
    public GetKickbackReportResponse createGetKickbackReportResponse() {
        return new GetKickbackReportResponse();
    }

    /**
     * Create an instance of {@link GetKickbackReportResponse2 }
     * 
     */
    public GetKickbackReportResponse2 createGetKickbackReportResponse2() {
        return new GetKickbackReportResponse2();
    }

    /**
     * Create an instance of {@link GetOrderEvents }
     * 
     */
    public GetOrderEvents createGetOrderEvents() {
        return new GetOrderEvents();
    }

    /**
     * Create an instance of {@link GetOrderEventsResponse2 }
     * 
     */
    public GetOrderEventsResponse2 createGetOrderEventsResponse2() {
        return new GetOrderEventsResponse2();
    }

    /**
     * Create an instance of {@link GetOrderPdfLink }
     * 
     */
    public GetOrderPdfLink createGetOrderPdfLink() {
        return new GetOrderPdfLink();
    }

    /**
     * Create an instance of {@link GetOrderPdfLinkResponse }
     * 
     */
    public GetOrderPdfLinkResponse createGetOrderPdfLinkResponse() {
        return new GetOrderPdfLinkResponse();
    }

    /**
     * Create an instance of {@link GetPaymentPlanReport }
     * 
     */
    public GetPaymentPlanReport createGetPaymentPlanReport() {
        return new GetPaymentPlanReport();
    }

    /**
     * Create an instance of {@link GetPaymentPlanReportResponse2 }
     * 
     */
    public GetPaymentPlanReportResponse2 createGetPaymentPlanReportResponse2() {
        return new GetPaymentPlanReportResponse2();
    }

    /**
     * Create an instance of {@link GetPendingReasons }
     * 
     */
    public GetPendingReasons createGetPendingReasons() {
        return new GetPendingReasons();
    }

    /**
     * Create an instance of {@link GetPendingReasonsRequest }
     * 
     */
    public GetPendingReasonsRequest createGetPendingReasonsRequest() {
        return new GetPendingReasonsRequest();
    }

    /**
     * Create an instance of {@link GetPendingReasonsResponse }
     * 
     */
    public GetPendingReasonsResponse createGetPendingReasonsResponse() {
        return new GetPendingReasonsResponse();
    }

    /**
     * Create an instance of {@link GetPendingReasonsResponse2 }
     * 
     */
    public GetPendingReasonsResponse2 createGetPendingReasonsResponse2() {
        return new GetPendingReasonsResponse2();
    }

    /**
     * Create an instance of {@link GetRegressionReport }
     * 
     */
    public GetRegressionReport createGetRegressionReport() {
        return new GetRegressionReport();
    }

    /**
     * Create an instance of {@link GetRegressionReportResponse2 }
     * 
     */
    public GetRegressionReportResponse2 createGetRegressionReportResponse2() {
        return new GetRegressionReportResponse2();
    }

    /**
     * Create an instance of {@link GetSpecificationReport }
     * 
     */
    public GetSpecificationReport createGetSpecificationReport() {
        return new GetSpecificationReport();
    }

    /**
     * Create an instance of {@link GetSpecificationReportRequest }
     * 
     */
    public GetSpecificationReportRequest createGetSpecificationReportRequest() {
        return new GetSpecificationReportRequest();
    }

    /**
     * Create an instance of {@link GetSpecificationReportResponse }
     * 
     */
    public GetSpecificationReportResponse createGetSpecificationReportResponse() {
        return new GetSpecificationReportResponse();
    }

    /**
     * Create an instance of {@link GetSpecificationReportResponse2 }
     * 
     */
    public GetSpecificationReportResponse2 createGetSpecificationReportResponse2() {
        return new GetSpecificationReportResponse2();
    }

    /**
     * Create an instance of {@link ReleasePendingOrder }
     * 
     */
    public ReleasePendingOrder createReleasePendingOrder() {
        return new ReleasePendingOrder();
    }

    /**
     * Create an instance of {@link ReleasePendingOrderResponse }
     * 
     */
    public ReleasePendingOrderResponse createReleasePendingOrderResponse() {
        return new ReleasePendingOrderResponse();
    }

    /**
     * Create an instance of {@link UpdateOrder }
     * 
     */
    public UpdateOrder createUpdateOrder() {
        return new UpdateOrder();
    }

    /**
     * Create an instance of {@link UpdateOrderResponse2 }
     * 
     */
    public UpdateOrderResponse2 createUpdateOrderResponse2() {
        return new UpdateOrderResponse2();
    }

    /**
     * Create an instance of {@link UpdateOrderRows }
     * 
     */
    public UpdateOrderRows createUpdateOrderRows() {
        return new UpdateOrderRows();
    }

    /**
     * Create an instance of {@link UpdateOrderRowsResponse2 }
     * 
     */
    public UpdateOrderRowsResponse2 createUpdateOrderRowsResponse2() {
        return new UpdateOrderRowsResponse2();
    }

    /**
     * Create an instance of {@link GetOrders }
     * 
     */
    public GetOrders createGetOrders() {
        return new GetOrders();
    }

    /**
     * Create an instance of {@link GetOrdersResponse2 }
     * 
     */
    public GetOrdersResponse2 createGetOrdersResponse2() {
        return new GetOrdersResponse2();
    }

    /**
     * Create an instance of {@link DeliverOrders }
     * 
     */
    public DeliverOrders createDeliverOrders() {
        return new DeliverOrders();
    }

    /**
     * Create an instance of {@link DeliverOrdersResponse }
     * 
     */
    public DeliverOrdersResponse createDeliverOrdersResponse() {
        return new DeliverOrdersResponse();
    }

    /**
     * Create an instance of {@link SearchOrders }
     * 
     */
    public SearchOrders createSearchOrders() {
        return new SearchOrders();
    }

    /**
     * Create an instance of {@link SearchOrdersResponse2 }
     * 
     */
    public SearchOrdersResponse2 createSearchOrdersResponse2() {
        return new SearchOrdersResponse2();
    }

    /**
     * Create an instance of {@link SearchInvoices }
     * 
     */
    public SearchInvoices createSearchInvoices() {
        return new SearchInvoices();
    }

    /**
     * Create an instance of {@link SearchInvoicesResponse2 }
     * 
     */
    public SearchInvoicesResponse2 createSearchInvoicesResponse2() {
        return new SearchInvoicesResponse2();
    }

    /**
     * Create an instance of {@link GetInvoices }
     * 
     */
    public GetInvoices createGetInvoices() {
        return new GetInvoices();
    }

    /**
     * Create an instance of {@link GetInvoicesResponse2 }
     * 
     */
    public GetInvoicesResponse2 createGetInvoicesResponse2() {
        return new GetInvoicesResponse2();
    }

    /**
     * Create an instance of {@link SearchPaymentPlans }
     * 
     */
    public SearchPaymentPlans createSearchPaymentPlans() {
        return new SearchPaymentPlans();
    }

    /**
     * Create an instance of {@link SearchPaymentPlansResponse2 }
     * 
     */
    public SearchPaymentPlansResponse2 createSearchPaymentPlansResponse2() {
        return new SearchPaymentPlansResponse2();
    }

    /**
     * Create an instance of {@link GetSumOfOrderAmount }
     * 
     */
    public GetSumOfOrderAmount createGetSumOfOrderAmount() {
        return new GetSumOfOrderAmount();
    }

    /**
     * Create an instance of {@link GetSumOfOrderAmountResponse }
     * 
     */
    public GetSumOfOrderAmountResponse createGetSumOfOrderAmountResponse() {
        return new GetSumOfOrderAmountResponse();
    }

    /**
     * Create an instance of {@link GetSumOfInvoiceAmount }
     * 
     */
    public GetSumOfInvoiceAmount createGetSumOfInvoiceAmount() {
        return new GetSumOfInvoiceAmount();
    }

    /**
     * Create an instance of {@link GetSumOfInvoiceAmountResponse }
     * 
     */
    public GetSumOfInvoiceAmountResponse createGetSumOfInvoiceAmountResponse() {
        return new GetSumOfInvoiceAmountResponse();
    }

    /**
     * Create an instance of {@link GetSumOfPaymentPlanAmount }
     * 
     */
    public GetSumOfPaymentPlanAmount createGetSumOfPaymentPlanAmount() {
        return new GetSumOfPaymentPlanAmount();
    }

    /**
     * Create an instance of {@link GetSumOfPaymentPlanAmountResponse }
     * 
     */
    public GetSumOfPaymentPlanAmountResponse createGetSumOfPaymentPlanAmountResponse() {
        return new GetSumOfPaymentPlanAmountResponse();
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link CreateOrderResponse2 }
     * 
     */
    public CreateOrderResponse2 createCreateOrderResponse2() {
        return new CreateOrderResponse2();
    }

    /**
     * Create an instance of {@link ChangeInvoiceDueDate }
     * 
     */
    public ChangeInvoiceDueDate createChangeInvoiceDueDate() {
        return new ChangeInvoiceDueDate();
    }

    /**
     * Create an instance of {@link ChangeInvoiceDueDateResponse2 }
     * 
     */
    public ChangeInvoiceDueDateResponse2 createChangeInvoiceDueDateResponse2() {
        return new ChangeInvoiceDueDateResponse2();
    }

    /**
     * Create an instance of {@link CreateApprovedOrder }
     * 
     */
    public CreateApprovedOrder createCreateApprovedOrder() {
        return new CreateApprovedOrder();
    }

    /**
     * Create an instance of {@link CreateApprovedOrderResponse2 }
     * 
     */
    public CreateApprovedOrderResponse2 createCreateApprovedOrderResponse2() {
        return new CreateApprovedOrderResponse2();
    }

    /**
     * Create an instance of {@link SearchAccountCredits }
     * 
     */
    public SearchAccountCredits createSearchAccountCredits() {
        return new SearchAccountCredits();
    }

    /**
     * Create an instance of {@link SearchAccountCreditsResponse }
     * 
     */
    public SearchAccountCreditsResponse createSearchAccountCreditsResponse() {
        return new SearchAccountCreditsResponse();
    }

    /**
     * Create an instance of {@link SearchAccountCreditsResponse2 }
     * 
     */
    public SearchAccountCreditsResponse2 createSearchAccountCreditsResponse2() {
        return new SearchAccountCreditsResponse2();
    }

    /**
     * Create an instance of {@link GetAccountCredits }
     * 
     */
    public GetAccountCredits createGetAccountCredits() {
        return new GetAccountCredits();
    }

    /**
     * Create an instance of {@link GetAccountCreditsResponse }
     * 
     */
    public GetAccountCreditsResponse createGetAccountCreditsResponse() {
        return new GetAccountCreditsResponse();
    }

    /**
     * Create an instance of {@link GetAccountCreditsResponse2 }
     * 
     */
    public GetAccountCreditsResponse2 createGetAccountCreditsResponse2() {
        return new GetAccountCreditsResponse2();
    }

    /**
     * Create an instance of {@link GetClientId }
     * 
     */
    public GetClientId createGetClientId() {
        return new GetClientId();
    }

    /**
     * Create an instance of {@link GetClientIdRequest }
     * 
     */
    public GetClientIdRequest createGetClientIdRequest() {
        return new GetClientIdRequest();
    }

    /**
     * Create an instance of {@link GetClientIdResponse }
     * 
     */
    public GetClientIdResponse createGetClientIdResponse() {
        return new GetClientIdResponse();
    }

    /**
     * Create an instance of {@link GetClientIdResponse2 }
     * 
     */
    public GetClientIdResponse2 createGetClientIdResponse2() {
        return new GetClientIdResponse2();
    }

    /**
     * Create an instance of {@link CreateOrderInformation }
     * 
     */
    public CreateOrderInformation createCreateOrderInformation() {
        return new CreateOrderInformation();
    }

    /**
     * Create an instance of {@link CreateAccountCreditDetails }
     * 
     */
    public CreateAccountCreditDetails createCreateAccountCreditDetails() {
        return new CreateAccountCreditDetails();
    }

    /**
     * Create an instance of {@link CreatePaymentPlanDetails }
     * 
     */
    public CreatePaymentPlanDetails createCreatePaymentPlanDetails() {
        return new CreatePaymentPlanDetails();
    }

    /**
     * Create an instance of {@link CreateOrderResult }
     * 
     */
    public CreateOrderResult createCreateOrderResult() {
        return new CreateOrderResult();
    }

    /**
     * Create an instance of {@link ArrayOfOrderRow }
     * 
     */
    public ArrayOfOrderRow createArrayOfOrderRow() {
        return new ArrayOfOrderRow();
    }

    /**
     * Create an instance of {@link OrderRow }
     * 
     */
    public OrderRow createOrderRow() {
        return new OrderRow();
    }

    /**
     * Create an instance of {@link ArrayOfOrderRowReferenceItem }
     * 
     */
    public ArrayOfOrderRowReferenceItem createArrayOfOrderRowReferenceItem() {
        return new ArrayOfOrderRowReferenceItem();
    }

    /**
     * Create an instance of {@link OrderRowReferenceItem }
     * 
     */
    public OrderRowReferenceItem createOrderRowReferenceItem() {
        return new OrderRowReferenceItem();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link CustomerIdentity }
     * 
     */
    public CustomerIdentity createCustomerIdentity() {
        return new CustomerIdentity();
    }

    /**
     * Create an instance of {@link CompanyIdentity }
     * 
     */
    public CompanyIdentity createCompanyIdentity() {
        return new CompanyIdentity();
    }

    /**
     * Create an instance of {@link IndividualIdentity }
     * 
     */
    public IndividualIdentity createIndividualIdentity() {
        return new IndividualIdentity();
    }

    /**
     * Create an instance of {@link ArrayOfOrderStatus }
     * 
     */
    public ArrayOfOrderStatus createArrayOfOrderStatus() {
        return new ArrayOfOrderStatus();
    }

    /**
     * Create an instance of {@link ArrayOfInvoicePaidToClientRow }
     * 
     */
    public ArrayOfInvoicePaidToClientRow createArrayOfInvoicePaidToClientRow() {
        return new ArrayOfInvoicePaidToClientRow();
    }

    /**
     * Create an instance of {@link InvoicePaidToClientRow }
     * 
     */
    public InvoicePaidToClientRow createInvoicePaidToClientRow() {
        return new InvoicePaidToClientRow();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.Order", name = "TextMatchType")
    public JAXBElement<TextMatchType> createSearchOrder(TextMatchType value) {
        return new JAXBElement<TextMatchType>(_SearchOrder_QNAME, TextMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderRowsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "AddOrderRowsRequest")
    public JAXBElement<AddOrderRowsRequest> createAddOrderRowsRequest(AddOrderRowsRequest value) {
        return new JAXBElement<AddOrderRowsRequest>(_AddOrderRowsRequest_QNAME, AddOrderRowsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "BasicRequest")
    public JAXBElement<BasicRequest> createBasicRequest(BasicRequest value) {
        return new JAXBElement<BasicRequest>(_BasicRequest_QNAME, BasicRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "Authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfSetting")
    public JAXBElement<ArrayOfSetting> createArrayOfSetting(ArrayOfSetting value) {
        return new JAXBElement<ArrayOfSetting>(_ArrayOfSetting_QNAME, ArrayOfSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Setting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "Setting")
    public JAXBElement<Setting> createSetting(Setting value) {
        return new JAXBElement<Setting>(_Setting_QNAME, Setting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderRowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "AddOrderRowsResponse")
    public JAXBElement<AddOrderRowsResponse> createAddOrderRowsResponse(AddOrderRowsResponse value) {
        return new JAXBElement<AddOrderRowsResponse>(_AddOrderRowsResponse_QNAME, AddOrderRowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "BasicResponse")
    public JAXBElement<BasicResponse> createBasicResponse(BasicResponse value) {
        return new JAXBElement<BasicResponse>(_BasicResponse_QNAME, BasicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveInvoiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ApproveInvoiceRequest")
    public JAXBElement<ApproveInvoiceRequest> createApproveInvoiceRequest(ApproveInvoiceRequest value) {
        return new JAXBElement<ApproveInvoiceRequest>(_ApproveInvoiceRequest_QNAME, ApproveInvoiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveInvoiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ApproveInvoiceResponse")
    public JAXBElement<ApproveInvoiceResponse> createApproveInvoiceResponse(ApproveInvoiceResponse value) {
        return new JAXBElement<ApproveInvoiceResponse>(_ApproveInvoiceResponse_QNAME, ApproveInvoiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCancellationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfCancellationRow")
    public JAXBElement<ArrayOfCancellationRow> createArrayOfCancellationRow(ArrayOfCancellationRow value) {
        return new JAXBElement<ArrayOfCancellationRow>(_ArrayOfCancellationRow_QNAME, ArrayOfCancellationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CancellationRow")
    public JAXBElement<CancellationRow> createCancellationRow(CancellationRow value) {
        return new JAXBElement<CancellationRow>(_CancellationRow_QNAME, CancellationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CancelOrderRequest")
    public JAXBElement<CancelOrderRequest> createCancelOrderRequest(CancelOrderRequest value) {
        return new JAXBElement<CancelOrderRequest>(_CancelOrderRequest_QNAME, CancelOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CancelOrderResponse")
    public JAXBElement<CancelOrderResponse> createCancelOrderResponse(CancelOrderResponse value) {
        return new JAXBElement<CancelOrderResponse>(_CancelOrderResponse_QNAME, CancelOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelOrderRowsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CancelOrderRowsRequest")
    public JAXBElement<CancelOrderRowsRequest> createCancelOrderRowsRequest(CancelOrderRowsRequest value) {
        return new JAXBElement<CancelOrderRowsRequest>(_CancelOrderRowsRequest_QNAME, CancelOrderRowsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelOrderRowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CancelOrderRowsResponse")
    public JAXBElement<CancelOrderRowsResponse> createCancelOrderRowsResponse(CancelOrderRowsResponse value) {
        return new JAXBElement<CancelOrderRowsResponse>(_CancelOrderRowsResponse_QNAME, CancelOrderRowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPaymentPlanAmountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CancelPaymentPlanAmountRequest")
    public JAXBElement<CancelPaymentPlanAmountRequest> createCancelPaymentPlanAmountRequest(CancelPaymentPlanAmountRequest value) {
        return new JAXBElement<CancelPaymentPlanAmountRequest>(_CancelPaymentPlanAmountRequest_QNAME, CancelPaymentPlanAmountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPaymentPlanAmountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CancelPaymentPlanAmountResponse")
    public JAXBElement<CancelPaymentPlanAmountResponse> createCancelPaymentPlanAmountResponse(CancelPaymentPlanAmountResponse value) {
        return new JAXBElement<CancelPaymentPlanAmountResponse>(_CancelPaymentPlanAmountResponse_QNAME, CancelPaymentPlanAmountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPaymentPlanRowsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CancelPaymentPlanRowsRequest")
    public JAXBElement<CancelPaymentPlanRowsRequest> createCancelPaymentPlanRowsRequest(CancelPaymentPlanRowsRequest value) {
        return new JAXBElement<CancelPaymentPlanRowsRequest>(_CancelPaymentPlanRowsRequest_QNAME, CancelPaymentPlanRowsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPaymentPlanRowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CancelPaymentPlanRowsResponse")
    public JAXBElement<CancelPaymentPlanRowsResponse> createCancelPaymentPlanRowsResponse(CancelPaymentPlanRowsResponse value) {
        return new JAXBElement<CancelPaymentPlanRowsResponse>(_CancelPaymentPlanRowsResponse_QNAME, CancelPaymentPlanRowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditInvoiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CreditInvoiceRequest")
    public JAXBElement<CreditInvoiceRequest> createCreditInvoiceRequest(CreditInvoiceRequest value) {
        return new JAXBElement<CreditInvoiceRequest>(_CreditInvoiceRequest_QNAME, CreditInvoiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRowCreditingOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfRowCreditingOption")
    public JAXBElement<ArrayOfRowCreditingOption> createArrayOfRowCreditingOption(ArrayOfRowCreditingOption value) {
        return new JAXBElement<ArrayOfRowCreditingOption>(_ArrayOfRowCreditingOption_QNAME, ArrayOfRowCreditingOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RowCreditingOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "RowCreditingOption")
    public JAXBElement<RowCreditingOption> createRowCreditingOption(RowCreditingOption value) {
        return new JAXBElement<RowCreditingOption>(_RowCreditingOption_QNAME, RowCreditingOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "DeliveryResponse")
    public JAXBElement<DeliveryResponse> createDeliveryResponse(DeliveryResponse value) {
        return new JAXBElement<DeliveryResponse>(_DeliveryResponse_QNAME, DeliveryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeliverOrderResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfDeliverOrderResult")
    public JAXBElement<ArrayOfDeliverOrderResult> createArrayOfDeliverOrderResult(ArrayOfDeliverOrderResult value) {
        return new JAXBElement<ArrayOfDeliverOrderResult>(_ArrayOfDeliverOrderResult_QNAME, ArrayOfDeliverOrderResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliverOrderResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "DeliverOrderResult")
    public JAXBElement<DeliverOrderResult> createDeliverOrderResult(DeliverOrderResult value) {
        return new JAXBElement<DeliverOrderResult>(_DeliverOrderResult_QNAME, DeliverOrderResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartialDeliveryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "PartialDeliveryRequest")
    public JAXBElement<PartialDeliveryRequest> createPartialDeliveryRequest(PartialDeliveryRequest value) {
        return new JAXBElement<PartialDeliveryRequest>(_PartialDeliveryRequest_QNAME, PartialDeliveryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliverOrderInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "DeliverOrderInformation")
    public JAXBElement<DeliverOrderInformation> createDeliverOrderInformation(DeliverOrderInformation value) {
        return new JAXBElement<DeliverOrderInformation>(_DeliverOrderInformation_QNAME, DeliverOrderInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRowDeliveryOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfRowDeliveryOption")
    public JAXBElement<ArrayOfRowDeliveryOption> createArrayOfRowDeliveryOption(ArrayOfRowDeliveryOption value) {
        return new JAXBElement<ArrayOfRowDeliveryOption>(_ArrayOfRowDeliveryOption_QNAME, ArrayOfRowDeliveryOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RowDeliveryOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "RowDeliveryOption")
    public JAXBElement<RowDeliveryOption> createRowDeliveryOption(RowDeliveryOption value) {
        return new JAXBElement<RowDeliveryOption>(_RowDeliveryOption_QNAME, RowDeliveryOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ExtendOrderRequest")
    public JAXBElement<ExtendOrderRequest> createExtendOrderRequest(ExtendOrderRequest value) {
        return new JAXBElement<ExtendOrderRequest>(_ExtendOrderRequest_QNAME, ExtendOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountCreditRegressReportDataRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfAccountCreditRegressReportDataRow")
    public JAXBElement<ArrayOfAccountCreditRegressReportDataRow> createArrayOfAccountCreditRegressReportDataRow(ArrayOfAccountCreditRegressReportDataRow value) {
        return new JAXBElement<ArrayOfAccountCreditRegressReportDataRow>(_ArrayOfAccountCreditRegressReportDataRow_QNAME, ArrayOfAccountCreditRegressReportDataRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountCreditRegressReportDataRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "AccountCreditRegressReportDataRow")
    public JAXBElement<AccountCreditRegressReportDataRow> createAccountCreditRegressReportDataRow(AccountCreditRegressReportDataRow value) {
        return new JAXBElement<AccountCreditRegressReportDataRow>(_AccountCreditRegressReportDataRow_QNAME, AccountCreditRegressReportDataRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountingAgreementType25ReportDataRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfAccountingAgreementType25ReportDataRow")
    public JAXBElement<ArrayOfAccountingAgreementType25ReportDataRow> createArrayOfAccountingAgreementType25ReportDataRow(ArrayOfAccountingAgreementType25ReportDataRow value) {
        return new JAXBElement<ArrayOfAccountingAgreementType25ReportDataRow>(_ArrayOfAccountingAgreementType25ReportDataRow_QNAME, ArrayOfAccountingAgreementType25ReportDataRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingAgreementType25ReportDataRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "AccountingAgreementType25ReportDataRow")
    public JAXBElement<AccountingAgreementType25ReportDataRow> createAccountingAgreementType25ReportDataRow(AccountingAgreementType25ReportDataRow value) {
        return new JAXBElement<AccountingAgreementType25ReportDataRow>(_AccountingAgreementType25ReportDataRow_QNAME, AccountingAgreementType25ReportDataRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountingAgreementType25Summation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfAccountingAgreementType25Summation")
    public JAXBElement<ArrayOfAccountingAgreementType25Summation> createArrayOfAccountingAgreementType25Summation(ArrayOfAccountingAgreementType25Summation value) {
        return new JAXBElement<ArrayOfAccountingAgreementType25Summation>(_ArrayOfAccountingAgreementType25Summation_QNAME, ArrayOfAccountingAgreementType25Summation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingAgreementType25Summation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "AccountingAgreementType25Summation")
    public JAXBElement<AccountingAgreementType25Summation> createAccountingAgreementType25Summation(AccountingAgreementType25Summation value) {
        return new JAXBElement<AccountingAgreementType25Summation>(_AccountingAgreementType25Summation_QNAME, AccountingAgreementType25Summation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountingReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetAccountingReportRequest")
    public JAXBElement<GetAccountingReportRequest> createGetAccountingReportRequest(GetAccountingReportRequest value) {
        return new JAXBElement<GetAccountingReportRequest>(_GetAccountingReportRequest_QNAME, GetAccountingReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountingReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetAccountingReportResponse")
    public JAXBElement<GetAccountingReportResponse> createGetAccountingReportResponse(GetAccountingReportResponse value) {
        return new JAXBElement<GetAccountingReportResponse>(_GetAccountingReportResponse_QNAME, GetAccountingReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountingReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfAccountingReportRow")
    public JAXBElement<ArrayOfAccountingReportRow> createArrayOfAccountingReportRow(ArrayOfAccountingReportRow value) {
        return new JAXBElement<ArrayOfAccountingReportRow>(_ArrayOfAccountingReportRow_QNAME, ArrayOfAccountingReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "AccountingReportRow")
    public JAXBElement<AccountingReportRow> createAccountingReportRow(AccountingReportRow value) {
        return new JAXBElement<AccountingReportRow>(_AccountingReportRow_QNAME, AccountingReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFinancialReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetFinancialReportRequest")
    public JAXBElement<GetFinancialReportRequest> createGetFinancialReportRequest(GetFinancialReportRequest value) {
        return new JAXBElement<GetFinancialReportRequest>(_GetFinancialReportRequest_QNAME, GetFinancialReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFinancialReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetFinancialReportResponse")
    public JAXBElement<GetFinancialReportResponse> createGetFinancialReportResponse(GetFinancialReportResponse value) {
        return new JAXBElement<GetFinancialReportResponse>(_GetFinancialReportResponse_QNAME, GetFinancialReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialReportHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "FinancialReportHeader")
    public JAXBElement<FinancialReportHeader> createFinancialReportHeader(FinancialReportHeader value) {
        return new JAXBElement<FinancialReportHeader>(_FinancialReportHeader_QNAME, FinancialReportHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFinancialReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfFinancialReportRow")
    public JAXBElement<ArrayOfFinancialReportRow> createArrayOfFinancialReportRow(ArrayOfFinancialReportRow value) {
        return new JAXBElement<ArrayOfFinancialReportRow>(_ArrayOfFinancialReportRow_QNAME, ArrayOfFinancialReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "FinancialReportRow")
    public JAXBElement<FinancialReportRow> createFinancialReportRow(FinancialReportRow value) {
        return new JAXBElement<FinancialReportRow>(_FinancialReportRow_QNAME, FinancialReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceJournalReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetInvoiceJournalReportRequest")
    public JAXBElement<GetInvoiceJournalReportRequest> createGetInvoiceJournalReportRequest(GetInvoiceJournalReportRequest value) {
        return new JAXBElement<GetInvoiceJournalReportRequest>(_GetInvoiceJournalReportRequest_QNAME, GetInvoiceJournalReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceJournalReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetInvoiceJournalReportResponse")
    public JAXBElement<GetInvoiceJournalReportResponse> createGetInvoiceJournalReportResponse(GetInvoiceJournalReportResponse value) {
        return new JAXBElement<GetInvoiceJournalReportResponse>(_GetInvoiceJournalReportResponse_QNAME, GetInvoiceJournalReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoiceJournalReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfInvoiceJournalReportRow")
    public JAXBElement<ArrayOfInvoiceJournalReportRow> createArrayOfInvoiceJournalReportRow(ArrayOfInvoiceJournalReportRow value) {
        return new JAXBElement<ArrayOfInvoiceJournalReportRow>(_ArrayOfInvoiceJournalReportRow_QNAME, ArrayOfInvoiceJournalReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceJournalReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "InvoiceJournalReportRow")
    public JAXBElement<InvoiceJournalReportRow> createInvoiceJournalReportRow(InvoiceJournalReportRow value) {
        return new JAXBElement<InvoiceJournalReportRow>(_InvoiceJournalReportRow_QNAME, InvoiceJournalReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoicePdfLinkRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetInvoicePdfLinkRequest")
    public JAXBElement<GetInvoicePdfLinkRequest> createGetInvoicePdfLinkRequest(GetInvoicePdfLinkRequest value) {
        return new JAXBElement<GetInvoicePdfLinkRequest>(_GetInvoicePdfLinkRequest_QNAME, GetInvoicePdfLinkRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PdfLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "PdfLinkResponse")
    public JAXBElement<PdfLinkResponse> createPdfLinkResponse(PdfLinkResponse value) {
        return new JAXBElement<PdfLinkResponse>(_PdfLinkResponse_QNAME, PdfLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetInvoiceReportRequest")
    public JAXBElement<GetInvoiceReportRequest> createGetInvoiceReportRequest(GetInvoiceReportRequest value) {
        return new JAXBElement<GetInvoiceReportRequest>(_GetInvoiceReportRequest_QNAME, GetInvoiceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetInvoiceReportResponse")
    public JAXBElement<GetInvoiceReportResponse> createGetInvoiceReportResponse(GetInvoiceReportResponse value) {
        return new JAXBElement<GetInvoiceReportResponse>(_GetInvoiceReportResponse_QNAME, GetInvoiceReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoiceReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfInvoiceReportRow")
    public JAXBElement<ArrayOfInvoiceReportRow> createArrayOfInvoiceReportRow(ArrayOfInvoiceReportRow value) {
        return new JAXBElement<ArrayOfInvoiceReportRow>(_ArrayOfInvoiceReportRow_QNAME, ArrayOfInvoiceReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "InvoiceReportRow")
    public JAXBElement<InvoiceReportRow> createInvoiceReportRow(InvoiceReportRow value) {
        return new JAXBElement<InvoiceReportRow>(_InvoiceReportRow_QNAME, InvoiceReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoicesWithChangedDueDateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetInvoicesWithChangedDueDateRequest")
    public JAXBElement<GetInvoicesWithChangedDueDateRequest> createGetInvoicesWithChangedDueDateRequest(GetInvoicesWithChangedDueDateRequest value) {
        return new JAXBElement<GetInvoicesWithChangedDueDateRequest>(_GetInvoicesWithChangedDueDateRequest_QNAME, GetInvoicesWithChangedDueDateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoicesWithChangedDueDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetInvoicesWithChangedDueDateResponse")
    public JAXBElement<GetInvoicesWithChangedDueDateResponse> createGetInvoicesWithChangedDueDateResponse(GetInvoicesWithChangedDueDateResponse value) {
        return new JAXBElement<GetInvoicesWithChangedDueDateResponse>(_GetInvoicesWithChangedDueDateResponse_QNAME, GetInvoicesWithChangedDueDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoiceWithChangedDueDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfInvoiceWithChangedDueDate")
    public JAXBElement<ArrayOfInvoiceWithChangedDueDate> createArrayOfInvoiceWithChangedDueDate(ArrayOfInvoiceWithChangedDueDate value) {
        return new JAXBElement<ArrayOfInvoiceWithChangedDueDate>(_ArrayOfInvoiceWithChangedDueDate_QNAME, ArrayOfInvoiceWithChangedDueDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceWithChangedDueDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "InvoiceWithChangedDueDate")
    public JAXBElement<InvoiceWithChangedDueDate> createInvoiceWithChangedDueDate(InvoiceWithChangedDueDate value) {
        return new JAXBElement<InvoiceWithChangedDueDate>(_InvoiceWithChangedDueDate_QNAME, InvoiceWithChangedDueDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKickbackReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfKickbackReportRow")
    public JAXBElement<ArrayOfKickbackReportRow> createArrayOfKickbackReportRow(ArrayOfKickbackReportRow value) {
        return new JAXBElement<ArrayOfKickbackReportRow>(_ArrayOfKickbackReportRow_QNAME, ArrayOfKickbackReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KickbackReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "KickbackReportRow")
    public JAXBElement<KickbackReportRow> createKickbackReportRow(KickbackReportRow value) {
        return new JAXBElement<KickbackReportRow>(_KickbackReportRow_QNAME, KickbackReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderEventsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetOrderEventsRequest")
    public JAXBElement<GetOrderEventsRequest> createGetOrderEventsRequest(GetOrderEventsRequest value) {
        return new JAXBElement<GetOrderEventsRequest>(_GetOrderEventsRequest_QNAME, GetOrderEventsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "OrderEventType")
    public JAXBElement<OrderEventType> createOrderEventType(OrderEventType value) {
        return new JAXBElement<OrderEventType>(_OrderEventType_QNAME, OrderEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetOrderEventsResponse")
    public JAXBElement<GetOrderEventsResponse> createGetOrderEventsResponse(GetOrderEventsResponse value) {
        return new JAXBElement<GetOrderEventsResponse>(_GetOrderEventsResponse_QNAME, GetOrderEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfOrderEvent")
    public JAXBElement<ArrayOfOrderEvent> createArrayOfOrderEvent(ArrayOfOrderEvent value) {
        return new JAXBElement<ArrayOfOrderEvent>(_ArrayOfOrderEvent_QNAME, ArrayOfOrderEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "OrderEvent")
    public JAXBElement<OrderEvent> createOrderEvent(OrderEvent value) {
        return new JAXBElement<OrderEvent>(_OrderEvent_QNAME, OrderEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PendingEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "PendingEvent")
    public JAXBElement<PendingEvent> createPendingEvent(PendingEvent value) {
        return new JAXBElement<PendingEvent>(_PendingEvent_QNAME, PendingEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderPdfLinkRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetOrderPdfLinkRequest")
    public JAXBElement<GetOrderPdfLinkRequest> createGetOrderPdfLinkRequest(GetOrderPdfLinkRequest value) {
        return new JAXBElement<GetOrderPdfLinkRequest>(_GetOrderPdfLinkRequest_QNAME, GetOrderPdfLinkRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentPlanReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetPaymentPlanReportRequest")
    public JAXBElement<GetPaymentPlanReportRequest> createGetPaymentPlanReportRequest(GetPaymentPlanReportRequest value) {
        return new JAXBElement<GetPaymentPlanReportRequest>(_GetPaymentPlanReportRequest_QNAME, GetPaymentPlanReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentPlanReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetPaymentPlanReportResponse")
    public JAXBElement<GetPaymentPlanReportResponse> createGetPaymentPlanReportResponse(GetPaymentPlanReportResponse value) {
        return new JAXBElement<GetPaymentPlanReportResponse>(_GetPaymentPlanReportResponse_QNAME, GetPaymentPlanReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentPlanReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfPaymentPlanReportRow")
    public JAXBElement<ArrayOfPaymentPlanReportRow> createArrayOfPaymentPlanReportRow(ArrayOfPaymentPlanReportRow value) {
        return new JAXBElement<ArrayOfPaymentPlanReportRow>(_ArrayOfPaymentPlanReportRow_QNAME, ArrayOfPaymentPlanReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentPlanReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "PaymentPlanReportRow")
    public JAXBElement<PaymentPlanReportRow> createPaymentPlanReportRow(PaymentPlanReportRow value) {
        return new JAXBElement<PaymentPlanReportRow>(_PaymentPlanReportRow_QNAME, PaymentPlanReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPendingReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfPendingReason")
    public JAXBElement<ArrayOfPendingReason> createArrayOfPendingReason(ArrayOfPendingReason value) {
        return new JAXBElement<ArrayOfPendingReason>(_ArrayOfPendingReason_QNAME, ArrayOfPendingReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PendingReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "PendingReason")
    public JAXBElement<PendingReason> createPendingReason(PendingReason value) {
        return new JAXBElement<PendingReason>(_PendingReason_QNAME, PendingReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegressionReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetRegressionReportRequest")
    public JAXBElement<GetRegressionReportRequest> createGetRegressionReportRequest(GetRegressionReportRequest value) {
        return new JAXBElement<GetRegressionReportRequest>(_GetRegressionReportRequest_QNAME, GetRegressionReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegressionReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetRegressionReportResponse")
    public JAXBElement<GetRegressionReportResponse> createGetRegressionReportResponse(GetRegressionReportResponse value) {
        return new JAXBElement<GetRegressionReportResponse>(_GetRegressionReportResponse_QNAME, GetRegressionReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegressionReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfRegressionReportRow")
    public JAXBElement<ArrayOfRegressionReportRow> createArrayOfRegressionReportRow(ArrayOfRegressionReportRow value) {
        return new JAXBElement<ArrayOfRegressionReportRow>(_ArrayOfRegressionReportRow_QNAME, ArrayOfRegressionReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegressionReportRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "RegressionReportRow")
    public JAXBElement<RegressionReportRow> createRegressionReportRow(RegressionReportRow value) {
        return new JAXBElement<RegressionReportRow>(_RegressionReportRow_QNAME, RegressionReportRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificationReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SpecificationReportType")
    public JAXBElement<SpecificationReportType> createSpecificationReportType(SpecificationReportType value) {
        return new JAXBElement<SpecificationReportType>(_SpecificationReportType_QNAME, SpecificationReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfSpecificationRow")
    public JAXBElement<ArrayOfSpecificationRow> createArrayOfSpecificationRow(ArrayOfSpecificationRow value) {
        return new JAXBElement<ArrayOfSpecificationRow>(_ArrayOfSpecificationRow_QNAME, ArrayOfSpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificationRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SpecificationRow")
    public JAXBElement<SpecificationRow> createSpecificationRow(SpecificationRow value) {
        return new JAXBElement<SpecificationRow>(_SpecificationRow_QNAME, SpecificationRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificationSummation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SpecificationSummation")
    public JAXBElement<SpecificationSummation> createSpecificationSummation(SpecificationSummation value) {
        return new JAXBElement<SpecificationSummation>(_SpecificationSummation_QNAME, SpecificationSummation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleasePendingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ReleasePendingRequest")
    public JAXBElement<ReleasePendingRequest> createReleasePendingRequest(ReleasePendingRequest value) {
        return new JAXBElement<ReleasePendingRequest>(_ReleasePendingRequest_QNAME, ReleasePendingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleasePendingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ReleasePendingResponse")
    public JAXBElement<ReleasePendingResponse> createReleasePendingResponse(ReleasePendingResponse value) {
        return new JAXBElement<ReleasePendingResponse>(_ReleasePendingResponse_QNAME, ReleasePendingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "UpdateOrderRequest")
    public JAXBElement<UpdateOrderRequest> createUpdateOrderRequest(UpdateOrderRequest value) {
        return new JAXBElement<UpdateOrderRequest>(_UpdateOrderRequest_QNAME, UpdateOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "UpdateOrderResponse")
    public JAXBElement<UpdateOrderResponse> createUpdateOrderResponse(UpdateOrderResponse value) {
        return new JAXBElement<UpdateOrderResponse>(_UpdateOrderResponse_QNAME, UpdateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderRowsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "UpdateOrderRowsRequest")
    public JAXBElement<UpdateOrderRowsRequest> createUpdateOrderRowsRequest(UpdateOrderRowsRequest value) {
        return new JAXBElement<UpdateOrderRowsRequest>(_UpdateOrderRowsRequest_QNAME, UpdateOrderRowsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumberedOrderRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfNumberedOrderRow")
    public JAXBElement<ArrayOfNumberedOrderRow> createArrayOfNumberedOrderRow(ArrayOfNumberedOrderRow value) {
        return new JAXBElement<ArrayOfNumberedOrderRow>(_ArrayOfNumberedOrderRow_QNAME, ArrayOfNumberedOrderRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberedOrderRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "NumberedOrderRow")
    public JAXBElement<NumberedOrderRow> createNumberedOrderRow(NumberedOrderRow value) {
        return new JAXBElement<NumberedOrderRow>(_NumberedOrderRow_QNAME, NumberedOrderRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderRowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "UpdateOrderRowsResponse")
    public JAXBElement<UpdateOrderRowsResponse> createUpdateOrderRowsResponse(UpdateOrderRowsResponse value) {
        return new JAXBElement<UpdateOrderRowsResponse>(_UpdateOrderRowsResponse_QNAME, UpdateOrderRowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetOrdersRequest")
    public JAXBElement<GetOrdersRequest> createGetOrdersRequest(GetOrdersRequest value) {
        return new JAXBElement<GetOrdersRequest>(_GetOrdersRequest_QNAME, GetOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetOrderInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfGetOrderInformation")
    public JAXBElement<ArrayOfGetOrderInformation> createArrayOfGetOrderInformation(ArrayOfGetOrderInformation value) {
        return new JAXBElement<ArrayOfGetOrderInformation>(_ArrayOfGetOrderInformation_QNAME, ArrayOfGetOrderInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetOrderInformation")
    public JAXBElement<GetOrderInformation> createGetOrderInformation(GetOrderInformation value) {
        return new JAXBElement<GetOrderInformation>(_GetOrderInformation_QNAME, GetOrderInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetOrdersResponse")
    public JAXBElement<GetOrdersResponse> createGetOrdersResponse(GetOrdersResponse value) {
        return new JAXBElement<GetOrdersResponse>(_GetOrdersResponse_QNAME, GetOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfOrder")
    public JAXBElement<ArrayOfOrder> createArrayOfOrder(ArrayOfOrder value) {
        return new JAXBElement<ArrayOfOrder>(_ArrayOfOrder_QNAME, ArrayOfOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "Order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditReportStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CreditReportStatus")
    public JAXBElement<CreditReportStatus> createCreditReportStatus(CreditReportStatus value) {
        return new JAXBElement<CreditReportStatus>(_CreditReportStatus_QNAME, CreditReportStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentPlanDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "PaymentPlanDetails")
    public JAXBElement<PaymentPlanDetails> createPaymentPlanDetails(PaymentPlanDetails value) {
        return new JAXBElement<PaymentPlanDetails>(_PaymentPlanDetails_QNAME, PaymentPlanDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "DeliveryRequest")
    public JAXBElement<DeliveryRequest> createDeliveryRequest(DeliveryRequest value) {
        return new JAXBElement<DeliveryRequest>(_DeliveryRequest_QNAME, DeliveryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeliverOrderInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfDeliverOrderInformation")
    public JAXBElement<ArrayOfDeliverOrderInformation> createArrayOfDeliverOrderInformation(ArrayOfDeliverOrderInformation value) {
        return new JAXBElement<ArrayOfDeliverOrderInformation>(_ArrayOfDeliverOrderInformation_QNAME, ArrayOfDeliverOrderInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchOrdersRequest")
    public JAXBElement<SearchOrdersRequest> createSearchOrdersRequest(SearchOrdersRequest value) {
        return new JAXBElement<SearchOrdersRequest>(_SearchOrdersRequest_QNAME, SearchOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOrderFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchOrderFilter")
    public JAXBElement<SearchOrderFilter> createSearchOrderFilter(SearchOrderFilter value) {
        return new JAXBElement<SearchOrderFilter>(_SearchOrderFilter_QNAME, SearchOrderFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDeliveryStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfOrderDeliveryStatus")
    public JAXBElement<ArrayOfOrderDeliveryStatus> createArrayOfOrderDeliveryStatus(ArrayOfOrderDeliveryStatus value) {
        return new JAXBElement<ArrayOfOrderDeliveryStatus>(_ArrayOfOrderDeliveryStatus_QNAME, ArrayOfOrderDeliveryStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDeliveryStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "OrderDeliveryStatus")
    public JAXBElement<OrderDeliveryStatus> createOrderDeliveryStatus(OrderDeliveryStatus value) {
        return new JAXBElement<OrderDeliveryStatus>(_OrderDeliveryStatus_QNAME, OrderDeliveryStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOrderSorting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchOrderSorting")
    public JAXBElement<SearchOrderSorting> createSearchOrderSorting(SearchOrderSorting value) {
        return new JAXBElement<SearchOrderSorting>(_SearchOrderSorting_QNAME, SearchOrderSorting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SortDirection")
    public JAXBElement<SortDirection> createSortDirection(SortDirection value) {
        return new JAXBElement<SortDirection>(_SortDirection_QNAME, SortDirection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrderProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SortOrderProperty")
    public JAXBElement<SortOrderProperty> createSortOrderProperty(SortOrderProperty value) {
        return new JAXBElement<SortOrderProperty>(_SortOrderProperty_QNAME, SortOrderProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchOrdersResponse")
    public JAXBElement<SearchOrdersResponse> createSearchOrdersResponse(SearchOrdersResponse value) {
        return new JAXBElement<SearchOrdersResponse>(_SearchOrdersResponse_QNAME, SearchOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfOrderListItem")
    public JAXBElement<ArrayOfOrderListItem> createArrayOfOrderListItem(ArrayOfOrderListItem value) {
        return new JAXBElement<ArrayOfOrderListItem>(_ArrayOfOrderListItem_QNAME, ArrayOfOrderListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "OrderListItem")
    public JAXBElement<OrderListItem> createOrderListItem(OrderListItem value) {
        return new JAXBElement<OrderListItem>(_OrderListItem_QNAME, OrderListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInvoicesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchInvoicesRequest")
    public JAXBElement<SearchInvoicesRequest> createSearchInvoicesRequest(SearchInvoicesRequest value) {
        return new JAXBElement<SearchInvoicesRequest>(_SearchInvoicesRequest_QNAME, SearchInvoicesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInvoiceFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchInvoiceFilter")
    public JAXBElement<SearchInvoiceFilter> createSearchInvoiceFilter(SearchInvoiceFilter value) {
        return new JAXBElement<SearchInvoiceFilter>(_SearchInvoiceFilter_QNAME, SearchInvoiceFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoicePaymentStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfInvoicePaymentStatus")
    public JAXBElement<ArrayOfInvoicePaymentStatus> createArrayOfInvoicePaymentStatus(ArrayOfInvoicePaymentStatus value) {
        return new JAXBElement<ArrayOfInvoicePaymentStatus>(_ArrayOfInvoicePaymentStatus_QNAME, ArrayOfInvoicePaymentStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoicePaymentStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "InvoicePaymentStatus")
    public JAXBElement<InvoicePaymentStatus> createInvoicePaymentStatus(InvoicePaymentStatus value) {
        return new JAXBElement<InvoicePaymentStatus>(_InvoicePaymentStatus_QNAME, InvoicePaymentStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInvoiceSorting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchInvoiceSorting")
    public JAXBElement<SearchInvoiceSorting> createSearchInvoiceSorting(SearchInvoiceSorting value) {
        return new JAXBElement<SearchInvoiceSorting>(_SearchInvoiceSorting_QNAME, SearchInvoiceSorting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortInvoiceProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SortInvoiceProperty")
    public JAXBElement<SortInvoiceProperty> createSortInvoiceProperty(SortInvoiceProperty value) {
        return new JAXBElement<SortInvoiceProperty>(_SortInvoiceProperty_QNAME, SortInvoiceProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInvoicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchInvoicesResponse")
    public JAXBElement<SearchInvoicesResponse> createSearchInvoicesResponse(SearchInvoicesResponse value) {
        return new JAXBElement<SearchInvoicesResponse>(_SearchInvoicesResponse_QNAME, SearchInvoicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoiceListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfInvoiceListItem")
    public JAXBElement<ArrayOfInvoiceListItem> createArrayOfInvoiceListItem(ArrayOfInvoiceListItem value) {
        return new JAXBElement<ArrayOfInvoiceListItem>(_ArrayOfInvoiceListItem_QNAME, ArrayOfInvoiceListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "InvoiceListItem")
    public JAXBElement<InvoiceListItem> createInvoiceListItem(InvoiceListItem value) {
        return new JAXBElement<InvoiceListItem>(_InvoiceListItem_QNAME, InvoiceListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "InvoiceType")
    public JAXBElement<InvoiceType> createInvoiceType(InvoiceType value) {
        return new JAXBElement<InvoiceType>(_InvoiceType_QNAME, InvoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoicesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetInvoicesRequest")
    public JAXBElement<GetInvoicesRequest> createGetInvoicesRequest(GetInvoicesRequest value) {
        return new JAXBElement<GetInvoicesRequest>(_GetInvoicesRequest_QNAME, GetInvoicesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetInvoiceInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfGetInvoiceInformation")
    public JAXBElement<ArrayOfGetInvoiceInformation> createArrayOfGetInvoiceInformation(ArrayOfGetInvoiceInformation value) {
        return new JAXBElement<ArrayOfGetInvoiceInformation>(_ArrayOfGetInvoiceInformation_QNAME, ArrayOfGetInvoiceInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetInvoiceInformation")
    public JAXBElement<GetInvoiceInformation> createGetInvoiceInformation(GetInvoiceInformation value) {
        return new JAXBElement<GetInvoiceInformation>(_GetInvoiceInformation_QNAME, GetInvoiceInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetInvoicesResponse")
    public JAXBElement<GetInvoicesResponse> createGetInvoicesResponse(GetInvoicesResponse value) {
        return new JAXBElement<GetInvoicesResponse>(_GetInvoicesResponse_QNAME, GetInvoicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfInvoice")
    public JAXBElement<ArrayOfInvoice> createArrayOfInvoice(ArrayOfInvoice value) {
        return new JAXBElement<ArrayOfInvoice>(_ArrayOfInvoice_QNAME, ArrayOfInvoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Invoice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "Invoice")
    public JAXBElement<Invoice> createInvoice(Invoice value) {
        return new JAXBElement<Invoice>(_Invoice_QNAME, Invoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPaymentPlansRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchPaymentPlansRequest")
    public JAXBElement<SearchPaymentPlansRequest> createSearchPaymentPlansRequest(SearchPaymentPlansRequest value) {
        return new JAXBElement<SearchPaymentPlansRequest>(_SearchPaymentPlansRequest_QNAME, SearchPaymentPlansRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPaymentPlanFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchPaymentPlanFilter")
    public JAXBElement<SearchPaymentPlanFilter> createSearchPaymentPlanFilter(SearchPaymentPlanFilter value) {
        return new JAXBElement<SearchPaymentPlanFilter>(_SearchPaymentPlanFilter_QNAME, SearchPaymentPlanFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentPlanStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfPaymentPlanStatus")
    public JAXBElement<ArrayOfPaymentPlanStatus> createArrayOfPaymentPlanStatus(ArrayOfPaymentPlanStatus value) {
        return new JAXBElement<ArrayOfPaymentPlanStatus>(_ArrayOfPaymentPlanStatus_QNAME, ArrayOfPaymentPlanStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentPlanStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "PaymentPlanStatus")
    public JAXBElement<PaymentPlanStatus> createPaymentPlanStatus(PaymentPlanStatus value) {
        return new JAXBElement<PaymentPlanStatus>(_PaymentPlanStatus_QNAME, PaymentPlanStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPaymentPlanSorting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchPaymentPlanSorting")
    public JAXBElement<SearchPaymentPlanSorting> createSearchPaymentPlanSorting(SearchPaymentPlanSorting value) {
        return new JAXBElement<SearchPaymentPlanSorting>(_SearchPaymentPlanSorting_QNAME, SearchPaymentPlanSorting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortPaymentPlanProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SortPaymentPlanProperty")
    public JAXBElement<SortPaymentPlanProperty> createSortPaymentPlanProperty(SortPaymentPlanProperty value) {
        return new JAXBElement<SortPaymentPlanProperty>(_SortPaymentPlanProperty_QNAME, SortPaymentPlanProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPaymentPlansResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchPaymentPlansResponse")
    public JAXBElement<SearchPaymentPlansResponse> createSearchPaymentPlansResponse(SearchPaymentPlansResponse value) {
        return new JAXBElement<SearchPaymentPlansResponse>(_SearchPaymentPlansResponse_QNAME, SearchPaymentPlansResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentPlanListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfPaymentPlanListItem")
    public JAXBElement<ArrayOfPaymentPlanListItem> createArrayOfPaymentPlanListItem(ArrayOfPaymentPlanListItem value) {
        return new JAXBElement<ArrayOfPaymentPlanListItem>(_ArrayOfPaymentPlanListItem_QNAME, ArrayOfPaymentPlanListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentPlanListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "PaymentPlanListItem")
    public JAXBElement<PaymentPlanListItem> createPaymentPlanListItem(PaymentPlanListItem value) {
        return new JAXBElement<PaymentPlanListItem>(_PaymentPlanListItem_QNAME, PaymentPlanListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumOfOrderAmountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SumOfOrderAmountRequest")
    public JAXBElement<SumOfOrderAmountRequest> createSumOfOrderAmountRequest(SumOfOrderAmountRequest value) {
        return new JAXBElement<SumOfOrderAmountRequest>(_SumOfOrderAmountRequest_QNAME, SumOfOrderAmountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumOfAmountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SumOfAmountResponse")
    public JAXBElement<SumOfAmountResponse> createSumOfAmountResponse(SumOfAmountResponse value) {
        return new JAXBElement<SumOfAmountResponse>(_SumOfAmountResponse_QNAME, SumOfAmountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumOfInvoiceAmountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SumOfInvoiceAmountRequest")
    public JAXBElement<SumOfInvoiceAmountRequest> createSumOfInvoiceAmountRequest(SumOfInvoiceAmountRequest value) {
        return new JAXBElement<SumOfInvoiceAmountRequest>(_SumOfInvoiceAmountRequest_QNAME, SumOfInvoiceAmountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumOfPaymentPlanAmountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SumOfPaymentPlanAmountRequest")
    public JAXBElement<SumOfPaymentPlanAmountRequest> createSumOfPaymentPlanAmountRequest(SumOfPaymentPlanAmountRequest value) {
        return new JAXBElement<SumOfPaymentPlanAmountRequest>(_SumOfPaymentPlanAmountRequest_QNAME, SumOfPaymentPlanAmountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CreateOrderRequest")
    public JAXBElement<CreateOrderRequest> createCreateOrderRequest(CreateOrderRequest value) {
        return new JAXBElement<CreateOrderRequest>(_CreateOrderRequest_QNAME, CreateOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CreateOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<CreateOrderResponse>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeInvoiceDueDateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ChangeInvoiceDueDateRequest")
    public JAXBElement<ChangeInvoiceDueDateRequest> createChangeInvoiceDueDateRequest(ChangeInvoiceDueDateRequest value) {
        return new JAXBElement<ChangeInvoiceDueDateRequest>(_ChangeInvoiceDueDateRequest_QNAME, ChangeInvoiceDueDateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeInvoiceDueDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ChangeInvoiceDueDateResponse")
    public JAXBElement<ChangeInvoiceDueDateResponse> createChangeInvoiceDueDateResponse(ChangeInvoiceDueDateResponse value) {
        return new JAXBElement<ChangeInvoiceDueDateResponse>(_ChangeInvoiceDueDateResponse_QNAME, ChangeInvoiceDueDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateApprovedOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CreateApprovedOrderRequest")
    public JAXBElement<CreateApprovedOrderRequest> createCreateApprovedOrderRequest(CreateApprovedOrderRequest value) {
        return new JAXBElement<CreateApprovedOrderRequest>(_CreateApprovedOrderRequest_QNAME, CreateApprovedOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CustomerInformation")
    public JAXBElement<CustomerInformation> createCustomerInformation(CustomerInformation value) {
        return new JAXBElement<CustomerInformation>(_CustomerInformation_QNAME, CustomerInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "DeliveryAddress")
    public JAXBElement<DeliveryAddress> createDeliveryAddress(DeliveryAddress value) {
        return new JAXBElement<DeliveryAddress>(_DeliveryAddress_QNAME, DeliveryAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "InvoiceAddress")
    public JAXBElement<InvoiceAddress> createInvoiceAddress(InvoiceAddress value) {
        return new JAXBElement<InvoiceAddress>(_InvoiceAddress_QNAME, InvoiceAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "OrderInformation")
    public JAXBElement<OrderInformation> createOrderInformation(OrderInformation value) {
        return new JAXBElement<OrderInformation>(_OrderInformation_QNAME, OrderInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountCreditInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "AccountCreditInformation")
    public JAXBElement<AccountCreditInformation> createAccountCreditInformation(AccountCreditInformation value) {
        return new JAXBElement<AccountCreditInformation>(_AccountCreditInformation_QNAME, AccountCreditInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "InvoiceInformation")
    public JAXBElement<InvoiceInformation> createInvoiceInformation(InvoiceInformation value) {
        return new JAXBElement<InvoiceInformation>(_InvoiceInformation_QNAME, InvoiceInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfBillingReference")
    public JAXBElement<ArrayOfBillingReference> createArrayOfBillingReference(ArrayOfBillingReference value) {
        return new JAXBElement<ArrayOfBillingReference>(_ArrayOfBillingReference_QNAME, ArrayOfBillingReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "BillingReference")
    public JAXBElement<BillingReference> createBillingReference(BillingReference value) {
        return new JAXBElement<BillingReference>(_BillingReference_QNAME, BillingReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentPlanInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "PaymentPlanInformation")
    public JAXBElement<PaymentPlanInformation> createPaymentPlanInformation(PaymentPlanInformation value) {
        return new JAXBElement<PaymentPlanInformation>(_PaymentPlanInformation_QNAME, PaymentPlanInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateApprovedOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "CreateApprovedOrderResponse")
    public JAXBElement<CreateApprovedOrderResponse> createCreateApprovedOrderResponse(CreateApprovedOrderResponse value) {
        return new JAXBElement<CreateApprovedOrderResponse>(_CreateApprovedOrderResponse_QNAME, CreateApprovedOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAccountCreditsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchAccountCreditsRequest")
    public JAXBElement<SearchAccountCreditsRequest> createSearchAccountCreditsRequest(SearchAccountCreditsRequest value) {
        return new JAXBElement<SearchAccountCreditsRequest>(_SearchAccountCreditsRequest_QNAME, SearchAccountCreditsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAccountCreditFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "SearchAccountCreditFilter")
    public JAXBElement<SearchAccountCreditFilter> createSearchAccountCreditFilter(SearchAccountCreditFilter value) {
        return new JAXBElement<SearchAccountCreditFilter>(_SearchAccountCreditFilter_QNAME, SearchAccountCreditFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountCreditStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfAccountCreditStatus")
    public JAXBElement<ArrayOfAccountCreditStatus> createArrayOfAccountCreditStatus(ArrayOfAccountCreditStatus value) {
        return new JAXBElement<ArrayOfAccountCreditStatus>(_ArrayOfAccountCreditStatus_QNAME, ArrayOfAccountCreditStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountCreditStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "AccountCreditStatus")
    public JAXBElement<AccountCreditStatus> createAccountCreditStatus(AccountCreditStatus value) {
        return new JAXBElement<AccountCreditStatus>(_AccountCreditStatus_QNAME, AccountCreditStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountCreditListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfAccountCreditListItem")
    public JAXBElement<ArrayOfAccountCreditListItem> createArrayOfAccountCreditListItem(ArrayOfAccountCreditListItem value) {
        return new JAXBElement<ArrayOfAccountCreditListItem>(_ArrayOfAccountCreditListItem_QNAME, ArrayOfAccountCreditListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountCreditListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "AccountCreditListItem")
    public JAXBElement<AccountCreditListItem> createAccountCreditListItem(AccountCreditListItem value) {
        return new JAXBElement<AccountCreditListItem>(_AccountCreditListItem_QNAME, AccountCreditListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountCreditsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "GetAccountCreditsRequest")
    public JAXBElement<GetAccountCreditsRequest> createGetAccountCreditsRequest(GetAccountCreditsRequest value) {
        return new JAXBElement<GetAccountCreditsRequest>(_GetAccountCreditsRequest_QNAME, GetAccountCreditsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountCreditItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "ArrayOfAccountCreditItem")
    public JAXBElement<ArrayOfAccountCreditItem> createArrayOfAccountCreditItem(ArrayOfAccountCreditItem value) {
        return new JAXBElement<ArrayOfAccountCreditItem>(_ArrayOfAccountCreditItem_QNAME, ArrayOfAccountCreditItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountCreditItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service", name = "AccountCreditItem")
    public JAXBElement<AccountCreditItem> createAccountCreditItem(AccountCreditItem value) {
        return new JAXBElement<AccountCreditItem>(_AccountCreditItem_QNAME, AccountCreditItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountCreditDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", name = "AccountCreditDetails")
    public JAXBElement<AccountCreditDetails> createAccountCreditDetails(AccountCreditDetails value) {
        return new JAXBElement<AccountCreditDetails>(_AccountCreditDetails_QNAME, AccountCreditDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAccountCreditSorting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", name = "SearchAccountCreditSorting")
    public JAXBElement<SearchAccountCreditSorting> createSearchAccountCreditSorting(SearchAccountCreditSorting value) {
        return new JAXBElement<SearchAccountCreditSorting>(_SearchAccountCreditSorting_QNAME, SearchAccountCreditSorting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortAccountCreditProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", name = "SortAccountCreditProperty")
    public JAXBElement<SortAccountCreditProperty> createSortAccountCreditProperty(SortAccountCreditProperty value) {
        return new JAXBElement<SortAccountCreditProperty>(_SortAccountCreditProperty_QNAME, SortAccountCreditProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetAccountCreditInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", name = "ArrayOfGetAccountCreditInformation")
    public JAXBElement<ArrayOfGetAccountCreditInformation> createArrayOfGetAccountCreditInformation(ArrayOfGetAccountCreditInformation value) {
        return new JAXBElement<ArrayOfGetAccountCreditInformation>(_ArrayOfGetAccountCreditInformation_QNAME, ArrayOfGetAccountCreditInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountCreditInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", name = "GetAccountCreditInformation")
    public JAXBElement<GetAccountCreditInformation> createGetAccountCreditInformation(GetAccountCreditInformation value) {
        return new JAXBElement<GetAccountCreditInformation>(_GetAccountCreditInformation_QNAME, GetAccountCreditInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextMatchType2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.Invoice", name = "TextMatchType")
    public JAXBElement<TextMatchType2> createSearchInvoice(TextMatchType2 value) {
        return new JAXBElement<TextMatchType2>(_SearchInvoice_QNAME, TextMatchType2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelAccountCreditAmountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "CancelAccountCreditAmountRequest")
    public JAXBElement<CancelAccountCreditAmountRequest> createCancelAccountCreditAmountRequest(CancelAccountCreditAmountRequest value) {
        return new JAXBElement<CancelAccountCreditAmountRequest>(_CancelAccountCreditAmountRequest_QNAME, CancelAccountCreditAmountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelAccountCreditRowsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "CancelAccountCreditRowsRequest")
    public JAXBElement<CancelAccountCreditRowsRequest> createCancelAccountCreditRowsRequest(CancelAccountCreditRowsRequest value) {
        return new JAXBElement<CancelAccountCreditRowsRequest>(_CancelAccountCreditRowsRequest_QNAME, CancelAccountCreditRowsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountCreditRegressReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "AccountCreditRegressReportRequest")
    public JAXBElement<AccountCreditRegressReportRequest> createAccountCreditRegressReportRequest(AccountCreditRegressReportRequest value) {
        return new JAXBElement<AccountCreditRegressReportRequest>(_AccountCreditRegressReportRequest_QNAME, AccountCreditRegressReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingAgreementType25ReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "AccountingAgreementType25ReportRequest")
    public JAXBElement<AccountingAgreementType25ReportRequest> createAccountingAgreementType25ReportRequest(AccountingAgreementType25ReportRequest value) {
        return new JAXBElement<AccountingAgreementType25ReportRequest>(_AccountingAgreementType25ReportRequest_QNAME, AccountingAgreementType25ReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDebtInvoicesPaidToClientForReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "GetDebtInvoicesPaidToClientForReportRequest")
    public JAXBElement<GetDebtInvoicesPaidToClientForReportRequest> createGetDebtInvoicesPaidToClientForReportRequest(GetDebtInvoicesPaidToClientForReportRequest value) {
        return new JAXBElement<GetDebtInvoicesPaidToClientForReportRequest>(_GetDebtInvoicesPaidToClientForReportRequest_QNAME, GetDebtInvoicesPaidToClientForReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoicesPaidToClientForReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "GetInvoicesPaidToClientForReportRequest")
    public JAXBElement<GetInvoicesPaidToClientForReportRequest> createGetInvoicesPaidToClientForReportRequest(GetInvoicesPaidToClientForReportRequest value) {
        return new JAXBElement<GetInvoicesPaidToClientForReportRequest>(_GetInvoicesPaidToClientForReportRequest_QNAME, GetInvoicesPaidToClientForReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKickbackReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "GetKickbackReportRequest")
    public JAXBElement<GetKickbackReportRequest> createGetKickbackReportRequest(GetKickbackReportRequest value) {
        return new JAXBElement<GetKickbackReportRequest>(_GetKickbackReportRequest_QNAME, GetKickbackReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendingReasonsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "GetPendingReasonsRequest")
    public JAXBElement<GetPendingReasonsRequest> createGetPendingReasonsRequest(GetPendingReasonsRequest value) {
        return new JAXBElement<GetPendingReasonsRequest>(_GetPendingReasonsRequest_QNAME, GetPendingReasonsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpecificationReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "GetSpecificationReportRequest")
    public JAXBElement<GetSpecificationReportRequest> createGetSpecificationReportRequest(GetSpecificationReportRequest value) {
        return new JAXBElement<GetSpecificationReportRequest>(_GetSpecificationReportRequest_QNAME, GetSpecificationReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpecificationReportResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "GetSpecificationReportResponse")
    public JAXBElement<GetSpecificationReportResponse2> createGetSpecificationReportResponse(GetSpecificationReportResponse2 value) {
        return new JAXBElement<GetSpecificationReportResponse2>(_GetSpecificationReportResponse_QNAME, GetSpecificationReportResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", name = "GetClientIdRequest")
    public JAXBElement<GetClientIdRequest> createGetClientIdRequest(GetClientIdRequest value) {
        return new JAXBElement<GetClientIdRequest>(_GetClientIdRequest_QNAME, GetClientIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextMatchType3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.PaymentPlan", name = "TextMatchType")
    public JAXBElement<TextMatchType3> createSearchPaymentPlan(TextMatchType3 value) {
        return new JAXBElement<TextMatchType3>(_SearchPaymentPlan_QNAME, TextMatchType3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", name = "CreateOrderInformation")
    public JAXBElement<CreateOrderInformation> createCreateOrderInformation(CreateOrderInformation value) {
        return new JAXBElement<CreateOrderInformation>(_CreateOrderInformation_QNAME, CreateOrderInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountCreditDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", name = "CreateAccountCreditDetails")
    public JAXBElement<CreateAccountCreditDetails> createCreateAccountCreditDetails(CreateAccountCreditDetails value) {
        return new JAXBElement<CreateAccountCreditDetails>(_CreateAccountCreditDetails_QNAME, CreateAccountCreditDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePaymentPlanDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", name = "CreatePaymentPlanDetails")
    public JAXBElement<CreatePaymentPlanDetails> createCreatePaymentPlanDetails(CreatePaymentPlanDetails value) {
        return new JAXBElement<CreatePaymentPlanDetails>(_CreatePaymentPlanDetails_QNAME, CreatePaymentPlanDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.CreateOrder", name = "CreateOrderResult")
    public JAXBElement<CreateOrderResult> createCreateOrderResult(CreateOrderResult value) {
        return new JAXBElement<CreateOrderResult>(_CreateOrderResult_QNAME, CreateOrderResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextMatchType4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Search.AccountCredit", name = "TextMatchType")
    public JAXBElement<TextMatchType4> createSearchAccountCredit(TextMatchType4 value) {
        return new JAXBElement<TextMatchType4>(_SearchAccountCredit_QNAME, TextMatchType4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RowType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Enums", name = "RowType")
    public JAXBElement<RowType> createRowType(RowType value) {
        return new JAXBElement<RowType>(_RowType_QNAME, RowType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Enums", name = "AddressSource")
    public JAXBElement<AddressSource> createAddressSource(AddressSource value) {
        return new JAXBElement<AddressSource>(_AddressSource_QNAME, AddressSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Enums", name = "BillingReferenceType")
    public JAXBElement<BillingReferenceType> createBillingReferenceType(BillingReferenceType value) {
        return new JAXBElement<BillingReferenceType>(_BillingReferenceType_QNAME, BillingReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "ArrayOfOrderRow")
    public JAXBElement<ArrayOfOrderRow> createArrayOfOrderRow(ArrayOfOrderRow value) {
        return new JAXBElement<ArrayOfOrderRow>(_ArrayOfOrderRow_QNAME, ArrayOfOrderRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "OrderRow")
    public JAXBElement<OrderRow> createOrderRow(OrderRow value) {
        return new JAXBElement<OrderRow>(_OrderRow_QNAME, OrderRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "OrderType")
    public JAXBElement<OrderType> createOrderType(OrderType value) {
        return new JAXBElement<OrderType>(_OrderType_QNAME, OrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderRowReferenceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "ArrayOfOrderRowReferenceItem")
    public JAXBElement<ArrayOfOrderRowReferenceItem> createArrayOfOrderRowReferenceItem(ArrayOfOrderRowReferenceItem value) {
        return new JAXBElement<ArrayOfOrderRowReferenceItem>(_ArrayOfOrderRowReferenceItem_QNAME, ArrayOfOrderRowReferenceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRowReferenceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "OrderRowReferenceItem")
    public JAXBElement<OrderRowReferenceItem> createOrderRowReferenceItem(OrderRowReferenceItem value) {
        return new JAXBElement<OrderRowReferenceItem>(_OrderRowReferenceItem_QNAME, OrderRowReferenceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "CustomerIdentity")
    public JAXBElement<CustomerIdentity> createCustomerIdentity(CustomerIdentity value) {
        return new JAXBElement<CustomerIdentity>(_CustomerIdentity_QNAME, CustomerIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "CompanyIdentity")
    public JAXBElement<CompanyIdentity> createCompanyIdentity(CompanyIdentity value) {
        return new JAXBElement<CompanyIdentity>(_CompanyIdentity_QNAME, CompanyIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "CustomerType")
    public JAXBElement<CustomerType> createCustomerType(CustomerType value) {
        return new JAXBElement<CustomerType>(_CustomerType_QNAME, CustomerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "IndividualIdentity")
    public JAXBElement<IndividualIdentity> createIndividualIdentity(IndividualIdentity value) {
        return new JAXBElement<IndividualIdentity>(_IndividualIdentity_QNAME, IndividualIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "ArrayOfOrderStatus")
    public JAXBElement<ArrayOfOrderStatus> createArrayOfOrderStatus(ArrayOfOrderStatus value) {
        return new JAXBElement<ArrayOfOrderStatus>(_ArrayOfOrderStatus_QNAME, ArrayOfOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "OrderStatus")
    public JAXBElement<OrderStatus> createOrderStatus(OrderStatus value) {
        return new JAXBElement<OrderStatus>(_OrderStatus_QNAME, OrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KycRiskClassification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", name = "KycRiskClassification")
    public JAXBElement<KycRiskClassification> createKycRiskClassification(KycRiskClassification value) {
        return new JAXBElement<KycRiskClassification>(_KycRiskClassification_QNAME, KycRiskClassification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceDistributionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder", name = "InvoiceDistributionType")
    public JAXBElement<InvoiceDistributionType> createInvoiceDistributionType(InvoiceDistributionType value) {
        return new JAXBElement<InvoiceDistributionType>(_InvoiceDistributionType_QNAME, InvoiceDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoicePaidToClientRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Internal.Service.Types", name = "ArrayOfInvoicePaidToClientRow")
    public JAXBElement<ArrayOfInvoicePaidToClientRow> createArrayOfInvoicePaidToClientRow(ArrayOfInvoicePaidToClientRow value) {
        return new JAXBElement<ArrayOfInvoicePaidToClientRow>(_ArrayOfInvoicePaidToClientRow_QNAME, ArrayOfInvoicePaidToClientRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoicePaidToClientRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Internal.Service.Types", name = "InvoicePaidToClientRow")
    public JAXBElement<InvoicePaidToClientRow> createInvoicePaidToClientRow(InvoicePaidToClientRow value) {
        return new JAXBElement<InvoicePaidToClientRow>(_InvoicePaidToClientRow_QNAME, InvoicePaidToClientRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelAccountCreditAmountResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "CancelAccountCreditAmountResponse")
    public JAXBElement<CancelAccountCreditAmountResponse2> createCancelAccountCreditAmountResponse(CancelAccountCreditAmountResponse2 value) {
        return new JAXBElement<CancelAccountCreditAmountResponse2>(_CancelAccountCreditAmountResponse_QNAME, CancelAccountCreditAmountResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelAccountCreditRowsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "CancelAccountCreditRowsResponse")
    public JAXBElement<CancelAccountCreditRowsResponse2> createCancelAccountCreditRowsResponse(CancelAccountCreditRowsResponse2 value) {
        return new JAXBElement<CancelAccountCreditRowsResponse2>(_CancelAccountCreditRowsResponse_QNAME, CancelAccountCreditRowsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendOrderResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "ExtendOrderResponse")
    public JAXBElement<ExtendOrderResponse2> createExtendOrderResponse(ExtendOrderResponse2 value) {
        return new JAXBElement<ExtendOrderResponse2>(_ExtendOrderResponse_QNAME, ExtendOrderResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountCreditRegressReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "AccountCreditRegressReportResponse")
    public JAXBElement<AccountCreditRegressReportResponse> createAccountCreditRegressReportResponse(AccountCreditRegressReportResponse value) {
        return new JAXBElement<AccountCreditRegressReportResponse>(_AccountCreditRegressReportResponse_QNAME, AccountCreditRegressReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingAgreementType25ReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "AccountingAgreementType25ReportResponse")
    public JAXBElement<AccountingAgreementType25ReportResponse> createAccountingAgreementType25ReportResponse(AccountingAgreementType25ReportResponse value) {
        return new JAXBElement<AccountingAgreementType25ReportResponse>(_AccountingAgreementType25ReportResponse_QNAME, AccountingAgreementType25ReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDebtInvoicesPaidToClientForReportResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "GetDebtInvoicesPaidToClientForReportResponse")
    public JAXBElement<GetDebtInvoicesPaidToClientForReportResponse2> createGetDebtInvoicesPaidToClientForReportResponse(GetDebtInvoicesPaidToClientForReportResponse2 value) {
        return new JAXBElement<GetDebtInvoicesPaidToClientForReportResponse2>(_GetDebtInvoicesPaidToClientForReportResponse_QNAME, GetDebtInvoicesPaidToClientForReportResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoicesPaidToClientForReportResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "GetInvoicesPaidToClientForReportResponse")
    public JAXBElement<GetInvoicesPaidToClientForReportResponse2> createGetInvoicesPaidToClientForReportResponse(GetInvoicesPaidToClientForReportResponse2 value) {
        return new JAXBElement<GetInvoicesPaidToClientForReportResponse2>(_GetInvoicesPaidToClientForReportResponse_QNAME, GetInvoicesPaidToClientForReportResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKickbackReportResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "GetKickbackReportResponse")
    public JAXBElement<GetKickbackReportResponse2> createGetKickbackReportResponse(GetKickbackReportResponse2 value) {
        return new JAXBElement<GetKickbackReportResponse2>(_GetKickbackReportResponse_QNAME, GetKickbackReportResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendingReasonsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "GetPendingReasonsResponse")
    public JAXBElement<GetPendingReasonsResponse2> createGetPendingReasonsResponse(GetPendingReasonsResponse2 value) {
        return new JAXBElement<GetPendingReasonsResponse2>(_GetPendingReasonsResponse_QNAME, GetPendingReasonsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAccountCreditsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "SearchAccountCreditsResponse")
    public JAXBElement<SearchAccountCreditsResponse2> createSearchAccountCreditsResponse(SearchAccountCreditsResponse2 value) {
        return new JAXBElement<SearchAccountCreditsResponse2>(_SearchAccountCreditsResponse_QNAME, SearchAccountCreditsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountCreditsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "GetAccountCreditsResponse")
    public JAXBElement<GetAccountCreditsResponse2> createGetAccountCreditsResponse(GetAccountCreditsResponse2 value) {
        return new JAXBElement<GetAccountCreditsResponse2>(_GetAccountCreditsResponse_QNAME, GetAccountCreditsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientIdResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", name = "GetClientIdResponse")
    public JAXBElement<GetClientIdResponse2> createGetClientIdResponse(GetClientIdResponse2 value) {
        return new JAXBElement<GetClientIdResponse2>(_GetClientIdResponse_QNAME, GetClientIdResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOflong")
    public JAXBElement<ArrayOflong> createArrayOflong(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ArrayOflong_QNAME, ArrayOflong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

}
