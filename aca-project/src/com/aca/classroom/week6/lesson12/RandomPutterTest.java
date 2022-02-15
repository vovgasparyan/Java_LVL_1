package com.aca.classroom.week6.lesson12;

import java.util.Scanner;

public class RandomPutterTest {

    public static void main(String[] args) {
        new RandomPutter(getBuffer()).start();

    }

    public static Buffer getBuffer() {
        Scanner scanner = new Scanner(System.in);
        int iteration = scanner.nextInt();

        return iteration == 0 ? new MyBuffer() : new ArrayBuffer();


    }
}
