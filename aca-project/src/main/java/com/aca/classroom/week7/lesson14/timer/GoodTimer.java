package com.aca.classroom.week7.lesson14.timer;

public class GoodTimer implements Timer {

    private Action action;

    public GoodTimer(Action action) {
        this.action = action;
    }

    @Override
    public void start() {
        while (true) {
            wait1Sec();
            action.doAction();
        }
    }

    private void wait1Sec() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start <= 1000);
    }
}
