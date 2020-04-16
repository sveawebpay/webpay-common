
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountCreditsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountCreditsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountCredits" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfAccountCreditItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountCreditsResponse", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", propOrder = {
    "accountCredits"
})
public class GetAccountCreditsResponse2
    extends BasicResponse
{

    @XmlElement(name = "AccountCredits", nillable = true)
    protected ArrayOfAccountCreditItem accountCredits;

    /**
     * Gets the value of the accountCredits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountCreditItem }
     *     
     */
    public ArrayOfAccountCreditItem getAccountCredits() {
        return accountCredits;
    }

    /**
     * Sets the value of the accountCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountCreditItem }
     *     
     */
    public void setAccountCredits(ArrayOfAccountCreditItem value) {
        this.accountCredits = value;
    }

}
