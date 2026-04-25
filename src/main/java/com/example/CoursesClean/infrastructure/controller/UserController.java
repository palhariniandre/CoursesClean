package com.example.CoursesClean.infrastructure.controller;

import com.example.CoursesClean.application.usecases.user.CreateUserUseCase;
import com.example.CoursesClean.application.usecases.user.DeleteUserUseCase;
import com.example.CoursesClean.application.usecases.user.UpdateUserUseCase;
import com.example.CoursesClean.infrastructure.controller.mapper.UserHttpMapper;
import com.example.CoursesClean.infrastructure.controller.request.HttpCreateUserRequest;
import com.example.CoursesClean.infrastructure.controller.request.HttpUpdateUserRequest;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;
    private final UserHttpMapper userHttpMapper;

    public UserController(CreateUserUseCase createUserUseCase, 
                          UpdateUserUseCase updateUserUseCase, 
                          DeleteUserUseCase deleteUserUseCase, 
                          UserHttpMapper userMapper) {
        this.createUserUseCase = createUserUseCase;
        this.updateUserUseCase = updateUserUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
        this.userHttpMapper = userMapper;
    }

    @PostMapping
    public ResponseEntity<CreateUserUseCase.Output> create(@Valid @RequestBody HttpCreateUserRequest request) {
        CreateUserUseCase.Command command = userHttpMapper.toCommand(request);
        CreateUserUseCase.Output output = createUserUseCase.execute(command);
        return ResponseEntity.status(HttpStatus.CREATED).body(output);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UpdateUserUseCase.Output> update(@PathVariable Long id, @Valid @RequestBody HttpUpdateUserRequest request) {
        UpdateUserUseCase.Command command = userHttpMapper.toCommand(id, request);
        UpdateUserUseCase.Output output = updateUserUseCase.execute(command);
        return ResponseEntity.ok(output);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        deleteUserUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
