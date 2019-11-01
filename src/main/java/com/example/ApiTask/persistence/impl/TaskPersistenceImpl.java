package com.example.ApiTask.persistence.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
    public Task updateTask(String id, String responsible, String status, Date dueDate, String description, String title) {
        Task task = getTaskById(id);
        task.setId(id);
        task.setResponsible(responsible);
        task.setStatus(status);
        task.setDueDate(dueDate);
        task.setDescription(description);
        task.setTitle(title);
        tareas.replace(task.getId(),task);
        return task;
    }

    @Override
    public Task createTask(String id, String responsible, String status, Date dueDate, String description, String title) {
        Task task = new Task();
        task.setId(id);
        task.setResponsible(responsible);
        task.setStatus(status);
        task.setDueDate(dueDate);
        task.setDescription(description);
        task.setTitle(title);
        tareas.put(id,task);
        return task;
    }

    
}