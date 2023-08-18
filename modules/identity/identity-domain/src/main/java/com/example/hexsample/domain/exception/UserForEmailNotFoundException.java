package com.example.hexsample.domain.exception;

public class UserForEmailNotFoundException extends RuntimeException {
    public UserForEmailNotFoundException(String email) {
        super("Not found user for email: " + email);
    }

}
