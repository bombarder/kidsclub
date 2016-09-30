package com.kidsclub.service.impl;

import com.kidsclub.model.User;
import com.kidsclub.repository.UserDao;
import com.kidsclub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }

    @Override
    public User createUser(String login, String firstName, String lastName) {
        User user = new User(firstName, lastName, login);
        return user;
    }
}
