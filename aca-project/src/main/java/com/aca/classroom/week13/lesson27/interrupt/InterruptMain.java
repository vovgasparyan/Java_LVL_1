package com.aca.classroom.week13.lesson27.interrupt;

public class InterruptMain {

    public static void main(String[] args) {

        final Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            doHeavyTask();
            System.out.println("Finished");
        });
        thread.start();

        new Thread(() -> {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread.interrupt();
        }).start();
    }

    public static void doHeavyTask()  {
        for (int i = 0; i < 100; i++) {

            if (Thread.interrupted()) {
                Thread.currentThread().interrupt();
                return;
            }
/*
            try {
                System.out.println("Doing a heavy task - " + i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            final long start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start < 100);
            System.out.println("Doing a heavy task - " + i);
        }
    }
}
