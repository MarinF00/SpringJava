package com.self.FootballWebSite.bootstrap;



import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.model.Player;
import com.self.FootballWebSite.model.Publisher;
import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.PlayerRepository;
import com.self.FootballWebSite.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    ClubRepository clubRepository;
    PlayerRepository playerRepository;
    PublisherRepository publisherRepository;

   public static List<Player> munPlayers = new ArrayList<>();
   public static List<Player> arsPlayers = new ArrayList<>();



    public BootStrapData(ClubRepository clubRepository, PlayerRepository playerRepository, PublisherRepository publisherRepository) {
        this.clubRepository = clubRepository;
        this.playerRepository = playerRepository;
        this.publisherRepository = publisherRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("Marin", "Filipov","Bulgaria","Varna");
        Club mun = new Club("Manchester United");

        Player Denis = new Player("Denis","Bergkamp",10,"Forward");
        Club ars = new Club("Arsenal");
        ars.addPlayer(Denis,arsPlayers);


        Player DeGea = new Player("David", "DeGea",1,"Goalkeeper");
        Player Dean = new Player("Dean", "Henderson",26,"Goalkeeper");
        Player Harry = new Player("Harry", "Maguire",5,"Defender");
        Player Victor = new Player("Victor", "Lindelof",2,"Defender");
        Player Eric = new Player("Eric", "Baily",3,"Defender");
        Player Luke = new Player("Luke", "Shaw",23,"Defender");
        Player Alex = new Player("Alex", "Telles",27,"Defender");
        Player Brandon = new Player("Brandon", "Williams",33,"Defender");
        Player Axel = new Player("Axel", "Tuanzebe",38,"Defender");
        Player WanBissaka = new Player("Wan", "Bissaka",29,"Defender");
        Player Bruno = new Player("Bruno", "Fernandes",18,"Midfielder");
        Player Paul = new Player("Paul", "Pogba",6,"Midfielder");
        Player Juan = new Player("Juan", "Mata",8,"Midfielder");
        Player Nemanja = new Player("Nemanja", "Matic",31,"Midfielder");
        Player Fred = new Player("Fred","TheRed",17,"Midfielder");
        Player Scott = new Player("Scott","McTominay",39,"Midfielder");
        Player Donny = new Player("Donny","VanDeBeek",38,"Midfielder");
        Player Rashford = new Player("Marcus", "Rashford",10,"Forward");
        Player Martial = new Player("Anthony", "Martial",9,"Forward");
        Player Mason = new Player("Mason", "Greenwood",11,"Forward");
        Player Cavani = new Player("Edinson", "Cavani",7,"Forward");
        Player Deans = new Player("proba", "greshka",133,"Striker");
        mun.addPlayer(DeGea,munPlayers);
        mun.addPlayer(Dean,munPlayers);
        mun.addPlayer(Victor,munPlayers);
        mun.addPlayer(Eric,munPlayers);
        mun.addPlayer(Harry,munPlayers);
        mun.addPlayer(Luke,munPlayers);
        mun.addPlayer(WanBissaka,munPlayers);
        mun.addPlayer(Alex,munPlayers);
        mun.addPlayer(Axel,munPlayers);
        mun.addPlayer(Brandon,munPlayers);
        mun.addPlayer(Bruno,munPlayers);
        mun.addPlayer(Paul,munPlayers);
        mun.addPlayer(Juan,munPlayers);
        mun.addPlayer(Nemanja,munPlayers);
        mun.addPlayer(Donny,munPlayers);
        mun.addPlayer(Fred,munPlayers);
        mun.addPlayer(Scott,munPlayers);
        mun.addPlayer(Cavani,munPlayers);
        mun.addPlayer(Martial,munPlayers);
        mun.addPlayer(Rashford,munPlayers);
        mun.addPlayer(Mason,munPlayers);
        mun.addPlayer(Deans,munPlayers);

        ars.setPlayers(arsPlayers);
        mun.setPlayers(munPlayers);



    }
}

