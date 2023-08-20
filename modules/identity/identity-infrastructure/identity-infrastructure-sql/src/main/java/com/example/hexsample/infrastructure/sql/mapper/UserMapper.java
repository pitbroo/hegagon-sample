package com.example.hexsample.infrastructure.sql.mapper;

import com.example.hexsample.infrastructure.sql.model.UserDb;
import com.example.hexsample.domain.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User toDomain(UserDb userDb);

    List<User> toDomain(List<UserDb> userDb);
}
