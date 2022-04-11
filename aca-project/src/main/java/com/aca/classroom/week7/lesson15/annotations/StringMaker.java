package com.aca.classroom.week7.lesson15.annotations;

import com.aca.classroom.week7.lesson15.string.performance.StringMakerResult;

public interface StringMaker {

    StringMakerResult make(int start, int end);

    static StringMaker ofBad() {
        return new StringMakerImpl();
    }

    static StringMaker ofGood() {
        return new GoodStringMaker();
    }
}
