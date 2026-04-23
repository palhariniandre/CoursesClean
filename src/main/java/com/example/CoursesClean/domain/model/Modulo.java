package com.example.CoursesClean.domain.model;

import java.util.List;

public record Modulo(
        Long id,
        String nome,
        Curso curso,
        List<Conteudo> conteudos
) {}
