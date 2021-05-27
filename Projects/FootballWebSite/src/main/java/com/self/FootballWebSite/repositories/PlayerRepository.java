package com.self.FootballWebSite.repositories;

import com.self.FootballWebSite.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {

}
