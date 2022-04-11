package com.aca.classroom.week7.lesson14.test;

public enum ResultType {
    FAIL("The execution is failed"),
    PASS("The execution is passed");


    // The user registration test execution is failed
    private String message;

    ResultType(String message) {
        this.message = message;
    }

    public String getTestExecutionMessage(String testName) {
        return "Test name " + message;
    }
}
