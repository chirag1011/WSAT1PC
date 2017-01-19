
package com.unf.edu.wsat.billpay;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "BillPayException", targetNamespace = "http://jaxws.billpay.wsat.edu.unf.com/")
public class BillPayException
    extends Exception
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 7950765506673433441L;
	/**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.unf.edu.wsat.billpay.jaxws.BillPayException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public BillPayException(String message, com.unf.edu.wsat.billpay.jaxws.BillPayException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public BillPayException(String message, com.unf.edu.wsat.billpay.jaxws.BillPayException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.unf.edu.wsat.billpay.jaxws.BillPayException
     */
    public com.unf.edu.wsat.billpay.jaxws.BillPayException getFaultInfo() {
        return faultInfo;
    }

}
