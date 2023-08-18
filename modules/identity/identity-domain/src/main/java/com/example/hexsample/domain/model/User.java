package com.example.hexsample.domain.model;

public record User(
        String name,
        String surname,
        int age,
        String email,
        String phoneNumber,
        String pesel
){
}
