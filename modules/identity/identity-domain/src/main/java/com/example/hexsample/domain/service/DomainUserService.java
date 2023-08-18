package com.example.hexsample.domain.service;

import com.example.hexsample.domain.model.User;
import com.example.hexsample.domain.port.out.UserRepository;
import com.example.hexsample.domain.port.in.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class DomainUserService implements UserService {
    private final UserRepository userRepository;
    @Override
    public User getByEmail(String email) {
        return userRepository.getByEmail();
    }

    @Override
    public List<User> getUsers() {
        return userRepository.getUsers();
    }
}
