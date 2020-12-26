package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.repositories.PlayerRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class PlayerController {
    final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository)
    {
        this.playerRepository = playerRepository;
    }
    @RequestMapping("/players")
    public String getPlayers(Model model)
    {
    model.addAttribute("players",playerRepository.findAll());
    return "players";
    }

}
