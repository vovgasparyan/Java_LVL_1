package com.aca.homework.week4.json.processor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a json string.");
        String string = scanner.nextLine();

        StringProcessor stringProcessor = new StringProcessor(string);

        System.out.println("Please input a field name:");
        String key = scanner.nextLine();
        System.out.println(stringProcessor.getValue(key));

    }
}
