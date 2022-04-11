package com.aca.classroom.week7.lesson15.string.performance;

public class StringMakerResult {

    private String text;
    private long duration;

    public StringMakerResult(String text, long duration) {
        this.text = text;
        this.duration = duration;
    }

    public String getText() {
        return text;
    }

    public long getDuration() {
        return duration;
    }
}
