
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNumberedOrderRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNumberedOrderRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberedOrderRow" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}NumberedOrderRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNumberedOrderRow", propOrder = {
    "numberedOrderRow"
})
public class ArrayOfNumberedOrderRow {

    @XmlElement(name = "NumberedOrderRow", nillable = true)
    protected List<NumberedOrderRow> numberedOrderRow;

    /**
     * Gets the value of the numberedOrderRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the numberedOrderRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberedOrderRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberedOrderRow }
     * 
     * 
     */
    public List<NumberedOrderRow> getNumberedOrderRow() {
        if (numberedOrderRow == null) {
            numberedOrderRow = new ArrayList<NumberedOrderRow>();
        }
        return this.numberedOrderRow;
    }

}
