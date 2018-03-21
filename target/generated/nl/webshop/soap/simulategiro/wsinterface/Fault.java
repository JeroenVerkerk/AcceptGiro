
package nl.webshop.soap.simulategiro.wsinterface;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "giroFault", targetNamespace = "http://nl.webshop.giro/giroservice/fault")
public class Fault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GiroFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Fault(String message, GiroFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Fault(String message, GiroFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: nl.webshop.soap.simulategiro.wsinterface.GiroFault
     */
    public GiroFault getFaultInfo() {
        return faultInfo;
    }

}