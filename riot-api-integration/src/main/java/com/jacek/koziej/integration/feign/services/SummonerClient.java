package com.jacek.koziej.integration.feign.services;

import com.jacek.koziej.integration.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "summonerClient", url = "https://eun1.api.riotgames.com/")
public interface SummonerClient {

    @GetMapping(value = "lol/summoner/v4/summoners/by-name/{name}", produces = "application/json")
    Summoner getSummonerByName(@PathVariable("name") String name);

    @GetMapping(value = "lol/league/v4/entries/by-summoner/{encryptedSummonerId}", produces = "application/json")
    List<RankingInfo> getPlayerBySummonerId(@PathVariable("encryptedSummonerId") String encryptedSummonerId);
}
