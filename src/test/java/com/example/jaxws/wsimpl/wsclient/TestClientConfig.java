package com.example.jaxws.wsimpl.wsclient;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;

import javax.wsdl.Port;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

public abstract class TestClientConfig<T> {
    public T getPort(QName client, Class<T> clazz) {
        Service service = Service.create(client);
        T port = service.getPort(clazz);
        return port;
    }
    public Client getClient(T port) {
        Client client = ClientProxy.getClient(port);
        ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/services/testWsdl");
        return client;
    }
}
