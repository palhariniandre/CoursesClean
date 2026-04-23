package com.example.CoursesClean.application.usecases.user;

import com.example.CoursesClean.application.gateways.UserGateway;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final UserGateway userGateway;

    public DeleteUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void delete(Long id) {
        userGateway.delete(id);
    }
}

