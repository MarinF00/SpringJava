package com.self.FootballWebSite.controller.impl;

import com.self.FootballWebSite.model.UserDto;
import com.self.FootballWebSite.repositories.UserRepository;
import com.self.FootballWebSite.service.AuthService;
import com.self.FootballWebSite.service.AuthValidationService;
import com.self.FootballWebSite.service.RegisterUserServiceModel;
import org.h2.engine.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
   private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final AuthValidationService authValidationService;
    public  AuthServiceImpl(UserRepository userRepository, ModelMapper modelMapper, AuthValidationService authValidationService)
    {
        this.authValidationService = authValidationService;
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
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
    }

