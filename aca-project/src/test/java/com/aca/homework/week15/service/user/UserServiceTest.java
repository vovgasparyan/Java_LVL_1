package com.aca.homework.week15.service.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService(new UserRepository(new ConnectionFactory()));
    }

    @Test
    public void testInsertUsers() {
        User user = new User("vovani", "Vladimir");
        UserCreateParams params = new UserCreateParams(user.getUsername(), user.getName());
        userService.create(params);
        Assertions.assertEquals("vovani", user.getUsername());
    }

    // will add more tests
}