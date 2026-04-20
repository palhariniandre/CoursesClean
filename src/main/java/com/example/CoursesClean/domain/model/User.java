package com.example.CoursesClean.domain.model;

import com.example.CoursesClean.domain.valueobjects.Email;

public record User(
        Long id,
        String nome,
        Email email,
        String senha
) {
}
