package com.example.CoursesClean.core.entities;

public record Curso(
        Long id,
        String nome,
        String descricao,
        User ResposavelId
) {}
