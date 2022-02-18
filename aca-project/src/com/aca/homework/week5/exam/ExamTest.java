package com.aca.homework.week5.exam;

public class ExamTest {

    private final String username;
    private boolean passed;

    public ExamTest(String username, boolean passed) {
        this.username = username;
        this.passed = passed;
    }

    public String getUserName() {
        return this.username;
    }

    public boolean isPassed() {
        return this.passed;
    }
}
