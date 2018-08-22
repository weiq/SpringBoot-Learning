package com.lanif.lesson2.service;

import com.lanif.lesson2.dao.UserDao;
import com.lanif.lesson2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(int id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public boolean addUser(User user) {
        boolean result = false;
        try {
            userDao.insertSelective(user);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return result;
    }
}
