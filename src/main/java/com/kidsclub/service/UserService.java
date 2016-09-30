package com.kidsclub.service;

import com.kidsclub.model.User;
import java.util.List;

public interface UserService {
    List<User> getAll();
    User createUser(String login, String firstName, String lastName);
}
