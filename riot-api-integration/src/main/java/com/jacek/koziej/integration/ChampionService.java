package com.jacek.koziej.integration;

import com.jacek.koziej.integration.feign.services.ChampionClient;
import com.jacek.koziej.integration.feign.services.ChampionsClient;
import com.jacek.koziej.integration.model.Champion;
import com.jacek.koziej.integration.model.ChampionData;
import com.jacek.koziej.integration.model.Champions;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.httpclient.ApacheHttpClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ChampionService {
    //String id = "Aatrox";
    public Champion getAll(){

        ChampionClient championClient = Feign.builder()
                .client(new ApacheHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(ChampionClient.class, "http://ddragon.leagueoflegends.com/cdn/11.4.1/data/pl_PL/champion/Aatrox.json");

        return new Champion(championClient.getAll().getData());
    }
}
