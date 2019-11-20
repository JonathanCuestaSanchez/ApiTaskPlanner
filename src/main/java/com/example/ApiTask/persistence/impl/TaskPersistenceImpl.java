package com.example.ApiTask.persistence.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.ApiTask.model.Task;
import com.example.ApiTask.persistence.TaskService;

import org.springframework.stereotype.Service;

/**
 * TaskPersistenceImpl
 */
@Service
public class TaskPersistenceImpl implements TaskService {
    HashMap<String, Task> tareas = new HashMap<String, Task>();
    @Override
    public List<Task> getTasksList() {
        List<Task> tasks = new ArrayList<Task>(tareas.values());
        return tasks;
    }

    @Override
    public Task getTaskById(String id) {        
        return tareas.get(id);
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        List<Task> tasks = getTasksList();
        List<Task> userTasks = new ArrayList<Task>();
        for (int i = 0; i < tareas.size(); i++) {
             if(tasks.get(i).getResponsible().equals(userId)){
                  userTasks.add(tasks.get(i));
             }
        }
        return userTasks;
    } 

    @Override
    public void removeTask(String taskId) {
        tareas.remove(taskId);
    }

    @Override
    public Task updateTask(Task task) {        
        tareas.replace(task.getId(),task);
        return task;
    }

    @Override
    public Task createTask(Task task) {        
        tareas.put(task.getId(),task);
        return task;
    }

    
}