package com.vilauweb.springcertificationpursuit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/section1")
    public String section1(){
        return "section1";
    }

    @GetMapping("/section5")
    public String section5() {
        return "section5security";
    }

}
