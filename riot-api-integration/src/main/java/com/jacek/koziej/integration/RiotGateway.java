package com.jacek.koziej.integration;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RiotGateway {


    public static String callService(HttpRequestBase request) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        request.setHeader("X-Riot-Token", "RGAPI-9cba57ae-18e4-45f7-98de-6b5718c054d1");
        CloseableHttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
           return EntityUtils.toString(entity);
        }
        throw new IllegalStateException("no entity");
    }
}
