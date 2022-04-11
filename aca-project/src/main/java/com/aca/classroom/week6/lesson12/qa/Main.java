package com.aca.classroom.week6.lesson12.qa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        TestExecution maxTestExecution = new MaxTestExecution();
//        //maxTestExecution.start();
//        TestExecution minTestExecution = new MinTestExecution();

        System.setErr(new PrintStream(new FileOutputStream("./errors.txt")));
        System.setOut(new PrintStream(new FileOutputStream("./out.txt")));

        TestExecution[] testExecutions = {new MaxTestExecution(), new MinTestExecution(), new AbsTestExecution()};
        startAll(testExecutions);

    }

    public static void startAll(TestExecution[] testExecutions) {
        for (TestExecution testExecution : testExecutions) {
            testExecution.start();
        }
    }
}
