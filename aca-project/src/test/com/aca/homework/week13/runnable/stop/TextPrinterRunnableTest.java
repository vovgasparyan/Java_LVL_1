package com.aca.homework.week13.runnable.stop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

class TextPrinterRunnableTest {

    @Test
    public void testRun() {
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
        Assertions.assertEquals("HELLO WORLD!", printerRunnable.getName());
    }
}