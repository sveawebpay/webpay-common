
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPaymentPlanSorting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPaymentPlanSorting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SortDirection" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SortDirection" minOccurs="0"/&gt;
 *         &lt;element name="SortPaymentPlanProperty" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SortPaymentPlanProperty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPaymentPlanSorting", propOrder = {
    "sortDirection",
    "sortPaymentPlanProperty"
})
public class SearchPaymentPlanSorting {

    @XmlElement(name = "SortDirection")
    @XmlSchemaType(name = "string")
    protected SortDirection sortDirection;
    @XmlElement(name = "SortPaymentPlanProperty")
    @XmlSchemaType(name = "string")
    protected SortPaymentPlanProperty sortPaymentPlanProperty;

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

    /**
     * Gets the value of the sortPaymentPlanProperty property.
     * 
     * @return
     *     possible object is
     *     {@link SortPaymentPlanProperty }
     *     
     */
    public SortPaymentPlanProperty getSortPaymentPlanProperty() {
        return sortPaymentPlanProperty;
    }

    /**
     * Sets the value of the sortPaymentPlanProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortPaymentPlanProperty }
     *     
     */
    public void setSortPaymentPlanProperty(SortPaymentPlanProperty value) {
        this.sortPaymentPlanProperty = value;
    }

}
