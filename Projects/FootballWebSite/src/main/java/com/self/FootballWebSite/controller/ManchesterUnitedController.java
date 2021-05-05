package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.model.Player;
import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ManchesterUnitedController {
    public PlayerRepository playerRepository;
    public ClubRepository clubRepository;

    public ManchesterUnitedController(PlayerRepository playerRepository,ClubRepository clubRepository)
    {
        this.playerRepository = playerRepository;
        this.clubRepository = clubRepository;
    }
    @PostMapping("/employees")
    Club newClub(@RequestBody Club newClub) {
        return clubRepository.save(newClub);
    }

    @RequestMapping(value = "/ManchesterUnited")
    public String getPlayers(Model model)
    {
        long id = 581;
        Club hello = clubRepository.findById(id).orElse(null);
        model.addAttribute("players", hello.getPlayers());
    return "ManchesterUnited";
    }
    @RequestMapping(value = "/Manchester United")
    public String gettPlayers(Model model)
    {
        long id = 581;
        Club hello = clubRepository.findById(id).orElse(null);
        model.addAttribute("players", hello.getPlayers());
        return "ManchesterUnited";
    }

}
