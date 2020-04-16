
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialDeliveryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialDeliveryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvoiceDistributionType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice.DeliverOrder}InvoiceDistributionType" minOccurs="0"/&gt;
 *         &lt;element name="OrderToDeliver" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}DeliverOrderInformation"/&gt;
 *         &lt;element name="RowNumbers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialDeliveryRequest", propOrder = {
    "invoiceDistributionType",
    "orderToDeliver",
    "rowNumbers"
})
public class PartialDeliveryRequest
    extends BasicRequest
{

    @XmlElement(name = "InvoiceDistributionType", nillable = true)
    @XmlSchemaType(name = "string")
    protected InvoiceDistributionType invoiceDistributionType;
    @XmlElement(name = "OrderToDeliver", required = true, nillable = true)
    protected DeliverOrderInformation orderToDeliver;
    @XmlElement(name = "RowNumbers", required = true, nillable = true)
    protected ArrayOflong rowNumbers;

    /**
     * Gets the value of the invoiceDistributionType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDistributionType }
     *     
     */
    public InvoiceDistributionType getInvoiceDistributionType() {
        return invoiceDistributionType;
    }

    /**
     * Sets the value of the invoiceDistributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDistributionType }
     *     
     */
    public void setInvoiceDistributionType(InvoiceDistributionType value) {
        this.invoiceDistributionType = value;
    }

    /**
     * Gets the value of the orderToDeliver property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverOrderInformation }
     *     
     */
    public DeliverOrderInformation getOrderToDeliver() {
        return orderToDeliver;
    }

    /**
     * Sets the value of the orderToDeliver property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverOrderInformation }
     *     
     */
    public void setOrderToDeliver(DeliverOrderInformation value) {
        this.orderToDeliver = value;
    }

    /**
     * Gets the value of the rowNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getRowNumbers() {
        return rowNumbers;
    }

    /**
     * Sets the value of the rowNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setRowNumbers(ArrayOflong value) {
        this.rowNumbers = value;
    }

}
