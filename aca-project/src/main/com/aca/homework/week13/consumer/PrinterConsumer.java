package com.aca.homework.week13.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PrinterConsumer implements Consumer<String> {

    private List<String> list;

    public PrinterConsumer() {
        list = new ArrayList<>();
    }

    @Override
    public void accept(String s) {
        list.add(s);
    }

    public List<String> getList() {
        return list;
    }

    public int getSize() {
        return list.size();
    }

    public static void main(String[] args) {
        PrinterConsumer printerConsumer = new PrinterConsumer();
        printerConsumer.accept("Vladimir");
        printerConsumer.accept("Gasparyan");
        for (int i = 0; i < printerConsumer.getSize(); i++) {
            System.out.println(printerConsumer.getList().get(i));
        }
    }
}
