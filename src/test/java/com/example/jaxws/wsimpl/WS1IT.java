package com.example.jaxws.wsimpl;

import com.example.jaxws.ws.testwsdl.SrvEx;
import com.example.jaxws.ws.testwsdl.TestWsdl;
import com.example.jaxws.ws.testwsdl.TestWsdlPortType;
import com.example.jaxws.ws.testwsdl.bean.TestWsdlReq;
import com.example.jaxws.ws.testwsdl.bean.TestWsdlResp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;

import javax.xml.ws.soap.SOAPFaultException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WS1IT {

    private TestWsdlPortType testClient;

    @Autowired
    private ServletWebServerApplicationContext webServerAppCtxt;

    @BeforeEach
    void init() {
        testClient = WSTestClientUtil.getFactoryBean(
                TestWsdlPortType.class,
                TestWsdl.SERVICE,
                webServerAppCtxt.getWebServer().getPort(),
                "testWsdl")
                .create(TestWsdlPortType.class);
    }

    @Test
    void dummy() throws SrvEx {
        TestWsdlReq req = new TestWsdlReq();
        String testName = "Zoli";
        req.setName(testName);

        TestWsdlResp resp = testClient.testWsdl(req);
        assertEquals("Hello " + testName, resp.getMessage());
    }

    @Test
    void exception() throws SrvEx {
        TestWsdlReq req = new TestWsdlReq();
        assertThrows(SOAPFaultException.class, () -> testClient.testWsdl(req));
    }
}