package com.aca.homework.week13.runnable.stop;

import java.util.function.Consumer;

public class TextPrinterMain {

    public static void main(String[] args) {

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(s);
            }
        };

        TextPrinterRunnable printerRunnable = new TextPrinterRunnable(consumer, "HELLO WORLD!");

        Thread thread = new Thread(printerRunnable);
        thread.start();

        try {
            Thread.sleep(10000);
            printerRunnable.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
