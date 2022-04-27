package com.aca.homework.week15.service.user;

@Table(name = "USERS")
public class User {

    @Column(name = "username")
    private String username;

    @Column(name = "name")
    private String name;

    public User(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }
}
