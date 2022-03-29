package com.aca.homework.week12.thread;

public class ThreadTermination {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");

        Thread[] threads = new Thread[2];
        for (int i = 0; i < 2; i++) {
            threads[i] = new Thread(new MyRunnable(i));
            threads[i].start();
        }
        for (int i = 0; i < 2; i++) {
            threads[i].join();
        }

        System.out.println("Finished");
    }

    private static class MyRunnable implements Runnable {

        private int number;

        public MyRunnable(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(System.currentTimeMillis());
        }
    }

}
