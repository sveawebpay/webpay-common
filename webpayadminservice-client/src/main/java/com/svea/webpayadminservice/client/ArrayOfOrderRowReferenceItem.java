
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderRowReferenceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderRowReferenceItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderRowReferenceItem" type="{http://schemas.datacontract.org/2004/07/DataObjects.Webservice}OrderRowReferenceItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderRowReferenceItem", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Webservice", propOrder = {
    "orderRowReferenceItem"
})
public class ArrayOfOrderRowReferenceItem {

    @XmlElement(name = "OrderRowReferenceItem", nillable = true)
    protected List<OrderRowReferenceItem> orderRowReferenceItem;

    /**
     * Gets the value of the orderRowReferenceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderRowReferenceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderRowReferenceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderRowReferenceItem }
     * 
     * 
     */
    public List<OrderRowReferenceItem> getOrderRowReferenceItem() {
        if (orderRowReferenceItem == null) {
            orderRowReferenceItem = new ArrayList<OrderRowReferenceItem>();
        }
        return this.orderRowReferenceItem;
    }

}
