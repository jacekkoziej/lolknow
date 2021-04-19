package com.jacek.koziej.integration;

import com.jacek.koziej.integration.feign.services.SummonerClient;
import com.jacek.koziej.integration.model.Champion;
import com.jacek.koziej.integration.model.Summoner;
import org.springframework.stereotype.Component;

@Component
public class SummonerService {

    private final SummonerClient summonerClient;

    public SummonerService(SummonerClient summonerClient) {
        this.summonerClient = summonerClient;
    }

    public Summoner get(String name){
        return summonerClient.getSummonerByName(name);
    }
}
