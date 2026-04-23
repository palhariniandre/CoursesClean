package com.example.CoursesClean.domain.model;

import java.time.LocalDateTime;

public record ProgressoUsuario(
        Curso curso,
        User usuario,
        Double percentualConclusao,
        LocalDateTime ultimoAcesso
) {
}
