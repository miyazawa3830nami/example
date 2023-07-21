package com.example.example.controller;

import com.example.example.form.CreateTaskForm;
import com.example.example.model.TaskService;
import com.example.example.spring.mybatis.model.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/task")
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping(path = "/select")
    public List<TodoList> selectTask(CreateTaskForm form) {
        return taskService.selectTask(form);
    }

    @PutMapping
    public ResponseEntity<String> createTask(CreateTaskForm form) throws ParseException {
        System.out.println(form.getTaskName());
        return ResponseEntity.ok(taskService.createTask(form));
    }
}
