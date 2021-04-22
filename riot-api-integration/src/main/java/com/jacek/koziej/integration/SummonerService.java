package com.jacek.koziej.integration;

import com.jacek.koziej.integration.feign.services.SummonerClient;
import com.jacek.koziej.integration.model.Player;
import com.jacek.koziej.integration.model.RankingInfo;
import com.jacek.koziej.integration.model.Summoner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SummonerService {

    private final SummonerClient summonerClient;

    public SummonerService(SummonerClient summonerClient) {
        this.summonerClient = summonerClient;
    }

    public Summoner get(String name){
        return summonerClient.getSummonerByName(name);
    }

    public List<RankingInfo> getRankingData(String encryptedSummonerId) {
        return new ArrayList<>(summonerClient
                .getPlayerBySummonerId(encryptedSummonerId)
                .getEntries()
        );
    }

}
