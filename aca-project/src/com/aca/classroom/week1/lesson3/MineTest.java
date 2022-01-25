package com.aca.classroom.week1.lesson3;

import java.util.Scanner;

public class MineTest {

    public static void main(String[] args) {

        char[] mines = new char[6];

        for (int i = 0; i < mines.length; i++) {
            System.out.println("Is there a mine at " + i);
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() == 1) {
                mines[i] = '*';
            }

        }

        System.out.println("Where do you want to stand");
        Scanner scanner = new Scanner(System.in);
        int standIndex = scanner.nextInt();
        if(mines[standIndex] == '*') {
            System.out.println("Boom");
        } else {
            System.out.println("You are alive");
        }

        /**
         *
         */
    }
}
