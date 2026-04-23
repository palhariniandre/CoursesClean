package com.example.CoursesClean.application.usecases.user;

import com.example.CoursesClean.domain.model.Role;

public interface UpdateUserUseCase {
    Output execute(Command command);

    record Command(Long id, String nome, String email, String senha, Role role) {}

    record Output(Long id, String nome, String email, Role role) {}
}
