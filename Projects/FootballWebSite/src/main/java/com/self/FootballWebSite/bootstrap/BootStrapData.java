package com.self.FootballWebSite.bootstrap;



import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.model.Player;
import com.self.FootballWebSite.model.Publisher;
import com.self.FootballWebSite.repositories.ArsenalRepository;
import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.ManchesterUnitedRepository;
import com.self.FootballWebSite.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    ClubRepository clubRepository;
    ManchesterUnitedRepository manchesterUnitedRepository;
    PublisherRepository publisherRepository;


    public BootStrapData(ClubRepository clubRepository, ManchesterUnitedRepository manchesterUnitedRepository, PublisherRepository publisherRepository,ArsenalRepository arsenalRepository) {
        this.clubRepository = clubRepository;
        this.manchesterUnitedRepository = manchesterUnitedRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("Marin", "Filipov","Bulgaria","Varna");
        Club mun = new Club("Manchester United");

        Player WayneRooney = new Player("Wayne", "Rooney",33,"Forward");
        Player Harry = new Player("Harry", "Maguire",26,"Central Deffender");
        Player WanBissaka = new Player("Wan", "Bissaka",24,"Right-Back");
        Player Rashford = new Player("Marcus", "Rashford",23,"Central Forward");
        Player Cavani = new Player("Edinson", "Cavani",31,"Central Forward");
        mun.addPlayer(WayneRooney);
        mun.addPlayer(Harry);
        mun.addPlayer(Rashford);
        mun.addPlayer(WanBissaka);
        mun.addPlayer(Cavani);

        publisherRepository.save(publisher);

        manchesterUnitedRepository.save(WayneRooney);
        manchesterUnitedRepository.save(Harry);
        manchesterUnitedRepository.save(Rashford);
        manchesterUnitedRepository.save(Cavani);
        manchesterUnitedRepository.save(WanBissaka);

        clubRepository.save(mun);

        System.out.println(publisher);
        System.out.println(mun);

    }
}

