package com.jacek.koziej.application.api;

import com.jacek.koziej.integration.RankingService;
import com.jacek.koziej.integration.model.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/ranking")
public class ShowRankingController {

    @GetMapping("/challenger")
    public String showRanking2(){
        StringBuilder stringBuilder = new StringBuilder();
        //creating list and sorting by ranking using stream
        List<Player> sortedPlayers = new RankingService().getAll().stream()
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

    @GetMapping("/*")
    public String defaultOver9000(){
        return "over 9000";
    }

}
