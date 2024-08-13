package com.example.webstatic1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticSiteController {

    @GetMapping("/")
    public String index() {
        return "index"; // retorna index.html da pasta src/main/resources/static
    }
}
