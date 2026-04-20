package com.example.CoursesClean.infrastructure.config;

import com.example.CoursesClean.application.gateways.PasswordEncoder;
import com.example.CoursesClean.application.gateways.UserGateway;
import com.example.CoursesClean.application.usecases.user.CreateUserUseCase;
import com.example.CoursesClean.application.usecases.user.CreateUserUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(UserGateway userGateway, PasswordEncoder passwordEncoder) {
        return new CreateUserUseCaseImpl(userGateway, passwordEncoder);
    }
}