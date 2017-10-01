//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.01 at 11:12:38 PM PKT 
//


package dk.semler.ws.vehiclesalecalculator.v201412.calculateusedvehicle.request;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the trade-in car as seller might buy as part of the deal.			
 * 			
 * 
 * <p>Java class for VEHICLESOLDTODEALERType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VEHICLESOLDTODEALERType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRICE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VATAMOUNT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OUTSTANDINGDEBT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VEHICLESOLDTODEALERType", propOrder = {
    "price",
    "vatamount",
    "outstandingdebt"
})
public class VEHICLESOLDTODEALERType {

    @XmlElement(name = "PRICE", required = true)
    protected BigDecimal price;
    @XmlElement(name = "VATAMOUNT")
    protected BigDecimal vatamount;
    @XmlElement(name = "OUTSTANDINGDEBT")
    protected BigDecimal outstandingdebt;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICE(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the vatamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATAMOUNT() {
        return vatamount;
    }

    /**
     * Sets the value of the vatamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATAMOUNT(BigDecimal value) {
        this.vatamount = value;
    }

    /**
     * Gets the value of the outstandingdebt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOUTSTANDINGDEBT() {
        return outstandingdebt;
    }

    /**
     * Sets the value of the outstandingdebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOUTSTANDINGDEBT(BigDecimal value) {
        this.outstandingdebt = value;
    }

    public VEHICLESOLDTODEALERType withPRICE(BigDecimal value) {
        setPRICE(value);
        return this;
    }

    public VEHICLESOLDTODEALERType withVATAMOUNT(BigDecimal value) {
        setVATAMOUNT(value);
        return this;
    }

    public VEHICLESOLDTODEALERType withOUTSTANDINGDEBT(BigDecimal value) {
        setOUTSTANDINGDEBT(value);
        return this;
    }

}