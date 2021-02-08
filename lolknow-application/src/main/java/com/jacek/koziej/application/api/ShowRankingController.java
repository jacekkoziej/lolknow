package com.jacek.koziej.application.api;

import com.jacek.koziej.application.api.model.BestPlayers;
import com.jacek.koziej.application.api.model.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ranking")
public class ShowRankingController {


    @GetMapping("/best")
    public BestPlayers getBestPlayers(@RequestParam("pageNumber") int pageNumber){
        BestPlayers bestPlayers = new BestPlayers();
        bestPlayers.setTotalCount(100L);
        List<Player> list = new ArrayList<>();
        Player playerOne = new Player();
        playerOne.setName("Jacek");
        list.add(playerOne);
        bestPlayers.setPlayers(list);
        bestPlayers.setPagaNumer(pageNumber);
        return bestPlayers;
    }

    @GetMapping("/ladder")
    public String showRanking(){
        return "2500";
    }

    @GetMapping("/*")
    public String mainRanking(){
        return "3000";
    }


}
