package com.example.hexsample.infrastructure.sql.repository;

import com.example.hexsample.infrastructure.sql.model.UserDb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserDb, Long> {
    UserDb findAllByEmail(String email);
}
