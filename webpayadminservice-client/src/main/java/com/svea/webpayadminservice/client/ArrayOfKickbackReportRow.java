
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKickbackReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKickbackReportRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KickbackReportRow" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}KickbackReportRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKickbackReportRow", propOrder = {
    "kickbackReportRow"
})
public class ArrayOfKickbackReportRow {

    @XmlElement(name = "KickbackReportRow", nillable = true)
    protected List<KickbackReportRow> kickbackReportRow;

    /**
     * Gets the value of the kickbackReportRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kickbackReportRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKickbackReportRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KickbackReportRow }
     * 
     * 
     */
    public List<KickbackReportRow> getKickbackReportRow() {
        if (kickbackReportRow == null) {
            kickbackReportRow = new ArrayList<KickbackReportRow>();
        }
        return this.kickbackReportRow;
    }

}
