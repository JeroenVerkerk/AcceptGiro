
package nl.webshop.soap.simulategiro.wsinterface;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.webshop.soap.simulategiro.wsinterface package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.webshop.soap.simulategiro.wsinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GiroResponse }
     * 
     */
    public GiroResponse createGiroResponse() {
        return new GiroResponse();
    }

    /**
     * Create an instance of {@link GiroRequest }
     * 
     */
    public GiroRequest createGiroRequest() {
        return new GiroRequest();
    }

    /**
     * Create an instance of {@link GiroFault }
     * 
     */
    public GiroFault createGiroFault() {
        return new GiroFault();
    }

}
