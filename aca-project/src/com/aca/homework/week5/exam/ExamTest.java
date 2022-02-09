package com.aca.homework.week5.exam;

public class ExamTest {

    private final String username;
    private boolean passed;

    public ExamTest(String username) {
        this.username = username;
    }

    public String getUserName() {
        return this.username;
    }

    public boolean getPassed() {
        return this.passed;
    }

    public void setPassed(boolean result) {
        this.passed = result;
    }
}
