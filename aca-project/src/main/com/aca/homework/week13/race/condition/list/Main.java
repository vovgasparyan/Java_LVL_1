package com.aca.homework.week13.race.condition.list;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        RaceConditionGenerator raceConditionGenerator = new RaceConditionGenerator();
        System.out.println(raceConditionGenerator.start());
    }
}
