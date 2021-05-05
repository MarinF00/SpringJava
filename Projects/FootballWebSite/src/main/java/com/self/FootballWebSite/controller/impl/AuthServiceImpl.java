package com.self.FootballWebSite.controller.impl;

import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.model.UserDto;
import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.UserRepository;
import com.self.FootballWebSite.service.AuthService;
import com.self.FootballWebSite.service.AuthValidationService;
import com.self.FootballWebSite.service.RegisterClubServiceModel;
import com.self.FootballWebSite.service.RegisterUserServiceModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
   private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final AuthValidationService authValidationService;
    private final ClubRepository clubRepository;
    public  AuthServiceImpl(UserRepository userRepository, ModelMapper modelMapper, AuthValidationService authValidationService, ClubRepository clubRepository)
    {
        this.authValidationService = authValidationService;
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.clubRepository = clubRepository;
    }

    @Override
    public void register(RegisterUserServiceModel model) {
        if(!authValidationService.isValid(model))
        {
            System.out.println("WRONG CREDENTIALS");
        }
        UserDto userDto = modelMapper.map(model, UserDto.class);
        userRepository.save(userDto);
        }

    @Override
    public void clubRegister(RegisterClubServiceModel model) {
            Club club = modelMapper.map(model, Club.class);
            clubRepository.save(club);

    }
}

