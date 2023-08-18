package com.example.hexsample.repository;

import com.example.hexsample.domain.model.User;
import com.example.hexsample.domain.port.out.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class UserRepositoryMemory implements UserRepository {
    @Override
    public User getByEmail() {
        return new User("Piotr", "Kowalski", 27, "piotr@wp.pl",
                "+48602891000", "908001233200");
    }

    @Override
    public List<User> getUsers() {
        return List.of(
                new User("Piotr", "Kowalski", 27, "piotr@wp.pl",
                        "+48602891000", "908001233200")
        );
    }
}
