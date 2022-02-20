package com.aca.homework.week7.singleton;

public class SingletonUserService {

    private static SingletonUserService userService;

    private SingletonUserService() {}

    public static SingletonUserService getInstance() {
        if (userService != null) {
            return userService;
        }
        userService = new SingletonUserService();
        return userService;
    }
}
