package com.example.ApiTask.persistence;

import java.util.Date;
import java.util.List;

import com.example.ApiTask.model.Task;
import com.example.ApiTask.model.User;

/**
 * TaskService
 */
public interface TaskService {
    
    List<Task> getTasksList();
        
    Task getTaskById(String id);
    
    List<Task> getTasksByUserId(String userId);
    
    //Task assignTaskToUser(String taskId, String user);
    
    void removeTask(String taskId);
    
    Task createTask(String id, String responsible, String status, Date dueDate, String description,String title);
    Task updateTask(String id, String responsible, String status, Date dueDate, String description, String title);
}