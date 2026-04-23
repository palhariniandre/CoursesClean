package com.example.CoursesClean.domain.model;

import java.time.LocalDateTime;

public record PostagemTimeline(
        Long id,
        User autor,
        String titulo,
        String conteudo,
        String urlFoto,
        LocalDateTime dataPublicacao
) {
}
