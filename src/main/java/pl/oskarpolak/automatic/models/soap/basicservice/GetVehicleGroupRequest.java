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
 *         &lt;element name="GroupId" type="{http://www.fleetboard.com/data}vehicleGroupIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="limit" type="{http://www.fleetboard.com/data}limitType" /&gt;
 *       &lt;attribute name="offset" type="{http://www.fleetboard.com/data}offsetType" /&gt;
 *       &lt;attribute name="version" type="{http://www.fleetboard.com/data}versionType" /&gt;
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
    "groupId"
})
@XmlRootElement(name = "GetVehicleGroupRequest")
public class GetVehicleGroupRequest {

    @XmlElement(name = "FleetId")
    protected Long fleetId;
    @XmlElement(name = "GroupId")
    protected Long groupId;
    @XmlAttribute(name = "limit")
    protected BigInteger limit;
    @XmlAttribute(name = "offset")
    protected BigInteger offset;
    @XmlAttribute(name = "version")
    protected Long version;

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
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupId(Long value) {
        this.groupId = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

}
