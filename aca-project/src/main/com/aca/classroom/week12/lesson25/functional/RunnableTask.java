package com.aca.classroom.week12.lesson25.functional;

public class RunnableTask {

    public static void main(String[] args) throws InterruptedException {

        final int[] a = {0};
        Thread[] threads = new Thread[2000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    a[0]++;
                }
            });

            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(a[0]);
    }

}
