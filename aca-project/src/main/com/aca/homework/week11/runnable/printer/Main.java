package com.aca.homework.week11.runnable.printer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        NumberPrinterRunnable runnable = new NumberPrinterRunnable(10);

        List<Runnable> runnables = runnable.createRunnables();
        runnable.runAll(runnables);

    }
}
