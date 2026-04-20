package com.example.CoursesClean.infrastructure.controller.mapper;

import com.example.CoursesClean.application.usecases.user.CreateUserUseCase;
import com.example.CoursesClean.infrastructure.controller.request.HttpCreateUserRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserHttpMapper {

    CreateUserUseCase.Command toCommand(HttpCreateUserRequest request);

}