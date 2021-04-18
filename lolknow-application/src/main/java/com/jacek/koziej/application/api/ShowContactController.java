package com.jacek.koziej.application.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/v1/contact")
public class ShowContactController {

    @GetMapping("/*")
    public String contact() {
        return "contact";
    }
}
