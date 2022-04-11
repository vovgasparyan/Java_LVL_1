package com.aca.classroom.week7.lesson15.annotations;

import com.aca.classroom.week7.lesson15.string.performance.StringMakerResult;

@LowPerformance
public class StringMakerImpl implements StringMaker {

    @Override
    @LowPerformance
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
