package com.alexkinyua.security_app.registration.token;

import com.alexkinyua.security_app.user.User;

import java.util.Optional;

public interface IVerificationTokenService {
    String validateToken(String token);
    void saveVerificationTokenForUser(User user, String token);
    Optional<VerificationToken> findByToken(String token);

    void deleteUserToken(Long id);
}
