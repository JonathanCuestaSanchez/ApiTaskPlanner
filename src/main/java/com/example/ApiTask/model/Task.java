package com.example.ApiTask.model;

import java.util.Date;

/**
 * Task
 */
public class Task {
    String id;
    String title;
    String description;
    String responsible;
    Date dueDate;
    String status;

    public Task (String id, String title, String description, String responsible, Date dueDate, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.responsible = responsible;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Task() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
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

  


    

   

    
    
}