package com.lanif.lesson2.service;

import com.lanif.lesson2.entity.User;

public interface UserService {
    User getUserById(int id);

    boolean addUser(User user);
}
