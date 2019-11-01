package com.example.ApiTask.persistence.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.ApiTask.model.User;
import com.example.ApiTask.persistence.UserService;

import org.springframework.stereotype.Service;

/**
 * UserPersistenceImpl
 */
@Service
public class UserPersistenceImpl implements UserService {

    HashMap<String, User> usersMap = new HashMap<>();

    @Override
    public List<User> getUsersList() {
        List<User> users;
        users = new ArrayList<User>(usersMap.values());
        return users;
    }

    @Override
    public User getUserByEmail(String userEmail) {
        User user = usersMap.get(userEmail);
        return user;
    }

    @Override
    public User createUser(String userId, String name, String email, String password) {
        User user = new User(userId, name, email, password);
        usersMap.put(email, user);
        return user;

    }

    @Override
    public User updateUser(String userId, String name, String email, String password) {
        User user = getUserByEmail(email);
        user.setId(userId);
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        usersMap.replace(user.getId(), user);
        return user;
    }

    @Override
    public void removeUser(String userId) {
        usersMap.remove(userId);
    }

}
