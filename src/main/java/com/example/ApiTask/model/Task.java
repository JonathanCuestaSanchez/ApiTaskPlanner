package com.example.ApiTask.model;

import java.util.Date;

/**
 * Task
 */
public class Task {
    String id;
    String title;
    String description;
    User responsible;
    Date dueDate;
    String status;

    public Task() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
 

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getResponsible() {
        return responsible;
    }

    public void setResponsible(User responsible) {
        this.responsible = responsible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   

    
    
}