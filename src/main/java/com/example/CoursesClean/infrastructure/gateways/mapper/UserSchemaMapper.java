package com.example.CoursesClean.infrastructure.gateways.mapper;

import com.example.CoursesClean.domain.model.User;
import com.example.CoursesClean.infrastructure.gateways.schema.UserSchema;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserSchemaMapper {

    @Mapping(target = "email", source = "email.value")
    @Mapping(target = "role", source = "role.tipoRole") // ajuste se o método for getTipo()
    UserSchema toSchema(User user);

    @Mapping(target = "email", expression = "java(new com.example.CoursesClean.domain.valueobjects.Email(schema.getEmail()))")
    @Mapping(target = "role", expression = "java(new com.example.CoursesClean.domain.model.Role(null, schema.getRole()))")
    User toDomain(UserSchema schema);
}