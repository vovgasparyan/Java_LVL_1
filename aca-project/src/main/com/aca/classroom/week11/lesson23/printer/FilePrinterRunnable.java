package com.aca.classroom.week11.lesson23.printer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FilePrinterRunnable implements Runnable {

    private final String filePath;

    public FilePrinterRunnable(final String fileName) {
        this.filePath = fileName;
    }

    @Override
    public void run() {
        if (true) {
            throw new RuntimeException();
        }
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("The file " + filePath + " not found");
        }

        for (int i = 0; i < 30_000_000; i++) {
            printWriter.println(i);
        }
        printWriter.close();

    }
}
