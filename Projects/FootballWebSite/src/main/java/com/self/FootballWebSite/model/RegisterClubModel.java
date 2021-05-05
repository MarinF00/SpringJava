package com.self.FootballWebSite.model;

import com.self.FootballWebSite.service.RegisterClubServiceModel;

public class RegisterClubModel {

    String name;
    String description;
    public RegisterClubModel()
    {

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
