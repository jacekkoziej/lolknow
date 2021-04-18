package com.jacek.koziej.application.api;

import com.jacek.koziej.integration.ChampionService;
import com.jacek.koziej.integration.ChampionsService;
import com.jacek.koziej.integration.RankingService;
import com.jacek.koziej.integration.model.Champion;
import com.jacek.koziej.integration.model.ChampionData;
import com.jacek.koziej.integration.model.Player;
import com.jacek.koziej.integration.model.Spell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/v1/champions")
public class ShowChampionsController {

    private List<Champion> allChampions;

    @GetMapping("/all")
    public String allChampions(Model model) {
        if (allChampions == null)  allChampions = new ChampionsService().getAll();
        model.addAttribute("champions", allChampions);
        return "champions";
    }

    @GetMapping("/single")
    public String single(Model model, @RequestParam("id") String id) {
        if (allChampions == null)  allChampions = new ChampionsService().getAll();
        Optional<Champion> first = allChampions.stream().filter(champion -> champion.getName().equals(id)).findFirst();
        model.addAttribute("champion", first.get());
        return "champion";
    }
    @GetMapping("/test")
    public String test(Model model) {
        if (allChampions == null)  allChampions = new ChampionsService().getAll();
        model.addAttribute("champions", allChampions);
        return "champions";
    }
}
