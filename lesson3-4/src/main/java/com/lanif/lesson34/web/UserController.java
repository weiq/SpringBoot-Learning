package com.lanif.lesson34.web;

import com.lanif.lesson34.domain.User;
import com.lanif.lesson34.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String save(@ModelAttribute User user) {
        userRepository.save(user);
        return "success";
    }

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "success";
    }
}
