package com.todo.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ToDoException extends Exception {
    public ToDoException(final String message) {
        super(message);
    }
}
