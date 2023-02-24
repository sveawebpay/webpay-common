
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSpecificationReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSpecificationReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rows" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}ArrayOfSpecificationRow" minOccurs="0"/&gt;
 *         &lt;element name="Summation" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}SpecificationSummation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSpecificationReportResponse", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Requests", propOrder = {
    "rows",
    "summation"
})
public class GetSpecificationReportResponse2
    extends BasicResponse
{

    @XmlElement(name = "Rows", nillable = true)
    protected ArrayOfSpecificationRow rows;
    @XmlElement(name = "Summation", nillable = true)
    protected SpecificationSummation summation;

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecificationRow }
     *     
     */
    public ArrayOfSpecificationRow getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecificationRow }
     *     
     */
    public void setRows(ArrayOfSpecificationRow value) {
        this.rows = value;
    }

    /**
     * Gets the value of the summation property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationSummation }
     *     
     */
    public SpecificationSummation getSummation() {
        return summation;
    }

    /**
     * Sets the value of the summation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationSummation }
     *     
     */
    public void setSummation(SpecificationSummation value) {
        this.summation = value;
    }

}
