package com.example.CoursesClean.domain.model;

import java.time.LocalDateTime;

public record Matricula(
        User usuario,
        Modulo modulo,
        LocalDateTime inscricao
) {
}
