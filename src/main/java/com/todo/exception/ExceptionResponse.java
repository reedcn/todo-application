package com.todo.exception;

import lombok.Data;

@Data
public class ExceptionResponse {
    private String errorMessage;
    private String requestedUri;
}
