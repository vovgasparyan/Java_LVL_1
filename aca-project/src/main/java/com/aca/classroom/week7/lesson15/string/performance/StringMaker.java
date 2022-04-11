package com.aca.classroom.week7.lesson15.string.performance;

public interface StringMaker {

    StringMakerResult make(int start, int end);

    static StringMaker ofBad() {
        return new BadStringMaker();
    }

    static StringMaker ofGood() {
        return new GoodStringMaker();
    }
}
