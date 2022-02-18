package com.aca.homework.week5.exam;

public class FailedExamTest extends ExamTest {

    public FailedExamTest(String username) {
        super(username, false);
    }

    @Override
    public boolean isPassed() {
        return false;
    }

    @Override
    public String toString() {
        return this.getUserName() + " is failed exam";
    }
}
