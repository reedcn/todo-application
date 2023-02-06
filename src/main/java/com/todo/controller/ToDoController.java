package com.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.model.AddItemRequest;
import com.todo.service.ToDoService;

@RestController
public class ToDoController {
    Logger logger = LoggerFactory.getLogger(ToDoController.class);

    @Autowired
    private ToDoService toDoService;


    @PostMapping("/add")
    public ResponseEntity<String> addToDo(@RequestBody AddItemRequest itemRequest) {
        toDoService.addToDo(itemRequest);
        return new ResponseEntity<String>("done", HttpStatus.OK);
    }

    @GetMapping("/viewItems")
    public ResponseEntity<String> viewItems() {
        return new ResponseEntity<String>(toDoService.listToDoItems().toString(), HttpStatus.OK);
    }
}
