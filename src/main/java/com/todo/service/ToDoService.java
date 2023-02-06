package com.todo.service;

import java.util.List;

import com.todo.model.AddItemRequest;
import com.todo.model.ToDoItem;

public interface ToDoService {
	public void addToDo(AddItemRequest itemRequest);	

	public List<ToDoItem> listToDoItems();
}
