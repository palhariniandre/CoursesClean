package com.example.CoursesClean.domain.model;

import com.example.CoursesClean.domain.enums.TipoNotificacao;

import java.time.LocalDateTime;

public record Notificacao(
        Long id,
        User destinatario,
        String titulo,
        String mensagem,
        TipoNotificacao tipo,
        boolean lida,
        LocalDateTime dataEnvio
) {
}
