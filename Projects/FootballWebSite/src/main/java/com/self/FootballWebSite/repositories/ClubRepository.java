package com.self.FootballWebSite.repositories;

import com.self.FootballWebSite.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClubRepository  extends JpaRepository<Club,Long> {

}
