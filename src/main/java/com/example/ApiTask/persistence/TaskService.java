package com.example.ApiTask.persistence;

import java.util.List;

import com.example.ApiTask.model.Task;

/**
 * TaskService
 */
public interface TaskService {
    
    List<Task> getTasksList();        
    Task getTaskById(String id);    
    List<Task> getTasksByUserId(String userId);    
    //Task assignTaskToUser(String taskId, String user);    
    void removeTask(String taskId);    
    Task createTask(Task task);
    Task updateTask(Task task);
}