package org.lessons.java.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("test")
    public String test() {
        return "test";
    }

    @GetMapping("prova")
    public String prova() {
        return "prova";
    }

}
