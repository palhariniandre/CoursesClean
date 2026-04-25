package com.example.CoursesClean.infrastructure.controller.request;

import com.example.CoursesClean.domain.model.Role;
import jakarta.validation.constraints.Email;

public record HttpUpdateUserRequest(
        String nome,
        @Email
        String email,
        String senha,
        Role role
) {
}
