package com.example.example.controller;

import com.example.example.form.CreateTaskForm;
import com.example.example.model.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@Controller
@RestController
@RequestMapping(path = "/task")
public class TaskController {
    @Autowired
    TaskService taskService;

//    @GetMapping(path = "/select")
//    public String selectAll(){
//        return taskService.selectAll();
//    }

    @PutMapping
    public ResponseEntity<String> createTask(CreateTaskForm form) throws ParseException {
        System.out.println(form.getTaskName());
        return ResponseEntity.ok(taskService.createTask(form));
    }
}
