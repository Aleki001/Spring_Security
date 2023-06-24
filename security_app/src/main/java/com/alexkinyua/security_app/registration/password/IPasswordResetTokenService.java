package com.alexkinyua.security_app.registration.password;

import com.alexkinyua.security_app.user.User;

import java.util.Optional;

public interface IPasswordResetTokenService {
    String validatePasswordResetToken(String theToken);

    Optional<User> findUserByPasswordResetToken(String theToken);

    void resetPassword(User theUser, String password);

    void createPasswordResetTokenForUser(User user, String passwordResetToken);
}
