package com.aca.classroom.week6.lesson12.qa;

public class AbsTestExecution extends TestExecution {

    public AbsTestExecution() {
        super("Abs function test");
    }

    @Override
    public Result execute() {
        return (Math.abs(-1000) < -99) ? Result.PASS : Result.FAIL;
    }
}
