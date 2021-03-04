package com.jacek.koziej.application.api;

import com.jacek.koziej.integration.DeltaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/v1/leszek")
public class ShowLeszekController {

    @GetMapping("/smieszek")
    public String showLeszek() throws IOException {
        return new DeltaService().returnSomething();
    }

}
