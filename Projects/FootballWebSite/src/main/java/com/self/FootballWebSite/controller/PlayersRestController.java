package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.model.Player;
import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.PlayerRepository;
import com.self.FootballWebSite.service.ClubNotFoundException;
import com.self.FootballWebSite.service.PlayerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayersRestController {
    @Autowired
    PlayerRepository playerRepository;
    public PlayersRestController(PlayerRepository playerRepository){this.playerRepository = playerRepository;}


    @GetMapping("/players")
    Iterable<Player> all() {
        return  playerRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/players/post")
    Player newPlayer(@RequestBody Player newPlayer) {
        return playerRepository.save(newPlayer);
    }

    // Single item

    @GetMapping("/players/{id}")
    Player one(@PathVariable Long id) {

        return playerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException(id));
    }

    @PutMapping("/players/put/{id}")
    Player replaceEmployee(@RequestBody Player newPlayer, @PathVariable Long id) {

        return playerRepository.findById(id)
                .map(player -> {
                    player.setFirstName(player.getFirstName());
                    player.setFamilyName(player.getFamilyName());
                    player.setNumber(player.getNumber());
                    player.setPosition(player.getPosition());
                    player.setOwner(player.getOwner());
                    return playerRepository.save(player);
                })
                .orElseGet(() -> {
                    newPlayer.setId(id);
                    return playerRepository.save(newPlayer);
                });
    }

    @DeleteMapping("/players/delete/{id}")
    void deleteEmployee(@PathVariable Long id) {
        playerRepository.deleteById(id);
    }
}

