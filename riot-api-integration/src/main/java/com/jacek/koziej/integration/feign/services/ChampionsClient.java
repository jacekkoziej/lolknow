package com.jacek.koziej.integration.feign.services;

import com.jacek.koziej.integration.model.Champion;
import com.jacek.koziej.integration.model.ChampionData;
import com.jacek.koziej.integration.model.Champions;
import com.jacek.koziej.integration.model.Spell;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "championsClient", url = "http://ddragon.leagueoflegends.com/cdn/11.4.1/data/pl_PL/")
public interface ChampionsClient {

    @GetMapping(value = "champion.json", produces = "application/json")
    Champions getAll();

    @GetMapping(value = "/champion/{name}.json", produces = "application/json")
    Champions get(@PathVariable("name") String name);

}
