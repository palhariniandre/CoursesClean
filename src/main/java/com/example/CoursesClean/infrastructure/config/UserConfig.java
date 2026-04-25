package com.example.CoursesClean.infrastructure.config;

import com.example.CoursesClean.application.gateways.PasswordEncoder;
import com.example.CoursesClean.application.gateways.UserGateway;
import com.example.CoursesClean.application.usecases.user.CreateUserUseCase;
import com.example.CoursesClean.application.usecases.user.CreateUserUseCaseImpl;
import com.example.CoursesClean.application.usecases.user.DeleteUserUseCase;
import com.example.CoursesClean.application.usecases.user.DeleteUserUseCaseImpl;
import com.example.CoursesClean.application.usecases.user.UpdateUserUseCase;
import com.example.CoursesClean.application.usecases.user.UpdateUserUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(UserGateway userGateway, PasswordEncoder passwordEncoder) {
        return new CreateUserUseCaseImpl(userGateway, passwordEncoder);
    }

    @Bean
    public UpdateUserUseCase updateUserUseCase(UserGateway userGateway, PasswordEncoder passwordEncoder) {
        return new UpdateUserUseCaseImpl(userGateway, passwordEncoder);
    }

    @Bean
    public DeleteUserUseCase deleteUserUseCase(UserGateway userGateway) {
        return new DeleteUserUseCaseImpl(userGateway);
    }
}
