package com.nineleaps.repository;

import com.nineleaps.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Query(value = "SELECT first_name FROM user.user_table WHERE first_name = :username", nativeQuery = true)
    User getUserByUsername(@Param("username") String username);

    User findByEmail(String email);

    User findUserByEmail(String email);
}
