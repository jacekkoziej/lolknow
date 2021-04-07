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

    public List<Champion> getAll(){

        ChampionsClient championsClient = Feign.builder()
                .client(new ApacheHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(ChampionsClient.class, "http://ddragon.leagueoflegends.com/cdn/11.4.1/data/pl_PL/champion.json");

        return new ArrayList<>(championsClient.getAll().getData().values());
    }
}
