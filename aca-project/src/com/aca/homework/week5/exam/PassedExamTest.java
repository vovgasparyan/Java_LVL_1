package com.aca.homework.week5.exam;

public class PassedExamTest extends ExamTest {

    public PassedExamTest(String username) {
        super(username);
    }

    @Override
    public String toString() {
        if (!this.getPassed()) {
            return this.getUserName() + " is failed exam";
        }
        return this.getUserName() + " is passed exam";
    }
}
