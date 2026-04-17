package com.example.CoursesClean.core.entities;

public record Conteudo(
        Long id,
        String nome,
        String link,
        TipoConteudo tipoConteudo
) {
}
