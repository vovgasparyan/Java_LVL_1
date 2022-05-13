package com.aca.homework.week18.website.facade.request.user;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super(String.format("User with %s id is not exists", id));
    }
}
