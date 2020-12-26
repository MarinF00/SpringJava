package com.self.FootballWebSite.model;

import javax.persistence.*;
@Entity
//@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String firstName;
    String familyName;
    int age;
    String position;
    @ManyToOne
    Club owner;

    public Player()
    {

    }
    public Player(String firstName,String familyName, int age, String position)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.age = age;
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setAge(int age) {
        this.age = age;
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
        return
                 firstName + " " +
                 familyName + " " +
                         age + " " +
                 position;
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
