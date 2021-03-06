//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.10 at 03:44:48 PM EDT 
//


package com.github.edeandrea.xjcplugin.generated.maven2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Download policy.
 * 
 * <p>Java class for RepositoryPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepositoryPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checksumPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryPolicy", propOrder = {

})
public class RepositoryPolicy
    implements Serializable
{

    protected String enabled;
    protected String updatePolicy;
    protected String checksumPolicy;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the updatePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatePolicy() {
        return updatePolicy;
    }

    /**
     * Sets the value of the updatePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatePolicy(String value) {
        this.updatePolicy = value;
    }

    /**
     * Gets the value of the checksumPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksumPolicy() {
        return checksumPolicy;
    }

    /**
     * Sets the value of the checksumPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksumPolicy(String value) {
        this.checksumPolicy = value;
    }

}
