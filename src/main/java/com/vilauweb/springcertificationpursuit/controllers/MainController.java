package com.vilauweb.springcertificationpursuit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/landing")
    public String landing() {
        return "landing";
    }

}
