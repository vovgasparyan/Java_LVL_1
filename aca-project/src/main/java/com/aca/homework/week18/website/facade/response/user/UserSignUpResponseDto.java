package com.aca.homework.week18.website.facade.response.user;

import java.util.Objects;

public class UserSignUpResponseDto {

    private Long id;
    private final String username;
    private final String password;
    private final String firstName;
    private final String secondName;

    public UserSignUpResponseDto(String username, String password, String firstName, String secondName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSignUpResponseDto that = (UserSignUpResponseDto) o;
        return Objects.equals(id, that.id) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(firstName, that.firstName) && Objects.equals(secondName, that.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, firstName, secondName);
    }

    @Override
    public String toString() {
        return "UserSignUpResponseDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
