package com.aca.homework.week18.website.facade.user;

public class UserIsAlreadyExistsException extends RuntimeException {
    public UserIsAlreadyExistsException(final String username) {
        super(String.format("User having a username - %s is already exists", username));
    }
}
