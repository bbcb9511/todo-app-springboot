package com.example.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapp.model.Todo;
import com.example.todoapp.repository.TodoMapper;

@RestController
public class TodoController {
	
	@Autowired
	TodoMapper todoMapper;
	
	@GetMapping("/todos")
	public List<Todo> getAllTodo() {
		return todoMapper.selectAll();		
	}

	@PostMapping("/newtodo")
	public Integer createTodo(@RequestBody Todo todo) {
		todoMapper.insert(todo);
		return 1;
	}
	
	@DeleteMapping("/{id}")
	public Integer deleteTodo(@PathVariable Integer id) {
		todoMapper.delete(id);
		return 1;
	}
	
	@PutMapping("/{id}")
	public Integer update(@PathVariable Integer id, @RequestBody Todo todo) {
		todoMapper.update(id, todo);
		return 1;
	}
	
	

}
