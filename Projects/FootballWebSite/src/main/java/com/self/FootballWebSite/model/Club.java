package com.self.FootballWebSite.model;

import com.self.FootballWebSite.repositories.ClubRepository;
import com.self.FootballWebSite.repositories.PlayerRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;



    String name;


    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn(name = "player_name")
    List<Player> players = new ArrayList<>();

    public Club()
    {

    }

    public Club(String name)
    {

        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player,List<Player> players)
    {
        players.add(player);
    }

    @Override
    public String toString() {

        return "Club{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Club club = (Club) o;

        return id != null ? id.equals(club.id) : club.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

