
package com.example.jaxws.ws.testwsdl2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.8
 * 2023-01-27T23:38:25.294+01:00
 * Generated source version: 3.3.8
 */

@WebFault(name = "errorCode", targetNamespace = "http://bean.testwsdl2.ws.jaxws.example.com")
public class SrvEx extends Exception {

    private java.lang.String faultInfo;

    public SrvEx() {
        super();
    }

    public SrvEx(String message) {
        super(message);
    }

    public SrvEx(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SrvEx(String message, java.lang.String errorCode) {
        super(message);
        this.faultInfo = errorCode;
    }

    public SrvEx(String message, java.lang.String errorCode, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = errorCode;
    }

    public java.lang.String getFaultInfo() {
        return this.faultInfo;
    }
}
