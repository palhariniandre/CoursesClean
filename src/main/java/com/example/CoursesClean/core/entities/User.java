package com.example.CoursesClean.core.entities;

public record User(
        Long id,
        String nome,
        String email,
        String senha
) {
}
