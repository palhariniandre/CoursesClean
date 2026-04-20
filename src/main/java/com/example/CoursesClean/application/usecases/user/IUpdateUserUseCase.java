package com.example.CoursesClean.application.usecases.user;

import com.example.CoursesClean.application.dto.input.UserInput;
import com.example.CoursesClean.application.dto.output.UserOutput;

public interface IUpdateUserUseCase {
    UserOutput execute(UserInput input);
}
