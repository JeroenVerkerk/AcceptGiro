
package nl.webshop.soap.simulategiro.wsinterface;

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
 *         &lt;element name="naam" type="{http://nl.webshop.giro/giroservice/request}naamType"/>
 *         &lt;element name="adres" type="{http://nl.webshop.giro/giroservice/request}adresType"/>
 *         &lt;element name="bedrag" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "naam",
    "adres",
    "bedrag"
})
@XmlRootElement(name = "giroRequest")
public class GiroRequest {

    @XmlElement(required = true)
    protected String naam;
    @XmlElement(required = true)
    protected String adres;
    protected double bedrag;

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdres(String value) {
        this.adres = value;
    }

    /**
     * Gets the value of the bedrag property.
     * 
     */
    public double getBedrag() {
        return bedrag;
    }

    /**
     * Sets the value of the bedrag property.
     * 
     */
    public void setBedrag(double value) {
        this.bedrag = value;
    }

}
