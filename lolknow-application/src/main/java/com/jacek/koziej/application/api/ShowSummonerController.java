package com.jacek.koziej.application.api;

import com.jacek.koziej.integration.ChampionsService;
import com.jacek.koziej.integration.RankingService;
import com.jacek.koziej.integration.SummonerService;
import com.jacek.koziej.integration.model.Champion;
import com.jacek.koziej.integration.model.Summoner;
import feign.FeignException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/v1/summoner")
public class ShowSummonerController {

    private final SummonerService summonerService;

    public ShowSummonerController(SummonerService summonerService) {
        this.summonerService = summonerService;
    }


    @GetMapping("/details")
    public String summoner(Model model, @RequestParam("name") String name) {
        try {
            Summoner summoner = summonerService.get(name);
            model.addAttribute("summoner", summoner);
            String encryptedSummonerId = summoner.getId();
            model.addAttribute("player", summonerService.getRankingData(encryptedSummonerId));
            return "summoner";
        } catch (FeignException exception) {
            if (exception.status() == 404) {
                return "home";
            }
            throw exception;
        }
    }
}
