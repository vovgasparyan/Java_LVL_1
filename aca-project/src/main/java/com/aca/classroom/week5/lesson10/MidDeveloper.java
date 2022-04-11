package com.aca.classroom.week5.lesson10;

public class MidDeveloper extends Developer {

    public MidDeveloper(String name) {
        super(name);
    }

    @Override
    public long getSalary() {
        return 500_000;
    }
}
