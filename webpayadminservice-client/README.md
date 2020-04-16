# webpayadminservice-client - Admin Service API

This API is for managing orders created using webpayws - Webpay EU Webservice API

The WSDL-itself is located on https://webpayadminservice.svea.com/AdminService.svc?wsdl

More documentation on available methods can be found on [Admin Service API](https://www.svea.com/se/sv/foretag/betallosningar/betallosningar-for-e-handel/tech-site/?currentTab=custom-integration&subTab=integration-guides)

## Installation

The parent project must first be built.

## Usage

Include the following dependency in your pom.xml

```
<dependency>
  <groupId>com.svea</groupId>
  <artifactId>webpayadminservice-client</artifactId>
  <version>0.0.3-SNAPSHOT</version>
</dependency>
```

For example code on how to use the library, check the class `se.sveaekonomi.partnerweb.test.TestGetClientsByIdentityAccount.java`

Generated with wsdl2java - Apache CXF 3.2.6

```
wsdl2java.sh -frontend jaxws21 
	-p com.svea.webpayadminservice.client 
	-d src/main/java 
	-b src/main/resources/bindings.xml 
	-autoNameResolution 
	-client src/main/resources/AdminService.svc.wsdl
```

See also src/main/resources/bindings.xml for additional comments.

See also http://stackoverflow.com/questions/23011547/webservice-client-generation-error-with-jdk8

