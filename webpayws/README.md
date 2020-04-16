# webpayws - EU Webservice API

The purpose of this webservice is to create invoices, paymentplans and account service orders.

This is a maven module that generates java classes to access the webservice located 
at https://webpayws.svea.com/SveaWebPay.asmx?WSDL using the [cxf-codegen-plugin](http://cxf.apache.org/docs/maven-cxf-codegen-plugin-wsdl-to-java.html).

A detailed description of the SOAP-service is found here
https://www.svea.com/globalassets/sweden/foretag/betallosningar/e-handel/moduler-integration/webpay_eu_webservice_nov2017.pdf  

The generated classes are placed in the package `com.svea.webpayws`

See class `com.svea.webpayws.client.WebpayWsClient` for example on how to use the API.

## Installation

The parent project must first be built.

## Usage

Include the following dependency in your pom.xml

```
<dependency>
  <groupId>com.svea</groupId>
  <artifactId>webpayws</artifactId>
  <version>0.0.3-SNAPSHOT</version>
</dependency>
```
