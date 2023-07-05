package com.alexkinyua.security_app.user;

import com.alexkinyua.security_app.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;

/**
  * @Author: Alex Kinyua
  */

public interface IUserService {
    List<User> getAllUsers();
    User registerUser(RegistrationRequest registrationRequest);
    Optional<User> findByEmail(String email);

    Optional<User> findById(Long id);

    void updateUser(Long id, String firstName, String lastName, String email);

    void deleteUser(Long id);
}
