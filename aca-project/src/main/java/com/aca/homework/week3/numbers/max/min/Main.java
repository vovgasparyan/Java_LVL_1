package com.aca.homework.week3.numbers.max.min;

public class Main {

    public static void main(String[] args) {

        Numbers numbers = new Numbers(17, 24, 35);

        System.out.println("The max number of object 'numbers' is: " + numbers.max());
        System.out.println("The min number of object 'numbers' is: " + numbers.min());
    }
}
