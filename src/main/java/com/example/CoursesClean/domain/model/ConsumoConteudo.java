package com.example.CoursesClean.domain.model;

import java.time.LocalDateTime;

public record ConsumoConteudo(
        Conteudo conteudo,
        User usuario,
        boolean concluido,
        LocalDateTime dataConclusao
) {}