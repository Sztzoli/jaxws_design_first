package com.example.jaxws.wsimpl;

import com.example.jaxws.ws.testwsdl2.TestWsdl2;
import com.example.jaxws.ws.testwsdl2.TestWsdl2PortType;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;

import javax.xml.namespace.QName;

public class WSTestClientUtil {
    public static JaxWsProxyFactoryBean getFactoryBean(Class clazz, QName serviceName, int port, String address) {
        JaxWsProxyFactoryBean jaxWsProxyFactory = new JaxWsProxyFactoryBean();
        jaxWsProxyFactory.setServiceClass(clazz);
        jaxWsProxyFactory.setServiceName(serviceName);
        jaxWsProxyFactory.setAddress("http://localhost:" + port + "/services/" + address);
        return jaxWsProxyFactory;
    }
}
