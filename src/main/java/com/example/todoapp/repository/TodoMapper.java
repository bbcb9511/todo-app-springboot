package com.example.todoapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.todoapp.model.Todo;

@Mapper
public interface TodoMapper {
	
	List<Todo> selectAll();
	
	Integer insert(@Param("todo") Todo todo);
	
	Integer delete(Integer id);
	
	Integer update(Integer id, @Param("todo") Todo todo);

}
