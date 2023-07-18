package com.example.example.form;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class CreateTaskForm {
    private String taskName;
    private String taskDetail;
    private Integer status;
    private Date limitDate;
}
