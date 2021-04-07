package com.jacek.koziej.integration.feign.services;

import com.jacek.koziej.integration.model.Champion;
import com.jacek.koziej.integration.model.Champions;
import com.jacek.koziej.integration.model.Spell;
import feign.Headers;
import feign.RequestLine;

public interface ChampionsClient {

    @Headers("X-Riot-Token : RGAPI-db5bd1a0-495b-4e50-9a06-78f13c5044a0" )
    @RequestLine("GET")
    Champions getAll();

}
