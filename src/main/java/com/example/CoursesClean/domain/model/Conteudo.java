package com.example.CoursesClean.domain.model;

import com.example.CoursesClean.domain.enums.TipoConteudo;

public record Conteudo(
        Long id,
        String nome,
        String link,
        TipoConteudo tipoConteudo
) {
}
