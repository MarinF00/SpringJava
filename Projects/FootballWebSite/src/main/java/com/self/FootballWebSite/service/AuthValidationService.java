package com.self.FootballWebSite.service;

import com.self.FootballWebSite.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthValidationService {
    private final UserRepository userRepository;

    public AuthValidationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isValid(RegisterUserServiceModel model)
    {
        return this.isEmailFree(model.getEmail()) &&
                this.isPasswordFree(model.getPassword()) &&
                this.isUsernameFree(model.getUsername());
    }

    private boolean isUsernameFree(String username)
    {
        return userRepository.existsByUsername(username);
    }
    private boolean isPasswordFree(String password)
    {
        return userRepository.existsByPassword(password);
    }
    private boolean isEmailFree(String email)
    {
        return userRepository.existsByEmail(email);
    }

}
