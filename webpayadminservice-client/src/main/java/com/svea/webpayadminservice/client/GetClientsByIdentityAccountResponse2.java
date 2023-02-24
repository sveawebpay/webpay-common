
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClientsByIdentityAccountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientsByIdentityAccountResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Clients" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfClientData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientsByIdentityAccountResponse", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", propOrder = {
    "clients"
})
public class GetClientsByIdentityAccountResponse2
    extends BasicResponse
{

    @XmlElement(name = "Clients", nillable = true)
    protected ArrayOfClientData clients;

    /**
     * Gets the value of the clients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClientData }
     *     
     */
    public ArrayOfClientData getClients() {
        return clients;
    }

    /**
     * Sets the value of the clients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClientData }
     *     
     */
    public void setClients(ArrayOfClientData value) {
        this.clients = value;
    }

}
