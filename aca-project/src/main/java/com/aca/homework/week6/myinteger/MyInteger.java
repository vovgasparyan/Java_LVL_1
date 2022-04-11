package com.aca.homework.week6.myinteger;

public class MyInteger {

    private int value;
    private static MyInteger[] integersArray = new MyInteger[201];

    public MyInteger(int value) {
        this.value = value;
    }

    public static MyInteger valueOf(int value) {
        if (value < -101 || value > 100) {
           return new MyInteger(value);
        }
        if (integersArray[value + 100] == null) {
            create(value);
        }
        return integersArray[value + 100];
    }

    public static void create(int value) {
        integersArray[value + 100] = new MyInteger(value);
    }

    @Override
    public String toString() {
        return "Value is: " + value;
    }
}
