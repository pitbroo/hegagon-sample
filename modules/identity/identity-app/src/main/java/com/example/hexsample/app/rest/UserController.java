package com.example.hexsample.app.rest;

import com.example.hexsample.app.rest.mapper.MapperAppRest;
import com.example.hexsample.app.rest.model.UserResponse;
import com.example.hexsample.domain.port.in.UserService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final MapperAppRest mapper;

    @GetMapping
    public ResponseEntity<List<UserResponse>> getUsers() {
        val users = userService.getUsers();
        val userResponse = mapper.toApp(users);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @GetMapping("/{email}")
    public ResponseEntity<UserResponse> getUserByEmail(@PathVariable String email) {
        val user = userService.getByEmail(email);
        val userResponse = mapper.toApp(user);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }
}