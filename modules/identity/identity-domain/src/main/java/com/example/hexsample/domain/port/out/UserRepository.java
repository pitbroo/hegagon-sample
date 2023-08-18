package com.example.hexsample.domain.port.out;

import com.example.hexsample.domain.model.User;

import java.util.List;

public interface UserRepository {
    User getByEmail();
    List<User> getUsers();
}
