package com.jacek.koziej.integration;

import com.jacek.koziej.integration.feign.services.LadderClient;
import com.jacek.koziej.integration.model.Player;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.httpclient.ApacheHttpClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RankingService {

    private final LadderClient ladderClient;

    public RankingService(LadderClient ladderClient) {
        this.ladderClient = ladderClient;
    }

    public List<Player> getAll(){
        return ladderClient.getRankedSolo5x5().getEntries();
    }
}
