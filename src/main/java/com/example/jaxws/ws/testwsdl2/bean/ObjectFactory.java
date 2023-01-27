
package com.example.jaxws.ws.testwsdl2.bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.jaxws.ws.testwsdl2.bean package. 
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

    private final static QName _TestWsdl2Req_QNAME = new QName("http://bean.testwsdl2.ws.jaxws.example.com", "testWsdl2Req");
    private final static QName _TestWsdl2Resp_QNAME = new QName("http://bean.testwsdl2.ws.jaxws.example.com", "testWsdl2Resp");
    private final static QName _ErrorCode_QNAME = new QName("http://bean.testwsdl2.ws.jaxws.example.com", "errorCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.jaxws.ws.testwsdl2.bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestWsdl2Req }
     * 
     */
    public TestWsdl2Req createTestWsdl2Req() {
        return new TestWsdl2Req();
    }

    /**
     * Create an instance of {@link TestWsdl2Resp }
     * 
     */
    public TestWsdl2Resp createTestWsdl2Resp() {
        return new TestWsdl2Resp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestWsdl2Req }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestWsdl2Req }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.testwsdl2.ws.jaxws.example.com", name = "testWsdl2Req")
    public JAXBElement<TestWsdl2Req> createTestWsdl2Req(TestWsdl2Req value) {
        return new JAXBElement<TestWsdl2Req>(_TestWsdl2Req_QNAME, TestWsdl2Req.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestWsdl2Resp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestWsdl2Resp }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.testwsdl2.ws.jaxws.example.com", name = "testWsdl2Resp")
    public JAXBElement<TestWsdl2Resp> createTestWsdl2Resp(TestWsdl2Resp value) {
        return new JAXBElement<TestWsdl2Resp>(_TestWsdl2Resp_QNAME, TestWsdl2Resp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.testwsdl2.ws.jaxws.example.com", name = "errorCode")
    public JAXBElement<String> createErrorCode(String value) {
        return new JAXBElement<String>(_ErrorCode_QNAME, String.class, null, value);
    }

}
