package com.jacek.koziej.application.api;

import com.jacek.koziej.integration.ChampionsService;
import com.jacek.koziej.integration.RankingService;
import com.jacek.koziej.integration.model.Champion;
import com.jacek.koziej.integration.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping("/challenger")
    public String showRanking2(){
        StringBuilder stringBuilder = new StringBuilder();
        //creating list and sorting by ranking using stream
        List<Player> sortedPlayers = rankingService.getAll().stream()
                .sorted(Comparator.comparing(Player::getLeaguePoints).reversed())
                .collect(Collectors.toList());
        //variable used to print position of a player in a ladder
        AtomicInteger cnt = new AtomicInteger(0);

        sortedPlayers.forEach(player -> stringBuilder
                .append(player.getSummonerName())
                .append(", ")
                .append(player.getLeaguePoints())
                .append(", W/L = ")
                .append(player.getWins())
                .append("/")
                .append(player.getLosses())
                .append(", ranking = ")
                //print ranking position, there is no information about position from service
                .append(cnt.incrementAndGet())
                .append("<br>"));

        return stringBuilder.toString();
    }
    @GetMapping("/all")
    public String bestPlayers(Model model) {
        if (bestPlayers == null)  bestPlayers = rankingService
                .getAll()
                .stream()
                .sorted(Comparator.comparing(Player::getLeaguePoints).reversed())
                .collect(Collectors.toList());
        model.addAttribute("ranking", bestPlayers);
        return "ranking";
    }

    @GetMapping("/*")
    public String defaultOver9000(){
        return "over 9000";
    }


}
