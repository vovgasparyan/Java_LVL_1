package com.aca.homework.week5.exam;

public class FailedExamTest extends ExamTest {

    public FailedExamTest(String username) {
        super(username);
    }

    @Override
    public String toString() {
        if (this.getPassed()) {
            return this.getUserName() + " is passed exam";
        }
        return this.getUserName() + " is failed exam";
    }
}
