package com.aca.homework.week19.job.platform.service.impl.user;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super(String.format("User having id - %s is not found", id));
    }
}
