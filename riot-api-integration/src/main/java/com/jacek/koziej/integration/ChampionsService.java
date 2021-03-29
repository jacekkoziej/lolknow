package com.jacek.koziej.integration;

import com.jacek.koziej.integration.feign.services.ChampionsClient;
import com.jacek.koziej.integration.model.Champion;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.httpclient.ApacheHttpClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChampionsService {


//    public List<Champion> getAll() throws IOException {
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//
//        HttpGet request = new HttpGet("http://ddragon.leagueoflegends.com/cdn/11.4.1/data/en_US/champion.json");
//        CloseableHttpResponse response = httpClient.execute(request);
//        System.out.println(response.getStatusLine().getStatusCode());
//        HttpEntity entity = response.getEntity();
//        if (entity != null) {
//            String result = EntityUtils.toString(entity);
//            System.out.println(result);
//            Champions champions = new Gson().fromJson(result, Champions.class);
//
//
//            return new ArrayList<>(champions.getData().values());
//
//        }
//        return new ArrayList<>();
//    }

    public List<Champion> getAll(){

        ChampionsClient championsClient = Feign.builder()
                .client(new ApacheHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(ChampionsClient.class, "http://ddragon.leagueoflegends.com/cdn/11.4.1/data/pl_PL/champion.json");

        return new ArrayList<>(championsClient.getAll().getData().values());
    }

}
