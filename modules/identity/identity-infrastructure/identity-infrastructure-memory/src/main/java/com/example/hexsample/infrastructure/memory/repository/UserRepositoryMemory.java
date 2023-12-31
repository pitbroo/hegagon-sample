package com.example.hexsample.infrastructure.memory.repository;

import com.example.hexsample.domain.model.User;
import com.example.hexsample.domain.port.out.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.val;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@ConditionalOnProperty(name = "use.db.provider", havingValue = "MEMORY")
class UserRepositoryMemory implements UserRepository {
    List<User> users;
    @PostConstruct
    void onInit(){
        users = List.of(
                new User("Piotr", "Kowalski", 27, "piotr@wp.pl",
                        "+48602891000", "908001233200"),
                new User("Mariusz", "Pudzikowski", 47, "mariusz@wp.pl",
                        "+48601891000", "778001233200")
        );

    }
    @Override
    public Optional<User> getByEmail(String email) {
         val userList = users.stream().filter(user -> user.email().equals(email)).toList();
         if (userList.size() > 0){
             return Optional.of(userList.get(0));
         }else return Optional.empty();
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
