package com.example.CoursesClean.application.gateways;

import com.example.CoursesClean.domain.model.User;
import com.example.CoursesClean.domain.valueobjects.Email;

import java.util.List;
import java.util.Optional;

public interface UserGateway {
    User create(User user);

    User update(User user);

    Optional<User> getById(Long id);

    Optional<User> getByEmail(Email email);

//    List<User> getAll();
}
