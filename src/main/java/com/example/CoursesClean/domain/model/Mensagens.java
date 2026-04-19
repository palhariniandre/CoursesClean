package com.example.CoursesClean.domain.model;

import java.time.LocalDateTime;

public record Mensagens(
        Long id,
        User emissor,
        User receptor,
        String mensagem,
        LocalDateTime hora
) {
}
