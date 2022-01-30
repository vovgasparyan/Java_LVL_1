package com.aca.homework.week3.stack.strings;

import java.util.Scanner;

public class Stack {

    private String[] strings;
    private static int index = 0;


    public void push(int stringCount) {
        this.strings = new String[stringCount];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the " + stringCount + " strings");
        for (int i = 0; i < stringCount; i++) {
            String string = scanner.nextLine();
            this.strings[i] = string;
            index++;
        }
        for (int i = 0; i < stringCount; i++) {
            System.out.println(this.strings[i]);
        }
    }

    public void pop () {
        System.out.println();
        System.out.println(index);
        if (index == 0) {
            this.strings = null;
            System.out.println("pop: ");
            index = 0;
        } else {
            for (int i = index - 1; i >= 0 ; i--) {
                System.out.println("pop:" + this.strings[i]);
            }
            index--;
        }
    }

}
