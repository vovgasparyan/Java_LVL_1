package com.aca.homework.week15.service.user;

public class UserCreateParams {

    @NotNull
    private String username;

    @NotNull
    private String name;

    public UserCreateParams(@NotNull String username, @NotNull String name) {
        this.username = username;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }
}
