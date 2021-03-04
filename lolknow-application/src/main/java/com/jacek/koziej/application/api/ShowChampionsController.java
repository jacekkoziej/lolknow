package com.jacek.koziej.application.api;

import com.jacek.koziej.integration.Champion;
import com.jacek.koziej.integration.ChampionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/v1/champions")
public class ShowChampionsController {

//    private final ChampionsService championsService;
//
//    @Autowired
//    public ShowChampionsController(ChampionsService championsService) {
//        this.championsService = championsService;
//    }

    @GetMapping("/Aatrox")
    public String showRanking(){
        return "Aatrox champion";
    }

    @GetMapping("/Annie")
    public String mainRanking(){
        return "Annie champion";
    }

    @GetMapping("/all")
    public List<Champion> allChampions() throws IOException {
        return new ChampionsService().getAll();
    }

    @GetMapping("/all2")
    public String allChampions2() throws IOException {
        List<Champion> all = new ChampionsService().getAll();
        StringBuilder stringBuilder = new StringBuilder();
        all.forEach(champion -> stringBuilder.append("Name: ").append(champion.getName()).append("<br>"));
        return stringBuilder.toString();

    }


}
