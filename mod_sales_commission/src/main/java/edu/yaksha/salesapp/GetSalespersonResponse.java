//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.27 at 12:00:45 PM IST 
//


package edu.yaksha.salesapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Salesperson" type="{http://yaksha.edu/salesapp}SalesPerson"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "salesperson"
})
@XmlRootElement(name = "GetSalespersonResponse")
public class GetSalespersonResponse {

    @XmlElement(name = "Salesperson", required = true)
    protected SalesPerson salesperson;

    /**
     * Gets the value of the salesperson property.
     * 
     * @return
     *     possible object is
     *     {@link SalesPerson }
     *     
     */
    public SalesPerson getSalesperson() {
        return salesperson;
    }

    /**
     * Sets the value of the salesperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPerson }
     *     
     */
    public void setSalesperson(SalesPerson value) {
        this.salesperson = value;
    }

}
