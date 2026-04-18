package com.example.CoursesClean.core.entities;

public record Mensagens(
        User emissor,
        User receptor,
        String mensagem
) {
}
