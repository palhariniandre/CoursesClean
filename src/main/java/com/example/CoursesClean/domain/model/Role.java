package com.example.CoursesClean.domain.model;

import com.example.CoursesClean.domain.enums.TipoRole;

public record Role(
    Long id,
    TipoRole tipoRole
) {}