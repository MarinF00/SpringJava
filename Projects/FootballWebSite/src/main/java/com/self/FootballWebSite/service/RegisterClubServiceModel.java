package com.self.FootballWebSite.service;

import org.springframework.stereotype.Service;

@Service
public class RegisterClubServiceModel {
    String name;
    String description;
    public RegisterClubServiceModel ()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
