package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.repositories.ClubRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ClubController {

    public ClubRepository clubRepository;

    public ClubController(ClubRepository clubRepository)
    {
        this.clubRepository = clubRepository;
    }
@RequestMapping("/MyClubs")
    public String getClubs(Model model)
    {
    model.addAttribute("clubs", clubRepository.findAll());
    return "MyClubs";
    }
}
