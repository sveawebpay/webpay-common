
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGetAccountCreditInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGetAccountCreditInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetAccountCreditInformation" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account}GetAccountCreditInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetAccountCreditInformation", namespace = "http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Account", propOrder = {
    "getAccountCreditInformation"
})
public class ArrayOfGetAccountCreditInformation {

    @XmlElement(name = "GetAccountCreditInformation", nillable = true)
    protected List<GetAccountCreditInformation> getAccountCreditInformation;

    /**
     * Gets the value of the getAccountCreditInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the getAccountCreditInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetAccountCreditInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetAccountCreditInformation }
     * 
     * 
     */
    public List<GetAccountCreditInformation> getGetAccountCreditInformation() {
        if (getAccountCreditInformation == null) {
            getAccountCreditInformation = new ArrayList<GetAccountCreditInformation>();
        }
        return this.getAccountCreditInformation;
    }

}
