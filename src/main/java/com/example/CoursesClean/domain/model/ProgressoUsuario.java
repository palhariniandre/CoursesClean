package com.example.CoursesClean.domain.model;

public record ProgressoUsuario(
        Modulo modulo,
        User usuario,
        Double progresso
) {
}
