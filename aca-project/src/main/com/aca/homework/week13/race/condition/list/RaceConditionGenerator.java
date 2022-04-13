package com.aca.homework.week13.race.condition.list;

import java.util.Scanner;
import java.util.function.Supplier;

public class RaceConditionGenerator {

    private List<Integer> list;

    public int start() throws InterruptedException {
        Supplier<Boolean> supplier;
        System.out.println("Type the 'true' for SafeList or 'false' for UnsafeList");
        supplier = () -> new Scanner(System.in).nextBoolean();
        if (supplier.get()) {
            list = new SafeList<>();
        } else {
            list = new UnsafeList<>();
        }

        Thread[] threads = createThreads(list, 0);
        startThreads(threads);
        joinThreads(threads);

        return list.size();
    }

    public Thread[] createThreads(List<Integer> list, int number) {
        Thread[] threads = new Thread[10_000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new NumberAdderRunnable(list, number));
        }
        return threads;
    }

    public void startThreads(Thread[] threads) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public void joinThreads(Thread[] threads) throws InterruptedException {
        for (Thread thread : threads) {
            thread.join();
        }
    }

}
