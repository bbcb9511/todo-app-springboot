package com.example.todoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@GetMapping
	public String todoGet() {
		return "成功";
	}

}
