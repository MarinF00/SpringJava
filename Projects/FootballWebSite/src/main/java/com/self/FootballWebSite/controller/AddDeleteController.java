package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.bootstrap.BootStrapData;
import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.model.Player;
import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class AddDeleteController {
    public PlayerRepository playerRepository;
    public ClubRepository clubRepository;
    public AddDeleteController(PlayerRepository playerRepository,ClubRepository clubRepository)
    {
        this.playerRepository = playerRepository;
        this.clubRepository = clubRepository;
    }
    @RequestMapping(value = "/add")
    public void addPlayers(@RequestParam Long id, @RequestParam String firstName, @RequestParam String familyName, @RequestParam int number, @RequestParam String position)
    {
        Player player = new Player(firstName, familyName, number, position);
        playerRepository.save(player);
        Club found = clubRepository.findById(id).orElse(null);
        found.getPlayers().add(player);
        clubRepository.save(found);
    }
    @RequestMapping(value = "/delete")
    public void deletePlayers(@RequestParam Long id, @RequestParam String firstName, @RequestParam String familyName,@RequestParam int number, @RequestParam String position)
    {
        Club found = clubRepository.findById(id).orElse(null);


        for(int i = 0; i < found.getPlayers().size(); i++)
        {
            if(number == found.getPlayers().get(i).getNumber())
            {
                playerRepository.delete(found.getPlayers().remove(i));
                found.getPlayers().remove(i);
                clubRepository.save(found);
            }
        }

    }
}
