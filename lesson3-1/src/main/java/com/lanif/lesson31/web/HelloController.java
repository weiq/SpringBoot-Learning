package com.lanif.lesson31.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(Model model, String name) {
        String message = "Spring Boot FreeMarker!";
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        return "hello";
    }
}
