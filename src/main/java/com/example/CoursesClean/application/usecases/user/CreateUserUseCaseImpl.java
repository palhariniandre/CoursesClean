package com.example.CoursesClean.application.usecases.user;

import com.example.CoursesClean.application.gateways.PasswordEncoder;
import com.example.CoursesClean.application.gateways.UserGateway;
import com.example.CoursesClean.domain.enums.TipoRole;
import com.example.CoursesClean.domain.model.Role;
import com.example.CoursesClean.domain.model.User;
import com.example.CoursesClean.domain.valueobjects.Email;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserGateway userGateway;
    private final PasswordEncoder passwordEncoder;

    public CreateUserUseCaseImpl(UserGateway userGateway, PasswordEncoder passwordEncoder) {
        this.userGateway = userGateway;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Output execute(Command command) {
        Email email = new Email(command.email());

        if (userGateway.getByEmail(email).isPresent()) {
            throw new RuntimeException("Email já está sendo utilizado"); // Ou sua Exception customizada
        }

        String senhaHasheada = passwordEncoder.encode(command.senha());

        Role userRole = command.role() != null ? command.role() : new Role(null, TipoRole.ALUNO);

        User user = new User(null, command.nome(), email, senhaHasheada, command.role());

        User createdUser = userGateway.create(user);

        return new Output(createdUser.id(), createdUser.nome(), createdUser.email().value(), createdUser.role());
    }
}