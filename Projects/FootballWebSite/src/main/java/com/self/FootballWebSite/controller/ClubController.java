package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.repositories.ClubRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping("/MyClubs/{id}")
    public ModelAndView getClub(@PathVariable Long id, Model model)
    {
        ModelAndView modelAndView = new ModelAndView();

        if(id == 581)
        {
            Club hello = clubRepository.findById(id).orElse(null);
            model.addAttribute("players", hello.getPlayers());
            modelAndView.setViewName("ManchesterUnited");
        }
       else if(id == 579)
        {
            Club hello = clubRepository.findById(id).orElse(null);
            model.addAttribute("players", hello.getPlayers());
            modelAndView.setViewName("Arsenal");
        }
       return modelAndView;
    }

}
