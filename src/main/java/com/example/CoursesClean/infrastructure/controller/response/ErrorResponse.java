package com.example.CoursesClean.infrastructure.controller.response;

import java.time.LocalDateTime;

public record ErrorResponse(
        LocalDateTime timestamp,
        Integer status,
        String error,
        String path
) {}