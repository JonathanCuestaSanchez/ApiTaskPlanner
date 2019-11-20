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
    public User getUserByEmail(String userId) {
        User user = usersMap.get(userId);
        return user;
    }

    @Override
    public User createUser(User user) {       
        usersMap.put(user.getId(), user);
        return user;

    }

    @Override
    public User updateUser(User user) {       
        usersMap.replace(user.getId(), user);
        return user;
    }

    @Override
    public void removeUser(String userId) {
        usersMap.remove(userId);
    }

}
