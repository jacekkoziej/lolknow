package com.jacek.koziej.integration;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ChampionsService {


    public List<Champion> getAll() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet request = new HttpGet("http://ddragon.leagueoflegends.com/cdn/11.4.1/data/en_US/champion.json");
        CloseableHttpResponse response = httpClient.execute(request);
        System.out.println(response.getStatusLine().getStatusCode());
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            String result = EntityUtils.toString(entity);
            System.out.println(result);
            Champions champions = new Gson().fromJson(result, Champions.class);


            return new ArrayList<>(champions.getData().values());

        }
        return new ArrayList<>();
    }
}
