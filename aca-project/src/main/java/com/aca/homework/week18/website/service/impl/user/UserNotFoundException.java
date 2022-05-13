package com.aca.homework.week18.website.service.impl.user;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(final String username) {
        super(String.format("User having a username - %s not found", username));
    }

    public UserNotFoundException(final Long id) {
        super(String.format("User having a id - %s not found", id));
    }
}
