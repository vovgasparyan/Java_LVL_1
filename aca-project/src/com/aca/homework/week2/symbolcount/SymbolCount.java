package com.aca.homework.week2.symbolcount;

import java.util.Scanner;

public class SymbolCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a text");
        String scannerString = scanner.nextLine();

        System.out.println("Please write a symbol");
        char scannerChar = new Scanner(System.in).next().charAt(0);

        int sum = 0;
        for (int i = 0; i < scannerString.length(); i++) {
            if (scannerChar == scannerString.charAt(i)) {
                sum += 1;
            }
        }
        System.out.println(sum);

    }
}
