
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchAccountCreditsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAccountCreditsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountCreditListItems" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfAccountCreditListItem"/&gt;
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchAccountCreditsResponse", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses", propOrder = {
    "accountCreditListItems",
    "resultCount"
})
public class SearchAccountCreditsResponse2
    extends BasicResponse
{

    @XmlElement(name = "AccountCreditListItems", required = true, nillable = true)
    protected ArrayOfAccountCreditListItem accountCreditListItems;
    @XmlElement(name = "ResultCount")
    protected int resultCount;

    /**
     * Gets the value of the accountCreditListItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountCreditListItem }
     *     
     */
    public ArrayOfAccountCreditListItem getAccountCreditListItems() {
        return accountCreditListItems;
    }

    /**
     * Sets the value of the accountCreditListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountCreditListItem }
     *     
     */
    public void setAccountCreditListItems(ArrayOfAccountCreditListItem value) {
        this.accountCreditListItems = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(int value) {
        this.resultCount = value;
    }

}
