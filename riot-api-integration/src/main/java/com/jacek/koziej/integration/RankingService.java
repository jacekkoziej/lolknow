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
//    public List<Player> getAll() throws IOException {
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpGet request = new HttpGet("https://eun1.api.riotgames.com/lol/league/v4/challengerleagues/by-queue/RANKED_SOLO_5x5?api_key=RGAPI-db5bd1a0-495b-4e50-9a06-78f13c5044a0");
//        CloseableHttpResponse response = httpClient.execute(request);
//        System.out.println(response.getStatusLine().getStatusCode());
//        HttpEntity entity = response.getEntity();
//        if (entity != null) {
//            String result = EntityUtils.toString(entity);
//            System.out.println(result);
//            BestPlayers bestPlayers= new Gson().fromJson(result, BestPlayers.class);
//            return new ArrayList<>(bestPlayers.getEntries());
//
//        }
//        return new ArrayList<>();
//    }

    public List<Player> getAll(){

        LadderClient ladderClient = Feign.builder()
                .client(new ApacheHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(LadderClient.class, "https://eun1.api.riotgames.com/lol/league/v4/challengerleagues/by-queue/RANKED_SOLO_5x5?api_key=RGAPI-db5bd1a0-495b-4e50-9a06-78f13c5044a0");

        return ladderClient.getAll().getEntries();
    }
}
