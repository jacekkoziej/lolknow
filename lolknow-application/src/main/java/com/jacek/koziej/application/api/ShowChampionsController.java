package com.jacek.koziej.application.api;

import com.jacek.koziej.integration.ChampionsService;
import com.jacek.koziej.integration.model.Champion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/v1/champions")
public class ShowChampionsController {

    private List<Champion> all;

    @GetMapping("/all")
    public String allChampions(Model model) {
        if (all == null)  all = new ChampionsService().getAll();
        model.addAttribute("champions", all);
        return "champions";

//        StringBuilder stringBuilder = new StringBuilder();
//
//        List<Champion> all = new ChampionsService().getAll();
//
//        all.forEach(champion -> champion.getImage();
//
//        return stringBuilder.toString();

    }

    @GetMapping("/single")
    public String single(Model model, @RequestParam("id") String id) {
        if (all == null)  all = new ChampionsService().getAll();
        Optional<Champion> first = all.stream().filter(champion -> champion.getName().equals(id)).findFirst();
        model.addAttribute("champion", first.get());
        return "champion";
    }

    @GetMapping("/*")
    public String defaultOver9000() {
        return "over 9000";
    }

}
