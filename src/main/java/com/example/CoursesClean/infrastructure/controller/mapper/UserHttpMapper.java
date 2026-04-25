package com.example.CoursesClean.infrastructure.controller.mapper;

import com.example.CoursesClean.application.usecases.user.CreateUserUseCase;
import com.example.CoursesClean.application.usecases.user.UpdateUserUseCase;
import com.example.CoursesClean.infrastructure.controller.request.HttpCreateUserRequest;
import com.example.CoursesClean.infrastructure.controller.request.HttpUpdateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserHttpMapper {

    CreateUserUseCase.Command toCommand(HttpCreateUserRequest request);

    @Mapping(target = "id", source = "id")
    UpdateUserUseCase.Command toCommand(Long id, HttpUpdateUserRequest request);
}
