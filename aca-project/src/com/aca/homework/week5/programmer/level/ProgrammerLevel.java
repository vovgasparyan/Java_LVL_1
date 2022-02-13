package com.aca.homework.week5.programmer.level;

public enum ProgrammerLevel {
    JUNIOR, MID, SENIOR;

    @Override
    public String toString() {
        String levelPosition = this.name().toLowerCase();
        return levelPosition.substring(0, 1).toUpperCase() + levelPosition.substring(1) + " programmer";
    }
}
