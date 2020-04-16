
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCancellationRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCancellationRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancellationRow" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}CancellationRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCancellationRow", propOrder = {
    "cancellationRow"
})
public class ArrayOfCancellationRow {

    @XmlElement(name = "CancellationRow", nillable = true)
    protected List<CancellationRow> cancellationRow;

    /**
     * Gets the value of the cancellationRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancellationRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancellationRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationRow }
     * 
     * 
     */
    public List<CancellationRow> getCancellationRow() {
        if (cancellationRow == null) {
            cancellationRow = new ArrayList<CancellationRow>();
        }
        return this.cancellationRow;
    }

}
