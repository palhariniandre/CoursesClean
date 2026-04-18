package com.example.CoursesClean.core.entities;

import com.example.CoursesClean.core.enums.TipoConteudo;

public record Conteudo(
        Long id,
        String nome,
        String link,
        TipoConteudo tipoConteudo
) {
}
