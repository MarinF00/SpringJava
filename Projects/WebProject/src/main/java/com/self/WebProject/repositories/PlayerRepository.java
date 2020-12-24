package com.self.WebProject.repositories;

import com.self.WebProject.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player,Long> {
}
