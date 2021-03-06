//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:34:55 AM CEST 
//


package pl.oskarpolak.automatic.models.soap.basicservice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDriverResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDriverResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DriverInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DriverNameID" type="{http://www.fleetboard.com/data}driverNameIDType"/&gt;
 *                   &lt;element name="DriverToken" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DriverTokenKind"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="SIM"/&gt;
 *                                   &lt;enumeration value="FB"/&gt;
 *                                   &lt;enumeration value="KEY"/&gt;
 *                                   &lt;enumeration value="DTCO"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Locale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Status" type="{http://www.fleetboard.com/data}driverStatusType" minOccurs="0"/&gt;
 *                   &lt;element name="DriverGroup" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DriverGroupId" type="{http://www.fleetboard.com/data}driverGroupIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "GetDriverResponseType", propOrder = {
    "driverInfo"
})
public class GetDriverResponseType {

    @XmlElement(name = "DriverInfo")
    protected List<GetDriverResponseType.DriverInfo> driverInfo;
    @XmlAttribute(name = "limit")
    protected BigInteger limit;
    @XmlAttribute(name = "offset")
    protected BigInteger offset;
    @XmlAttribute(name = "resultSize")
    protected BigInteger resultSize;
    @XmlAttribute(name = "responseSize")
    protected BigInteger responseSize;

    /**
     * Gets the value of the driverInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetDriverResponseType.DriverInfo }
     * 
     * 
     */
    public List<GetDriverResponseType.DriverInfo> getDriverInfo() {
        if (driverInfo == null) {
            driverInfo = new ArrayList<GetDriverResponseType.DriverInfo>();
        }
        return this.driverInfo;
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
     *         &lt;element name="DriverNameID" type="{http://www.fleetboard.com/data}driverNameIDType"/&gt;
     *         &lt;element name="DriverToken" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DriverTokenKind"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="SIM"/&gt;
     *                         &lt;enumeration value="FB"/&gt;
     *                         &lt;enumeration value="KEY"/&gt;
     *                         &lt;enumeration value="DTCO"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Locale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Status" type="{http://www.fleetboard.com/data}driverStatusType" minOccurs="0"/&gt;
     *         &lt;element name="DriverGroup" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DriverGroupId" type="{http://www.fleetboard.com/data}driverGroupIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
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
    @XmlType(name = "", propOrder = {
        "driverNameID",
        "driverToken",
        "firstName",
        "lastName",
        "locale",
        "comment",
        "status",
        "driverGroup"
    })
    public static class DriverInfo {

        @XmlElement(name = "DriverNameID")
        protected long driverNameID;
        @XmlElement(name = "DriverToken")
        protected List<GetDriverResponseType.DriverInfo.DriverToken> driverToken;
        @XmlElement(name = "FirstName", required = true)
        protected String firstName;
        @XmlElement(name = "LastName", required = true)
        protected String lastName;
        @XmlElement(name = "Locale", required = true)
        protected String locale;
        @XmlElement(name = "Comment", required = true)
        protected String comment;
        @XmlElement(name = "Status")
        @XmlSchemaType(name = "string")
        protected DriverStatusType status;
        @XmlElement(name = "DriverGroup")
        protected GetDriverResponseType.DriverInfo.DriverGroup driverGroup;

        /**
         * Gets the value of the driverNameID property.
         * 
         */
        public long getDriverNameID() {
            return driverNameID;
        }

        /**
         * Sets the value of the driverNameID property.
         * 
         */
        public void setDriverNameID(long value) {
            this.driverNameID = value;
        }

        /**
         * Gets the value of the driverToken property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the driverToken property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDriverToken().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetDriverResponseType.DriverInfo.DriverToken }
         * 
         * 
         */
        public List<GetDriverResponseType.DriverInfo.DriverToken> getDriverToken() {
            if (driverToken == null) {
                driverToken = new ArrayList<GetDriverResponseType.DriverInfo.DriverToken>();
            }
            return this.driverToken;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the locale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocale() {
            return locale;
        }

        /**
         * Sets the value of the locale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocale(String value) {
            this.locale = value;
        }

        /**
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link DriverStatusType }
         *     
         */
        public DriverStatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link DriverStatusType }
         *     
         */
        public void setStatus(DriverStatusType value) {
            this.status = value;
        }

        /**
         * Gets the value of the driverGroup property.
         * 
         * @return
         *     possible object is
         *     {@link GetDriverResponseType.DriverInfo.DriverGroup }
         *     
         */
        public GetDriverResponseType.DriverInfo.DriverGroup getDriverGroup() {
            return driverGroup;
        }

        /**
         * Sets the value of the driverGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetDriverResponseType.DriverInfo.DriverGroup }
         *     
         */
        public void setDriverGroup(GetDriverResponseType.DriverInfo.DriverGroup value) {
            this.driverGroup = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="DriverGroupId" type="{http://www.fleetboard.com/data}driverGroupIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "driverGroupId"
        })
        public static class DriverGroup {

            @XmlElement(name = "DriverGroupId", type = Long.class)
            protected List<Long> driverGroupId;

            /**
             * Gets the value of the driverGroupId property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the driverGroupId property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDriverGroupId().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            public List<Long> getDriverGroupId() {
                if (driverGroupId == null) {
                    driverGroupId = new ArrayList<Long>();
                }
                return this.driverGroupId;
            }

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
         *       &lt;sequence&gt;
         *         &lt;element name="DriverTokenKind"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="SIM"/&gt;
         *               &lt;enumeration value="FB"/&gt;
         *               &lt;enumeration value="KEY"/&gt;
         *               &lt;enumeration value="DTCO"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "driverTokenKind",
            "token"
        })
        public static class DriverToken {

            @XmlElement(name = "DriverTokenKind", required = true)
            protected String driverTokenKind;
            @XmlElement(name = "Token", required = true)
            protected String token;

            /**
             * Gets the value of the driverTokenKind property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDriverTokenKind() {
                return driverTokenKind;
            }

            /**
             * Sets the value of the driverTokenKind property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDriverTokenKind(String value) {
                this.driverTokenKind = value;
            }

            /**
             * Gets the value of the token property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getToken() {
                return token;
            }

            /**
             * Sets the value of the token property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setToken(String value) {
                this.token = value;
            }

        }

    }

}
