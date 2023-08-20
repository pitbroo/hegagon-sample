package com.example.hexsample.infrastructure.sql.repository;

import com.example.hexsample.domain.model.User;
import com.example.hexsample.domain.port.out.UserRepository;
import com.example.hexsample.infrastructure.sql.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@ConditionalOnProperty(name = "use.db.provider", havingValue = "SQL", matchIfMissing = true)
class UserRepositorySql implements UserRepository {
    private final UserJpaRepository userJpaRepository;
    private final UserMapper mapper;
    @Override
    public Optional<User> getByEmail(String email) {
        val user = mapper.toDomain(userJpaRepository.findAllByEmail(email));
        return Optional.ofNullable(user);
    }

    @Override
    public List<User> getUsers() {
        return mapper.toDomain(userJpaRepository.findAll());
    }
}
