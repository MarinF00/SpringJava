package com.self.FootballWebSite.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
@Entity
@Table(name = "m_players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;



    String firstName;
    String familyName;
    int number;
    String position;
    String description;
    @ManyToOne
    Club owner;

    public Player()
    {

    }
    public Player(String firstName,String familyName,int number, String position)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.number = number;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setOwner(Club owner) {
        this.owner = owner;
    }

    public Club getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return firstName + " " + familyName + " " + number + " " + position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return id != null ? id.equals(player.id) : player.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
