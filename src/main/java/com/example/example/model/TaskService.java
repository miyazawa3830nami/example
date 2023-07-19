package com.example.example.model;

import com.example.example.form.CreateTaskForm;
import com.example.example.repository.TodoListRepository;
import com.example.example.spring.mybatis.model.TodoList;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service

public class TaskService {
    @Autowired
    ObjectMapper mapper;
    @Autowired
    private TodoListRepository todoListRepository;

    /**
     * taskを作成
     *
     * @param form createTaskForm
     * @return String
     */
    public String createTask(CreateTaskForm form) {
        Date date = new Date();
        TodoList todoList = new TodoList();
        todoList.setTaskName(form.getTaskName());
        todoList.setTaskDetail(form.getTaskDetail());
        todoList.setStatus(form.getStatus());
        todoList.setLimitDate(form.getLimitDate());
        todoList.setCreateDate(date);
        todoList.setLastmodifyDate(date);
        todoListRepository.insert(todoList);
        return "";
    }

}
