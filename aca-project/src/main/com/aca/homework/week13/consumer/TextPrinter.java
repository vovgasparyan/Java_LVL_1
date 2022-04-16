package com.aca.homework.week13.consumer;

import java.util.List;

public class TextPrinter {

    PrinterConsumer consumer;

    public TextPrinter(PrinterConsumer printerConsumer) {
        this.consumer = printerConsumer;
    }

    public List<String> printAll(List<String> list) {
        return consumer.getList();
    }

    public static void main(String[] args) {
        PrinterConsumer printerConsumer = new PrinterConsumer();
        TextPrinter printer = new TextPrinter(printerConsumer);
        printerConsumer.accept("Vladimir");
        printerConsumer.accept("Gasparyan");
        printer.printAll(printerConsumer.getList());

    }
}
