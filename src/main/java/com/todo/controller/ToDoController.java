package com.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.exception.ToDoException;

@RestController
public class ToDoController {
    @GetMapping("/hello")
    public String helloWorld() throws ToDoException {
        throw new ToDoException("exception");
    }
}
