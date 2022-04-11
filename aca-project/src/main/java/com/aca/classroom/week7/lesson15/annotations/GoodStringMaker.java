package com.aca.classroom.week7.lesson15.annotations;

import com.aca.classroom.week7.lesson15.string.performance.StringMakerResult;

@HighPerformance
public class GoodStringMaker implements StringMaker {

    @Override
    public StringMakerResult make(int start, int end) {
        long startMillis = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++) {
            builder.append(i);
        }

        String text = builder.toString();

        return new StringMakerResult(text, System.currentTimeMillis() - startMillis);
    }
}
