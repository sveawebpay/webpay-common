
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrderRowsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrderRowsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}BasicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RowNumbers" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}ArrayOfOrderRowReferenceItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrderRowsResponse", propOrder = {
    "rowNumbers"
})
public class AddOrderRowsResponse
    extends BasicResponse
{

    @XmlElement(name = "RowNumbers", nillable = true)
    protected ArrayOfOrderRowReferenceItem rowNumbers;

    /**
     * Gets the value of the rowNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderRowReferenceItem }
     *     
     */
    public ArrayOfOrderRowReferenceItem getRowNumbers() {
        return rowNumbers;
    }

    /**
     * Sets the value of the rowNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderRowReferenceItem }
     *     
     */
    public void setRowNumbers(ArrayOfOrderRowReferenceItem value) {
        this.rowNumbers = value;
    }

}
