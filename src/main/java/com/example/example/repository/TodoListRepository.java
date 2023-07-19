package com.example.example.repository;

import com.example.example.spring.mybatis.mapper.TodoListMapper;
import com.example.example.spring.mybatis.model.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TodoListRepository {
    @Autowired
    private TodoListMapper mapper;

    public void insert(TodoList todoList) {
        mapper.insertSelective(todoList);
    }
}
