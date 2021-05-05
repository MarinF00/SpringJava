package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.repositories.ClubRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

@RequestMapping("club/{id}")
    public String getClub(@PathVariable Long id,Model model)
{
    Club club = clubRepository.findById(id).orElse(null);
    model.addAttribute("club_name", club.getName());
    model.addAttribute("club_desc",club.getDescription());
    model.addAttribute("players",club.getPlayers());
    return "club";
}
}
