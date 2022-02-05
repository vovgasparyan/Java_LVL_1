package com.aca.homework.week4.time;

public class Time {

    private final int second;

    public Time(int secondsOfDay) {
        this.second = secondsOfDay;
    }

    public int getHour() {
        return this.second / 3600;
    }

    public int getMinutes() {
        return this.second % 3600 / 60;
    }

    public int getSecond() {
        return this.second % 60;
    }
}
