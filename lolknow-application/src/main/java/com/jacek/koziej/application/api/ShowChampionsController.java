package com.jacek.koziej.application.api;

import com.jacek.koziej.integration.ChampionsService;
import com.jacek.koziej.integration.model.Champion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/v1/champions")
public class ShowChampionsController {
    
    private final ChampionsService championsService;

    private List<Champion> allChampions;

    public ShowChampionsController(ChampionsService championsService) {
        this.championsService = championsService;
    }

    @GetMapping("/all")
    public String allChampions(Model model) {
        if (allChampions == null)  allChampions = championsService.getAll();
        model.addAttribute("champions", allChampions);
        return "champions";
    }

    @GetMapping("/single")
    public String single(Model model, @RequestParam("id") String id) {
        model.addAttribute("champion", championsService.get(id));
        return "champion";
    }

}
