package com.example.CoursesClean.domain.model;

import java.util.List;

public record Curso(
        Long id,
        String nome,
        String descricao,
        User resposavel,
        List<Modulo> modulos
) {}
