
package com.svea.webpayadminservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPaymentPlanReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPaymentPlanReportRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentPlanReportRow" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}PaymentPlanReportRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaymentPlanReportRow", propOrder = {
    "paymentPlanReportRow"
})
public class ArrayOfPaymentPlanReportRow {

    @XmlElement(name = "PaymentPlanReportRow", nillable = true)
    protected List<PaymentPlanReportRow> paymentPlanReportRow;

    /**
     * Gets the value of the paymentPlanReportRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPlanReportRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPlanReportRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentPlanReportRow }
     * 
     * 
     */
    public List<PaymentPlanReportRow> getPaymentPlanReportRow() {
        if (paymentPlanReportRow == null) {
            paymentPlanReportRow = new ArrayList<PaymentPlanReportRow>();
        }
        return this.paymentPlanReportRow;
    }

}
