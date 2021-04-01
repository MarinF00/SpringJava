package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ArsenalController {

    public PlayerRepository arsenalRepository;
    public ClubRepository clubRepository;

    public ArsenalController(PlayerRepository arsenalRepository, ClubRepository clubRepository)
    {
        this.arsenalRepository = arsenalRepository;
        this.clubRepository = clubRepository;
    }

    @RequestMapping(value = "/Arsenal")
    public String getPlayers(Model model)
    {
        long id = 579;
        Club hello = clubRepository.findById(id).orElse(null);
        model.addAttribute("players", hello.getPlayers());


        return "Arsenal";
    }
}
