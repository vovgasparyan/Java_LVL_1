package com.aca.homework.week19.job.platform.service.impl.user;

public class UserEmailExistsException extends RuntimeException {
    public UserEmailExistsException(String email) {
        super(String.format("%s email address is already exists", email));
    }
}
