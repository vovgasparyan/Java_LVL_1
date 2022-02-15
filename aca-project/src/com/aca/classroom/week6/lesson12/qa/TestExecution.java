package com.aca.classroom.week6.lesson12.qa;

public abstract class TestExecution {

    private String description;

    public TestExecution(String description) {
        this.description = description;
    }

    public abstract Result execute();

    public void start() {
        printTestDescription();
        Result result = execute();
        printResult(result);
    }

    public void printTestDescription() {
        System.out.println("Starting the test " + description);
    }

    public void printResult(Result result) {
        if (result == Result.FAIL) {
            System.err.println("The result of " + description + " is " + result);
        } else {
            System.out.println("The result of " + description + " is " + result);
        }

    }
}
