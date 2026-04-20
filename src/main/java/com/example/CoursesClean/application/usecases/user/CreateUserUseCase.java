package com.example.CoursesClean.application.usecases.user;

import com.example.CoursesClean.domain.model.Role;

public interface CreateUserUseCase {

    Output execute(Command command);

    record Command(String nome, String email, String senha, Role role) {}

    record Output(Long id, String nome, String email, Role role) {}
}