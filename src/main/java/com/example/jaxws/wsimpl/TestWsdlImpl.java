package com.example.jaxws.wsimpl;

import com.example.jaxws.ws.testwsdl.SrvEx;
import com.example.jaxws.ws.testwsdl.TestWsdlPortType;
import com.example.jaxws.ws.testwsdl.bean.TestWsdlReq;
import com.example.jaxws.ws.testwsdl.bean.TestWsdlResp;
import org.springframework.stereotype.Service;

@Service
public class TestWsdlImpl implements TestWsdlPortType {
    @Override
    public TestWsdlResp testWsdl(TestWsdlReq req) throws SrvEx {
        TestWsdlResp testWsdlResp;

        testWsdlResp = new TestWsdlResp();
        testWsdlResp.setMessage("Hello " + req.getName());
        return testWsdlResp;
    }
}
