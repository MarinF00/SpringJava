package com.self.FootballWebSite.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;

public class RegisterUserModel {
    String username;
    String password;
    String email;
    String roles;
    public RegisterUserModel()
    {

    }



    public String getRoles() {
        return roles;
    }


    public void setRoles(String roles) {
        this.roles = roles;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
