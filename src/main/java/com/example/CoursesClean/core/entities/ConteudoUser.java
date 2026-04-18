package com.example.CoursesClean.core.entities;

public record ConteudoUser(
        Conteudo conteudo,
        User user,
        Boolean feito
) {}
