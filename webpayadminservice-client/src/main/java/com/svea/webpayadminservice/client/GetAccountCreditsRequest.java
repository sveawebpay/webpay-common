
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountCreditsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountCreditsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountCreditsToRetrieve" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account}ArrayOfGetAccountCreditInformation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountCreditsRequest", propOrder = {
    "accountCreditsToRetrieve"
})
public class GetAccountCreditsRequest
    extends BasicRequest
{

    @XmlElement(name = "AccountCreditsToRetrieve", required = true, nillable = true)
    protected ArrayOfGetAccountCreditInformation accountCreditsToRetrieve;

    /**
     * Gets the value of the accountCreditsToRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetAccountCreditInformation }
     *     
     */
    public ArrayOfGetAccountCreditInformation getAccountCreditsToRetrieve() {
        return accountCreditsToRetrieve;
    }

    /**
     * Sets the value of the accountCreditsToRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetAccountCreditInformation }
     *     
     */
    public void setAccountCreditsToRetrieve(ArrayOfGetAccountCreditInformation value) {
        this.accountCreditsToRetrieve = value;
    }

}
