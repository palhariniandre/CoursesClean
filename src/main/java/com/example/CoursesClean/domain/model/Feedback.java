package com.example.CoursesClean.domain.model;

public record Feedback(
        Conteudo conteudo,
        User user,
        String mensagem,
        Integer qtdEstrelas
) {}
