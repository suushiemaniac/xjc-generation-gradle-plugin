//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.10 at 11:25:14 AM EST 
//


package ch.forum_datenaustausch.invoice400;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for recordLabType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordLabType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.forum-datenaustausch.ch/de&gt;stringType1_350"&gt;
 *       &lt;attribute name="record_id" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="tariff_type" default="316"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="[0-9A-Z]{3}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="code" use="required" type="{http://www.forum-datenaustausch.ch/de}stringType1_20" /&gt;
 *       &lt;attribute name="quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="date_begin" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="date_end" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ean_provider" type="{http://www.forum-datenaustausch.ch/de}unionPartyType" /&gt;
 *       &lt;attribute name="ean_responsible" type="{http://www.forum-datenaustausch.ch/de}unionPartyType" /&gt;
 *       &lt;attribute name="unit" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;minInclusive value="0.0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="unit_factor" default="1.0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;minExclusive value="0.0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="external_factor" default="1.0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;minInclusive value="0.0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="amount" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="vat_rate" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="100"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="validate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="obligation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="remark" type="{http://www.forum-datenaustausch.ch/de}stringType1_350" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordLabType", propOrder = {
    "value"
})
public class RecordLabType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "record_id", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger recordId;
    @XmlAttribute(name = "tariff_type")
    protected String tariffType;
    @XmlAttribute(name = "code", required = true)
    protected String code;
    @XmlAttribute(name = "quantity", required = true)
    protected double quantity;
    @XmlAttribute(name = "date_begin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBegin;
    @XmlAttribute(name = "date_end")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEnd;
    @XmlAttribute(name = "ean_provider")
    protected String eanProvider;
    @XmlAttribute(name = "ean_responsible")
    protected String eanResponsible;
    @XmlAttribute(name = "unit", required = true)
    protected double unit;
    @XmlAttribute(name = "unit_factor")
    protected Double unitFactor;
    @XmlAttribute(name = "external_factor")
    protected Double externalFactor;
    @XmlAttribute(name = "amount", required = true)
    protected double amount;
    @XmlAttribute(name = "vat_rate")
    protected Double vatRate;
    @XmlAttribute(name = "validate")
    protected Boolean validate;
    @XmlAttribute(name = "obligation")
    protected Boolean obligation;
    @XmlAttribute(name = "remark")
    protected String remark;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordId(BigInteger value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the tariffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffType() {
        if (tariffType == null) {
            return "316";
        } else {
            return tariffType;
        }
    }

    /**
     * Sets the value of the tariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffType(String value) {
        this.tariffType = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the dateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBegin() {
        return dateBegin;
    }

    /**
     * Sets the value of the dateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBegin(XMLGregorianCalendar value) {
        this.dateBegin = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the eanProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEanProvider() {
        return eanProvider;
    }

    /**
     * Sets the value of the eanProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEanProvider(String value) {
        this.eanProvider = value;
    }

    /**
     * Gets the value of the eanResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEanResponsible() {
        return eanResponsible;
    }

    /**
     * Sets the value of the eanResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEanResponsible(String value) {
        this.eanResponsible = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     */
    public double getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     */
    public void setUnit(double value) {
        this.unit = value;
    }

    /**
     * Gets the value of the unitFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getUnitFactor() {
        if (unitFactor == null) {
            return  1.0D;
        } else {
            return unitFactor;
        }
    }

    /**
     * Sets the value of the unitFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitFactor(Double value) {
        this.unitFactor = value;
    }

    /**
     * Gets the value of the externalFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getExternalFactor() {
        if (externalFactor == null) {
            return  1.0D;
        } else {
            return externalFactor;
        }
    }

    /**
     * Sets the value of the externalFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExternalFactor(Double value) {
        this.externalFactor = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getVatRate() {
        if (vatRate == null) {
            return  0.0D;
        } else {
            return vatRate;
        }
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVatRate(Double value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the validate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isValidate() {
        if (validate == null) {
            return true;
        } else {
            return validate;
        }
    }

    /**
     * Sets the value of the validate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidate(Boolean value) {
        this.validate = value;
    }

    /**
     * Gets the value of the obligation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isObligation() {
        if (obligation == null) {
            return true;
        } else {
            return obligation;
        }
    }

    /**
     * Sets the value of the obligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObligation(Boolean value) {
        this.obligation = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
