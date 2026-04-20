package com.example.CoursesClean.infrastructure.controller;

import com.example.CoursesClean.application.usecases.user.CreateUserUseCase;
import com.example.CoursesClean.infrastructure.controller.mapper.UserHttpMapper;
import com.example.CoursesClean.infrastructure.controller.request.HttpCreateUserRequest;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final UserHttpMapper userHttpMapper;

    public UserController(CreateUserUseCase createUserUseCase, UserHttpMapper userMapper) {
        this.createUserUseCase = createUserUseCase;
        this.userHttpMapper = userMapper;
    }

    @PostMapping
    public ResponseEntity<CreateUserUseCase.Output> create(@Valid @RequestBody HttpCreateUserRequest request) {
        CreateUserUseCase.Command command = userHttpMapper.toCommand(request);
        CreateUserUseCase.Output output = createUserUseCase.execute(command);
        return ResponseEntity.status(HttpStatus.CREATED).body(output);
    }
}