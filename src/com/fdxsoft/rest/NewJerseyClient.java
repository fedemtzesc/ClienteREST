/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fdxsoft.rest;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:ProductoResource
 * [Producto]<br>
 * USAGE:
 * <pre>
 *        NewJerseyClient client = new NewJerseyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author federico
 */
public class NewJerseyClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://www.fdxsoft.com:8080/ServicioREST/webresources";

    public NewJerseyClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("Producto");
    }

    public String clearList() throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("clearList");
        return resource.request(javax.ws.rs.core.MediaType.TEXT_HTML).get(String.class);
    }

    public String getHtml() throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getHTML");
        return resource.request(javax.ws.rs.core.MediaType.TEXT_HTML).get(String.class);
    }

    public <T> T buscar(Class<T> responseType, String id) throws ClientErrorException {
        return webTarget.path(java.text.MessageFormat.format("buscar/{0}", new Object[]{id})).request().post(null, responseType);
    }

    public String getXml() throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getXML");
        return resource.request(javax.ws.rs.core.MediaType.TEXT_XML).get(String.class);
    }

    public <T> T addToJSONList(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.path("addToJSONList").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), responseType);
    }

    public <T> T getJSON(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getJSONList");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T RFCInfoRequestJSON(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.path("RFCInfoRequestJSON").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), responseType);
    }

    public void close() {
        client.close();
    }
    
}
