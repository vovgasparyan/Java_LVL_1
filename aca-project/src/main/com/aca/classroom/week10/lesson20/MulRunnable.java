package com.aca.classroom.week10.lesson20;

public class MulRunnable implements Runnable {

    private int number1;
    private int number2;

    public MulRunnable(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public void run() {
        System.out.println("The multiple of num1 and num2 is: " + (number1 * number2));
    }
}