package com.aca.classroom.week13.lesson27.buffer;

public class WaitMain {

    public static void main(String[] args) throws InterruptedException {
        final WaitMain waitMain = new WaitMain();
        synchronized (waitMain) {
            waitMain.wait();
        }

    }
}
