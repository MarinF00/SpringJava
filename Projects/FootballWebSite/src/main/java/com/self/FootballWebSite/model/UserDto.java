package com.self.FootballWebSite.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Users")
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty
    private String password;


    @NotNull
    @NotEmpty
    private String email;
    boolean active;
    String roles;
public UserDto()
{

}
    public UserDto(String username)
    {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
    public boolean isActive()
    {
        return active;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "firstName='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}