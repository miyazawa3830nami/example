package com.example.example.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class Task {
    private Integer taskId;
    private String taskName;
    private String taskDetail;
    private Integer status;
    private Date limitDate;
    private Date createDate;
    private Date lastmodifyDate;
}
