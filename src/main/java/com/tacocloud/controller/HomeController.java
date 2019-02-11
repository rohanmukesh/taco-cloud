package com.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Controller : It's primary purpose is to identify this class as a part of spring component scanning.
 * Spring's component scanning discovers it and creates bean and adds it to Spring Application Context.
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
