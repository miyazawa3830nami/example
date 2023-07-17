package com.example.example.model;

import com.example.example.form.CreateTaskForm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TaskService {
    @Autowired
    ObjectMapper mapper;

    /**
     * taskを作成
     * @param form createTaskForm
     * @return String
     */
    public String createTask(CreateTaskForm form){
        String taskName = form.getTaskName();
        String status = form.getStatus().toString();
        ObjectNode jsonNodes = mapper.createObjectNode();
        jsonNodes.put("taskName",taskName);
        jsonNodes.put("status",status);
        jsonNodes.put("taskId","taskId");
        return jsonNodes.toString();
    }
}
