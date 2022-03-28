package com.aca.homework.week11.runnable.printer;

import java.util.ArrayList;
import java.util.List;

public class NumberPrinterRunnable implements Runnable {

    private final int number;

    public NumberPrinterRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start < 1000);
        System.out.println(this.number);
    }

    public List<Runnable> createRunnables () {
        List<Runnable> runnables = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            runnables.add(new NumberPrinterRunnable(i));
        }
        return runnables;
    }

    public void runAll(List<Runnable> runnables) {
        for (Runnable runnable : runnables) {
            runnable.run();
        }
    }
}
