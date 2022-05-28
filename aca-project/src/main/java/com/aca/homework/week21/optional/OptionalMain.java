package com.aca.homework.week21.optional;

import java.util.Optional;

public class OptionalMain {

    private int size = 0;

    public void printFirstSymbol(Optional<String> string) {
        if (string.isPresent()) {
            String name = string.get();
            if (name.length() >= 2) {
                size++;
                System.out.println(name.charAt(1));
            }
        } else {
            System.out.println("Argument value should be not null or not empty");
        }
    }

    public int getSize() {
        return size;
    }
}
