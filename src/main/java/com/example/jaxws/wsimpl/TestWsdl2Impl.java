package com.example.jaxws.wsimpl;

import com.example.jaxws.ws.testwsdl2.SrvEx;
import com.example.jaxws.ws.testwsdl2.TestWsdl2PortType;
import com.example.jaxws.ws.testwsdl2.bean.TestWsdl2Req;
import com.example.jaxws.ws.testwsdl2.bean.TestWsdl2Resp;

public class TestWsdl2Impl implements TestWsdl2PortType {
    @Override
    public TestWsdl2Resp testWsdl2(TestWsdl2Req req) throws SrvEx {
        TestWsdl2Resp testWsdl2Resp;

        testWsdl2Resp = new TestWsdl2Resp();
        testWsdl2Resp.setMessage("Hello " + req.getName());
        return testWsdl2Resp;
    }
}
