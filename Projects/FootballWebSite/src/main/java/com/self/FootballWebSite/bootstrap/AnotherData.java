package com.self.FootballWebSite.bootstrap;

import com.self.FootballWebSite.controller.ArsenalController;
import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.model.Player;
import com.self.FootballWebSite.repositories.ArsenalRepository;
import com.self.FootballWebSite.repositories.ClubRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AnotherData implements CommandLineRunner {
    ClubRepository clubRepository;
    ArsenalRepository arsenalRepository;
    public AnotherData(ClubRepository clubRepository,ArsenalRepository arsenalRepository)
    {
        this.arsenalRepository = arsenalRepository;
        this.clubRepository = clubRepository;

    }
    @Override
    public void run(String... args) throws Exception {
        Player Denis = new Player("Denis","Bergkamp",29,"Forward");
        Club ars = new Club("Arsenal");
        ars.addPlayer(Denis);
        arsenalRepository.save(Denis);
        clubRepository.save(ars);
        System.out.println(arsenalRepository.findAll());
    }
}
