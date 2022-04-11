package com.aca.classroom.week6.lesson12.qa;

public class MaxTestExecution extends TestExecution {

    public MaxTestExecution() {
        super("Max function test");
    }

    @Override
    public Result execute() {
        if (Math.max(9, 99) == 99) {
            return Result.PASS;
        } else {
            return Result.FAIL;
        }
    }
}
