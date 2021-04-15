package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.model.Player;
import com.self.FootballWebSite.model.UserDto;
import com.self.FootballWebSite.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;


@Controller
public class RegistrationController {
    UserRepository userRepository;
    RegistrationController(UserRepository userRepository)
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
    public String register()
    {
        return "register";
    }

}
