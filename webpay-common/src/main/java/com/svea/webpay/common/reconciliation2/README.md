# Reconciliation Format

This package describes the latest reconciliation format for Svea Webpay.

The reconciliation format is retrieved from the Payment Admin API.

The report is fetched using a call to [https://paymentadminadpi.svea.com/api/v2/reports](https://paymentadminadpi.svea.com/documentation)

which parameters are described [here](https://paymentadminapi.svea.com/documentation/?_ga=2.141338354.1728867598.1569316578-2041118720.1567500401#/?id=get-reconciliation-report)

The structure is as follows

```
	ReconciliationReport (1)
		 ClientReport (0..*)
		 	ClientPaymentReport (1)
		 		VatGroup (0..*)
		 	ClientReportRow (0..*)
		 		ClientFee (0..*)
```

Links to record descriptors

* [ClientReport](https://paymentadminapi.svea.com/documentation/?_ga=2.141338354.1728867598.1569316578-2041118720.1567500401#/?id=clientreport)
* [ClientPaymentReport](https://paymentadminapi.svea.com/documentation/?_ga=2.141338354.1728867598.1569316578-2041118720.1567500401#/?id=paymentreport) a.k.a PaymentReport
* [VatGroup](https://paymentadminapi.svea.com/documentation/?_ga=2.141338354.1728867598.1569316578-2041118720.1567500401#/?id=vatgroup)
* [ClientReportRow](https://paymentadminapi.svea.com/documentation/?_ga=2.141338354.1728867598.1569316578-2041118720.1567500401#/?id=reportrow) a.k.a ReportRow
* [ClientFee](https://paymentadminapi.svea.com/documentation/?_ga=2.141338354.1728867598.1569316578-2041118720.1567500401#/?id=fee) a.k.a Fee
