package com.example.CoursesClean.domain.model;

public record ConteudoUser(
        Conteudo conteudo,
        User user,
        Boolean feito
) {}
