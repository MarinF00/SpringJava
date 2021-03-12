package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.model.Player;
import com.self.FootballWebSite.repositories.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "/ManchesterUnited/add")
    public void addPlayers(@RequestParam String firstName, @RequestParam String familyName,@RequestParam int number, @RequestParam String position)
    {
        Player player = new Player(firstName, familyName, number, position);
        playerRepository.save(player);
    }
  @RequestMapping(value = "/ManchesterUnited/delete")
   public void deletePlayers(@RequestParam String firstName, @RequestParam String familyName,@RequestParam int number, @RequestParam String position)
   {
       for(int i = 0; i < BootStrapData.munPlayers.size();i++)
       {
           if(number == (BootStrapData.munPlayers.get(i).getNumber()))
           {
               playerRepository.delete(BootStrapData.munPlayers.get(i));
               BootStrapData.munPlayers.remove(i);
           }
       }

   }

}
