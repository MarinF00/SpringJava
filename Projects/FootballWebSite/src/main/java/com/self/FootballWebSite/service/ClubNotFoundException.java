package com.self.FootballWebSite.service;

public class ClubNotFoundException extends RuntimeException{
    public ClubNotFoundException (Long id )
    {
        super("Club not found" + id);
    }
}
