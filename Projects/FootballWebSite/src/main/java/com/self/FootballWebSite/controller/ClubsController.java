package com.self.FootballWebSite.controller;

import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.service.ClubNotFoundException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClubsController {
    ClubRepository clubRepository;
    public ClubsController(ClubRepository clubRepository){this.clubRepository = clubRepository;}


    @GetMapping("/clubs")
    Iterable<Club> all() {
        return  clubRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/clubs/post")
    Club newEmployee(@RequestBody Club newClub) {
        return clubRepository.save(newClub);
    }

    // Single item

    @GetMapping("/clubs/{id}")
    Club one(@PathVariable Long id) {

        return clubRepository.findById(id)
                .orElseThrow(() -> new ClubNotFoundException(id));
    }

    @PutMapping("/clubs/put/{id}")
    Club replaceEmployee(@RequestBody Club newClub, @PathVariable Long id) {

        return clubRepository.findById(id)
                .map(club -> {
                    club.setName(newClub.getName());
                    club.setPlayers(newClub.getPlayers());
                    return clubRepository.save(club);
                })
                .orElseGet(() -> {
                    newClub.setId(id);
                    return clubRepository.save(newClub);
                });
    }

    @DeleteMapping("/clubs/delete/{id}")
    void deleteEmployee(@PathVariable Long id) {
        clubRepository.deleteById(id);
    }
}

