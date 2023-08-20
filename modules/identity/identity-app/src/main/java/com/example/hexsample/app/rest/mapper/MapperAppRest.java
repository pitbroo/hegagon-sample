package com.example.hexsample.app.rest.mapper;

import com.example.hexsample.app.rest.model.UserResponse;
import com.example.hexsample.domain.model.User;

import java.util.List;

@org.mapstruct.Mapper
public interface MapperAppRest {
    UserResponse toApp(User user);
    List<UserResponse> toApp(List<User> user);
}
