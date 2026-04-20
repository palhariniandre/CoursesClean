package com.example.CoursesClean.infrastructure.gateways.repository;

import com.example.CoursesClean.infrastructure.gateways.schema.UserSchema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJpaRepository extends JpaRepository<UserSchema, Long> {
    Optional<UserSchema> findByEmail(String email);
}
