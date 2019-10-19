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
    public List<Task> geTasksList() {
        List<Task> tasks = new ArrayList<Task>(tareas.values());
        return tasks;
    }

    @Override
    public Task getTaskById(String id) {        
        return tareas.get(id);
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        List<Task> tasks = geTasksList();
        List<Task> userTasks = new ArrayList<Task>();
        for (int i = 0; i < tareas.size(); i++) {
             if(tasks.get(i).getResponsible().getId().equals(userId)){
                  userTasks.add(tasks.get(i));
             }
        }
        return userTasks;
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        Task taskNewAssigned = null;
        List<Task> task = geTasksList();
        for (int i=0; i< task.size();i++){
            if(task.get(i).getId().equals(taskId)){
                task.get(i).setResponsible(user);
                taskNewAssigned = task.get(i);
            }
        }
        return taskNewAssigned;
    }

    @Override
    public void removeTask(String taskId) {
        tareas.remove(taskId);
    }

    @Override
    public Task updateTask(String id, User responsible, String status, Date dueDate, String description, String tittle) {
        Task task = getTaskById(id);
        task.setId(id);
        task.setResponsible(responsible);
        task.setStatus(status);
        task.setDueDate(dueDate);
        task.setDescription(description);
        task.setTitle(tittle);
        tareas.replace(task.getId(),task);
        return task;
    }

    
}