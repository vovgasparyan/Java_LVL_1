package com.aca.homework.week12.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("username")
    private String userName;

    @JsonProperty("name")
    private String firstName;

    @JsonProperty("age")
    private int age;

    public User(String userName, String firstName, int age) {
        this.userName = userName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
