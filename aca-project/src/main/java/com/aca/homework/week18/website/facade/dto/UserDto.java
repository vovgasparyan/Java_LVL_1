package com.aca.homework.week18.website.facade.dto;

public class UserDto {

    private Long id;
    private String username;
    private String firstName;
    private String secondName;

    public UserDto(Long id, String username, String firstName, String secondName) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
