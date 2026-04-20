package com.example.CoursesClean.infrastructure.gateways;


import com.example.CoursesClean.application.gateways.UserGateway;
import com.example.CoursesClean.domain.model.User;
import com.example.CoursesClean.infrastructure.gateways.mapper.UserSchemaMapper;
import com.example.CoursesClean.infrastructure.gateways.repository.UserJpaRepository;
import com.example.CoursesClean.infrastructure.gateways.schema.UserSchema;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserGatewayImpl implements UserGateway {

    private final UserJpaRepository repository;
    private final UserSchemaMapper mapper;

    public UserGatewayImpl(UserJpaRepository repository, UserSchemaMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public User create(User userDomain) {
        UserSchema schema = mapper.toSchema(userDomain);
        UserSchema savedSchema = repository.save(schema);
        return mapper.toDomain(savedSchema);
    }

    @Override
    public Optional<User> getByEmail(com.example.CoursesClean.domain.valueobjects.Email email) {
        return repository.findByEmail(email.value())
                .map(mapper::toDomain);
    }
}