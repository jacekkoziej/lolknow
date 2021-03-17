package com.jacek.koziej.application.api;

import com.jacek.koziej.integration.ChampionsService;
import com.jacek.koziej.integration.model.Champion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/v1/champions")
public class ShowChampionsController {

    @GetMapping("/all")
    public String allChampions2() {
        StringBuilder stringBuilder = new StringBuilder();

        List<Champion> all = new ChampionsService().getAll();

        all.forEach(champion -> stringBuilder.append(champion.getName()).append("<br>"));

        return stringBuilder.toString();

    }

    @GetMapping("/*")
    public String defaultOver9000(){
        return "over 9000";
    }

}
