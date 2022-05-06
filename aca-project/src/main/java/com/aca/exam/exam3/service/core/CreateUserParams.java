package com.aca.exam.exam3.service.core;

import org.springframework.util.Assert;

public class CreateUserParams {

    private String firstName;

    private String secondName;

    private String passport;

    public CreateUserParams(String firstName, String secondName, String passport) {
        Assert.notNull(firstName, "The firstname should not be null");
        Assert.notNull(secondName, "The secondname should not be null");
        Assert.notNull(passport, "The passport should not be null");
        this.firstName = firstName;
        this.secondName = secondName;
        this.passport = passport;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPassport() {
        return passport;
    }
}
