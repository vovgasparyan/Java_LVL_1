package com.aca.classroom.week11.lesson23.printer;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {
/*        for (int i = 0; i < 2; i++) {
            new Thread(new RunnableImpl()).start();
        }*/

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                System.out.println("Start");
                while((System.currentTimeMillis() - start) < 1000) {
                }
                System.out.println("End");
            }
        };

        for (int i = 0; i < 2; i++) {
            new Thread(runnable).start();
        }
    }
/*
    private static class RunnableImpl implements Runnable {

        @Override
        public void run() {
            System.out.println("Start");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End");
        }
    }*/


}
