package com.example.CoursesClean.core.entities;

import java.time.LocalDateTime;

public record Matricula(
        User usuario,
        Modulo modulo,
        LocalDateTime inscricao
) {
}
