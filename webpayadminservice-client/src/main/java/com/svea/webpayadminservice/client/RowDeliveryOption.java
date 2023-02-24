
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowDeliveryOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowDeliveryOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuantityToDeliver" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowDeliveryOption", propOrder = {
    "quantityToDeliver",
    "rowNumber"
})
public class RowDeliveryOption {

    @XmlElement(name = "QuantityToDeliver", nillable = true)
    protected BigDecimal quantityToDeliver;
    @XmlElement(name = "RowNumber")
    protected long rowNumber;

    /**
     * Gets the value of the quantityToDeliver property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityToDeliver() {
        return quantityToDeliver;
    }

    /**
     * Sets the value of the quantityToDeliver property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityToDeliver(BigDecimal value) {
        this.quantityToDeliver = value;
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

}
