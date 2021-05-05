package com.self.FootballWebSite.service;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserServiceModel {
    private String username;
    private String email;
    private String password;
    String roles;

    public RegisterUserServiceModel()
    {

    }

    public void setRoles(String roles) {
        this.roles = roles;
    }



    public String getRoles() {
        return roles;
    }



    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
