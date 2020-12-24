package com.self.WebProject.bootstrap;

import com.self.WebProject.model.Club;
import com.self.WebProject.model.Player;
import com.self.WebProject.repositories.ClubRepository;
import com.self.WebProject.repositories.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    final ClubRepository clubRepository;
    final PlayerRepository playerRepository;

    public BootStrapData(ClubRepository clubRepository, PlayerRepository playerRepository) {
        this.clubRepository = clubRepository;
        this.playerRepository = playerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Club mun = new Club("Manchester United");
        Player WayneRooney = new Player("Wayne", "Rooney",33,"Forward",mun);
        Player Harry = new Player("Harry", "Maguire",26,"Central Deffender",mun);
        mun.getPlayers().add(WayneRooney);
        mun.getPlayers().add(Harry);
        clubRepository.save(mun);
        playerRepository.save(WayneRooney);
        playerRepository.save(Harry);
        System.out.println("Manchester United has: " + playerRepository.count() + " players");
    }
}
