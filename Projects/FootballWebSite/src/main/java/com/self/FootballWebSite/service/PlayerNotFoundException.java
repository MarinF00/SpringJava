package com.self.FootballWebSite.service;

public class PlayerNotFoundException extends RuntimeException{
    public PlayerNotFoundException(Long id)
    {
        super("Player not found " + id);
}
}
