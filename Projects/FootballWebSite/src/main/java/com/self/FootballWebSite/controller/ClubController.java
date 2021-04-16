package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.repositories.ClubRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/addClub",method = RequestMethod.POST)
    @ResponseBody
    public String submit(@Valid @ModelAttribute("club") Club club,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", club.getName());
        model.addAttribute("id", club.getId());
        return "MyClubs";
    }
}
