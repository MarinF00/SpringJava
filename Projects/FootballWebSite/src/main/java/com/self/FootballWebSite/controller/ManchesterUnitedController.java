package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.model.Player;
import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ManchesterUnitedController {
    public PlayerRepository playerRepository;
    public ClubRepository clubRepository;

    public ManchesterUnitedController(PlayerRepository playerRepository,ClubRepository clubRepository)
    {
        this.playerRepository = playerRepository;
        this.clubRepository = clubRepository;
    }

    @RequestMapping(value = "/ManchesterUnited")
    public String getPlayers(Model model)
    {
        long id = 581;
        Club hello = clubRepository.findById(id).orElse(null);
        model.addAttribute("players", hello.getPlayers());
    return "ManchesterUnited";
    }

    @RequestMapping(value = "/ManchesterUnited/add")
    public void addPlayers(@RequestParam Long id, @RequestParam String firstName, @RequestParam String familyName,@RequestParam int number, @RequestParam String position)
    {
        Player player = new Player(firstName, familyName, number, position);
        //playerRepository.save(player);
        Club found = clubRepository.findById(id).orElse(null);
        found.getPlayers().add(player);
        clubRepository.save(found);
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
