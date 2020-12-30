package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.repositories.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ManchesterUnitedController {
    public PlayerRepository playerRepository;

    public ManchesterUnitedController(PlayerRepository playerRepository)
    {
        this.playerRepository = playerRepository;
    }

    @RequestMapping(value = "/ManchesterUnited")
    public String getPlayers(Model model)
    {
    model.addAttribute("players", BootStrapData.munPlayers);
    return "ManchesterUnited";
    }
   
}
