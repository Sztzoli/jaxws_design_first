package com.example.jaxws.wsimpl;

import com.example.jaxws.ws.testwsdl.SrvEx;
import com.example.jaxws.ws.testwsdl.TestWsdlPortType;
import com.example.jaxws.ws.testwsdl.bean.TestWsdlReq;
import com.example.jaxws.ws.testwsdl.bean.TestWsdlResp;
import com.example.jaxws.wsimpl.wsclient.TestWsdlClientConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.xml.ws.soap.SOAPFaultException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@ContextConfiguration(classes = {TestWsdlClientConfig.class})
class WS1IT {

    @Autowired
    private TestWsdlPortType client;

    @Test
    void dummy() throws SrvEx {
        TestWsdlReq req = new TestWsdlReq();
        String testName = "Zoli";
        req.setName(testName);

        TestWsdlResp resp = client.testWsdl(req);
        assertEquals("Hello " + testName, resp.getMessage());
    }

    @Test
    void exception() throws SrvEx {
        TestWsdlReq req = new TestWsdlReq();
        assertThrows(SOAPFaultException.class, () -> client.testWsdl(req));
    }
}