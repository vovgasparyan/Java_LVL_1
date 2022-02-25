package com.aca.classroom.week7.lesson15.string.performance;

public class BadStringMaker implements StringMaker, LowPerformance {

    @Override
    public StringMakerResult make(int start, int end) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = start; i < end; i++) {
            result += i;
        }
        long endTime = System.currentTimeMillis() - startTime;
        return new StringMakerResult(result, endTime);
    }

}
