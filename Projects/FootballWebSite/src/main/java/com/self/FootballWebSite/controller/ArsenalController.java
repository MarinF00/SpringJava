package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.repositories.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ArsenalController {

    public PlayerRepository arsenalRepository;

    public ArsenalController(PlayerRepository arsenalRepository)
    {
        this.arsenalRepository = arsenalRepository;
    }

    @RequestMapping(value = "/Arsenal")
    public String getPlayers(Model model)
    {
        model.addAttribute("ArsenalPlayers", BootStrapData.arsPlayers);
        return "Arsenal";
    }
}
