package com.example.example.controller;
import org.springframework.ui.Model;
import com.example.example.form.CreateTaskForm;
import com.example.example.model.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(path = "/task")
public class TaskController {
    @Autowired
    TaskService service;

    @GetMapping
    public String getAll(Model model){
        return "list";
    }

    @PutMapping
    public ResponseEntity<String> createTask(CreateTaskForm form) {
        System.out.println(form.getTaskName());
        return ResponseEntity.ok(service.createTask(form));
    }
}
