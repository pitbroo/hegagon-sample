package com.example.hexsample.app.exception.handler;

import com.example.hexsample.domain.exception.UserForEmailNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserNotFoundExceptionHandler {
    @ExceptionHandler(UserForEmailNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String bookNotFoundHandler(UserForEmailNotFoundException exception) {
        return exception.getMessage();
    }

}

