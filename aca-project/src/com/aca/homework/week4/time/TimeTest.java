package com.aca.homework.week4.time;

public class TimeTest {

    public static void main(String[] args) {

        Time time = new Time(5631);

        System.out.println(time.getHour() + " hours " + time.getMinutes() + " minutes " + time.getSecond() + " seconds.");
    }
}
