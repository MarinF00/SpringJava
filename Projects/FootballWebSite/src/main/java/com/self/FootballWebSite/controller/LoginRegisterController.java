package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.model.UserDto;
import com.self.FootballWebSite.repositories.UserRepository;
import org.h2.engine.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginRegisterController {
    UserRepository userRepository;
    LoginRegisterController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    @RequestMapping(value = "/register/user")
    public void addUsers(@RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam String role)
    {
        UserDto user = new UserDto(username, password, email, role);
        user.setActive(true);
        userRepository.save(user);
    }
    @GetMapping("/register")
    public ModelAndView register()
    {
        return new ModelAndView("register");
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
}
