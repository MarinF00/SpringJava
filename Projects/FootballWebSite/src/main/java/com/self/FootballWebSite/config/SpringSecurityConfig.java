package com.self.FootballWebSite.config;

import com.self.FootballWebSite.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.net.PasswordAuthentication;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Qualifier("myUserDetailService")
    @Autowired
    UserDetailsService userDetailsService;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Bean
    PasswordEncoder getPasswordEncoder(){return NoOpPasswordEncoder.getInstance();}


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
                httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
                .authorizeRequests().antMatchers("/console/*").permitAll();


                        httpSecurity.authorizeRequests().antMatchers("/ManchesterUnited").permitAll().and()
                        .authorizeRequests().antMatchers("/Arsenal").permitAll().and()
                        .authorizeRequests().antMatchers("/MyClubs").permitAll().and()
                        .authorizeRequests().antMatchers("/home").permitAll().and()
                                .authorizeRequests().antMatchers("/index").permitAll().and()
                        .authorizeRequests().antMatchers("/registration").permitAll().and()
                        .authorizeRequests().antMatchers("/addClub").permitAll().and()
                        .authorizeRequests().antMatchers("/players/post").permitAll().and()
                        .authorizeRequests().antMatchers("/clubs/post").permitAll().and()
                        .authorizeRequests().antMatchers("/add").hasRole("ADMIN").and()
                        .authorizeRequests().antMatchers("/delete").hasRole("ADMIN");

                httpSecurity.csrf().disable();
                httpSecurity.headers().frameOptions().disable()
                .and()
                .formLogin()
                .loginPage("/login");
    }
}
