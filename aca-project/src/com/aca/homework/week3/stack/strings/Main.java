package com.aca.homework.week3.stack.strings;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Starting method push()");
        stack.push("main");
        stack.push("push");
        stack.push("push");
        stack.push("push");

        System.out.println("Starting method pop()");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
