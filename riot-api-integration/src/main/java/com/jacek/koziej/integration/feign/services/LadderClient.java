package com.jacek.koziej.integration.feign.services;

import com.jacek.koziej.integration.model.BestPlayers;
import feign.Headers;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ladderClient", url = "https://eun1.api.riotgames.com/lol/league/v4/")
public interface LadderClient {
    @GetMapping(value = "challengerleagues/by-queue/RANKED_SOLO_5x5", produces = "application/json")
    BestPlayers getRankedSolo5x5();
}
