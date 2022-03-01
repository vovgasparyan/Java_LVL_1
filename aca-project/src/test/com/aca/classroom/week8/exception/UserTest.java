package com.aca.classroom.week8.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class UserTest {

    @Test
    public void testWhenUsernameIsNull() {
        RuntimeException exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new User(null, "firstname");
            }
        });
        Assertions.assertEquals(exception.getMessage(), "Username is null");


        //System.out.println(exception.getMessage());

    }
    @Test
    public void testWhenFirstnameIsNull() {
        RuntimeException exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new User("username", null);
            }
        });
        Assertions.assertEquals(exception.getMessage(), "Firstname is null");


        //System.out.println(exception.getMessage());

    }

    @Test
    public void testWhenUsernameLengthIs2() {
        RuntimeException exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new User("us", "firstname");
            }
        });
        Assertions.assertEquals("The username length is less than 3, length is: 2", exception.getMessage());


        //System.out.println(exception.getMessage());

    }
}
