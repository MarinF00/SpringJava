package com.self.FootballWebSite.service;

import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthValidationService {
    private final UserRepository userRepository;
    private final ClubRepository clubRepository;

    public AuthValidationService(UserRepository userRepository, ClubRepository clubRepository) {
        this.userRepository = userRepository;
        this.clubRepository = clubRepository;
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
