package com.jacek.koziej.application.api;

import com.jacek.koziej.integration.ChampionsService;
import com.jacek.koziej.integration.RankingService;
import com.jacek.koziej.integration.model.Champion;
import com.jacek.koziej.integration.model.Player;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/v1/ranking")
public class ShowRankingController {

    private final RankingService rankingService;

    private List<Player> bestPlayers;

    public ShowRankingController(RankingService rankingService) {
        this.rankingService = rankingService;
    }

    @GetMapping("/all")
    public String bestPlayers(Model model) {
        if (bestPlayers == null) bestPlayers = rankingService.getAll().stream()
                .sorted(Comparator.comparing(Player::getLeaguePoints).reversed())
                .collect(Collectors.toList());
        model.addAttribute("ranking", bestPlayers);
        return "ranking";
    }

}
