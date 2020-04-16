
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetKickbackReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetKickbackReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kickbacks" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfKickbackReportRow" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetKickbackReportResponse", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", propOrder = {
    "kickbacks"
})
public class GetKickbackReportResponse2
    extends BasicResponse
{

    @XmlElement(name = "Kickbacks", nillable = true)
    protected ArrayOfKickbackReportRow kickbacks;

    /**
     * Gets the value of the kickbacks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKickbackReportRow }
     *     
     */
    public ArrayOfKickbackReportRow getKickbacks() {
        return kickbacks;
    }

    /**
     * Sets the value of the kickbacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKickbackReportRow }
     *     
     */
    public void setKickbacks(ArrayOfKickbackReportRow value) {
        this.kickbacks = value;
    }

}
