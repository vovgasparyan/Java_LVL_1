package com.aca.classroom.week3.lesson6.maxmin;

import java.util.Scanner;

public class MaxMinTest {

    public static void main(String[] args) {

        MaxMin[] maxMins = get3MaxMins();
        printMaxMin(maxMins);
        MaxMin maxMin = new MaxMin();
        maxMin.max = 5;
        maxMin.min = 1;

        Printers.printMaxAndMix(maxMin);


    }



    public static void printMaxMin(MaxMin[] maxMinArray) {
        for (int i = 0; i < maxMinArray.length; i++) {
            MaxMin maxMin = maxMinArray[i];
            System.out.println("The max is: " + maxMin.max + ", min is: " + maxMin.min);
            //System.out.println("The max is: " + maxMinArray[i].max + ", min is: " + maxMinArray[i].min);
        }
    }

    public static MaxMin[] get3MaxMins() {
        MaxMin[] maxMinArray = new MaxMin[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter a number 1");
            long number1 = new Scanner(System.in).nextLong();
            System.out.println("Please enter a number 2");
            long number2 = new Scanner(System.in).nextLong();

            MaxMin maxMin = createMaxMin(number1, number2);
            maxMinArray[i] = maxMin;
        }
        return maxMinArray;
    }

    public static MaxMin createMaxMin(long i, long j) {
        MaxMin maxMin = new MaxMin();
        if (i > j) {
            maxMin.max = i;
            maxMin.min = j;
        } else {
            maxMin.max = j;
            maxMin.min = i;
        }
        return maxMin;
    }
}
