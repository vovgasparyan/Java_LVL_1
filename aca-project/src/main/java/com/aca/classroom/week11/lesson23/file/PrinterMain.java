package com.aca.classroom.week11.lesson23.file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrinterMain {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "D:/ACA/test.txt";

        PrintWriter printWriter = new PrintWriter(fileName);
        printWriter.print(12);
        printWriter.print("gdsfsdfsfsds");
        printWriter.print(15f);
        printWriter.close();
    }
}
