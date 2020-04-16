
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberedOrderRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberedOrderRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}OrderRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditInvoiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberedOrderRow", propOrder = {
    "creditInvoiceId",
    "invoiceId",
    "rowNumber",
    "status"
})
public class NumberedOrderRow
    extends OrderRow
{

    @XmlElement(name = "CreditInvoiceId", nillable = true)
    protected Long creditInvoiceId;
    @XmlElement(name = "InvoiceId", nillable = true)
    protected Long invoiceId;
    @XmlElement(name = "RowNumber")
    protected long rowNumber;
    @XmlElement(name = "Status", nillable = true)
    protected String status;

    /**
     * Gets the value of the creditInvoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditInvoiceId() {
        return creditInvoiceId;
    }

    /**
     * Sets the value of the creditInvoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditInvoiceId(Long value) {
        this.creditInvoiceId = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceId(Long value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     */
    public long getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     */
    public void setRowNumber(long value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
