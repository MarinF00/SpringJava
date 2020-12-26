package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.repositories.ArsenalRepository;
import com.self.FootballWebSite.repositories.ManchesterUnitedRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ArsenalController {

    final ArsenalRepository arsenalRepository;

    public ArsenalController(ArsenalRepository arsenalRepository)
    {
        this.arsenalRepository = arsenalRepository;
    }

    @RequestMapping(value = "/Arsenal")
    public String getPlayers(Model model)
    {
        model.addAttribute("players", arsenalRepository.findAll());
        return "Arsenal";
    }
}
