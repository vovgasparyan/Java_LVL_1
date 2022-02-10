package com.aca.homework.week5.exam;

public class Main {

    public static void main(String[] args) {

        ExamTest user1 = new FailedExamTest("username1");
        ExamTest user2 = new PassedExamTest("smart-username");

        ExamTest[] tests = {user1, user2};

        for (ExamTest test : tests) {
            System.out.println(test.toString());
        }
    }
}
