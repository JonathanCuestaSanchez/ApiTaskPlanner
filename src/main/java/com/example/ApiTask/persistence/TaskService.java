package com.example.ApiTask.persistence;

import java.util.List;

import com.example.ApiTask.model.Task;
import com.example.ApiTask.model.User;

/**
 * TaskService
 */
public interface TaskService {
    
    List<Task> geTasksList();
        
    Task getTaskById(String id);
    
    List<Task> getTasksByUserId(String userId);
    
    Task assignTaskToUser(String taskId, User user);
    
    void removeTask(String taskId);
    
    Task updateTask(Task task);
    
}