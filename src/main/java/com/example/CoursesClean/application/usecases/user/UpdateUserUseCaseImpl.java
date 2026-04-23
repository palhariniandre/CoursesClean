package com.example.CoursesClean.application.usecases.user;

import com.example.CoursesClean.application.exception.EmailJaCadastradoException;
import com.example.CoursesClean.application.gateways.PasswordEncoder;
import com.example.CoursesClean.application.gateways.UserGateway;
import com.example.CoursesClean.domain.enums.TipoRole;
import com.example.CoursesClean.domain.model.Role;
import com.example.CoursesClean.domain.model.User;
import com.example.CoursesClean.domain.valueobjects.Email;

import java.util.Optional;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {
    private final UserGateway userGateway;
    private final PasswordEncoder passwordEncoder;

    public UpdateUserUseCaseImpl(UserGateway userGateway, PasswordEncoder passwordEncoder) {
        this.userGateway = userGateway;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Output execute(Command command) {
        User existingUser = userGateway.getById(command.id())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado")); // Sugestão: Crie uma UserNotFoundException

        Email newEmail = new Email(command.email());

        Optional<User> userWithSameEmail = userGateway.getByEmail(newEmail);
        if (userWithSameEmail.isPresent() && !userWithSameEmail.get().id().equals(command.id())) {
            throw new EmailJaCadastradoException();
        }

        String senhaHasheada = existingUser.senha();
        if (command.senha() != null && !command.senha().isBlank()) {
            senhaHasheada = passwordEncoder.encode(command.senha());
        }

        Role userRole = command.role() != null ? command.role() : existingUser.role();

        User userToUpdate = new User(existingUser.id(), command.nome(), newEmail, senhaHasheada, userRole);

        User updatedUser = userGateway.update(userToUpdate);

        return new Output(updatedUser.id(), updatedUser.nome(), updatedUser.email().value(), updatedUser.role());
    }
}