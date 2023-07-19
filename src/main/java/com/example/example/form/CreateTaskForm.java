package com.example.example.form;

import lombok.Data;

@Data
public class CreateTaskForm {
    private String taskName;
    private String taskDetail;
    private Short status;
    private String limitDate;
}
