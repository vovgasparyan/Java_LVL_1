package com.aca.homework.week3.stack.strings;

public class Stack {

    private static int i = 0;
    private String[] strings = new String[10];


    public void push(String string) {
        this.strings[i] = string;
        System.out.println(strings[i]);
        i++;
    }

    public String pop() {
        i--;
        if (i < 0) {
            this.strings = null;
            return "empty";
        }
        return this.strings[i];

    }
}
