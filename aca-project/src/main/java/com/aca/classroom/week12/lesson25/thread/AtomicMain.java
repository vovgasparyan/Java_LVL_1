package com.aca.classroom.week12.lesson25.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AtomicMain {

    public static synchronized void increment(int[] a) {
        a[0]++;
    }


    public static void main(String[] args) {
        final int[] a = {0};
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 5000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //System.out.println(a[0]);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    increment(a);
                }
            });
            threads.add(thread);
            thread.start();
        }

        threads.forEach(new Consumer<Thread>() {
            @Override
            public void accept(Thread thread) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println(a[0]);
    }
}
