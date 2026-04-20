package com.example.CoursesClean.domain.valueobjects;

import java.util.regex.Pattern;

public record Email(String value) {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public Email {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("E-mail não pode ser vazio");
        }

        value = value.trim().toLowerCase();

        if (!EMAIL_PATTERN.matcher(value).matches()) {
            throw new IllegalArgumentException("E-mail inválido: " + value);
        }
    }
}