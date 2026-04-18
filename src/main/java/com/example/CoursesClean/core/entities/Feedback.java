package com.example.CoursesClean.core.entities;

public record Feedback(
        Conteudo conteudo,
        User user,
        String mensagem,
        Integer qtdEstrelas
) {}
