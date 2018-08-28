package com.lanif.lesson41.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLoginPage(@RequestParam Optional<String> error) {
        LOGGER.info("Getting login page, error={}", error);
        return new ModelAndView("login", "error", error);
    }
}
