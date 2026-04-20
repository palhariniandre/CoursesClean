package com.example.CoursesClean.application.interactor.user;

import com.example.CoursesClean.application.dto.input.UserInput;
import com.example.CoursesClean.application.dto.output.UserOutput;
import com.example.CoursesClean.application.usecases.user.ICreateUserUseCase;
import com.example.CoursesClean.domain.gateways.UserGateway;
import com.example.CoursesClean.domain.model.User;
import com.example.CoursesClean.domain.valueobjects.Email;

public class CreateUserInteractor implements ICreateUserUseCase {

    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public UserOutput execute(UserInput input) {
        User user = new User(null, input.nome(), new Email(input.email()), input.senha());
        User createdUser = userGateway.create(user);
        return new UserOutput(createdUser.id(), createdUser.nome(), createdUser.email().value());
    }
}
