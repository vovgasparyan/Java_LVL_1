package com.aca.homework.week13.runnable.stop;

import java.util.function.Consumer;

public class TextPrinterRunnable implements Runnable {

    private Consumer<String> consumer;
    private String name;
    private boolean isRunning = true;

    public TextPrinterRunnable(Consumer<String> consumer, String name) {
        this.consumer = consumer;
        this.name = name;
    }

    @Override
    public void run() {
        while (isRunning) {
            consumer.accept(name);
        }
    }

    public void stop() {
        isRunning = false;
    }

    public String getName() {
        return name;
    }
}
