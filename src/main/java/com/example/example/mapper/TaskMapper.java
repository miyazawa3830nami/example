package com.example.example.mapper;
import java.util.List;

import com.example.example.domain.Task;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface TaskMapper {
    @Select("SELECT * FROM todo_list")
    List<Task> selectAll();
}
