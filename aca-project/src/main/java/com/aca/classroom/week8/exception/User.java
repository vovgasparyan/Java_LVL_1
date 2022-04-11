package com.aca.classroom.week8.exception;

public class User {

    private String userName;
    private String firstName;

    public User(String userName, String firstName) {
        if (userName == null) {
            throw new IllegalArgumentException("Username is null");
        }

        if (userName.length() < 3) {
            throw new IllegalArgumentException("The username length is less than 3, length is: " + userName.length());
        }

        if (firstName == null) {
            throw new IllegalArgumentException("Firstname is null");
        }
        this.userName = userName;
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }
}
