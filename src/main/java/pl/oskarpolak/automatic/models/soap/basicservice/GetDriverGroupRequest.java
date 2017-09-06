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
 *         &lt;element name="FleetId" type="{http://www.fleetboard.com/data}fleetidType" minOccurs="0"/&gt;
 *         &lt;element name="DriverGroupId" type="{http://www.fleetboard.com/data}driverGroupIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="limit" type="{http://www.fleetboard.com/data}limitType" /&gt;
 *       &lt;attribute name="offset" type="{http://www.fleetboard.com/data}offsetType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fleetId",
    "driverGroupId"
})
@XmlRootElement(name = "GetDriverGroupRequest")
public class GetDriverGroupRequest {

    @XmlElement(name = "FleetId")
    protected Long fleetId;
    @XmlElement(name = "DriverGroupId")
    protected Long driverGroupId;
    @XmlAttribute(name = "limit")
    protected BigInteger limit;
    @XmlAttribute(name = "offset")
    protected BigInteger offset;

    /**
     * Gets the value of the fleetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFleetId() {
        return fleetId;
    }

    /**
     * Sets the value of the fleetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFleetId(Long value) {
        this.fleetId = value;
    }

    /**
     * Gets the value of the driverGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDriverGroupId() {
        return driverGroupId;
    }

    /**
     * Sets the value of the driverGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDriverGroupId(Long value) {
        this.driverGroupId = value;
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

}
