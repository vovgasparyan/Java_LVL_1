package com.aca.classroom.week10.lesson20;

public class RunnableImpl implements Runnable {

    private int number1;
    private int number2;

    public RunnableImpl(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    @Override
    public void run() {
        System.out.println("The summary of num1 and num2 is: " + (this.number1 + this.number2));
    }


    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl(10, 20);
        runnable.run();
    }
}
