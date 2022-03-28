package com.aca.classroom.week11.lesson23.printer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final long start = System.currentTimeMillis();
        String folderPath = "D:/ACA/";

        List<Runnable> runnables = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            runnables.add(new FilePrinterRunnable(folderPath + "filePrinter-" + i + ".txt"));
        }

        for (Runnable runnable : runnables) {
            new Thread(runnable).start();
        }

        System.out.println(System.currentTimeMillis() - start);

    }
}
