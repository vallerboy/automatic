//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:34:55 AM CEST 
//


package pl.oskarpolak.automatic.models.soap.basicservice;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Popup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Orderdone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "popup",
    "sound",
    "email",
    "sms",
    "orderdone"
})
@XmlRootElement(name = "RXMessage")
public class RXMessage {

    @XmlElement(name = "Popup")
    protected String popup;
    @XmlElement(name = "Sound")
    protected String sound;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "SMS")
    protected String sms;
    @XmlElement(name = "Orderdone")
    protected String orderdone;

    /**
     * Gets the value of the popup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopup() {
        return popup;
    }

    /**
     * Sets the value of the popup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopup(String value) {
        this.popup = value;
    }

    /**
     * Gets the value of the sound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSound() {
        return sound;
    }

    /**
     * Sets the value of the sound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSound(String value) {
        this.sound = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMS() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMS(String value) {
        this.sms = value;
    }

    /**
     * Gets the value of the orderdone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderdone() {
        return orderdone;
    }

    /**
     * Sets the value of the orderdone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderdone(String value) {
        this.orderdone = value;
    }

}