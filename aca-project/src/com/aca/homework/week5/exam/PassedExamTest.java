package com.aca.homework.week5.exam;

public class PassedExamTest extends ExamTest {

    public PassedExamTest(String username) {
        super(username, true);
    }

    @Override
    public String toString() {
        return this.getUserName() + " is passed exam";
    }
}
