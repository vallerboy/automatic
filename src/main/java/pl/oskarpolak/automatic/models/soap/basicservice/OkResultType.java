//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:34:55 AM CEST 
//


package pl.oskarpolak.automatic.models.soap.basicservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for okResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="okResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKResult" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="vehicleID" use="required" type="{http://www.fleetboard.com/data}vehicleidType" /&gt;
 *                 &lt;attribute name="inoid" use="required" type="{http://www.fleetboard.com/data}inoidType" /&gt;
 *                 &lt;attribute name="fbid" use="required" type="{http://www.fleetboard.com/data}fbidType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "okResultType", propOrder = {
    "okResult"
})
public class OkResultType {

    @XmlElement(name = "OKResult", required = true)
    protected List<OkResultType.OKResult> okResult;

    /**
     * Gets the value of the okResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the okResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOKResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OkResultType.OKResult }
     * 
     * 
     */
    public List<OkResultType.OKResult> getOKResult() {
        if (okResult == null) {
            okResult = new ArrayList<OkResultType.OKResult>();
        }
        return this.okResult;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="vehicleID" use="required" type="{http://www.fleetboard.com/data}vehicleidType" /&gt;
     *       &lt;attribute name="inoid" use="required" type="{http://www.fleetboard.com/data}inoidType" /&gt;
     *       &lt;attribute name="fbid" use="required" type="{http://www.fleetboard.com/data}fbidType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OKResult {

        @XmlAttribute(name = "vehicleID", required = true)
        protected long vehicleID;
        @XmlAttribute(name = "inoid", required = true)
        protected String inoid;
        @XmlAttribute(name = "fbid", required = true)
        protected String fbid;

        /**
         * Gets the value of the vehicleID property.
         * 
         */
        public long getVehicleID() {
            return vehicleID;
        }

        /**
         * Sets the value of the vehicleID property.
         * 
         */
        public void setVehicleID(long value) {
            this.vehicleID = value;
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

        /**
         * Gets the value of the fbid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFbid() {
            return fbid;
        }

        /**
         * Sets the value of the fbid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFbid(String value) {
            this.fbid = value;
        }

    }

}