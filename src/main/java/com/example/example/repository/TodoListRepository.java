package com.example.example.repository;

import com.example.example.spring.mybatis.mapper.TodoListMapper;
import com.example.example.spring.mybatis.model.TodoList;
import com.example.example.spring.mybatis.model.TodoListExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoListRepository {
    @Autowired
    private TodoListMapper mapper;

    public void insert(TodoList todoList) {
        mapper.insertSelective(todoList);
    }

//    public TodoList selectByTaskId(Integer taskId) {
//        TodoList todoLists = mapper.selectByPrimaryKey(taskId);
//        if (todoLists.size() == 0) {
//            return null;
//        }
//        return todoLists;
//    }

    public List<TodoList> select(TodoList todoList) {
        List<TodoList> todoLists = new ArrayList<>();
        TodoListExample example = new TodoListExample();
        example.createCriteria()
                .andTaskNameEqualTo(todoList.getTaskName())
                .andStatusEqualTo(todoList.getStatus());
        todoLists = mapper.selectByExample(example);
        if (todoLists.size() == 0) {
            return null;
        }
        return todoLists;
    }
}
