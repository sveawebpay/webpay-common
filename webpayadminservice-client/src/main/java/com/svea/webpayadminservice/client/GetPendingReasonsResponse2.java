
package com.svea.webpayadminservice.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPendingReasonsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPendingReasonsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PendingReasons" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfPendingReason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPendingReasonsResponse", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", propOrder = {
    "pendingReasons"
})
public class GetPendingReasonsResponse2
    extends BasicResponse
{

    @XmlElement(name = "PendingReasons", nillable = true)
    protected ArrayOfPendingReason pendingReasons;

    /**
     * Gets the value of the pendingReasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPendingReason }
     *     
     */
    public ArrayOfPendingReason getPendingReasons() {
        return pendingReasons;
    }

    /**
     * Sets the value of the pendingReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPendingReason }
     *     
     */
    public void setPendingReasons(ArrayOfPendingReason value) {
        this.pendingReasons = value;
    }

}
