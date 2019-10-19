package com.example.ApiTask.persistence;

import java.util.Date;
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
    
    Task updateTask(String id, User responsible, String status, Date dueDate, String description,String tittle);
    
}