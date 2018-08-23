package com.lanif.lesson33.web;

import com.lanif.lesson33.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("JSON错误");
    }
}
