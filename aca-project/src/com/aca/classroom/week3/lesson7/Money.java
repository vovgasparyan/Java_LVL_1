package com.aca.classroom.week3.lesson7;

public class Money {

    public static void main(String[] args) {
        System.out.println(money());
    }

    public static double money() {
        double sum = 150000;

        for (int i = 1; i <= 365; i++) {
            sum += sum * 0.01;

        }
        return sum;
    }
}
