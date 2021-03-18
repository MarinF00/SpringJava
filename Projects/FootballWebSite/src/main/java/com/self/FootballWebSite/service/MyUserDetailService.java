package com.self.FootballWebSite.service;

import com.self.FootballWebSite.model.UserDto;
import com.self.FootballWebSite.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Optional<UserDto> userDto = userRepository.findByUsername(username);

       userDto.orElseThrow(()-> new UsernameNotFoundException(username + "Not found!"));

     return userDto.map(MyUserDetails::new).get();
    }
}
