package com.example.jaxws.wsimpl;

import com.example.jaxws.ws.testwsdl2.SrvEx;
import com.example.jaxws.ws.testwsdl2.TestWsdl2;
import com.example.jaxws.ws.testwsdl2.TestWsdl2PortType;
import com.example.jaxws.ws.testwsdl2.bean.TestWsdl2Req;
import com.example.jaxws.ws.testwsdl2.bean.TestWsdl2Resp;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;

import javax.xml.ws.soap.SOAPFaultException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WS2IT {

    @Autowired
    private ServletWebServerApplicationContext webServerAppCtxt;
    private TestWsdl2PortType testClient;

    @BeforeEach
    void init() {
        testClient = WSTestClientUtil.getFactoryBean(
                TestWsdl2PortType.class,
                TestWsdl2.SERVICE,
                webServerAppCtxt.getWebServer().getPort(),
                "testWsdl2")
                .create(TestWsdl2PortType.class);
    }

    @Test
    void dummy() throws SrvEx {
        TestWsdl2Req req = new TestWsdl2Req();
        String testName = "Zoli";
        req.setName(testName);

        TestWsdl2Resp resp = testClient.testWsdl2(req);
        assertEquals("Hello " + testName, resp.getMessage());
    }

    @Test
    void exception() throws SrvEx {
        TestWsdl2Req req = new TestWsdl2Req();
        assertThrows(SOAPFaultException.class, () -> testClient.testWsdl2(req));
    }
}
