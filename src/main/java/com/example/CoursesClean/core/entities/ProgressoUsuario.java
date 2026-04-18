package com.example.CoursesClean.core.entities;

public record ProgressoUsuario(
        Modulo modulo,
        User usuario,
        Double progresso
) {
}
