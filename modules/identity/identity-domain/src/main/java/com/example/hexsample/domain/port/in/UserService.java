package com.example.hexsample.domain.port.in;

import com.example.hexsample.domain.exception.UserForEmailNotFoundException;
import com.example.hexsample.domain.model.User;

import java.util.List;

public interface UserService {
    User getByEmail(String email) throws UserForEmailNotFoundException;

    List<User> getUsers();
}
