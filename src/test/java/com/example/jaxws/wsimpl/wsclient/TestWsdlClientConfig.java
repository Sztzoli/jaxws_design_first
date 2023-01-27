package com.example.jaxws.wsimpl.wsclient;

import com.example.jaxws.ws.testwsdl.TestWsdl;
import com.example.jaxws.ws.testwsdl.TestWsdlPortType;
import org.apache.cxf.endpoint.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestWsdlClientConfig extends TestClientConfig<TestWsdlPortType>{

    @Bean
    public TestWsdlPortType testWsdlPortType() {
        return getPort(TestWsdl.SERVICE,TestWsdlPortType.class);
    }

    @Bean
    public Client testWsdlClient() {
        return getClient(testWsdlPortType());
    }
}
