package com.svea.webpayadminservice.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2023-02-24T16:24:25.291+01:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "AdminService",
                  wsdlLocation = "AdminService-230224.wsdl",
                  targetNamespace = "http://tempuri.org/")
public class AdminService extends Service {

    public final static URL WSDL_LOCATION;
    
    public final static String WSDL_FILE = "AdminService-230224.wsdl";

    public final static QName SERVICE = new QName("http://tempuri.org/", "AdminService");
    public final static QName AdminSoapService = new QName("http://tempuri.org/", "AdminSoapService");
    public final static QName WcfAdminSoapService = new QName("http://tempuri.org/", "WcfAdminSoapService");
    static {
        URL url = AdminService.class.getResource(WSDL_FILE);
        if (url == null) {
        	url = AdminService.class.getClassLoader().getResource(WSDL_FILE);
        }
        if (url == null) {
            java.util.logging.Logger.getLogger(AdminService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", WSDL_FILE);
        }
        WSDL_LOCATION = url;
    }

    public AdminService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AdminService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdminService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AdminService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AdminService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AdminService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IAdminService
     */
    @WebEndpoint(name = "AdminSoapService")
    public IAdminService getAdminSoapService() {
        return super.getPort(AdminSoapService, IAdminService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAdminService
     */
    @WebEndpoint(name = "AdminSoapService")
    public IAdminService getAdminSoapService(WebServiceFeature... features) {
        return super.getPort(AdminSoapService, IAdminService.class, features);
    }


    /**
     *
     * @return
     *     returns IAdminService
     */
    @WebEndpoint(name = "WcfAdminSoapService")
    public IAdminService getWcfAdminSoapService() {
        return super.getPort(WcfAdminSoapService, IAdminService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAdminService
     */
    @WebEndpoint(name = "WcfAdminSoapService")
    public IAdminService getWcfAdminSoapService(WebServiceFeature... features) {
        return super.getPort(WcfAdminSoapService, IAdminService.class, features);
    }

}
