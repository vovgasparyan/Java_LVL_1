package com.aca.classroom.week7.lesson14.timer;

class GoodTimerTest {

    public static void main(String[] args) {
/*
        Timer timer = new GoodTimer(new Action() {
            @Override
            public void doAction() {
                System.out.println("Hello!");
            }
        });
        timer.start();
        */

        Timer timer = new GoodTimer(new HelloPrinterAction());
        timer.start();

    }
}