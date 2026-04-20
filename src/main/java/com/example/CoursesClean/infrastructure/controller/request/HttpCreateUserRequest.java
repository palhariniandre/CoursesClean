package com.example.CoursesClean.infrastructure.controller.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record HttpCreateUserRequest(

        @NotBlank(message = "O nome é obrigatório e não pode estar em branco.")
        String nome,

        @NotBlank(message = "O e-mail é obrigatório.")
        @Email(message = "O formato do e-mail é inválido.")
        String email,

        @NotBlank(message = "A senha é obrigatória.")
        @Size(min = 6, message = "A senha deve conter pelo menos 6 caracteres.")
        String senha
) {
}