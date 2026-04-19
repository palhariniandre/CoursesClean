package com.example.CoursesClean.domain.model;

public record User(
        Long id,
        String nome,
        String email,
        String senha
) {
}
