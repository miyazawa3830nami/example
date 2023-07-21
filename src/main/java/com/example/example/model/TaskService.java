package com.example.example.model;

import com.example.example.form.CreateTaskForm;
import com.example.example.repository.TodoListRepository;
import com.example.example.spring.mybatis.model.TodoList;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
     * @throws ParseException
     */
    public String createTask(CreateTaskForm form) throws ParseException {
        Date date = new Date();
        TodoList todoList = new TodoList();
        todoList.setTaskName(form.getTaskName());
        todoList.setTaskDetail(form.getTaskDetail());
        todoList.setStatus(form.getStatus());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date limitDate = simpleDateFormat.parse(form.getLimitDate());
        todoList.setLimitDate(limitDate);
        todoList.setCreateDate(date);
        todoList.setLastmodifyDate(date);
        todoListRepository.insert(todoList);
        return "";
    }

    //    public TodoList selectByTaskId(Integer taskId) {
//        return todoListRepository.selectByTaskId(taskId);
//    }
    public List<TodoList> selectTask(CreateTaskForm form) {
        Date date = new Date();
        TodoList todoList = new TodoList();
        todoList.setTaskName(form.getTaskName());
        todoList.setTaskDetail(form.getTaskDetail());
        todoList.setStatus(form.getStatus());
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date limitDate = simpleDateFormat.parse(form.getLimitDate());
//        todoList.setLimitDate(limitDate);
        return todoListRepository.select(todoList);
    }

}
