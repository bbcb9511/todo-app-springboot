package com.example.todoapp.model;

import lombok.Data;

@Data
public class Todo {
		
	private Integer todoId;
	private String todoTitle;
	private String todoStatus;
	private String todoDetail;

}
