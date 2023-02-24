
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchAccountCreditSorting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAccountCreditSorting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SortAccountCreditProperty" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account}SortAccountCreditProperty" minOccurs="0"/&gt;
 *         &lt;element name="SortDirection" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SortDirection" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchAccountCreditSorting", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", propOrder = {
    "sortAccountCreditProperty",
    "sortDirection"
})
public class SearchAccountCreditSorting {

    @XmlElement(name = "SortAccountCreditProperty")
    @XmlSchemaType(name = "string")
    protected SortAccountCreditProperty sortAccountCreditProperty;
    @XmlElement(name = "SortDirection")
    @XmlSchemaType(name = "string")
    protected SortDirection sortDirection;

    /**
     * Gets the value of the sortAccountCreditProperty property.
     * 
     * @return
     *     possible object is
     *     {@link SortAccountCreditProperty }
     *     
     */
    public SortAccountCreditProperty getSortAccountCreditProperty() {
        return sortAccountCreditProperty;
    }

    /**
     * Sets the value of the sortAccountCreditProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortAccountCreditProperty }
     *     
     */
    public void setSortAccountCreditProperty(SortAccountCreditProperty value) {
        this.sortAccountCreditProperty = value;
    }

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link SortDirection }
     *     
     */
    public SortDirection getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirection }
     *     
     */
    public void setSortDirection(SortDirection value) {
        this.sortDirection = value;
    }

}
