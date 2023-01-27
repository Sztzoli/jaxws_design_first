package com.example.jaxws.wsimpl.wsconfig;

import com.example.jaxws.ws.testwsdl.TestWsdl;
import com.example.jaxws.ws.testwsdl2.TestWsdl2;
import com.example.jaxws.wsimpl.TestWsdl2Impl;
import com.example.jaxws.wsimpl.TestWsdlImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.namespace.QName;
import java.util.Map;

@Configuration
public class JaxWsConfig {
    public static final String SERVICE_LIST_TITLE = "Test Cxf services";

    @Bean
    public ServletRegistrationBean<CXFServlet> disServlet() {
        final ServletRegistrationBean<CXFServlet> servletRegistrationBean = new ServletRegistrationBean<>(new CXFServlet(), "/services/*");
        servletRegistrationBean.setLoadOnStartup(1);
        Map<String, String> initParameters = servletRegistrationBean.getInitParameters();
        initParameters.put("service-list-title", SERVICE_LIST_TITLE);
        return servletRegistrationBean;
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Server testWsdlServer() {
        return factoryBean(new TestWsdlImpl(),TestWsdl.SERVICE, "testWsdl").create();
    }

    @Bean
    public Server testWsdl2Server() {
        return factoryBean(new TestWsdl2Impl(), TestWsdl2.SERVICE, "testWsdl2").create();
    }


    public JaxWsServerFactoryBean factoryBean(Object impl, QName serviceName, String address) {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setBus(springBus());
        factoryBean.setAddress("/" + address);
        factoryBean.setServiceBean(impl);
        factoryBean.setServiceClass(impl.getClass());
        factoryBean.getFeatures().add(feature());
        factoryBean.setServiceName(serviceName);
        Map<String, Object> props = new java.util.HashMap<>();
        props.put("schema-validation-enabled", "true");
        factoryBean.setProperties(props);
        return factoryBean;
    }

    @Bean
    public LoggingFeature feature() {
        LoggingFeature feature = new LoggingFeature();
        feature.setPrettyLogging(true);
        return feature;
    }
}
