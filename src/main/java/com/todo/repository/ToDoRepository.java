package com.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.model.ToDoItem;

public interface ToDoRepository extends JpaRepository<ToDoItem, Long> {
	//List<ToDoItem> findItemsByUsername(String username);
}
