//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:34:55 AM CEST 
//


package pl.oskarpolak.automatic.models.soap.basicservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fleetboard.com/data}FLEET"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="limit" type="{http://www.fleetboard.com/data}limitType" /&gt;
 *       &lt;attribute name="offset" type="{http://www.fleetboard.com/data}offsetType" /&gt;
 *       &lt;attribute name="resultSize" type="{http://www.fleetboard.com/data}resultSizeType" /&gt;
 *       &lt;attribute name="responseSize" type="{http://www.fleetboard.com/data}responseSizeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fleet"
})
@XmlRootElement(name = "GetFleetResponse")
public class GetFleetResponse {

    @XmlElement(name = "FLEET", required = true)
    protected FLEET fleet;
    @XmlAttribute(name = "limit")
    protected BigInteger limit;
    @XmlAttribute(name = "offset")
    protected BigInteger offset;
    @XmlAttribute(name = "resultSize")
    protected BigInteger resultSize;
    @XmlAttribute(name = "responseSize")
    protected BigInteger responseSize;

    /**
     * Gets the value of the fleet property.
     * 
     * @return
     *     possible object is
     *     {@link FLEET }
     *     
     */
    public FLEET getFLEET() {
        return fleet;
    }

    /**
     * Sets the value of the fleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEET }
     *     
     */
    public void setFLEET(FLEET value) {
        this.fleet = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimit(BigInteger value) {
        this.limit = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffset(BigInteger value) {
        this.offset = value;
    }

    /**
     * Gets the value of the resultSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultSize() {
        return resultSize;
    }

    /**
     * Sets the value of the resultSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultSize(BigInteger value) {
        this.resultSize = value;
    }

    /**
     * Gets the value of the responseSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResponseSize() {
        return responseSize;
    }

    /**
     * Sets the value of the responseSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResponseSize(BigInteger value) {
        this.responseSize = value;
    }

}
