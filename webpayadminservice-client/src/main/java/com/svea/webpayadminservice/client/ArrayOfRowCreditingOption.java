
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRowCreditingOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRowCreditingOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RowCreditingOption" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}RowCreditingOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRowCreditingOption", propOrder = {
    "rowCreditingOption"
})
public class ArrayOfRowCreditingOption {

    @XmlElement(name = "RowCreditingOption", nillable = true)
    protected List<RowCreditingOption> rowCreditingOption;

    /**
     * Gets the value of the rowCreditingOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rowCreditingOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRowCreditingOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowCreditingOption }
     * 
     * 
     */
    public List<RowCreditingOption> getRowCreditingOption() {
        if (rowCreditingOption == null) {
            rowCreditingOption = new ArrayList<RowCreditingOption>();
        }
        return this.rowCreditingOption;
    }

}
