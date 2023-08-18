package com.example.hexsample.domain.port.out;

import com.example.hexsample.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> getByEmail(String email);
    List<User> getUsers();
}
