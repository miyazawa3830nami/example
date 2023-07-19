package com.example.example.spring.mybatis.mapper;

import com.example.example.spring.mybatis.model.TodoList;
import com.example.example.spring.mybatis.model.TodoListExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TodoListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    long countByExample(TodoListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    int deleteByExample(TodoListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    int deleteByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    int insert(TodoList row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    int insertSelective(TodoList row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    List<TodoList> selectByExample(TodoListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    TodoList selectByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    int updateByExampleSelective(@Param("row") TodoList row, @Param("example") TodoListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    int updateByExample(@Param("row") TodoList row, @Param("example") TodoListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    int updateByPrimaryKeySelective(TodoList row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    int updateByPrimaryKey(TodoList row);
}