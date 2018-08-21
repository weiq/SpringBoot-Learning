package com.lanif.lesson2.controller;

import com.lanif.lesson2.entity.User;
import com.lanif.lesson2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser")
    public User getUser(Integer id) {
        User user = this.userService.getUserById(id);
        return user;
    }
}
