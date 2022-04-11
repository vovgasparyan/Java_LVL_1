package com.aca.classroom.week4.lesson9;

public class Numbers {

    private int number1;
    private int number2;

    public Numbers() {
        this.number1 = 10;
        this.number2 = 50;
    }

    public Numbers (int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }


    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.setNumber1(10);
        numbers.setNumber2(50);
    }
}
