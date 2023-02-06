package com.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.model.AddItemRequest;
import com.todo.model.ToDoItem;
import com.todo.repository.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService {
	Logger logger = LoggerFactory.getLogger(ToDoServiceImpl.class);
	
	@Autowired
	ToDoRepository toDoRepository;

	public void addToDo(AddItemRequest itemRequest) {
		toDoRepository.save(new ToDoItem(itemRequest.getTitle(), itemRequest.getDescription(), itemRequest.getDate(), itemRequest.isDone()));
	}

	public List<ToDoItem> listToDoItems() {
		List<ToDoItem> toDoList = new ArrayList<ToDoItem>();
        for (ToDoItem item : toDoRepository.findAll()) {
            logger.info(item.toString());
			toDoList.add(item);
        }
		return toDoList;
    }
}
