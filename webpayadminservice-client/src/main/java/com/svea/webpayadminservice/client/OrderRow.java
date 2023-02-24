
package com.svea.webpayadminservice.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArticleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmountIncludingVat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PriceIncludingVat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PricePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RowType" type="{http://schemas.datacontract.org/2004/07/DataObjects.Enums}RowType" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VatPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderRow", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", propOrder = {
    "articleNumber",
    "description",
    "discountAmount",
    "discountAmountIncludingVat",
    "discountPercent",
    "numberOfUnits",
    "priceIncludingVat",
    "pricePerUnit",
    "rowType",
    "temporaryReference",
    "unit",
    "vatPercent"
})
@XmlSeeAlso({
    NumberedOrderRow.class
})
public class OrderRow {

    @XmlElement(name = "ArticleNumber", nillable = true)
    protected String articleNumber;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "DiscountAmount", nillable = true)
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountAmountIncludingVat", nillable = true)
    protected Boolean discountAmountIncludingVat;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "NumberOfUnits", required = true)
    protected BigDecimal numberOfUnits;
    @XmlElement(name = "PriceIncludingVat", nillable = true)
    protected Boolean priceIncludingVat;
    @XmlElement(name = "PricePerUnit", required = true)
    protected BigDecimal pricePerUnit;
    @XmlElement(name = "RowType", nillable = true)
    @XmlSchemaType(name = "string")
    protected RowType rowType;
    @XmlElement(name = "TemporaryReference", nillable = true)
    protected String temporaryReference;
    @XmlElement(name = "Unit", nillable = true)
    protected String unit;
    @XmlElement(name = "VatPercent", required = true)
    protected BigDecimal vatPercent;

    /**
     * Gets the value of the articleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleNumber() {
        return articleNumber;
    }

    /**
     * Sets the value of the articleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleNumber(String value) {
        this.articleNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountAmountIncludingVat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountAmountIncludingVat() {
        return discountAmountIncludingVat;
    }

    /**
     * Sets the value of the discountAmountIncludingVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountAmountIncludingVat(Boolean value) {
        this.discountAmountIncludingVat = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfUnits(BigDecimal value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the priceIncludingVat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceIncludingVat() {
        return priceIncludingVat;
    }

    /**
     * Sets the value of the priceIncludingVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceIncludingVat(Boolean value) {
        this.priceIncludingVat = value;
    }

    /**
     * Gets the value of the pricePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Sets the value of the pricePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePerUnit(BigDecimal value) {
        this.pricePerUnit = value;
    }

    /**
     * Gets the value of the rowType property.
     * 
     * @return
     *     possible object is
     *     {@link RowType }
     *     
     */
    public RowType getRowType() {
        return rowType;
    }

    /**
     * Sets the value of the rowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowType }
     *     
     */
    public void setRowType(RowType value) {
        this.rowType = value;
    }

    /**
     * Gets the value of the temporaryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryReference() {
        return temporaryReference;
    }

    /**
     * Sets the value of the temporaryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryReference(String value) {
        this.temporaryReference = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the vatPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatPercent() {
        return vatPercent;
    }

    /**
     * Sets the value of the vatPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatPercent(BigDecimal value) {
        this.vatPercent = value;
    }

}
