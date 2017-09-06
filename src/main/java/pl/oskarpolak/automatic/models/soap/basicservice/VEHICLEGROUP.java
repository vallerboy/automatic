//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:34:55 AM CEST 
//


package pl.oskarpolak.automatic.models.soap.basicservice;

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
 *         &lt;element name="GROUPID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FLEETID" type="{http://www.fleetboard.com/data}fleetidType"/&gt;
 *         &lt;element name="GROUPNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="inoid" use="required" type="{http://www.fleetboard.com/data}inoidType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "groupid",
    "fleetid",
    "groupname",
    "description"
})
@XmlRootElement(name = "VEHICLEGROUP")
public class VEHICLEGROUP {

    @XmlElement(name = "GROUPID", required = true)
    protected String groupid;
    @XmlElement(name = "FLEETID")
    protected long fleetid;
    @XmlElement(name = "GROUPNAME", required = true)
    protected String groupname;
    @XmlElement(name = "Description")
    protected String description;
    @XmlAttribute(name = "inoid", required = true)
    protected String inoid;

    /**
     * Gets the value of the groupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPID() {
        return groupid;
    }

    /**
     * Sets the value of the groupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPID(String value) {
        this.groupid = value;
    }

    /**
     * Gets the value of the fleetid property.
     * 
     */
    public long getFLEETID() {
        return fleetid;
    }

    /**
     * Sets the value of the fleetid property.
     * 
     */
    public void setFLEETID(long value) {
        this.fleetid = value;
    }

    /**
     * Gets the value of the groupname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPNAME() {
        return groupname;
    }

    /**
     * Sets the value of the groupname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPNAME(String value) {
        this.groupname = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the inoid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInoid() {
        return inoid;
    }

    /**
     * Sets the value of the inoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInoid(String value) {
        this.inoid = value;
    }

}