package com.example.ApiTask.persistence.impl;

import java.util.List;

import com.example.ApiTask.model.Task;
import com.example.ApiTask.model.User;
import com.example.ApiTask.persistence.TaskService;

import org.springframework.stereotype.Service;

/**
 * TaskPersistenceImpl
 */
@Service
public class TaskPersistenceImpl implements TaskService {

    @Override
    public List<Task> geTasksList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Task getTaskById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removeTask(String taskId) {
        // TODO Auto-generated method stub

    }

    @Override
    public Task updateTask(Task task) {
        // TODO Auto-generated method stub
        return null;
    }

    
}