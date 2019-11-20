package com.example.ApiTask.persistence;

import java.util.List;

import com.example.ApiTask.model.User;

/**
 * UserService
 */
public interface UserService {
    List<User> getUsersList(); 
    
    User getUserByEmail(String userId);
    
    User createUser(User user);
    
    User updateUser(User user);
    
    void removeUser(String userId);
    
}