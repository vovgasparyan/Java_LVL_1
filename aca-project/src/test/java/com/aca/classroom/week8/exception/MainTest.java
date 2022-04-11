package com.aca.classroom.week8.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MainTest {

    @Test
    public void test() throws Throwable {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                throw new RuntimeException();
            }
        };

        executable.execute();

//        Assertions.assertThrows(RuntimeException.class, new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                throw new IllegalArgumentException();
//            }
//        });
        // or
        Assertions.assertThrows(RuntimeException.class, executable);
    }

}