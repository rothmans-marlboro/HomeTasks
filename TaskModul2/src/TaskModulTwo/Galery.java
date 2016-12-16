//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 04:37:28 PM MSK 
//


package TaskModulTwo;

import java.math.BigInteger;
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
 *         &lt;element name="flower" maxOccurs="3">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="soil">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="grunt"/>
 *                         &lt;enumeration value="podsol"/>
 *                         &lt;enumeration value="sod-podzol"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="visualParametrs">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="colour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="growingTips">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="watering" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="multiplying">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="cuttings"/>
 *                         &lt;enumeration value="seed"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
    "flower"
})
@XmlRootElement(name = "galery")
public class Galery {

    @XmlElement(required = true)
    protected List<Galery.Flower> flower;

    /**
     * Gets the value of the flower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Galery.Flower }
     * 
     * 
     */
    public List<Galery.Flower> getFlower() {
        if (flower == null) {
            flower = new ArrayList<Galery.Flower>();
        }
        return this.flower;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="soil">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="grunt"/>
     *               &lt;enumeration value="podsol"/>
     *               &lt;enumeration value="sod-podzol"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="visualParametrs">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="colour" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="growingTips">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="watering" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="multiplying">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="cuttings"/>
     *               &lt;enumeration value="seed"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "name",
        "soil",
        "origin",
        "visualParametrs",
        "growingTips",
        "multiplying"
    })
    public static class Flower {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String soil;
        @XmlElement(required = true)
        protected String origin;
        @XmlElement(required = true)
        protected Galery.Flower.VisualParametrs visualParametrs;
        @XmlElement(required = true)
        protected Galery.Flower.GrowingTips growingTips;
        @XmlElement(required = true)
        protected String multiplying;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the soil property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSoil() {
            return soil;
        }

        /**
         * Sets the value of the soil property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSoil(String value) {
            this.soil = value;
        }

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the visualParametrs property.
         * 
         * @return
         *     possible object is
         *     {@link Galery.Flower.VisualParametrs }
         *     
         */
        public Galery.Flower.VisualParametrs getVisualParametrs() {
            return visualParametrs;
        }

        /**
         * Sets the value of the visualParametrs property.
         * 
         * @param value
         *     allowed object is
         *     {@link Galery.Flower.VisualParametrs }
         *     
         */
        public void setVisualParametrs(Galery.Flower.VisualParametrs value) {
            this.visualParametrs = value;
        }

        /**
         * Gets the value of the growingTips property.
         * 
         * @return
         *     possible object is
         *     {@link Galery.Flower.GrowingTips }
         *     
         */
        public Galery.Flower.GrowingTips getGrowingTips() {
            return growingTips;
        }

        /**
         * Sets the value of the growingTips property.
         * 
         * @param value
         *     allowed object is
         *     {@link Galery.Flower.GrowingTips }
         *     
         */
        public void setGrowingTips(Galery.Flower.GrowingTips value) {
            this.growingTips = value;
        }

        /**
         * Gets the value of the multiplying property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMultiplying() {
            return multiplying;
        }

        /**
         * Sets the value of the multiplying property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMultiplying(String value) {
            this.multiplying = value;
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
         *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="watering" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            "temperature",
            "watering"
        })
        public static class GrowingTips {

            @XmlElement(required = true)
            protected BigInteger temperature;
            @XmlElement(required = true)
            protected BigInteger watering;

            /**
             * Gets the value of the temperature property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTemperature() {
                return temperature;
            }

            /**
             * Sets the value of the temperature property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTemperature(BigInteger value) {
                this.temperature = value;
            }

            /**
             * Gets the value of the watering property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getWatering() {
                return watering;
            }

            /**
             * Sets the value of the watering property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setWatering(BigInteger value) {
                this.watering = value;
            }

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
         *         &lt;element name="colour" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            "colour",
            "length"
        })
        public static class VisualParametrs {

            @XmlElement(required = true)
            protected String colour;
            @XmlElement(required = true)
            protected BigInteger length;

            /**
             * Gets the value of the colour property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getColour() {
                return colour;
            }

            /**
             * Sets the value of the colour property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setColour(String value) {
                this.colour = value;
            }

            /**
             * Gets the value of the length property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLength() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLength(BigInteger value) {
                this.length = value;
            }

        }

    }

}