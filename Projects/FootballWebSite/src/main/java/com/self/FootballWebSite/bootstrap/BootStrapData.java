package com.self.FootballWebSite.bootstrap;



import com.self.FootballWebSite.model.Club;
import com.self.FootballWebSite.model.Player;
import com.self.FootballWebSite.model.Publisher;
import com.self.FootballWebSite.model.UserDto;
import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.PlayerRepository;
import com.self.FootballWebSite.repositories.PublisherRepository;
import com.self.FootballWebSite.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class BootStrapData implements CommandLineRunner {

    PlayerRepository playerRepository;
    PublisherRepository publisherRepository;
    UserRepository userRepository;


   public static List<Club> clubs = new ArrayList<>();



    public BootStrapData( PlayerRepository playerRepository, PublisherRepository publisherRepository, UserRepository userRepository) {
        this.playerRepository = playerRepository;
        this.publisherRepository = publisherRepository;
        this.userRepository = userRepository;

    }

    @Override
    public void run(String... args) throws Exception {

      Publisher publisher = new Publisher("Marin", "Filipov","Bulgaria","Varna");
        Club mun = new Club("Manchester United");

       Player Denis = new Player("Denis","Bergkamp",10,"Forward");
        Club ars = new Club("Arsenal");

       Player DeGea = new Player("David", "DeGea",1,"Goalkeeper");
        Player Dean = new Player("Dean", "Henderson",26,"Goalkeeper");
        Player Harry = new Player("Harry", "Maguire",5,"Defender");
        Player Victor = new Player("Victor", "Lindelof",2,"Defender");

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
        Player Eric = new Player("Eric", "Baily",3,"Defender");



     /*UserDto userDto3 = new UserDto("gggg");
     userDto3.setPassword("12345");
     userDto3.setEmail("kpkdsdsp23k3p@abv.bg");
     userDto3.setActive(true);
     userDto3.setRoles("ROLE_USER");
     userRepository.save(userDto3);*/
    }
}

