package com.example.hexsample.app.rest.model;

public record UserResponse(
        String name,
        String surname,
        int age,
        String email,
        String phoneNumber
) {
}
