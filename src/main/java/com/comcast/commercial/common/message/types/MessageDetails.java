//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.22 at 12:29:16 PM IST 
//


package com.comcast.commercial.common.message.types;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://commercial.comcast.com/common/message/types}MessageDetail" maxOccurs="unbounded"/>
 *         &lt;element name="MessageDetailsHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="releaseVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="eventName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://commercial.comcast.com/common/message/types}HeaderProperties" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "messageDetail",
    "messageDetailsHeader"
})
@XmlRootElement(name = "MessageDetails")
public class MessageDetails {

    @XmlElement(name = "MessageDetail", required = true)
    protected List<MessageDetail> messageDetail;
    @XmlElement(name = "MessageDetailsHeader", required = true)
    protected MessageDetails.MessageDetailsHeader messageDetailsHeader;

    /**
     * Gets the value of the messageDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDetail }
     * 
     * 
     */
    public List<MessageDetail> getMessageDetail() {
        if (messageDetail == null) {
            messageDetail = new ArrayList<MessageDetail>();
        }
        return this.messageDetail;
    }

    /**
     * Gets the value of the messageDetailsHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDetails.MessageDetailsHeader }
     *     
     */
    public MessageDetails.MessageDetailsHeader getMessageDetailsHeader() {
        return messageDetailsHeader;
    }

    /**
     * Sets the value of the messageDetailsHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDetails.MessageDetailsHeader }
     *     
     */
    public void setMessageDetailsHeader(MessageDetails.MessageDetailsHeader value) {
        this.messageDetailsHeader = value;
    }


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
     *         &lt;element name="releaseVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="eventName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{http://commercial.comcast.com/common/message/types}HeaderProperties" minOccurs="0"/>
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
        "releaseVersion",
        "eventName",
        "headerProperties"
    })
    public static class MessageDetailsHeader {

        @XmlElement(required = true)
        protected String releaseVersion;
        @XmlElement(required = true)
        protected String eventName;
        @XmlElement(name = "HeaderProperties")
        protected HeaderProperties headerProperties;

        /**
         * Gets the value of the releaseVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReleaseVersion() {
            return releaseVersion;
        }

        /**
         * Sets the value of the releaseVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReleaseVersion(String value) {
            this.releaseVersion = value;
        }

        /**
         * Gets the value of the eventName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventName() {
            return eventName;
        }

        /**
         * Sets the value of the eventName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventName(String value) {
            this.eventName = value;
        }

        /**
         * Gets the value of the headerProperties property.
         * 
         * @return
         *     possible object is
         *     {@link HeaderProperties }
         *     
         */
        public HeaderProperties getHeaderProperties() {
            return headerProperties;
        }

        /**
         * Sets the value of the headerProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link HeaderProperties }
         *     
         */
        public void setHeaderProperties(HeaderProperties value) {
            this.headerProperties = value;
        }

    }

}
