package com.example.registrationform.dao;

import com.example.registrationform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserDAO extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.username=:username")
    Optional<User> findByUsername(String username);

    @Query("SELECT u FROM User u WHERE u.password=:password")
    Optional<User> findByPassword(String password);
}
