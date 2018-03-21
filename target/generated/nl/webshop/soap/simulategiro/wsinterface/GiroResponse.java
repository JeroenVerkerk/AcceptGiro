
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
 *         &lt;element name="getal" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "getal"
})
@XmlRootElement(name = "giroResponse", namespace = "http://nl.webshop.giro/giroservice/response")
public class GiroResponse {

    @XmlElement(namespace = "http://nl.webshop.giro/giroservice/response")
    protected double getal;

    /**
     * Gets the value of the getal property.
     * 
     */
    public double getGetal() {
        return getal;
    }

    /**
     * Sets the value of the getal property.
     * 
     */
    public void setGetal(double value) {
        this.getal = value;
    }

}
