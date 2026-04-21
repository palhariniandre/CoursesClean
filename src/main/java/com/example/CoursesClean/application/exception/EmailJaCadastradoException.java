package com.example.CoursesClean.application.exception;

public class EmailJaCadastradoException extends RuntimeException {

    public EmailJaCadastradoException() {
        super("Email já está sendo utilizado");
    }

    public EmailJaCadastradoException(String message) {
        super(message);
    }
}
