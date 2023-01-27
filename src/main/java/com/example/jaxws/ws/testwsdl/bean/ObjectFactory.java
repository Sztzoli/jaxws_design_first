
package com.example.jaxws.ws.testwsdl.bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.jaxws.ws.testwsdl.bean package. 
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

    private final static QName _TestWsdlReq_QNAME = new QName("http://bean.testwsdl.ws.jaxws.example.com", "testWsdlReq");
    private final static QName _TestWsdlResp_QNAME = new QName("http://bean.testwsdl.ws.jaxws.example.com", "testWsdlResp");
    private final static QName _ErrorCode_QNAME = new QName("http://bean.testwsdl.ws.jaxws.example.com", "errorCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.jaxws.ws.testwsdl.bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestWsdlReq }
     * 
     */
    public TestWsdlReq createTestWsdlReq() {
        return new TestWsdlReq();
    }

    /**
     * Create an instance of {@link TestWsdlResp }
     * 
     */
    public TestWsdlResp createTestWsdlResp() {
        return new TestWsdlResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestWsdlReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestWsdlReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.testwsdl.ws.jaxws.example.com", name = "testWsdlReq")
    public JAXBElement<TestWsdlReq> createTestWsdlReq(TestWsdlReq value) {
        return new JAXBElement<TestWsdlReq>(_TestWsdlReq_QNAME, TestWsdlReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestWsdlResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestWsdlResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.testwsdl.ws.jaxws.example.com", name = "testWsdlResp")
    public JAXBElement<TestWsdlResp> createTestWsdlResp(TestWsdlResp value) {
        return new JAXBElement<TestWsdlResp>(_TestWsdlResp_QNAME, TestWsdlResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.testwsdl.ws.jaxws.example.com", name = "errorCode")
    public JAXBElement<String> createErrorCode(String value) {
        return new JAXBElement<String>(_ErrorCode_QNAME, String.class, null, value);
    }

}
