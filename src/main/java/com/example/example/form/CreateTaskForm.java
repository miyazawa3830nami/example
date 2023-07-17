package com.example.example.form;

import lombok.Data;

import java.util.Date;

@Data
public class CreateTaskForm {
    private String taskName;
    private String taskDetail;
    private Integer status;
    private Date limitDate;
}
