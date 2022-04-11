package com.aca.classroom.week8.file;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String username) {
        super("The user with " + username + " not found");
    }


}
