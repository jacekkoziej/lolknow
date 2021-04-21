package com.jacek.koziej.integration.feign.services;

import com.jacek.koziej.integration.model.BestPlayers;
import com.jacek.koziej.integration.model.Champions;
import com.jacek.koziej.integration.model.Summoner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "summonerClient", url = "https://eun1.api.riotgames.com/lol/summoner/v4/")
public interface SummonerClient {

    @GetMapping(value = "summoners/by-name/{name}", produces = "application/json")
    Summoner getSummonerByName(@PathVariable("name") String name);
}
