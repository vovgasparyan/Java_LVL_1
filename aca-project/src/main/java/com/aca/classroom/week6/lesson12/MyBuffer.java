package com.aca.classroom.week6.lesson12;

public class MyBuffer implements Buffer {

    private String value;

    @Override
    public void put(String value) {
        this.value = value;
    }

    @Override
    public String get() {
        return value;
    }
}
