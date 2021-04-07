package com.jacek.koziej.integration.feign.services;

import com.jacek.koziej.integration.model.Champion;
import com.jacek.koziej.integration.model.ChampionData;
import com.jacek.koziej.integration.model.Champions;
import feign.Headers;
import feign.RequestLine;

public interface ChampionClient {

    @Headers("X-Riot-Token : RGAPI-db5bd1a0-495b-4e50-9a06-78f13c5044a0" )
    @RequestLine("GET")
    ChampionData getAll();

}
