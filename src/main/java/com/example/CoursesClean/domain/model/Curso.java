package com.example.CoursesClean.domain.model;

public record Curso(
        Long id,
        String nome,
        String descricao,
        User resposavelId
) {}
