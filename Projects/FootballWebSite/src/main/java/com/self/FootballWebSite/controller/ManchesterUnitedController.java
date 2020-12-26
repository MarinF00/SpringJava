package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.repositories.ArsenalRepository;
import com.self.FootballWebSite.repositories.ManchesterUnitedRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ManchesterUnitedController {
    final ManchesterUnitedRepository manchesterUnitedRepository;


    public ManchesterUnitedController(ManchesterUnitedRepository manchesterUnitedRepository)
    {
        this.manchesterUnitedRepository = manchesterUnitedRepository;
    }

    @RequestMapping(value = "/ManchesterUnited")
    public String getPlayers(Model model)
    {
    model.addAttribute("players", manchesterUnitedRepository.findAll());
    return "ManchesterUnited";
    }
}
