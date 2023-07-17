package com.example.example.controller;

import com.example.example.form.CreateTaskForm;
import com.example.example.model.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/task")
public class TaskController {
    @Autowired
    TaskService service;

    @PutMapping
    public ResponseEntity<String> createTask(CreateTaskForm form) {
        System.out.println(form.getTaskName());
        return ResponseEntity.ok(service.createTask(form));
    }
}
