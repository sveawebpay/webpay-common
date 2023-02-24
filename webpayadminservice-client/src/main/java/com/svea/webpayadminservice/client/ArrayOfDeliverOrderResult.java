
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDeliverOrderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDeliverOrderResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliverOrderResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}DeliverOrderResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeliverOrderResult", propOrder = {
    "deliverOrderResult"
})
public class ArrayOfDeliverOrderResult {

    @XmlElement(name = "DeliverOrderResult", nillable = true)
    protected List<DeliverOrderResult> deliverOrderResult;

    /**
     * Gets the value of the deliverOrderResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliverOrderResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliverOrderResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliverOrderResult }
     * 
     * 
     */
    public List<DeliverOrderResult> getDeliverOrderResult() {
        if (deliverOrderResult == null) {
            deliverOrderResult = new ArrayList<DeliverOrderResult>();
        }
        return this.deliverOrderResult;
    }

}
