package com.self.FootballWebSite.repositories;

import com.self.FootballWebSite.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDto,Long> {


    Optional<UserDto> findByUsername(String username);
}

