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

    private final ChampionsClient championsClient;

    public ChampionsService(ChampionsClient championsClient) {
        this.championsClient = championsClient;
    }

    public List<Champion> getAll(){

        return new ArrayList<>(championsClient.getAll().getData().values());
    }

    public Champion get(String name){
        String id = name.replace(" ", "");
        return championsClient.get(id).getData().get(id);
    }
}
