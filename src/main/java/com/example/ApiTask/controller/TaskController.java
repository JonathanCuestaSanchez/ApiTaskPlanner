package com.example.ApiTask.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.ApiTask.model.Task;
import com.example.ApiTask.persistence.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TaskController
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/Task")
public class TaskController {

    @Autowired
    TaskService taskService;
    @GetMapping("")
    public ResponseEntity<?> getTaskList(){
        return new ResponseEntity<>(taskService.getTasksList(), HttpStatus.OK);
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<?> getTaskById(@PathVariable(name = "taskId") String taskId){
        try {
            return new ResponseEntity<>(taskService.getTaskById(taskId),HttpStatus.OK);
        } catch (Exception e) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error task no encontrado",HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/{taskId}")
    public ResponseEntity<?> deleteTaskById(@PathVariable(name = "taskId") String taskId){
        try {
            taskService.removeTask(taskId);
            return new ResponseEntity<>("Task eliminado",HttpStatus.OK);
        } catch (Exception e) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error usuario no encontrado",HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping ("/User/{userId}")
    public ResponseEntity<?> getTaskByUserId(@PathVariable(name = "userId") String userId){
        try {
            taskService.getTasksByUserId(userId);
            return new ResponseEntity<>(taskService.getTasksByUserId(userId),HttpStatus.OK);
        } catch (Exception e) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error usuario no encontrado",HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping(path = "")
    public ResponseEntity<?> createTask(@RequestBody Task task) {
        try {
            return new ResponseEntity<>(taskService.createTask(task), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }    
    
    @PutMapping("/{tastId}")
    public ResponseEntity<?> updateTaks(@PathVariable(name = "tastId") @RequestBody Task task) {
        try {
            return new ResponseEntity<>(taskService.updateTask(task), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }  
    
}

