package com.self.FootballWebSite.repositories;

import com.self.FootballWebSite.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface ArsenalRepository extends CrudRepository<Player,Long> {
}
