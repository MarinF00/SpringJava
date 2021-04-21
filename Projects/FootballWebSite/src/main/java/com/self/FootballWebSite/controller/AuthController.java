package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.model.RegisterUserModel;
import com.self.FootballWebSite.service.AuthService;
import com.self.FootballWebSite.service.RegisterUserServiceModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {
    private final AuthService authService;
    private final ModelMapper modelMapper;

    public AuthController(AuthService authService, ModelMapper modelMapper)
    {
        this.modelMapper = modelMapper;
        this.authService = authService;
    }
    @GetMapping("/login")
    public String getLoginForm()
    {
        return "login";
    }
    @GetMapping("/register")
    public String getRegisterForm()
    {
        return "register";
    }
    @PostMapping("/register")
   public ModelAndView register(@ModelAttribute RegisterUserModel model) {
        RegisterUserServiceModel serviceModel = modelMapper.map(model,RegisterUserServiceModel.class);
        authService.register(serviceModel);

        return new ModelAndView("login");
    }
}
