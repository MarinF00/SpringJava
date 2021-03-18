package com.self.FootballWebSite;

import com.self.FootballWebSite.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class FootballWebSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballWebSiteApplication.class, args);
	}

}
