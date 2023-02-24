
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}GetInvoicesWithChangedDueDateRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "GetInvoicesWithChangedDueDate", namespace = "http://tempuri.org/")
public class GetInvoicesWithChangedDueDate {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected GetInvoicesWithChangedDueDateRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetInvoicesWithChangedDueDateRequest }
     *     
     */
    public GetInvoicesWithChangedDueDateRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInvoicesWithChangedDueDateRequest }
     *     
     */
    public void setRequest(GetInvoicesWithChangedDueDateRequest value) {
        this.request = value;
    }

}
