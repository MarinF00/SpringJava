package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.repositories.ClubRepository;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class ClubController {

    final ClubRepository clubRepository;

    public ClubController(ClubRepository clubRepository)
    {
        this.clubRepository = clubRepository;
    }
@RequestMapping("/clubs")
    public String getClubs(Model model)
    {
    model.addAttribute("clubs",clubRepository.findAll());
    return "clubs";
    }
}
