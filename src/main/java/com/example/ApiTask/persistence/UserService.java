package com.example.ApiTask.persistence;

import java.util.List;

import com.example.ApiTask.model.User;

/**
 * UserService
 */
public interface UserService {
    List<User> getUsersList(); 
    
    User getUserByEmail(String userEmail);
    
    User createUser(String userId, String name, String email, String password);
    
    User updateUser(String userId, String name, String email, String password);
    
    void removeUser(String userId);
    
}