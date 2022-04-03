package com.aca.homework.week13.consumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class TextPrinterTest {

    private PrinterConsumer printerConsumer;

    @BeforeEach
    public void setUp() {
        printerConsumer = new PrinterConsumer();
    }

    @Test
    public void testWhenListIsEmpty() {
        Assertions.assertEquals(0, printerConsumer.getSize());
    }

    @Test
    public void testWhenListContains1Item() {
        printerConsumer.accept("String1");
        TextPrinter textPrinter = new TextPrinter(printerConsumer);
        Assertions.assertEquals(List.of("String1"), textPrinter.printAll(printerConsumer.getList()));

    }

    @Test
    public void testWhenListContains2Items() {
        printerConsumer.accept("String1");
        printerConsumer.accept("String2");
        TextPrinter textPrinter = new TextPrinter(printerConsumer);
        Assertions.assertEquals(List.of("String1", "String2"), textPrinter.printAll(printerConsumer.getList()));
    }
}